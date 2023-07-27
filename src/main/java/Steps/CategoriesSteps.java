package Steps;

import Pages.CategoriesPage;
import io.qameta.allure.Step;

public class CategoriesSteps {
    CategoriesPage categoriesPage = new CategoriesPage();
    @Step("მიაქვს კურსორი კვებასთან")
    public CategoriesSteps hoverFood() {
        categoriesPage.foodButton.hover();
        return this;
    }
    @Step("კლიკი კეთდება სუშიზე")
    public CategoriesSteps clickOnSushi(){
        categoriesPage.sushiCategory.click();
        return this;
    }
}
