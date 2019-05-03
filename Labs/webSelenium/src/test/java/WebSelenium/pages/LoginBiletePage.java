package WebSelenium.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.bilete.ro/mvc/Account/Login?ReturnUrl=%2F")
public class LoginBiletePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"Email\"]")
    private WebElementFacade emailLogin;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    private WebElementFacade passwordLogin;

    @FindBy(xpath = "/html/body/main/div[2]/div[2]/section/form/div[5]/div/input")
    private WebElementFacade loginButton;

    @FindBy(xpath = "//*[@id=\"logoutForm\"]/a")
    private WebElementFacade loginDetails;

    @FindBy(xpath = "/html/body/main/div[2]/div[2]/section/form/div[1]/div/div/ul/li")
    private WebElementFacade errorLogin;

    public String getLoginDetails(){
        return loginDetails.getText();
    }

    public String getError(){
        return errorLogin.getText();
    }

    public void enterEmail(String email){
        emailLogin.sendKeys(email);
    }

    public void sendPassword(String pswd){
        passwordLogin.sendKeys(pswd);
    }

    public void pressLoginButton(){
        try {
            Thread.sleep(1000);
            loginButton.click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void logout() {
        loginDetails.click();
    }
}
