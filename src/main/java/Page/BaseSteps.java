package Page;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
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

    @Step
    public void back() {
        BaseTest.navigationBack();
    }

    @Step("Войти доступно")
    public void buttonEnterEnabled() {
        System.out.println("Войти доступно");
        assertTrue("Войти не доступно",
                homePage.isbuttonEnterEnabled());
    }

    @Step("Нажать войти")
    public void buttonClick() {
        homePage.buttonClick();
        System.out.println("Нажать войти");
    }

    @Step("Логин доступно")
    public void buttonLoginEnabled() {
        assertTrue("Логин не доступно",
                homePage.isbuttonLoginEnabled());
        System.out.println("Логин доступно");
    }

    @Step("Нажать в поле Логин")
    public void loginClick() {
        homePage.loginClick();
        System.out.println("Нажать в поле Логин");
    }

    @Step("Вводятся Логин")
    public void enterLogin(String text) {
        homePage.enterLogin(text);
    }

    @Step("Пароль доступно")
    public void buttonPasswordEnabled() {
        System.out.println("Пароль доступно");
        assertTrue("Пароль не доступно",
                homePage.isbuttonPasswordEnabled());
    }

    @Step("Нажать в поле Пароль")
    public void passwordClick() {
        homePage.passwordClick();
        System.out.println("Нажать в поле Пароль");
    }

    @Step("Вводятся Пароль")
    public void enterPassword(String text2) {
        homePage.enterPassword(text2);
    }

    @Step("Авторизация доступно")
    public void authorizationEnabled() {
        System.out.println("Авторизация доступно");
        assertTrue("Авторизация не доступно",
                homePage.authorizationEnterEnabled());
    }

    @Step("Авторизация войти")
    public void authorizationClick() {
        homePage.authorizationClick();
        System.out.println("Авторизация войти");
    }

    @Step("Имя доступно")
    public void myNameEnabled() {
        assertTrue("Имя не доступно",
                homePage.myNameEnabled());
        System.out.println("Имя доступно");
    }

    @Step("Взять Имя")
    public String getName() {
        return homePage.myNameText();
    }

    @Step("Проверка на Имя")
    public void Equals(String loginname, String namelogin) {
        assertEquals("Что-то пошло не так ", loginname, namelogin);
        System.out.println(" юзер является AutotestUser");
    }

    @Step("Войти в Профиль")
    public void myNameClick() {
        homePage.myNameClick();
    }

    @Step("Выход доступно")
    public void exitEnabled() {
        assertTrue("Выход не доступно",
                homePage.exitEnabled());
    }

    @Step("Нажать Выход")
    public void exitClick() {
        homePage.exitClick();
    }

    @Step("Неверный пароль")
    public void invalidPasswordEnabled() {
        assertTrue("Неверный пароль не доступно", homePage.invalidPasswordEnabled());
    }

    @Step("Взять Текст сообжения Неверный пароль")
    public String getTextInvalidPassword() {
        return homePage.invalidPasswordText();
    }

    @Step("Проверка Неверный пароль")
    public void EqualsLogoPass(String messageError, String textErrorLogin) {
        assertEquals("Что-то пошло не так ", messageError, textErrorLogin);
    }

    @Step("Видео доступно")
    public void videoEnabled() {
        assertTrue("Видео не доступно", homePage.videoEnabled());
    }

    @Step("Взять Текст Видео")
    public String videoText() {
        return homePage.videoText();
    }

    @Step("Нажать Видео")
    public void videoClick() {
        homePage.videoClick();
    }

    @Step(" доступно")
    public void selectTabEnabled() {
        assertTrue(" не доступно", homePage.selectTabEnabled());
    }

    @Step("Взять Текст Таб")
    public String TextTab() {
        return homePage.selectTabText();
    }

    @Step("Проверка страницы")
    public void EqualsSelectTab(String tabSelect, String nav) {
        assertEquals("Что-то пошло не так ", tabSelect, nav);

    }

    @Step("images доступно")
    public void imagesEnabled() {
        assertTrue("images не доступно", homePage.imagesEnabled());
    }

    @Step("Взять Текст images")
    public String imagesText() {
        return homePage.imagesText();
    }

    @Step("Нажать images")
    public void imagesClick() {
        homePage.imagesClick();
    }

    @Step("news доступно")
    public void newsEnabled() {
        assertTrue("news не доступно", homePage.newsEnabled());
    }

    @Step("Взять Текст news")
    public String newsText() {
        return homePage.newsText();
    }

    @Step("Нажать news")
    public void newsClick() {
        homePage.newsClick();
    }

    @Step("maps доступно")
    public void mapsEnabled() {
        assertTrue("maps не доступно", homePage.mapsEnabled());
    }

    @Step("Взять Текст maps")
    public String mapsText() {
        return homePage.mapsText();
    }

    @Step("Нажать maps")
    public void mapsClick() {
        homePage.mapsClick();
    }

    @Step("market доступно")
    public void marketEnabled() {
        assertTrue("market не доступно", homePage.marketEnabled());
    }

    @Step("Взять Текст market")
    public String marketText() {
        return homePage.marketText();
    }

    @Step("Нажать market")
    public void marketClick() {
        homePage.marketClick();
    }

    @Step("translate доступно")
    public void translateEnabled() {
        assertTrue("translate не доступно", homePage.translateEnabled());
    }

    @Step("Взять Текст translate")
    public String translateText() {
        return homePage.translateText();
    }

    @Step("Нажать translate")
    public void translateClick() {
        homePage.translateClick();
    }

    @Step("music доступно")
    public void musicEnabled() {
        assertTrue("music не доступно", homePage.musicEnabled());
    }

    @Step("Взять Текст music")
    public String musicText() {
        return homePage.musicText();
    }

    @Step("Нажать music")
    public void musicClick() {
        homePage.musicClick();
    }
}

