package pages.TestPage;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class MyAccount {

    public SelenideElement registrationUsernameField = $x("//input[@id='reg_username']");
    public SelenideElement registrationEmailField = $x("//input[@id='reg_email']");
    public SelenideElement registrationPasswordField = $x("//input[@id='reg_password']");
    public SelenideElement registerBtn = $x("//button[@name='register']");
    public SelenideElement loginUsernameField = $x("//input[@id='username']");
    public SelenideElement loginPasswordField = $x("//input[@id='password']");
    public SelenideElement loginBtn = $x("//button[@name='login']");
    public SelenideElement myAccountTitle = $x("//h1[contains(@class, 'zak-page-title') and normalize-space(text()) = 'My account']");
    public SelenideElement welcomeMessage = $x("//p[contains(text(),'Hello')]");
    public SelenideElement accDetailsTab = $x("//a[normalize-space()='Account details']");
    public SelenideElement accDetailsEmailInput = $x("//input[@id='account_email']");
}
