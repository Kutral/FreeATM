package com.freeatm.registration;

import com.freeatm.constants.StringConstants;
import com.freeatm.database.UserRepository;
import com.freeatm.dto.User;

public class SignupModel {
    private final ISignupModelController iSignupModelController;
    private final UserRepository repo = UserRepository.getInstance();

    public SignupModel(ISignupModelController iSignupModelController) {
        this.iSignupModelController = iSignupModelController;
    }

    public void createUser(String username, String password) {
        if (UserRepository.findByUsername(username) != null) {
            iSignupModelController.onUserAlreadyExists(StringConstants.USER_EXISTS);
        } else {
            User newUser = new User(username, password);
            repo.addUser(newUser);
            iSignupModelController.onSignupSuccess(newUser);
        }
    }
}