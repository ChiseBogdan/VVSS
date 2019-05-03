package WebSelenium.steps.serenity;

import WebSelenium.pages.CalendarPage;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertTrue;

public class CalendarSteps {

    CalendarPage calendarPage;

    @Step
    public void loadCalendarPage(){
        calendarPage.open();
    }

    @Step
    public void clickOnExpiringDate(){
        calendarPage.clickOnExpiredEvent();
    }

    @Step
    public void clickOnOngoingEvent(){
        calendarPage.clickOnOngoingEvent();
    }

    @Step
    public void verifyBuyOption(){
        assertTrue(calendarPage.getBileteButtonText().contains("BILETE"));
    }

    @Step
    public void clickOnDetailsForExpirationEvent(){
        calendarPage.clickOnDetailsExpirationEvent();
    }

    @Step
    public void verifyExpiration(){
        assertTrue(calendarPage.getAnnouncementText().equals("Evenimentul a expirat."));
    }
}
