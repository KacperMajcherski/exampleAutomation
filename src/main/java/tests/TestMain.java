package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import core.Constants;
import pages.Pages;

import java.util.UUID;


import static core.Constants.randomUsername;

public class TestMain {

    public String generatedEmail;

    public String getRandomEmail() {
        Selenide.open("https://10minutemail.net");
        Pages.tenMinuteMailPage.tenMinuteMailTitle.should(Condition.visible);
        generatedEmail = Pages.tenMinuteMailPage.emailAddressField.getValue();
        Selenide.closeWebDriver();
        return generatedEmail;
    }

    public static String useRandomUUID() {
        UUID randomUUID = UUID.randomUUID();
        return randomUUID.toString().replaceAll("_", "");
    }

    public void login(String username, String password) {
        openMainPage();
        Pages.navigationMenu.myAccountBtn.should(Condition.visible).click();
        Pages.myAccount.loginUsernameField.should(Condition.empty).setValue(username);
        Pages.myAccount.loginPasswordField.should(Condition.empty).setValue(password);
        Pages.myAccount.loginBtn.should(Condition.visible).click();
    }

    public void registerUser() {
        //Get a new temporary email from 10MinuteMail.com, then open the main page of https://practice.sdetunicorns.com
        getRandomEmail();
        openMainPage();
        //Navigate to 'My Account', register a new user with a random username and the temporary email
        Pages.navigationMenu.myAccountBtn.should(Condition.visible).click();
        Pages.myAccount.registrationUsernameField.setValue(randomUsername);
        Pages.myAccount.registrationEmailField.setValue(generatedEmail);
        Pages.myAccount.registrationPasswordField.setValue(Constants.password);
        Pages.myAccount.registerBtn.should(Condition.visible).click();
        Pages.myAccount.myAccountTitle.should(Condition.visible);
        Pages.myAccount.welcomeMessage.shouldHave(Condition.partialText("Hello " + randomUsername));
    }
    public void openMainPage() {
        Selenide.open(Constants.TEST_URL);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        Pages.navigationMenu.homeBtn.should(Condition.visible);
    }
}