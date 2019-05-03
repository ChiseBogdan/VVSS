package WebSelenium.features.search;

import WebSelenium.steps.serenity.CalendarSteps;
import WebSelenium.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CalendarBileteroStory {


    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public CalendarSteps calendarSteps;

    @Test
    public void testCalendarWithExpiration(){

        calendarSteps.loadCalendarPage();
        calendarSteps.clickOnExpiringDate();

        try {
            Thread.sleep(1000);
            calendarSteps.clickOnDetailsForExpirationEvent();
            calendarSteps.verifyExpiration();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void testCalendarWithoutExpiration(){

        calendarSteps.loadCalendarPage();

        try {
            Thread.sleep(1000);
            calendarSteps.clickOnOngoingEvent();
            calendarSteps.verifyBuyOption();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
