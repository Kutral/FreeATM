package com.freeatm.home;

import com.freeatm.base.BaseView;
import com.freeatm.constants.StringConstants;

import java.util.Scanner;

public class HomeView extends BaseView {
    private final IHomeViewController controller;
    private final Scanner scanner;

    public HomeView(IHomeViewController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while(true) {
            printAll(StringConstants.HOME_MENU_OPTIONS);
            String choiceStr = printQuestion(StringConstants.ENTER_CHOICE, scanner);
            try {
                int choice = Integer.parseInt(choiceStr);
                if (choice == 4) {
                    controller.logout();
                    break;
                }
                controller.handleOption(choice);
            } catch (NumberFormatException e) {
                print("Invalid input");
            }
        }
    }

    public double askAmount() {
        String amountStr = printQuestion(StringConstants.ENTER_AMOUNT, scanner);
        try {
            return Double.parseDouble(amountStr);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public void showBalance(double balance) {
        print(StringConstants.BALANCE_IS + balance);
    }

    public void showMessage(String message) {
        print(message);
    }
}
