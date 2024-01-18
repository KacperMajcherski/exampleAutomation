package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import core.Constants;
import org.testng.annotations.BeforeTest;
import pages.Pages;

import java.io.IOException;
import java.util.UUID;


import static com.codeborne.selenide.Condition.*;
import static core.Constants.*;

public class TestMain {

    public String generatedEmail;

    @BeforeTest
    public void testPreparation() throws IOException {
        openMainPage();
    }

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
        Pages.navigationMenu.navigateMyAccount();
        Pages.myAccountPage.loginUsernameField.shouldBe(empty).setValue(username);
        Pages.myAccountPage.loginPasswordField.should(Condition.empty).setValue(password);
        Pages.myAccountPage.loginBtn.shouldBe(visible).click();
        Pages.myAccountPage.myAccountTitle.shouldBe(visible);
        Pages.myAccountPage.welcomeMessage.shouldHave(partialText("Hello "+username));
    }

    public void registerUser() {
        //Get a new temporary email from 10MinuteMail.com, then open the main page of https://practice.sdetunicorns.com
        getRandomEmail();
        openMainPage();
        //Navigate to 'My Account', register a new user with a random username and the temporary email
        Pages.navigationMenu.navigateMyAccount();
        Pages.myAccountPage.registrationUsernameField.setValue(randomUsername);
        Pages.myAccountPage.registrationEmailField.setValue(generatedEmail);
        Pages.myAccountPage.registrationPasswordField.setValue(Constants.password);
        Pages.myAccountPage.clickRegisterBtn();
        Pages.myAccountPage.myAccountTitle.shouldBe(visible);
        Pages.myAccountPage.welcomeMessage.shouldHave(Condition.partialText("Hello " + randomUsername));
    }
    public void openMainPage() {
        Selenide.open(Constants.TEST_URL);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        Pages.navigationMenu.homeBtn.should(Condition.visible);
    }

    public void clearCartIfLeftoverItems() {
        Pages.navigationMenu.navigateShoppingCart();
            while (!Pages.shoppingCartPage.removeBtns.isEmpty()) {
                Pages.shoppingCartPage.removeBtns.get(1).click();
                Selenide.sleep(100);
            }
    }
}