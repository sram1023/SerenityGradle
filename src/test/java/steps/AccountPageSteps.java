package steps;

import pagemethods.AccountPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AccountPageSteps {

    private AccountPage accountPage;

    @Step
    public void doSearchDress(String searchKey,String productName){
        String actual = accountPage.searchDress(searchKey,productName);
        Assert.assertEquals("Text is not matched","Blouse",actual);
    }
}
