package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class ConfigClass  {

    @BeforeMethod(alwaysRun = true)
    public void setup(){
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        open("https://www.swoop.ge");
        Configuration.timeout = 30000;



    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
