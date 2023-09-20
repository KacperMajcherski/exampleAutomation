package tests;

import com.codeborne.selenide.Condition;
import core.Constants;
import org.testng.annotations.Test;
import pages.Pages;
import static core.Constants.randomUsername;

public class RegisterNewUser extends TestMain {

    @Test
    public void registerNewUser() {
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
    Pages.myAccount.welcomeMessage.shouldHave(Condition.partialText("Hello "+randomUsername));

    }
}
