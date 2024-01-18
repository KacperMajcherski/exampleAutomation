package pages.TestPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class ShoppingCartPage {

    public SelenideElement proceedCheckoutBtn = $x("//a[@class='checkout-button button alt wc-forward']");
    public SelenideElement headphonesCart = $x("//a[normalize-space()='Headphone']");
    public ElementsCollection removeBtns = $$(By.className("product-remove"));
    public SelenideElement cameraCart = $x("//a[normalize-space()='Canon Antique Camera']");

}
