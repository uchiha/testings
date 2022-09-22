package org.tests.guicemodule;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import org.openqa.selenium.WebDriver;
import org.tests.application.actions.Login;
import org.tests.application.model.UserModel;
import org.tests.common.ILoginForm;
import org.tests.pageobjects.LoginForm;
import org.tests.providers.ChromeProvider;
import org.tests.providers.FirefoxProvider;

public class InitialModule extends AbstractModule {
    protected void configure(){
        bind(ILoginForm.class).to(LoginForm.class).in(Scopes.SINGLETON);
        bind(Login.class).in(Scopes.SINGLETON);
        bind(UserModel.class).in(Scopes.SINGLETON);
        bind(ObjectMapper.class).in(Scopes.SINGLETON);

        if(System.getProperty("browseruse").equals("chrome")){
            bind(WebDriver.class).toProvider(ChromeProvider.class).in(Scopes.SINGLETON);
        } else if(System.getProperty("browseruse").equals("firefox"))
            bind(WebDriver.class).toProvider(FirefoxProvider.class).in(Scopes.SINGLETON);

    }
}
