package pages.TestPage;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class NavigationMenu {

    public SelenideElement homeBtn = $x("//li[@id='menu-item-489']//a[normalize-space()='Home']");
    public SelenideElement shopBtn = $x("//li[@id='menu-item-567']//a[normalize-space()='Shop']");
    public SelenideElement myAccountBtn = $x("//li[@id='menu-item-619']//a[normalize-space()='My account']");
    public SelenideElement shoppingCart = $x("//div[@class='zak-header-actions zak-header-actions--desktop']//a[@title='View your shopping cart']//*[name()='svg']");

}
