package com.freeatm.registration;

import com.freeatm.base.BaseView;
import com.freeatm.constants.StringConstants;
import com.freeatm.dto.User;


import java.util.Scanner;

public class SignupView extends BaseView {
    private final ISignupViewController iSignupViewController;

    public SignupView(ISignupViewController iSignupViewController) {
        this.iSignupViewController = iSignupViewController;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        String name = printQuestion(StringConstants.ENTER_NAME, scan);
        String password = printQuestion(StringConstants.ENTER_PIN, scan);
        iSignupViewController.signup(name, password);
    }


    public void onSignupSuccess(User user) {
        print(StringConstants.SIGNUP_SUCCESS);
        print(StringConstants.WELCOME_USER + user.getName());
    }

    public void onSignupFailed(String message) {
        print(message);
    }

}
