package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    public SelenideElement restElement = $(By.xpath("//div[contains(@style, '/Images/NewDesigneImg/ReHeader/travel.svg')]")),
            categoriesButton = $(By.className("NewCategories")),
            foodButton =  $("a.mainCategories[href='/category/15/restornebi-da-barebi']"),
            regisrationButton = $x("//div[@class='HeaderTools swoop-login']");
}
