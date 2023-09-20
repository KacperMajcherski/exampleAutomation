package pages.TestPage;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.*;

public class Checkout {

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
}
