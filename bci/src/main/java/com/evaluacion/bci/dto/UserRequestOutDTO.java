package com.evaluacion.bci.dto;

import java.util.Date;
import java.util.UUID;

public class UserRequestOutDTO {

    private UUID id ;
    private Date created ;
    private Date modified ;
    private Date last_login ;
    private boolean isActive ;

    public UserRequestOutDTO() {
    }

    public UserRequestOutDTO(UUID id, Date created, Date modified, Date last_login, boolean isActive) {
        this.id = id;
        this.created = created;
        this.modified = modified;
        this.last_login = last_login;
        this.isActive = isActive;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public void Date(Date modified) {
        this.modified = modified;
    }

    public Date getLast_login() {
        return last_login;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
}
