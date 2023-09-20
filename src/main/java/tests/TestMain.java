package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import core.Constants;
import pages.Pages;

import java.util.UUID;

public class TestMain {

    String email;

    public void getRandomEmail() {
        Selenide.open("https://10minutemail.net");
        Pages.tenMinuteMailPage.tenMinuteMailTitle.should(Condition.visible);
        email = Pages.tenMinuteMailPage.emailAddressField.getValue();
        Selenide.closeWebDriver();
    }

    public void openMainPage() {
        Selenide.open(Constants.TEST_URL);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        Pages.mainPage.homeBtn.should(Condition.visible);
    }

    public static String useRandomUUID() {

        UUID randomUUID = UUID.randomUUID();

        return randomUUID.toString().replaceAll("_", "");

    }

}
