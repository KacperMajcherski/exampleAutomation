package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class TestPage {

    public SelenideElement homeBtn = $x("//li[@id='menu-item-489']//a[normalize-space()='Home']");
    public SelenideElement myAccountBtn = $x("//li[@id='menu-item-619']//a[normalize-space()='My account']");
    public SelenideElement registrationUsernameField = $x("//input[@id='reg_username']");
    public SelenideElement registrationEmailField = $x("")
    public SelenideElement registrationPasswordField = $x("//input[@id='reg_password']");

}
