package WebSelenium.steps.serenity;

import WebSelenium.pages.SearchBiletePage;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertTrue;

public class SearchSteps {

    SearchBiletePage searchBiletePage;

    @Step
    public void loadSearchPage(){
        searchBiletePage.open();
    }

    @Step
    public void pressSearchButton(){
        searchBiletePage.pressSearchButton();
    }

    @Step
    public void verifySearchResults(String result){

        assertTrue(searchBiletePage.getResultsAfterSearch().contains(result));
    }

    @Step
    public void verifySearchResultsFailing(String result){

        assertTrue(!searchBiletePage.getResultsAfterSearch().contains(result));
    }

    @Step
    public void addSearchText(String text){
        searchBiletePage.sendSearchText(text);
    }
}
