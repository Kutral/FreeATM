package com.freeatm.login;

import com.freeatm.dto.User;

public interface ILoginModelController {
    void onUserNotfound();

    void onUserfound(User user);
}
