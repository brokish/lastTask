package Steps;

import Pages.HomePage;
import io.qameta.allure.Step;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Step("დაკლიკვა დასვენების ღილაკზე")
    public HomePageSteps clickOnRestElement() {
        homePage.restElement.click();
        return this;
    }

    @Step("აჭერს კატეგორიების ღილაკს")
    public HomePageSteps clickCategories(){
        homePage.categoriesButton.click();
        return this;
    }
    @Step("კლიკი რეგისტრაციის ღილაკზე")
    public  HomePageSteps clickRegistration(){
        homePage.regisrationButton.click();
        return this;
    }

}
