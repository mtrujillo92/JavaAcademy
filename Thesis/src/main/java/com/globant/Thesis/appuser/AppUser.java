package com.globant.Thesis.appuser;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;


@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class AppUser implements UserDetails {

    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Long id;

    private String username;
    private String name;
    private String lastName;
    private String idNumber;
    private String address;
    private String zipCode;
    private String state;
    private String country;
    private String password;
    private Boolean locked;
    private Boolean enabled;

    public AppUser(String username, String name, String lastName, String idNumber, String address, String zipCode, String state, String country, String password, Boolean locked, Boolean enabled) {
        this.username = username;
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.address = address;
        this.zipCode = zipCode;
        this.state = state;
        this.country = country;
        this.password = password;
        this.locked = locked;
        this.enabled = enabled;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
