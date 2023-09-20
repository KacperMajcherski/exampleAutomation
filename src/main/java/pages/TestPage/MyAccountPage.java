package pages.TestPage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MyAccountPage {

    public SelenideElement registrationUsernameField = $x("//input[@id='reg_username']");
    public SelenideElement registrationEmailField = $x("//input[@id='reg_email']");
    public SelenideElement registrationPasswordField = $x("//input[@id='reg_password']");
    public SelenideElement registerBtn = $x("//button[@name='register']");
    public SelenideElement myAccountTitle = $x("//h1[contains(@class, 'zak-page-title') and normalize-space(text()) = 'My account']");
    public SelenideElement welcomeMessage = $x("//p[contains(text(),'Hello')]");
}
