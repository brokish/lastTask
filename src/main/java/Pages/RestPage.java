package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RestPage {
    public ElementsCollection prices =$$(By.xpath("//div[@class='discounted-prices']/p[1]"));
   public SelenideElement minimumPrice = $(By.xpath("//div[@class= 'category-filter-desk']//input[@name='minprice']")),
           maximumPrice = $(By.xpath("//div[@class= 'category-filter-desk']//input[@name='maxprice']")),
           searchButton = $(By.xpath("//div[@class= 'category-filter-desk']//div[@class ='submit-button']"));
}
