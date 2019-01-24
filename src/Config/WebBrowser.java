package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBrowser {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        String exePath = "C:\\Users\\Bruger\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        String baseUrl = "http://the-internet.herokuapp.com/";
        driver.get(baseUrl);
        return driver;
    }
}
