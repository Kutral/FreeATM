package com.freeatm.constants;

public class StringConstants {
    public static String[] WelcomeMessage = {"========================================\n" +
            "           Welcome to FreeATM\n" +
            "========================================"};

    public static String[] WELCOME_OPTIONS = {
            "1. Login",
            "2. Create New Account (Signup)",
            "3. Exit"
    };

    public static String ENTER_CHOICE = "Enter your choice: ";
    public static String ENTER_NAME = "Enter your name:";
    public static String ENTER_PIN = "Enter your PIN:";
    public static String LOGIN_SUCCESS = "Logged in.";
    public static String SIGNUP_SUCCESS = "Signup successful.";
    public static String WELCOME_USER = "Welcome ";
    public static String USER_NOT_FOUND = "User not found";
    public static String USER_EXISTS = "User already exists";

    public static String[] HOME_MENU_OPTIONS = {
            "1. Check Balance",
            "2. Cash Withdrawal",
            "3. Cash Deposit",
            "4. Transfer Funds",
            "5. Logout"
    };

    public static String BALANCE_IS = "Your balance is: ";
    public static String ENTER_AMOUNT = "Enter amount: ";
    public static String DEPOSIT_SUCCESS = "Deposit successful.";
    public static String WITHDRAW_SUCCESS = "Withdrawal successful.";
    public static String INSUFFICIENT_FUNDS = "Insufficient funds.";
    public static String TRANSFER_SUCCESS = "Transfer successful.";
    public static String ENTER_TARGET_USER = "Enter username to transfer to: ";
}
