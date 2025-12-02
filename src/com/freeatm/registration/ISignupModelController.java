package com.freeatm.registration;

import com.freeatm.dto.User;

public interface ISignupModelController {
    void onUserAlreadyExists(String message);

    void onSignupSuccess(User user);
}