import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rentaboatcontactform {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testOpenPage() {
        driver.get("https://rentaboatbyhour.com");
        System.out.println("Page loaded successfully.");
    }
    
    @Test(priority = 2)
    public void testnavigation() {
        driver.navigate().to("https://rentaboatbyhour.com/contact-us/");
        System.out.println("Navigated to contact us page succesfully");
    }
    
    @Test(priority = 3)
    public void testelements() throws InterruptedException {
    	
    	Actions actions = new Actions(driver);
    	WebElement Firstname = driver.findElement(By.id("ff_3_names_first_name_"));
    	actions.moveToElement(Firstname).click().sendKeys("boat").perform();

    	
    	
    	  WebElement emailField = driver.findElement(By.id("ff_3_email"));
          emailField.sendKeys("priscilla@elephantintheboardroom.in");
          
          
          WebElement phonenumber = driver.findElement(By.id("ff_3_phone"));
          phonenumber.sendKeys("9575656568");
          
          WebElement noofadults = driver.findElement(By.id("ff_3_input_text_3"));
          noofadults.sendKeys("2");
          
          WebElement nofchildren = driver.findElement(By.id("ff_3_input_text_4"));
          nofchildren.sendKeys("1");
          
          WebElement natureofenquiry = driver.findElement(By.id("ff_3_input_text_2"));
          natureofenquiry.sendKeys("about boat");
          
          WebElement durationofcharter = driver.findElement(By.id("ff_3_input_text"));
          durationofcharter.sendKeys("2 days");
          
          
          WebElement preferreddates = driver.findElement(By.id("ff_3_input_text_1"));
          preferreddates.sendKeys("monday, wednesday");
          
          WebElement yourmessage = driver.findElement(By.id("ff_3_description_1"));
          yourmessage.sendKeys("available");
          
          try {
     		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
     	        WebElement captchaFrame = wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"fluentform-recaptcha-3-1\"]/div/div/iframe")));
     	        driver.switchTo().frame(captchaFrame);
     	        WebElement captchaCheckbox = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"recaptcha-anchor\"]")));
     	        captchaCheckbox.click();
     	        System.out.println("Clicked on reCAPTCHA checkbox.");
     	        driver.switchTo().defaultContent();
        } catch (Exception e) {
            System.out.println("reCAPTCHA not found or failed to click. Please complete manually.");
        }

        System.out.println("Please complete the reCAPTCHA manually.");
        Thread.sleep(20000);
     }

          
       @Test(priority=4)
       public void submit()
       {
    	   WebElement submit=driver.findElement(By.className("ff-btn-submit"));
    	   
    	   submit.click();
       }
         
       
      }
    

