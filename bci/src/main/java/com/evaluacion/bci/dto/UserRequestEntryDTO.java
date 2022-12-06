package com.evaluacion.bci.dto;


import com.evaluacion.bci.models.BciUser;
import com.evaluacion.bci.models.Phones;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class UserRequestEntryDTO {


    @NotNull (message = " Nombre esta nulo ")
    @NotEmpty (message = " Nombre esta vacio ")
    @NotBlank (message = " Nombre esta en blanco  ")
    private String name;


    @NotNull (message = "Email es nulo")
    @NotEmpty (message = "Email esta vacio")
    @NotBlank (message = "Email esta en blanco")
    @Email(message = "Ingrese un email valido")
    private String email;


    @NotNull (message = "Password es nulo ")
    @NotEmpty (message = "Password esta vacio")
    @NotBlank (message = "Password esta en blanco")
    private String password;

    private List<Phones> phones;

    public UserRequestEntryDTO() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Phones> getPhones() {
        return phones;
    }

    public void setPhones(List<Phones> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "UserRequestEntryDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phones=" + phones.toString() +
                '}';
    }


}
