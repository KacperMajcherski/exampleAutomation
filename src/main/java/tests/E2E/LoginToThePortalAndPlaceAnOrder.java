package tests.E2E;

import com.codeborne.selenide.Selenide;

import core.Constants;
import org.testng.annotations.Test;
import pages.Pages;
import tests.TestMain;

import static com.codeborne.selenide.Condition.*;


public class LoginToThePortalAndPlaceAnOrder extends TestMain {

    String username = Constants.username;
    String password = Constants.password;
    String email = Constants.email;

    @Test
    void loginAndPlaceAnOrder() {
        //Open the page and login
        login(username,password);
        //Remove any leftover items from the cart, if there are any
        clearCartIfLeftoverItems();
        //Navigate to Shop
        Pages.navigationMenu.navigateShop();
        //Add some products to cart
        Pages.shopPage.cameraAddBtn.shouldBe(enabled).click();
        Selenide.sleep(1000);
        Pages.shopPage.headphonesAddBtn.shouldBe(enabled).click();
        Selenide.sleep(1000);
        Pages.navigationMenu.navigateShoppingCart();
        //Proceed to checkout
        Pages.shoppingCartPage.cameraCart.shouldBe(visible);
        Pages.shoppingCartPage.headphonesCart.shouldBe(visible);
        Pages.shoppingCartPage.proceedCheckoutBtn.shouldBe(visible).click();
        //Enter all information and place order. If this user has already used the shop, some of his data are prefilled.
        Pages.checkoutPage.enterUsername("Kacper");
        Pages.checkoutPage.enterLastName("Test");
        Pages.checkoutPage.chooseCountryFromDropdown("Poland");
        Pages.checkoutPage.enterStreet("Street");
        Pages.checkoutPage.enterPostcode("60-681");
        Pages.checkoutPage.enterTown("Poznan");
        Pages.checkoutPage.enterPhoneNo("123456789");
        Pages.checkoutPage.enterEmail(email);
        Pages.checkoutPage.placeOrderBtn.shouldBe(enabled).click();
        Pages.checkoutPage.checkoutPageTitle.shouldBe(visible);
        Pages.checkoutPage.orderDetailsTable.shouldBe(visible);
    }
}
