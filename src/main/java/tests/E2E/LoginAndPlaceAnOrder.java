package tests.E2E;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import core.Constants;
import org.testng.annotations.Test;
import pages.Pages;
import tests.TestMain;

public class LoginAndPlaceAnOrder extends TestMain {

    String username = Constants.randomUsername;
    String password = Constants.password;
    String generatedEmail = getRandomEmail();
    String email = generatedEmail;


    @Test
    public void loginAndPlaceAnOrder() {
        //Register a new user
        registerUser();
        Selenide.closeWebDriver();
        //Open the page and login
        login(username,password);
        Pages.myAccount.myAccountTitle.should(Condition.visible);
        Pages.myAccount.welcomeMessage.shouldHave(Condition.partialText("Hello "+username));
        //Navigate to Shop
        Pages.navigationMenu.shopBtn.should(Condition.visible).click();
        Pages.shop.shopPageTitle.should(Condition.visible);
        //Add some products to cart
        Pages.shop.cameraAddBtn.should(Condition.visible).click();
        Selenide.sleep(1000);
        Pages.shop.headphonesAddBtn.should(Condition.visible).click();
        Selenide.sleep(1000);
        Pages.navigationMenu.shoppingCart.should(Condition.visible).click();
        //Proceed to checkout
        Pages.cart.cameraCart.should(Condition.visible);
        Pages.cart.headphonesCart.should(Condition.visible);
        Pages.cart.proceedCheckoutBtn.should(Condition.visible).click();
        //Enter all information and place order
        Pages.checkout.firstNameInput.should(Condition.empty).setValue("Kacper");
        Pages.checkout.lastNameInput.should(Condition.empty).setValue("Test");
        Pages.checkout.countryDropdown.selectOptionContainingText("Poland");
        Pages.checkout.streetInput.should(Condition.empty).setValue("Street");
        Pages.checkout.postcodeInput.should(Condition.empty).setValue("60-681");
        Pages.checkout.townInput.should(Condition.empty).setValue("Poznan");
        Pages.checkout.phoneInput.should(Condition.empty).setValue("123456789");
        Pages.checkout.emailInput.setValue(email);
        Pages.checkout.placeOrderBtn.should(Condition.visible).click();
        Pages.checkout.checkoutPageTitle.should(Condition.visible);
        Pages.checkout.orderDetailsTable.should(Condition.visible);
    }
}
