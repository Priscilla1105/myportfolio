import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Eucabeta {
    
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
    }

    @Test(priority = 1)
    public void testOpenPage() {
        driver.get("https://www.eucaonline.com.au/");
        System.out.println("Page loaded successfully.");
    }

    @Test(priority = 2)
    public void testNavigateTo() {
        driver.navigate().to("https://www.eucaonline.com.au/customer/account/login/");
        System.out.println("Navigated to login page.");
    }

    @Test(priority = 3)
    public void handleCookiePopup() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement allowCookiesButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btn-cookie-allow")));

            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", allowCookiesButton);

            System.out.println("Cookie popup closed.");
        } catch (Exception e) {
            System.out.println(" Cookie popup not found or already closed: " + e.getMessage());
        }
    

        try {
            WebElement closePopup = driver.findElement(By.cssSelector(".popup-close")); 
            closePopup.click();
        } catch (NoSuchElementException e) {
            System.out.println("No popup found");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loading-mask")));


        WebElement element = driver.findElement(By.id("email"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
        element.sendKeys("test@gmail.com");



}
   
}


