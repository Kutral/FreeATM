package com.freeatm.login;

import com.freeatm.constants.StringConstants;
import com.freeatm.dto.User;
import com.freeatm.home.HomeController;

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
        loginView.print(StringConstants.USER_NOT_FOUND);

    }

    @Override
    public void onUserfound(User user) {
         loginView.onLoginSuccess(user);
         new HomeController(user).start();
    }
}
