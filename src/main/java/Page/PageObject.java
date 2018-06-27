package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageObject {

    BaseTest basetest = new BaseTest();

    @FindBy(css = "a[data-statlog=\"notifications.mail.logout.domik.login.big\"]") private WebElement buttonEnter;
    @FindBy(css = "input[name = \"login\"]") private WebElement login;
    @FindBy(css = "input[type = \"password\"]") private WebElement password;
    @FindBy(css = "span[class = \"passport-Button-Text\"]") private WebElement authorization;
    @FindBy(css = "[class = \"mail-User-Name\"]") private WebElement myName;
    @FindBy(css = "[data-metric = \"Выход\"]") private WebElement Exit;
    @FindBy(css = "[class = \"passport-Domik-Form-Error passport-Domik-Form-Error_active\"]") private WebElement invalid;
    @FindBy(css = "[data-id = \"video\"]") private WebElement video;
    @FindBy(css = "[data-id = \"images\"]") private WebElement images;
    @FindBy(css = "[data-id = \"news\"]") private WebElement news;
    @FindBy(css = "[data-id = \"maps\"]") private WebElement maps;
    @FindBy(css = "[data-id = \"market\"]") private WebElement market;
    @FindBy(css = "[data-id = \"translate\"]") private WebElement translate;
    @FindBy(css = "[data-id = \"music\"]") private WebElement music;
    @FindBy(css = "[class = \"tabs-navigation__tab-over-inner\"]") private WebElement selectTab;
    @FindBy(css = "[title = \"Новости\"]") private WebElement tabNews;
    @FindBy(css = ".logo_part_market>span") private WebElement tabMarket;
    @FindBy(css = ".button_air-large") private WebElement mapsButton;
    @FindBy(css = ".name>span") private WebElement tabTranslate;
    @FindBy(css = "[data-name = \"radio\"]") private WebElement musicPage;
    @FindBy(css = ".link__inner>span") private WebElement language;
    @FindBy(css = "[aria-label = \"ещё\"]") private WebElement yet;
    @FindBy(css = "[type = \"button\"]") private WebElement buttonLanguage;
    @FindBy(xpath = "//*[@class='select__text'][text()='English']") private WebElement english;
    @FindBy(css = ".form__save") private WebElement save;

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
        return login.isEnabled();
    }

    public void loginClick() {
        login.click();
    }

    public void enterLogin(String text) {
        login.sendKeys(text);
    }

    public boolean isbuttonPasswordEnabled() {
        return password.isEnabled();
    }

    public void passwordClick() {
        password.click();
    }

    public void enterPassword(String text2) {
        password.sendKeys(text2);
    }

    public boolean authorizationEnterEnabled() {
        return authorization.isEnabled();
    }

    public void authorizationClick() {
        authorization.click();
    }

    public boolean myNameEnabled() {
        return myName.isEnabled();
    }

    public String myNameText() {
        return myName.getText();
    }

    public void myNameClick() {
        myName.click();
    }

    public boolean exitEnabled() {
        return Exit.isEnabled();
    }

    public void exitClick() {
        Exit.click();
    }

    public boolean invalidPasswordEnabled() {
        return invalid.isEnabled();
    }

    public String invalidPasswordText() {
        System.out.println(invalid.getText());
        return invalid.getText();
    }

    public boolean videoEnabled() {
        return video.isEnabled();
    }

    public String videoText() {
        System.out.println(video.getText());
        return video.getText();
    }

    public void videoClick() {
        video.click();
    }

    public boolean selectTabEnabled() {
        return selectTab.isEnabled();
    }

    public boolean tabMarketEnabled() {
        return tabMarket.isEnabled();
    }

    public String selectTabText() {
        System.out.println(selectTab.getText());
        return selectTab.getText();
    }

    public String tabMarketTabText() {
        System.out.println(tabMarket.getText());
        return tabMarket.getText();
    }

    public boolean imagesEnabled() {
        return images.isEnabled();
    }

    public String imagesText() {
        System.out.println(images.getText());
        return images.getText();
    }

    public void imagesClick() {
        images.click();
    }

    public boolean newsEnabled() {
        return news.isEnabled();
    }

    public String newsText() {
        System.out.println(news.getText());
        return news.getText();
    }

    public void newsClick() {
        news.click();
    }

    public boolean tabNewsEnabled() {
        return tabNews.isEnabled();
    }

    public boolean mapsEnabled() {
        return maps.isEnabled();
    }

    public void mapsClick() {
        maps.click();
    }

    public boolean mapsButtonEnabled() {
        return mapsButton.isEnabled();
    }

    public boolean marketEnabled() {
        return market.isEnabled();
    }

    public String marketText() {
        return market.getText();
    }

    public void marketClick() {
        market.click();
    }

    public boolean translateEnabled() {
        return translate.isEnabled();
    }

    public String translateText() {
        return translate.getText();
    }

    public void translateClick() {
        translate.click();
    }

    public boolean tabTranslateEnabled() {
        return tabTranslate.isEnabled();
    }

    public String tabTranslateText() {
        return tabTranslate.getText();
    }

    public boolean musicEnabled() {
        return music.isEnabled();
    }

    public void musicClick() {
        music.click();
    }

    public boolean musicPageEnabled() {
        return musicPage.isEnabled();
    }

    public boolean languageEnabled() {
        return language.isEnabled();
    }

    public String languageText() {
        System.out.println(language.getText());
        return language.getText();
    }

    public void languageClick() {
        language.click();
    }

    public boolean yetEnabled() {
        return yet.isEnabled();
    }

    public void yetClick() {
        yet.click();
    }

    public boolean buttonLanguageEnabled() {
        return buttonLanguage.isEnabled();
    }

    public void buttonLanguageClick() {
        buttonLanguage.click();
    }

    public void englishClick() {
        english.click();
    }

    public boolean saveEnabled() {
        return save.isEnabled();
    }

    public void saveClick() {
        save.click();
    }
}




