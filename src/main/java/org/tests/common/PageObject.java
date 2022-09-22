package org.tests.common;

import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public abstract class PageObject {
    @Inject
    WebDriver driver;

    protected WebElement findElementWhenVisibleXPath(String locator){
        WebElement element = null;
        try{
            element = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        }catch(Exception e){
            Assert.fail("XPath locator \"" + locator + "\" cant be found.");
        }
        return element;
    }

    protected WebElement findElementWhenVisibleId(String locator){
        WebElement element = null;
        try{
            element = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
        }catch(Exception e){
            Assert.fail("ID locator \"" + locator + "\" cant be found.");
        }
        return element;
    }

}
