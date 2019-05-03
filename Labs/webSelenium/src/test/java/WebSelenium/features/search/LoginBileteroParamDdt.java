package WebSelenium.features.search;

import WebSelenium.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/data.csv")
public class LoginBileteroParamDdt {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginSteps loginSteps;

    @Test
    public void testLogin(){

        loginSteps.login(getEmail(), getPassword());
        loginSteps.checkLoginDetails();
        loginSteps.logout();
    }

    public String email;
    public String password;

    @Qualifier
    public String getQualifier(){
        return email;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
