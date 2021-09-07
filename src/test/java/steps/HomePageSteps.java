package steps;

import pagemethods.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HomePageSteps {

    private HomePage homePage;
    private static final String EXPECTED_LABEL = "YOUR PERSONAL INFORMATION";

    @Step
    public void signIn(){
        homePage.open();
    }

    @Step
    public void accountCreation(){
        homePage.accountCreation();
    }

    @Step
    public void validatePersonalInfo(){
        Assert.assertEquals("Label is not equal",EXPECTED_LABEL,homePage.personalInfoLabel());
    }
}
