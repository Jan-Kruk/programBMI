package com.jankruk.it.camp.program.db;

import com.jankruk.it.camp.program.model.User;

import java.util.ArrayList;

public class BmiRepository {
    ArrayList<User> userArrayList = new ArrayList<>();

    public void addUser(User user){
        userArrayList.add(user);
    }
    public User getLastUser(){
       return userArrayList.get(userArrayList.size()-1);
    }

    public ArrayList<User> getUserArrayList() {
        return userArrayList;
    }
}
