package com.globant.app.controller;

import com.globant.app.entity.User;
import com.globant.app.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController//combinación entre ResponseBody y Controller
@RequestMapping("/api/users")//para decirle la url, se usa plural
public class UserController {

    @Autowired
    private UserService userService; //inyeccción de dependencias

    //Create a new user
    @PostMapping
    public ResponseEntity<?> create (@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
    }
    //Read an user
    @GetMapping("/{id}")
    public ResponseEntity<?> read (@PathVariable(value = "id") Long userId){ //si no se llama igual toca si, si se llama igual se elimina el (value = "id")
        Optional<User> optionalUser = userService.findById(userId);

        if(!optionalUser.isPresent()){ //si no encuentra el usuario devuelve un error 404 not found
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optionalUser);
    }

    //update an user
    @PutMapping("/{id}")
    public ResponseEntity<?> update (@RequestBody User userDetails, @PathVariable Long id){
        Optional<User> user = userService.findById(id);
        if (!user.isPresent()){
            return ResponseEntity.notFound().build();
        }

        // BeanUtils.copyProperties(userDetails,user.get()); hace lo mismo que lo de abajo, pero incluye el id, por eso no se usa aca
        user.get().setName(userDetails.getName());
        user.get().setSurname(userDetails.getSurname());
        user.get().setEmail(userDetails.getEmail());
        user.get().setEnabled(userDetails.getEnabled());

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user.get()));
    }

    //Delete an User
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete (@PathVariable(value = "id") Long userId){
        if(!userService.findById(userId).isPresent()){
            return ResponseEntity.notFound().build();
        }
        userService.deleteById(userId);
        return ResponseEntity.ok().build();
    }

    //Read all users
    @GetMapping
    public List<User> readAll(){
        List<User> users = StreamSupport
                .stream(userService.findAll().spliterator(),false) //si queremos que sea secuencial se debe poner false
                .collect(Collectors.toList());

        return users;
    }
}
