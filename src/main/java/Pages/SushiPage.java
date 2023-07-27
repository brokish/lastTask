package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SushiPage {
    public ElementsCollection allPrices = $$(By.xpath("//div[@class='category-in-main']//div[@class='special-offer']//div[@class='discounted-prices']/p[1]"));
    public SelenideElement favorite = $(By.xpath("//div[@class=\"deal-box-wishlist\"][1]")),
            sortElement = $("#sort"),
            decreasingPrice = $(By.xpath("//select[@id='sort']/option[2]")),
            firstElement = $(By.xpath("(//div[@class='special-offer'])[1]")),
            shareElement = $(By.xpath("//span[text()='გაზიარება']")),
            voucherLimit = $(".voucher-limit");

}
