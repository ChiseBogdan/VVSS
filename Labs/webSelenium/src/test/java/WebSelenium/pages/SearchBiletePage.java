package WebSelenium.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.bilete.ro")
public class SearchBiletePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"mainnav\"]/div[2]/div/div[5]/div/div/form/div/input")
    private WebElementFacade searchBox;

    @FindBy(xpath = "/html/body/nav/div[2]/div/div[5]/div/div/form/div/button")
    private WebElementFacade searchButton;

    @FindBy(xpath = "/html/body/main/section[2]/div/div[1]/div/div")
    private WebElementFacade searchResults;

    public void sendSearchText(String searchText){
        searchBox.sendKeys(searchText);
    }

    public void pressSearchButton(){
        searchButton.click();
    }

    public String getResultsAfterSearch(){
        return searchResults.getText();
    }
}
