package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class registrationPage {
    public SelenideElement firstNameInput = $("#pFirstName"),
            register = $(By.className("register")),
            lastNameInput = $("#pLastName"),
            phoneInput = $("#pPhone"),
            emailInput = $("#pEmail"),
            dateOfBirthInput = $("#pDateBirth"),
            passwordInput = $("#pPassword"),
            confirmPasswordInput = $("#pConfirmPassword"),
            registrationButton = $(byXpath("//input[@value='რეგისტრაცია']")),
            genderText = $("#physicalInfoMassage");

}
