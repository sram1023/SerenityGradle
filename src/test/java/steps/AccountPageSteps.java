package steps;

import dresscollections.AccountPage;
import net.thucydides.core.annotations.Step;

public class AccountPageSteps {

    private AccountPage accountPage;

    @Step
    public String doSearchDress(String searchKey,String productName){
        return accountPage.searchDress(searchKey,productName);
    }
}
