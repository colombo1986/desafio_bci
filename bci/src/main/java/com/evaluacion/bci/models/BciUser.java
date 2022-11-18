
package com.evaluacion.bci.models;
import lombok.*;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Entity
@Transactional
@Data
@Table(name = "BCIUSERS")
public class BciUser {

    @Id
    @GeneratedValue
    @Column(name = "ID" ,columnDefinition = "UUID")
    private UUID id ;

    @NotNull
    private String name ;

    @NotNull
    @Email
    private String email ;

    @NotNull
    private String password ;

    @Column(columnDefinition = "DATE")
    private Date created ;

    @Column(columnDefinition = "DATE")
    private Date modified ;

   @Column(columnDefinition = "DATE")
   private Date last_login ;

   @Column(name ="ISACTIVE")
   private boolean isactive ;

    @OneToMany(targetEntity = Phones.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_phones_id" , referencedColumnName = "id")
    private List<Phones> bciUserPhone ;


    public BciUser() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getLast_login() {
        return last_login;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }


    public List<Phones> getBciUserPhone() {
        return bciUserPhone;
    }

    public void setBciUserPhone(List<Phones> bciUserPhone) {
        this.bciUserPhone = bciUserPhone;
    }


}