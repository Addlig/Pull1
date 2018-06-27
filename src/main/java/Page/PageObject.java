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

    public String selectTabText() {
        System.out.println(selectTab.getText());
        return selectTab.getText();
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

    public boolean mapsEnabled() {
        return maps.isEnabled();
    }

    public String mapsText() {
        System.out.println(maps.getText());
        return maps.getText();
    }

    public void mapsClick() {
        maps.click();
    }

    public boolean marketEnabled() {
        return market.isEnabled();
    }

    public String marketText() {
        System.out.println(market.getText());
        return market.getText();
    }

    public void marketClick() {
        market.click();
    }

    public boolean translateEnabled() {
        return translate.isEnabled();
    }

    public String translateText() {
        System.out.println(translate.getText());
        return translate.getText();
    }

    public void translateClick() {
        translate.click();
    }

    public boolean musicEnabled() {
        return music.isEnabled();
    }

    public String musicText() {
        System.out.println(music.getText());
        return music.getText();
    }

    public void musicClick() {
        music.click();
    }
}




