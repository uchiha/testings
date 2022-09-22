package org.tests.testngtests.common;

import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.tests.application.data.TestData;

public abstract class BaseTest {

    @Inject
    protected WebDriver driver;

    @Inject
    protected TestData testData;

    @BeforeMethod
    public void browseToApplication(){
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }
}
