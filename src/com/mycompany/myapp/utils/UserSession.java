/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.utils;

import com.mycompany.myapp.entities.User;





/**
 *
 * @author Anis
 */
public class UserSession {
     public static UserSession instance;

    private User u;

    public User getU() {
        return u;
    }

   

    @Override
    public String toString() {
        return "UserSession{" +
                "u=" + u +
                '}';
    }

    public void setU(User u) {
        this.u = u;
    }

    public UserSession(User u) {
        this.u = u;

    }

    public static UserSession getInstance(User u) {
        if(instance == null) {
            instance = new UserSession(u);
        }
        return instance;
    }

    

    public void cleanUserSession() {
        instance=null;
    }


    }

