package com.freeatm.welcome;

import com.freeatm.login.LoginController;
import com.freeatm.registration.SignupController;

public class WelcomeController implements IWelcomeViewController {
    private final WelcomeView welcomeView;

    public WelcomeController() {
        this.welcomeView = new WelcomeView(this);
    }

    public void start() {
        welcomeView.start();
    }

    @Override
    public void option(int choice) {
        switch (choice) {
            case 1:
                new LoginController().start();
                break;
            case 2:
                new SignupController().start();
                break;
            case 3:
                welcomeView.showExitMessage();
                System.exit(0);
        }
    }

    @Override
    public void login() {

    }
}
