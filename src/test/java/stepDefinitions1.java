public class stepDefinitions1 {

import cucumber.api.java.en.*;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class myFirstStepDefinition {
        WebDriver driver;
        @Given("^I navigate to \"([^\"]*)\" site$")
        public void i_navigate_to_site(String link) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Going to " + link);
            driver = new FirefoxDriver();
            driver.navigate().to(By.linkText(link));
            //driver.quit();
        }

        @When("^I navigate to \"([^\"]*)\" page$")
        public void i_navigate_to_page(String link) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Clicking on the " + link + " Page");
            driver.findElement(By.linkText(link)).click();
            System.out.println("Going BACK to Formy.com Main Page");
            driver.navigate().to("https://formy-project.herokuapp.com");
        }

        // Go back to the main page (added to the navigation step)

	/*@Then("^I navigate back to the main page$")
	public void i_navigate_back_to_the_main_page() throws Throwable {
    		// Write code here that turns the phrase above into concrete actions
   		System.out.println("Going to Formy.com Main Page");
		driver.navigate().to("https://formy-project.herokuapp.com");
	}
	*/

        @Then("^the page title should be visible$")
        public void the_page_title_should_be_visible() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Checking page title");
            System.out.println("The Title of the page is " + driver.getTitle());
            driver.quit();
        }

        // Translated to Java - cause Cucumber is outputting some other language that Java doesn't understand

	/*@Then("^the page should contain the following links$")
	public void the_page_should_contain_the_following_links(List<String> links) throws Throwable {
		for (int i = 0; i < links.size(); i++ ) {
			System.out.println("Verified Link Available: " + links.get(i));
		}

	}*/

    }
}
