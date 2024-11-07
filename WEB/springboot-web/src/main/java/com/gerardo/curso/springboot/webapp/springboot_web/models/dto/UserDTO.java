package com.gerardo.curso.springboot.webapp.springboot_web.models.dto;

import com.gerardo.curso.springboot.webapp.springboot_web.models.User;

public class UserDTO {

    private int ID; 
    private User user;
    
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    } 

    
}
