package org.tests.application.actions;

import com.google.inject.Inject;
import org.tests.application.model.UserModel;
import org.tests.common.ILoginForm;

public class Login {
    ILoginForm _iLogin;

    @Inject
    public Login(ILoginForm iLogin) {
        _iLogin = iLogin;
    }

    public void LoginWithUser(UserModel userModel){
        // business flow to login
        _iLogin.setEmailAddress(userModel.getUserName());
        _iLogin.setPassword(userModel.getPassWord());
        _iLogin.clickSignInButton();
    }
}
