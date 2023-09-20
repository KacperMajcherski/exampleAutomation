package pages.TestPage;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class Shop {

    public SelenideElement shopPageTitle = $x("//h1[@class='zak-page-title']");
    public SelenideElement headphonesAddBtn = $x("//a[@aria-label='Add “Headphone” to your cart']");
    public SelenideElement cameraAddBtn = $x("//a[@aria-label='Add “Canon Antique Camera” to your cart']");

}
