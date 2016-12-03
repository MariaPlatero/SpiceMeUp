package com.maryplasez.spicemeapp;

import java.io.Serializable;

/**
 * Created by platerosanchezm on 03/12/2016.
 */

public class User implements Serializable {
    String name;
    String password;


    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

}
