package com.freeatm.registration;

import com.freeatm.dto.User;
import com.freeatm.home.HomeController;

public class SignupController implements ISignupViewController, ISignupModelController {
    private final SignupView signupView;
    private final SignupModel signupModel;

    public SignupController() {
        this.signupView = new SignupView(this);
        this.signupModel = new SignupModel(this);
    }

    public void start() {
        signupView.start();
    }

    @Override
    public void signup(String name, String password) {
        signupModel.createUser(name, password);
    }

    @Override
    public void onUserAlreadyExists(String message) {
        signupView.onSignupFailed(message);
    }

    @Override
    public void onSignupSuccess(User user) {
        signupView.onSignupSuccess(user);
        new HomeController(user).start();
    }
}