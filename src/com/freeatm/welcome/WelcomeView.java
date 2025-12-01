package com.freeatm.welcome;

import com.freeatm.base.BaseView;

import java.util.Scanner;

public class WelcomeView extends BaseView {
    private final IWeclomeViewController iwelcomeviewcontroller;

    public WelcomeView(IWeclomeViewController iweclomeviewcontroller) {
        this.iwelcomeviewcontroller = iweclomeviewcontroller;
    }

    public void start() {

        System.out.println("========================================\n" +
                "           Welcome to FreeATM\n" +
                "========================================\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Login\n" +
                "2. Create New Account (Signup)\n" +
                "3. Exit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        iwelcomeviewcontroller.option(choice);
    }

    public void showExitMessage() {
    }
}

