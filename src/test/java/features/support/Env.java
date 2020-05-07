package features.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Env {

    private static final int TIMEOUT = 10;
    private static WebDriver driver;
    private static WebDriverWait wait;

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriverWait getWait() {
        return wait;
    }

    public static void setUpDriver(String word) {
        switch (word) {
            case ("chrome"):
                System.setProperty("webdriver.chrome.driver", "src\\test\\java\\features\\support\\driver\\chromedriver.exe");
                driver = new ChromeDriver();
                wait = new WebDriverWait(driver, TIMEOUT);
                driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
                break;
            case ("mozilla"):
                System.setProperty("webdriver.gecko.driver", "src\\test\\java\\features\\support\\driver\\geckodriver.exe");
                driver = new FirefoxDriver();
                wait = new WebDriverWait(driver, TIMEOUT);
                driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
                break;
        }
    }
}
