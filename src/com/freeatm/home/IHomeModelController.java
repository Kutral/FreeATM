package com.freeatm.home;

public interface IHomeModelController {
    void onBalanceRetrieved(double balance);
    void onTransactionSuccess(String message, double balance);
    void onTransactionFailed(String message);
}
