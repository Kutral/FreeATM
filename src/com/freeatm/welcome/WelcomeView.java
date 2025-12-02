package com.freeatm.welcome;

import com.freeatm.base.BaseView;
import com.freeatm.constants.StringConstants;

import java.util.Scanner;

public class WelcomeView extends BaseView {
    private final IWelcomeViewController iwelcomeviewcontroller;

    public WelcomeView(IWelcomeViewController iwelcomeviewcontroller) {
        this.iwelcomeviewcontroller = iwelcomeviewcontroller;
    }

    public void start() {
        printAll(StringConstants.WELCOME_MESSAGE);
        printAll(StringConstants.WELCOME_OPTIONS);

        Scanner sc = new Scanner(System.in);
        String choiceStr = printQuestion(StringConstants.ENTER_CHOICE, sc);
        int choice = Integer.parseInt(choiceStr);

        iwelcomeviewcontroller.option(choice);
    }

    public void showExitMessage() {
    }
}

