package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import core.Constants;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Pages;

public class RegisterNewUser {

    String username = "kacperTest";
    String email;
    String password = "Start123!";

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        Selenide.open("https://10minutemail.net");
        Pages.tenMinuteMailPage.tenMinuteMailTitle.should(Condition.visible);
        //Get the 10-minute-email
        email = Pages.tenMinuteMailPage.emailAddress.getText();
        Selenide.closeWebDriver();
        Selenide.open(Constants.TEST_URL);
        Pages.testPage.homeBtn.should(Condition.visible);
    }
    @AfterClass(alwaysRun = true)
    public void afterClass() {
        Selenide.closeWebDriver();
    }

    @Test
    public void registerNewUser() {
    //Navigate to 'My Account'
    Pages.testPage.myAccountBtn.click();



    }
}
