package Page;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class BaseSteps {

    PageObject homePage;

    public BaseSteps(WebDriver driver) {
        this.homePage = new PageObject(driver);
    }

    @Step
    public void open() {
        BaseTest.getDriver().get("https://yandex.by/");
    }

    @Step
    public void prepare() {
        BaseTest.prepareDriver();
    }

    @Step ("Войти доступно")
    public void buttonEnterEnabled() {
        System.out.println("Войти доступно");
        assertTrue("Войти не доступно",
                homePage.isbuttonEnterEnabled());
    }

    @Step ("Нажать войти")
    public void buttonClick() {
        homePage.buttonClick();
        System.out.println("Нажать войти");
    }
  }

