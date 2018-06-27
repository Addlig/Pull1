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

    @Step(" доступно")
    public void tabMarketEnabled() {
        assertTrue(" не доступно", homePage.tabMarketEnabled());
    }

    @Step("Взять Текст Таб")
    public String MarketTabText() {
        return homePage.tabMarketTabText();
    }

    @Step("Проверка страницы")
    public void EqualsSelectTab(String tabSelect, String nav) {
        assertTrue(tabSelect.contains(nav));
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

    @Step(" доступно")
    public void tabNewsEnabled() {
        assertTrue(" не доступно", homePage.tabNewsEnabled());
    }

    @Step("maps доступно")
    public void mapsEnabled() {
        assertTrue("maps не доступно", homePage.mapsEnabled());
    }

    @Step("maps доступно")
    public void mapsButtonEnabled() {
        assertTrue("maps не доступно", homePage.mapsButtonEnabled());
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

    @Step("translate доступно")
    public void tabTranslateEnabled() {
        assertTrue("translate не доступно", homePage.tabTranslateEnabled());
    }

    @Step("Взять Текст translate")
    public String tabTranslateText() {
        return homePage.tabTranslateText();
    }

    @Step("music доступно")
    public void musicEnabled() {
        assertTrue("music не доступно", homePage.musicEnabled());
    }

    @Step("Нажать music")
    public void musicClick() {
        homePage.musicClick();
    }

    @Step("music доступно")
    public void musicPageEnabled() {
        assertTrue("music не доступно", homePage.musicPageEnabled());
    }

    @Step("language доступно")
    public void languageEnabled() {
        assertTrue("market не доступно", homePage.languageEnabled());
    }

    @Step("Взять Текст language")
    public String languageText() {
        return homePage.languageText();
    }

    @Step("Нажать language")
    public void languageClick() {
        homePage.languageClick();
    }

    @Step("market доступно")
    public void yetEnabled() {
        assertTrue("market не доступно", homePage.yetEnabled());
    }

    @Step("Нажать language")
    public void yetClick() {
        homePage.yetClick();
    }

    @Step("market доступно")
    public void buttonLanguageEnabled() {
        assertTrue("market не доступно", homePage.buttonLanguageEnabled());
    }

    @Step("Нажать language")
    public void buttonLanguageClick() {
        homePage.buttonLanguageClick();
    }

    @Step("Нажать english")
    public void englishClick() {
        homePage.englishClick();
    }

    @Step("market доступно")
    public void saveEnabled() {
        assertTrue("market не доступно", homePage.saveEnabled());
    }

    @Step("Нажать save")
    public void saveClick() {
        homePage.saveClick();
    }

    @Step("Проверка Неверный пароль")
    public void EqualsLanguage(String lang1, String lang2) {
        assertEquals("Что-то пошло не так ", lang1, lang2);
    }
}

