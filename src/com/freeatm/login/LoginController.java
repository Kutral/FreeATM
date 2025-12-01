package com.freeatm.login;

import com.freeatm.dto.User;

public class LoginController implements ILoginViewController, ILoginModelController {
    private final LoginView loginView;
    private final LoginModel loginModel;

    public LoginController() {
        this.loginView = new LoginView(this);
        this.loginModel = new LoginModel(this);
    }

    public void start() {
        loginView.start();
    }

    @Override
    public void login(String name, String password) {
           loginModel.validateCredential(name,password);
    }

    @Override
    public void onUserNotfound() {
        loginView.print("User not found");

    }

    @Override
    public void onUserfound(User user) {
         loginView.onLoginSuccess(user);
    }
}
