package com.freeatm.login;

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
        System.out.println("Enter you name:");
        System.out.println("Enter the password");
        String name = scan.next();
        String password = scan.next();
        iLoginViewController.login(name, password);
    }

    public void onLoginSuccess(User user) {
            print("Logged in.");
            print("Welcome " + user.getName());
    }
}
