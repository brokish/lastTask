package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CategoriesPage {
    public SelenideElement foodButton =  $("a.mainCategories[href='/category/15/restornebi-da-barebi']"),
            sushiCategory =  $(By.xpath("//div[@class='mobileSubCategories subCategory-3 openedMenu']//a[text()='სუში']"));
}
