package runner;

import dresscollections.AccountPage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.AccountPageSteps;
import steps.HomePageSteps;

@RunWith(SerenityRunner.class)
public class AccountPageTest {

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    AccountPageSteps accountPageSteps;

    @Managed()
    WebDriver browser;

    @Before
    public void setup(){
        homePageSteps.signIn();
        homePageSteps.accountCreation();
    }

    @Test
    public void searchProduct(){
        String actual  = accountPageSteps.doSearchDress("Dress","Blouses > Blouse");
        Assert.assertEquals("Text is not matched","Blouse",actual);
    }

}
