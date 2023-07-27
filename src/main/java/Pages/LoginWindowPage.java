package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginWindowPage {
    public SelenideElement loginPage = $(By.id("login-content-1")),
            facebookHomeLinkLogo = $("#facebook");
}
