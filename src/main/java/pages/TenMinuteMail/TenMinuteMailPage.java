package pages.TenMinuteMail;

import com.codeborne.selenide.SelenideElement;
import pages.Pages;

import static com.codeborne.selenide.Selenide.$x;

public class TenMinuteMailPage extends Pages {

    public SelenideElement tenMinuteMailTitle = $x("//h2[normalize-space()='Witamy w 10-Minutowym Mailu']");
    public SelenideElement emailAddressField = $x("//input[@id='fe_text']");


}
