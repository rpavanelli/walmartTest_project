package tests.walmart.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {

    private By loginWindow = By.id("iframeLogin");
    private By btnSigninUser = By.id("signinButtonSend");
    private By signinUser = By.id("signinField");
    private By signinPassword = By.id("password");

    public boolean isWindowLoginExists() {
        return waitForElement(loginWindow, 10).isDisplayed();
    }

    public void register(String login, String password) {
        WebDriver webDriver = waitIframe(loginWindow, 10);
        webDriver.findElement(signinUser).sendKeys(login);
        webDriver.findElement(signinPassword).sendKeys(password);
        webDriver.findElement(btnSigninUser).click();
    }
}
