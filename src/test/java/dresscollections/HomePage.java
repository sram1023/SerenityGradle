package dresscollections;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

//@DefaultUrl("http://automationpractice.com/index.php")
public class HomePage extends PageObject {

    public void accountCreation(){
        $("//*[@id='header']/div[2]/div/div/nav/div[1]/a").click();
        $("//*[@id='email_create']").sendKeys("yorkii@hub.com");
        $("//*[@id='SubmitCreate']").click();
        waitFor((WebElementFacade) $("//*[@id='account-creation_form']/div[1]/h3"));
    }

    public String personalInfoLabel(){
        return $("//*[@id='account-creation_form']/div[1]/h3").getText();
    }

}
