package Steps;

import Pages.RestPage;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class RestSteps {
    RestPage restPage = new RestPage();

    @Step("სქროლი კეთდება ფასის ინფუთებთან")
    public RestSteps scrollToPrice() {
        JavascriptExecutor js = (JavascriptExecutor) WebDriverRunner.getWebDriver();
        js.executeScript("arguments[0].scrollIntoView()", restPage.searchButton);
        return this;
    }

    @Step("წერს მინიმალურ ფასს")
    public RestSteps setMinPrice() {
        restPage.minimumPrice.setValue("200");
        return this;
    }

    @Step("წერს მაქსიმალურ ფასს")
    public RestSteps setMaxPrice() {
        restPage.maximumPrice.setValue("230");
        return this;
    }

    @Step("აკეთებს კლიკს ძებნაზე")
    public RestSteps clickOnSearch() {
        restPage.searchButton.click();
        return this;
    }

    @Step("ფასების ვალიდაცია")
    public RestSteps priceValidation() {
        for (int i = 0; i < restPage.prices.size(); i++) {
            String price = restPage.prices.get(i).getText();
            price = price.replace("₾", "");
            Assert.assertTrue(Integer.parseInt(price) > 200 && Integer.parseInt(price) < 230);


        }
        return this;
    }
}
