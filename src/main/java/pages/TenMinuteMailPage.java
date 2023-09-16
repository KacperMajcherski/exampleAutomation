package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TenMinuteMailPage extends Pages {

    public SelenideElement emailAddress = $(By.className("value-text"));
    public SelenideElement tenMinuteMailTitle = $(By.className("ui-title"));

}
