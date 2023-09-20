package pages.TestPage;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class Cart {

    public SelenideElement proceedCheckoutBtn = $x("//a[@class='checkout-button button alt wc-forward']");
    public SelenideElement headphonesCart = $x("//a[normalize-space()='Headphone']");
    public SelenideElement toysCart = $x("//a[normalize-space()='Toys']");
    public SelenideElement cameraCart = $x("//a[normalize-space()='Canon Antique Camera']");

}
