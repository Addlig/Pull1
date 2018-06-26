package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageObject {

    BaseTest basetest = new BaseTest();

    @FindBy(css = "[role = \"button\"]")
    private WebElement buttonEnter;
    @FindBy(css = "input[name = \"login\"]")
    private WebElement login;
    @FindBy(css = "input[type = \"password\"]")
    private WebElement password;

    public PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean isbuttonEnterEnabled() {
        return buttonEnter.isEnabled();
    }

    public void buttonClick() {
        buttonEnter.click();
    }
    public boolean isbuttonLoginEnabled() {
        return login.isDisplayed();
    }

    public void loginClick() {
        login.click();
    }

    public boolean isbuttonPasswordEnabled() {
        return password.isDisplayed();
    }

    public void passwordClick() {
        password.click();
    }

}




