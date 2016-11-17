package feature;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by berkd on 07.11.2016.
 */
public class SearchProductTest extends BaseTest {

    @Given("^I opened (.*) website$")
    public void openWebSite(String webSite) {
        driver.navigate().to("http://" + webSite);
    }

    @When("^I search for a product (.*)$")
    public void searchProduct(String product) {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
        driver.findElement(By.id("twotabsearchtextbox")).submit();
    }

    @Then("^(.*) searches are displayed$")
    public void isProductDisplayed(String product) {
        Assert.assertTrue(driver.getTitle().contains(product));
    }

    @Then("^(\\d+) results are displayed$")
    public void isProductDisplayed(Integer numberOfProducts) {
        Assert.assertTrue(driver.findElement(By.id("s-results-list-atf")).findElements(By.tagName("li")).size() -
                          driver.findElements(By.className("s-sponsored-list-header")).size()
                          == numberOfProducts );
    }

    @Then("^Select first product$")
    public void selectFirstProduct() {
        driver.findElement(By.id("s-results-list-atf")).findElements(By.tagName("li")).get(0)
                                                       .findElement(By.className("s-access-detail-page")).click();
    }

}
