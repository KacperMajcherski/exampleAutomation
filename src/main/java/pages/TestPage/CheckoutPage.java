package pages.TestPage;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.*;

public class CheckoutPage {

    public SelenideElement countryDropdown = $x("//select[@id='billing_country']");
    public SelenideElement firstNameInput = $x("//input[@id='billing_first_name']");
    public SelenideElement lastNameInput = $x("//input[@id='billing_last_name']");
    public SelenideElement streetInput = $x("//input[@id='billing_address_1']");
    public SelenideElement townInput = $x("//input[@id='billing_city']");
    public SelenideElement postcodeInput = $x("//input[@id='billing_postcode']");
    public SelenideElement phoneInput = $x("//input[@id='billing_phone']");
    public SelenideElement emailInput = $x("//input[@id='billing_email']");
    public SelenideElement placeOrderBtn = $x("//button[@id='place_order']");
    public SelenideElement checkoutPageTitle = $x("//h1[@class='zak-page-title']");
    public SelenideElement orderDetailsTable = $x("//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received']");

    public void enterUsername(String firstName) {
        firstNameInput.shouldBe(enabled).setValue(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.shouldBe(enabled).setValue(lastName);
    }

    public void chooseCountryFromDropdown(String option) {
        countryDropdown.shouldBe(enabled).selectOptionContainingText(option);
    }

    public void enterStreet(String street) {
        streetInput.shouldBe(enabled).setValue(street);
    }

    public void enterPostcode(String postcode) {
        postcodeInput.shouldBe(enabled).setValue(postcode);
    }

    public void enterTown(String town) {
        townInput.shouldBe(enabled).setValue(town);
    }

    public void enterPhoneNo(String phoneNumber) {
        phoneInput.shouldBe(enabled).setValue(phoneNumber);
    }

    public void enterEmail(String email) {
        emailInput.shouldBe(enabled).setValue(email);
    }
}
