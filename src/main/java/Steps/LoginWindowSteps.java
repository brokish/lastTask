package Steps;

import Pages.LoginWindowPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.switchTo;

public class LoginWindowSteps {
    LoginWindowPage loginWindowPage = new LoginWindowPage();
    @Step("ამოწმებს ავტორიზაციის ფანჯარა არის თუარა გამოტანილი")
    public LoginWindowSteps checkLoginPage() {
        loginWindowPage.loginPage.shouldBe(Condition.visible);
        return this;
    }

    @Step("ამოწმებს რომ ფეისბუქის ლოგინ ფეიჯი გამოტანილია")
    public LoginWindowSteps validateFacebookLoginPage(){
        switchTo().window(1);
        loginWindowPage.facebookHomeLinkLogo.shouldBe(Condition.visible);
        return this;
    }
}
