package pages.TestPage;

import com.codeborne.selenide.SelenideElement;
import pages.Pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class NavigationMenu {

    public SelenideElement homeBtn = $x("//li[@id='menu-item-489']//a[normalize-space()='Home']");
    public SelenideElement shopBtn = $x("//li[@id='menu-item-567']//a[normalize-space()='Shop']");
    public SelenideElement myAccountBtn = $x("//li[@id='menu-item-619']//a[normalize-space()='My account']");
    public SelenideElement shoppingCartBtn = $x("//div[@class='zak-header-actions zak-header-actions--desktop']//a[@title='View your shopping cart']//*[name()='svg']");

    public NavigationMenu navigateShop() {
        Pages.navigationMenu.shopBtn.shouldBe(enabled).click();
        Pages.shopPage.shopPageTitle.shouldBe(visible);
        return new NavigationMenu();
    }

    public NavigationMenu navigateHome() {
        Pages.navigationMenu.homeBtn.shouldBe(enabled).click();
        return new NavigationMenu();
    }

    public NavigationMenu navigateMyAccount(){
        Pages.navigationMenu.myAccountBtn.shouldBe(enabled).click();
        return new NavigationMenu();
    }

    public NavigationMenu navigateShoppingCart(){
        Pages.navigationMenu.shoppingCartBtn.shouldBe(enabled).click();
        return new NavigationMenu();
    }

}
