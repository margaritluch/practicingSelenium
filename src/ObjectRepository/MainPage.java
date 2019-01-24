package ObjectRepository;
import Config.WebBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver = WebBrowser.getDriver();
    private WebElement ab_testing = driver.findElement(By.linkText("A/B Testing"));

    public WebElement getAbTesting() {
        return ab_testing;
    }
}
