package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class TestPage {

    public SelenideElement homeBtn = $x("//li[contains(@id,'menu-item-489'");
    public SelenideElement myAccountBtn = $x("//li[contains(@id,'menu-item-619'");

}
