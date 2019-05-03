package WebSelenium.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.bilete.ro/calendar")
public class CalendarPage extends PageObject {


    @FindBy(xpath = "/html/body/main/section[2]/div[2]/div[2]/div[3]/a/div/div/div")
    private WebElementFacade expiredEvent;

    @FindBy(xpath = "/html/body/main/section[2]/div[2]/div[6]/div[4]/a/div/div/div")
    private WebElementFacade ongoingEvent;

    @FindBy(xpath = "/html/body/main/section[2]/div/div[1]/div/div[1]/div[4]")
    private WebElementFacade detailsExpirationEvent;

    @FindBy(xpath = "/html/body/main/section[2]/div/div[1]/div/div[1]/div[4]/h5/a")
    private WebElementFacade bileteButton;

    @FindBy(xpath = "/html/body/main/section[2]/div/div/div/div[2]/div/p")
    private WebElementFacade expirationAnnouncement;

    public void clickOnOngoingEvent(){
        ongoingEvent.click();
    }

    public void clickOnDetailsExpirationEvent(){
        detailsExpirationEvent.click();
    }

    public void clickOnExpiredEvent(){
        expiredEvent.click();
    }

    public String getBileteButtonText(){
        return bileteButton.getText();
    }

    public String getAnnouncementText(){
        return expirationAnnouncement.getText();
    }


}
