package org.tests.testngtests;

import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import org.tests.application.actions.Login;
import org.tests.guicemodule.InitialModule;
import org.tests.testngtests.common.BaseTest;

@Guice(modules ={
        InitialModule.class
})

public class FirstTest extends BaseTest {

    @Inject
    Login login;

    @Test
    public void validLogin() throws InterruptedException{
        String jsonUserModel = "{ \"userName\" : \"clarenciotan7@protonmail.com\", \"passWord\" : \"testing1234\" }";
        login.LoginWithUser(testData.getUserModel(jsonUserModel));
        Thread.sleep(7000);
        driver.quit();
    }
}
