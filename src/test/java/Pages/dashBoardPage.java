package Pages;

import Utils.commonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.commonMethods.driver;

public class dashBoardPage extends commonMethods {


    @FindBy (id = "menu_pim_viewPimModule")
    public WebElement PIMOption;


    @FindBy(id="welcome")
    public WebElement welcomeText;

    public dashBoardPage(){

        PageFactory.initElements(driver,this);
    }
}
