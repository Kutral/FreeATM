package com.freeatm.database;

import com.freeatm.dto.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static UserRepository instance;
    private static final List<User> users = new ArrayList<>();

    private UserRepository(){
        users.add(new User("user", "user"));
    }

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    public static User findByUsername(String username) {
        for (User user : users) {
            if (user.getName().equals(username)) {
                return user;
            }
        }
        return null;

    }
    public boolean addUser(User user) {
        if (findByUsername(user.getName()) != null) {
            return false;
        }
        users.add(user);
        return true;
    }
}
