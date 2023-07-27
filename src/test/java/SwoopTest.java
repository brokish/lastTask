import Data.UserData;
import Steps.*;
import Utils.ConfigClass;
import io.qameta.allure.*;
import org.testng.annotations.Test;

@Epic("Swoop Test Validation")
@Feature("Sushi Ordering and Registration")
public class SwoopTest extends ConfigClass {
    HomePageSteps homePageSteps = new HomePageSteps();
    RestSteps restSteps = new RestSteps();
    SushiSteps sushiSteps = new SushiSteps();
    CategoriesSteps categoriesSteps = new CategoriesSteps();
    LoginWindowSteps loginWindowSteps = new LoginWindowSteps();
    registrationSteps registerWindow = new registrationSteps();

    UserData userData = new UserData();

    @Test(groups = "Regression1")
    @Story("Price range validation")
    @Description("Verify the price range and search functionality")
    public void firstMethod() {
        homePageSteps.clickOnRestElement();
        restSteps.scrollToPrice()
                .setMinPrice()
                .setMaxPrice()
                .clickOnSearch()
                .priceValidation();
    }

    @Test(groups = "Regression1")
    @Story("Ascending price sorting validation")
    @Description("Verify the sorting of prices in ascending order")
    public void secondMethod() {
        homePageSteps.clickCategories();
        categoriesSteps.hoverFood()
                .clickOnSushi();
        sushiSteps.addFirstItemFavorites();
        loginWindowSteps.checkLoginPage();
        sushiSteps.CheckVoucherLimit();
    }

    @Test(groups = "Regression2")
    @Story("Validation of prices in descending order")
    @Description("Verify the sorting of prices in descending order")
    public void thirdMethod() {
        homePageSteps.clickCategories();
        categoriesSteps.hoverFood()
                .clickOnSushi();
        sushiSteps.clickSort()
                .clickDecreasingPrice()
                .differenceBetweenPrices();
    }

    @Test(groups = "Regression2")
    @Story("Validation of sharing on Facebook")
    @Description("Verify the sharing functionality on Facebook")
    public void fourthMethod() {
        homePageSteps.clickCategories();
        categoriesSteps.hoverFood()
                .clickOnSushi();
        sushiSteps.clickFirstElement()
                .clickOnShare();
        loginWindowSteps.validateFacebookLoginPage();

    }

    @Test(groups = "Regression2")
    @Story("User registration validation")
    @Description("Verify the user registration process")
    public void fifthMethod() {
        homePageSteps.clickRegistration();
        registerWindow.clickRegister();
        userData.main(null);
        registerWindow.clickRegistrationButton()
                .checkGenderText();
    }

}
