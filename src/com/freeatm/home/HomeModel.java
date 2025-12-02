package com.freeatm.home;

import com.freeatm.constants.StringConstants;
import com.freeatm.database.UserRepository;
import com.freeatm.dto.User;

public class HomeModel {
    private final IHomeModelController controller;
    private final User user;

    public HomeModel(IHomeModelController controller, User user) {
        this.controller = controller;
        this.user = user;
    }

    public void getBalance() {
        controller.onBalanceRetrieved(user.getBalance());
    }

    public void withdraw(double amount) {
        if (user.getBalance() >= amount) {
            user.setBalance(user.getBalance() - amount);
            controller.onTransactionSuccess(StringConstants.WITHDRAW_SUCCESS, user.getBalance());
        } else {
            controller.onTransactionFailed(StringConstants.INSUFFICIENT_FUNDS);
        }
    }

    public void deposit(double amount) {
        user.setBalance(user.getBalance() + amount);
        controller.onTransactionSuccess(StringConstants.DEPOSIT_SUCCESS, user.getBalance());
    }
}
