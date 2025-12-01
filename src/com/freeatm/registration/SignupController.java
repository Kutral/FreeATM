package com.freeatm.registration;

public class SignupController implements  ISignupViewController, ISignupModelController {
    private final SignupView signupView;
    private final SignupModel signupModel;

    public SignupController() {
        this.signupView = new SignupView();
        this.signupModel = new SignupModel();
    }
    public void start() {
        signupView.start();
    }
}
