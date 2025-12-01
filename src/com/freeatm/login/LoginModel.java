package com.freeatm.login;

import com.freeatm.database.UserRepository;
import com.freeatm.dto.User;

public class LoginModel {
    private final ILoginModelController iLoginModelController;
    private final UserRepository repo = UserRepository.getInstance();

    public LoginModel(ILoginModelController iLoginModelController) {
        this.iLoginModelController = iLoginModelController;
    }


    public void validateCredential(String username, String password) {

        User user = UserRepository.findByUsername(username);
        if (user == null)  iLoginModelController.onUserNotfound();
        if (user != null && user.getPassword().equals(password)) {
            iLoginModelController.userfound(user);
        }
    }

    }