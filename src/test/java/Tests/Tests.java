package Tests;

import Page.BaseSteps;
import Page.BaseTest;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class Tests {

    BaseSteps homeSteps;
    private String  loginname = "AutotestUser";
    private String  password ="AutotestUser123";
    private String  invalidPassword ="NoAutotestUser123";
    private String textErrorPassword = "Неверный пароль";
    private String invalidLoginname = "NoAutotestUser123";
    private String textErrorLogin = "Такого аккаунта нет";


    @AfterClass
    public static void afterClass() {
        BaseTest.closeDriver();
    }

    @Before
    public void before() {
        homeSteps = new BaseSteps(BaseTest.getDriver());
        homeSteps.prepare();
        homeSteps.open();
    }

    @Test
    public void first() {
        homeSteps.buttonEnterEnabled();
        homeSteps.buttonClick();
        homeSteps.buttonLoginEnabled();
        homeSteps.loginClick();
        homeSteps.enterLogin(loginname);
        homeSteps.buttonPasswordEnabled();
        homeSteps.passwordClick();
        homeSteps.enterPassword(password);
        homeSteps.authorizationEnabled();
        homeSteps.authorizationClick();
        homeSteps.myNameEnabled();
        String namelogin = homeSteps.getName();
        homeSteps.Equals(loginname, namelogin);
        BaseTest.closeDriver();
    }

    @Test
    public void lockout() {
        homeSteps.buttonEnterEnabled();
        homeSteps.buttonClick();
        homeSteps.buttonLoginEnabled();
        homeSteps.loginClick();
        homeSteps.enterLogin(loginname);
        homeSteps.buttonPasswordEnabled();
        homeSteps.passwordClick();
        homeSteps.enterPassword(password);
        homeSteps.authorizationEnabled();
        homeSteps.authorizationClick();
        homeSteps.myNameEnabled();
        homeSteps.myNameClick();
        homeSteps.exitEnabled();
        homeSteps.exitClick();
        homeSteps.buttonEnterEnabled();
        BaseTest.closeDriver();
    }
    @Test
    public void invalidpassword() {
        homeSteps.buttonEnterEnabled();
        homeSteps.buttonClick();
        homeSteps.buttonLoginEnabled();
        homeSteps.loginClick();
        homeSteps.enterLogin(loginname);
        homeSteps.buttonPasswordEnabled();
        homeSteps.passwordClick();
        homeSteps.enterPassword(invalidPassword);
        homeSteps.authorizationEnabled();
        homeSteps.authorizationClick();
        homeSteps.invalidPasswordEnabled();
        String messageErrorPassword = homeSteps.getTextInvalidPassword();
        homeSteps.EqualsLogoPass(messageErrorPassword, textErrorPassword);
        BaseTest.closeDriver();
    }

    @Test
    public void invalidlogin() {
        homeSteps.buttonEnterEnabled();
        homeSteps.buttonClick();
        homeSteps.buttonLoginEnabled();
        homeSteps.loginClick();
        homeSteps.enterLogin(invalidLoginname);
        homeSteps.buttonPasswordEnabled();
        homeSteps.passwordClick();
        homeSteps.enterPassword(password);
        homeSteps.authorizationEnabled();
        homeSteps.authorizationClick();
        homeSteps.invalidPasswordEnabled();
        String messageError = homeSteps.getTextInvalidPassword();
        homeSteps.EqualsLogoPass(messageError, textErrorLogin);
        BaseTest.closeDriver();
    }

    @Test
    public void navigation() {
        homeSteps.videoEnabled();
        String nav = homeSteps.videoText();
        homeSteps.videoClick();
        homeSteps.selectTabEnabled();
        String tabSelect = homeSteps.TextTab();
        homeSteps.EqualsSelectTab(tabSelect, nav);
        homeSteps.back();

        homeSteps.imagesEnabled();
        nav = homeSteps.imagesText();
        homeSteps.imagesClick();
        homeSteps.selectTabEnabled();
        tabSelect = homeSteps.TextTab();
        homeSteps.EqualsSelectTab(tabSelect, nav);
        homeSteps.back();

        homeSteps.newsEnabled();
        nav = homeSteps.newsText();
        homeSteps.newsClick();
        homeSteps.selectTabEnabled();
        tabSelect = homeSteps.TextTab();
        homeSteps.EqualsSelectTab(tabSelect, nav);
        homeSteps.back();

        homeSteps.mapsEnabled();
        nav = homeSteps.mapsText();
        homeSteps.mapsClick();
        homeSteps.selectTabEnabled();
        tabSelect = homeSteps.TextTab();
        homeSteps.EqualsSelectTab(tabSelect, nav);
        homeSteps.back();

        homeSteps.marketEnabled();
        nav = homeSteps.marketText();
        homeSteps.marketClick();
        homeSteps.selectTabEnabled();
        tabSelect = homeSteps.TextTab();
        homeSteps.EqualsSelectTab(tabSelect, nav);
        homeSteps.back();

        homeSteps.translateEnabled();
        nav = homeSteps.translateText();
        homeSteps.translateClick();
        homeSteps.selectTabEnabled();
        tabSelect = homeSteps.TextTab();
        homeSteps.EqualsSelectTab(tabSelect, nav);
        homeSteps.back();

        homeSteps.musicEnabled();
        nav = homeSteps.musicText();
        homeSteps.musicClick();
        homeSteps.selectTabEnabled();
        tabSelect = homeSteps.TextTab();
        homeSteps.EqualsSelectTab(tabSelect, nav);
        BaseTest.closeDriver();

    }
}

