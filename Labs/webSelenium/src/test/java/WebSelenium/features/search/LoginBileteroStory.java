package WebSelenium.features.search;

import WebSelenium.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginBileteroStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginSteps loginSteps;

    @Test
    public void testLogin(){
        String email = "chise_b@yahoo.com";
        String paswd = "Alisia2015*";

        loginSteps.login(email, paswd);
        loginSteps.checkLoginDetails();
        loginSteps.logout();
    }

    @Test
    public void testLoginFaling(){

        String email = "chise_b@yahoo.com";
        String paswd = "fake";

        loginSteps.login(email, paswd);
        loginSteps.checkLoginDetailsFailing();

    }
}
