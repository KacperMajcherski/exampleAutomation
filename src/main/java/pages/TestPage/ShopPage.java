package pages.TestPage;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class ShopPage {

    public SelenideElement shopPageTitle = $x("//h1[@class='zak-page-title']");
    public SelenideElement headphonesAddBtn = $x("//a[contains(@aria-label, 'Add to cart: “Headphone”')]");
    public SelenideElement cameraAddBtn = $x("//a[contains(@aria-label, 'Add to cart: “Canon Antique Camera”')]");

}
