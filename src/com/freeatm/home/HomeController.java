package com.freeatm.home;

import com.freeatm.dto.User;
import com.freeatm.welcome.WelcomeController;

public class HomeController implements IHomeViewController, IHomeModelController {
    private final HomeView homeView;
    private final HomeModel homeModel;

    public HomeController(User user) {
        this.homeView = new HomeView(this);
        this.homeModel = new HomeModel(this, user);
    }

    public void start() {
        homeView.start();
    }

    @Override
    public void handleOption(int option) {
        switch (option) {
            case 1: // Balance
                homeModel.getBalance();
                break;
            case 2: // Withdrawal
                double withdrawAmount = homeView.askAmount();
                homeModel.withdraw(withdrawAmount);
                break;
            case 3: // Deposit
                double depositAmount = homeView.askAmount();
                homeModel.deposit(depositAmount);
                break;
            default:
                homeView.showMessage("Invalid option");
        }
    }

    @Override
    public void logout() {
        new WelcomeController().start();
    }

    @Override
    public void onBalanceRetrieved(double balance) {
        homeView.showBalance(balance);
    }

    @Override
    public void onTransactionSuccess(String message, double balance) {
        homeView.showMessage(message);
        homeView.showBalance(balance);
    }

    @Override
    public void onTransactionFailed(String message) {
        homeView.showMessage(message);
    }
}
