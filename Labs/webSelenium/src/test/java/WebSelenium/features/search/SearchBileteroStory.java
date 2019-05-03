package WebSelenium.features.search;

import WebSelenium.steps.serenity.LoginSteps;
import WebSelenium.steps.serenity.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.Scanner;

@RunWith(SerenityRunner.class)
public class SearchBileteroStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public SearchSteps searchSteps;

    @Test
    public void testSearch(){
        searchSteps.loadSearchPage();
        searchSteps.addSearchText("Romania-Malta");
        searchSteps.pressSearchButton();
        searchSteps.verifySearchResults("Malta - Romania - Euro2020");
    }

    @Test
    public void testSearchFailing(){
        searchSteps.loadSearchPage();
        searchSteps.addSearchText("Romania-Malta");
        searchSteps.pressSearchButton();
        searchSteps.verifySearchResultsFailing("Grasu XXL");
    }

}
