package Steps;

import Pages.registrationPage;
import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;


public class registrationSteps {
    registrationPage registration = new registrationPage();

    @Step("კლიკს აკეთებს რეგისტრაციაზე")
    public registrationSteps clickRegister() {
        registration.register.click();
        return this;
    }

    @Step("SQL ბაზის გამოყენებით ავსებს სარეგისტრაციო ფორმას")
    public void fillRegistrationForm(String firstName, String lastName, String phone, String email,
                                     String dateOfBirth, String password) {
        registration.firstNameInput.setValue(firstName);
        registration.lastNameInput.setValue(lastName);
        registration.phoneInput.setValue(phone);
        registration.emailInput.setValue(email);
        registration.dateOfBirthInput.setValue(dateOfBirth);
        registration.passwordInput.setValue(password);
        registration.confirmPasswordInput.setValue(password);
    }

    @Step("კლიკი რეგისტრაციის ღილაკზე")
    public registrationSteps clickRegistrationButton() {
        registration.registrationButton.click();
        return this;
    }

    @Step("ამოწმებს გენდერის არჩევის მესიჯს")
    public registrationSteps checkGenderText() {
        SoftAssert softAssert = new SoftAssert();
        String expectedText = "გთხოვთ აირჩიოთ სქესი!";
        String actualText = registration.genderText.getText();
        softAssert.assertEquals(actualText, expectedText, "მოთხოვნის ტექსტი არ ემთხვევა!");
        softAssert.assertAll();
        return this;
    }
}
