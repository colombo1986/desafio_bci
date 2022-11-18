package com.evaluacion.bci.dto;


import com.evaluacion.bci.models.BciUser;
import com.evaluacion.bci.models.Phones;

import java.util.List;

public class UserRequestEntryDTO {

private String name ;
  private String email ;
  private String password ;

  private List<Phones> phones ;

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
