package com.freeatm.login;

import com.freeatm.constants.StringConstants;
import com.freeatm.dto.User;
import com.freeatm.base.BaseView;

import java.util.Scanner;

public class LoginView extends BaseView {
        private final ILoginViewController iLoginViewController;

        public LoginView(ILoginViewController iLoginViewController) {
            this.iLoginViewController = iLoginViewController;
        }


    public void start() {
        Scanner scan = new Scanner(System.in);
        String name = printQuestion(StringConstants.ENTER_NAME, scan);
        String password = printQuestion(StringConstants.ENTER_PIN, scan);

        iLoginViewController.login(name, password);
    }

    public void onLoginSuccess(User user) {
            print(StringConstants.LOGIN_SUCCESS);
            print(StringConstants.WELCOME_USER + user.getName());
    }
}
