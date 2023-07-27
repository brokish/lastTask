package Steps;

import Pages.SushiPage;
import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Condition.attribute;

public class SushiSteps {
    SushiPage sushiPage = new SushiPage();
    SoftAssert softAssert = new SoftAssert();
    @Step("ამატებს დინამიურად პირველ ელემენტს ფავორიტებში")
    public SushiSteps addFirstItemFavorites() {
        sushiPage.favorite.click();
        return this;
    }

    @Step("შლის სორტირების ტიპებს")
    public SushiSteps clickSort() {
        sushiPage.sortElement.click();
        return this;
    }

    @Step("აკლიკებს კლებად ფასს")
    public SushiSteps clickDecreasingPrice() {
        sushiPage.decreasingPrice.click();
        return this;
    }

    @Step("აკეთებს ვალიდაციას, რომ პირველი ფასი მეტია მეორეზე")
    public SushiSteps differenceBetweenPrices() {
        String firsPrice = sushiPage.allPrices.get(0).getText();
        String secondPrice = sushiPage.allPrices.get(1).getText();
        int firstPriceNumber = Integer.parseInt(firsPrice.replace("₾", ""));
        int secondPriceNumber = Integer.parseInt(secondPrice.replace("₾", ""));
        softAssert.assertTrue(firstPriceNumber > secondPriceNumber);
        softAssert.assertAll();
        return this;
    }

    @Step("დინამიურად აკლიკებს პირველ ელემენტს")
    public SushiSteps clickFirstElement() {
        sushiPage.firstElement.click();
        return this;
    }

    @Step("აკლიკებს გაზიარების ღილაკს")
    public SushiSteps clickOnShare() {
        sushiPage.shareElement.click();
        return this;
    }
    @Step("ამოწმებს ვაუჩერები ხოარაა ამოყიდული")
    public SushiSteps CheckVoucherLimit(){
        sushiPage.voucherLimit.shouldNotHave(attribute("style", "width: 100%;"));
        return this;
    }
}
