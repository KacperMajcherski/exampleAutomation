package tests.LoginPage;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import pages.Pages;
import tests.TestMain;

import static core.Constants.*;

public class LoginToThePortal extends TestMain {

    @Test
    void loginToThePortal() {
        login(username, password);
        Pages.myAccountPage.myAccountTitle.should(Condition.visible);
        Pages.myAccountPage.welcomeMessage.shouldHave(Condition.partialText("Hello "+username));
    }

}
