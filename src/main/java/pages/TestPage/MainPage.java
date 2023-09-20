package pages.TestPage;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    public SelenideElement homeBtn = $x("//li[@id='menu-item-489']//a[normalize-space()='Home']");
    public SelenideElement myAccountBtn = $x("//li[@id='menu-item-619']//a[normalize-space()='My account']");

}
