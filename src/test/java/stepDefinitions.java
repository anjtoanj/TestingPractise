import io.cucumber.java.en.*;
import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class stepDefinitions {

    WebDriver driver;
    private boolean status;

    @Given("I launch Edge browser")
    public void i_launch_edge_browser() {
        System.setProperty("webdriver.edge.driver","C:\\Program Files\\Drivers\\msedgedriver.exe");
        driver =new EdgeDriver();// Launch Edge browser
    }
    @When("I open OrangeHRM homepage")
    public void i_open_orange_hrm_homepage() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @Then("I verify that the logo is present on the page")
    public void i_verify_that_the_logo_is_present_on_the_page() {
        driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true,status);
    }
    @Then("close the browser")
    public void close_the_browser() {
       driver.close();
    }

}
