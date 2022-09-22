package org.tests.pageobjects;

import org.tests.common.ILoginForm;
import org.tests.common.PageObject;

public class LoginForm extends PageObject implements ILoginForm {
    private String emailInput = "email";
    private String passwordInput = "passwd";
    private String signInButton = "SubmitLogin";

    @Override
    public void setEmailAddress(String emailAdd){
        findElementWhenVisibleId(emailInput).sendKeys(emailAdd);
    }
    @Override
    public void setPassword(String password){
        findElementWhenVisibleId(passwordInput).sendKeys(password);
    }
    @Override
    public void clickSignInButton(){
        findElementWhenVisibleId(signInButton).click();
    }
}
