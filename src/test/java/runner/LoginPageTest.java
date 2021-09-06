package runner;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HomePageSteps;

@RunWith(SerenityRunner.class)
public class LoginPageTest {

    @Steps
    HomePageSteps homePageSteps;

    @Managed()
    WebDriver browser;

    @Test
    public void login(){
        homePageSteps.signIn();
        homePageSteps.accountCreation();
        homePageSteps.validatePersonalInfo();
    }

}
