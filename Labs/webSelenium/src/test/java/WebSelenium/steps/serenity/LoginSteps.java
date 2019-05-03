package WebSelenium.steps.serenity;

import WebSelenium.pages.LoginBiletePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertTrue;

public class LoginSteps {

    LoginBiletePage loginPage;

    @Step
    private void enterEmail(String email){
        loginPage.enterEmail(email);
    }

    @Step
    private void enterPasswd(String paswd){
        loginPage.sendPassword(paswd);
    }

    @StepGroup
    public void enterCredentials(String email, String paswd){
        enterEmail(email);
        enterPasswd(paswd);
    }

    @Step
    private void openLoginPage(){
        loginPage.open();
    }

    @Step
    public void pressLoginButton(){
        loginPage.pressLoginButton();
    }

    @Step
    public void checkLoginDetails(){
        assertTrue(loginPage.getLoginDetails().contains("chise_b@yahoo.com"));
    }

    @Step
    public void checkLoginDetailsFailing(){
        assertTrue(loginPage.getError().equals("Email inexistent sau parola gresita. Incearca din nou!"));
    }

    @Step
    public void login(String email, String paswd){
        openLoginPage();
        enterCredentials(email, paswd);
        pressLoginButton();
    }

    @Step
    public void logout() {
        loginPage.logout();
    }

}
