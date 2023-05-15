package Steps;

import Utils.commonMethods;
import org.junit.After;
import org.junit.Before;

public class Hooks extends commonMethods {

    @Before
    public void preConditions(){
        openBrowserAndLaunchApplication();
    }
    @After
    public static void closeBrowser() {
        driver.close();
    }
}
