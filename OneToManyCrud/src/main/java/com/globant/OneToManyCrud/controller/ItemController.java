package com.globant.OneToManyCrud.controller;

import com.globant.OneToManyCrud.entity.Item;
import com.globant.OneToManyCrud.entity.dto.ItemDto;
import com.globant.OneToManyCrud.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/items")
public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public ResponseEntity<ItemDto> addItem(@RequestBody final ItemDto itemDto){
        Item item = itemService.addItem(Item.from(itemDto));
        return new ResponseEntity<>(ItemDto.from(item), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ItemDto>> getItems(){
        List<Item> items = itemService.getItems();
        List<ItemDto> itemDto = items.stream().map(ItemDto::from).collect(Collectors.toList());
        return new ResponseEntity<>(itemDto, HttpStatus.OK);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<ItemDto> getItem(@PathVariable final Long id){
        Item item = itemService.getItem(id);
        return new ResponseEntity<>(ItemDto.from(item),HttpStatus.OK);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<ItemDto> deleteItem(@PathVariable final Long id){
        Item item = itemService.deleteItem(id);
        return new ResponseEntity<>(ItemDto.from(item),HttpStatus.OK);
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<ItemDto> editItem(@PathVariable final Long id,@RequestBody final ItemDto itemDto){
        Item editedItem = itemService.editItem(id, Item.from(itemDto));
        return new ResponseEntity<>(ItemDto.from(editedItem),HttpStatus.OK);
    }
}
