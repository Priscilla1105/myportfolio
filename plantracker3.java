import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class plantracker3 {
	WebDriver driver;
    WebDriverWait wait;

    
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void testOpenPage() {
        driver.get("https://www.plantracker.com.au/online-registration/form/?step=about-yourself");
        System.out.println("Page loaded successfully.");
    }
    @Test(priority = 2)
    public void Aboutyourself()
    {
        WebElement formsection = driver.findElement(By.id("example-form"));
        System.out.println(formsection.getText());
    }
    
    @Test(priority = 3)
    public void radiobuttonchk()
    {
        WebElement btn = driver.findElement(By.id("label-429"));
        btn.click();
    }
    @Test(priority = 4)
    public void fieldvalidation()
    {
        WebElement txtfname = driver.findElement(By.id("fname"));
        txtfname.sendKeys("tes");
        WebElement txtlname = driver.findElement(By.id("flastname"));
        txtlname.sendKeys("testing");
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@aria-label='Preferred contact number (include area code for landline):']"));
        phoneNumber.sendKeys("0948484848");
       
        WebElement pemail = driver.findElement(By.id("femail"));
        pemail.sendKeys("test@gmail.com");
        
        WebElement firstName = driver.findElement(By.xpath("//input[@data-id='40']"));
        firstName.sendKeys("test");
        
        WebElement lastName = driver.findElement(By.xpath("//input[@data-id='41']"));
        lastName.sendKeys("testing");


    }
    
    @Test(priority = 5)
    public void Buttonvalidation()
    {
        WebElement btnnxt = driver.findElement(By.id("about_form_next"));
        btnnxt.click();
    }
    @Test(priority = 6)
    public void radiobtnclickvalidation()
    {
        WebElement yes = driver.findElement(By.id("label-543"));
      
        yes.click();
        WebElement additionalSection = driver.findElement(By.xpath("//*[@id=\"service_details\"]/div[8]/div"));
        System.out.println(additionalSection.getText());
        
        WebElement dropdownElement = driver.findElement(By.id("current_plan_option"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("My Plan Manager");   	 
        
        
    }
    @Test(priority = 7)
    public void radiobtnclickvalidation2()
    {
        WebElement yes = driver.findElement(By.id("label-848"));
      
        yes.click();
        
        WebElement participantyes = driver.findElement(By.id("label-5169"));
        
        participantyes.click();
       
    }
    
    @Test(priority = 8)
    public void conteactdetailsnext()
    {
        WebElement nextbtn = driver.findElement(By.id("about_form_next"));
        nextbtn.click();
    
}
   /* @Test(priority = 9)
    public void addressvalidation()
    
    {
    	WebElement address = driver.findElement(By.id("map_address"));
    	address.clear();
    	address.sendKeys("Dubbo NSW 2830, Australia");
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("pac-item")));

        if (!suggestions.isEmpty()) {
            suggestions.get(0).click(); 
        } else {
            System.out.println("No address suggestions found!");
        }	
    	
    } */
    
    @Test(priority = 10)
    public void addressmanualvalidation()
    {
    	
    	 WebElement address1manual = driver.findElement(By.xpath("//*[@id=\"contact_details\"]/div[3]/div[12]/div[2]"));
    	 address1manual.click();
    	
    	 WebElement address1 = driver.findElement(By.id("addresicon"));
    	 address1.sendKeys("test");
    	 
    	 WebElement suburbInput = driver.findElement(By.xpath("//input[@aria-label='Suburb:']"));
    	 suburbInput.sendKeys("Sydney");

    	 WebElement postcodeInput = driver.findElement(By.xpath("//input[@aria-label='Postcode:']"));
    	 postcodeInput.sendKeys("2000");
    	 
    	 WebElement stateDropdown = driver.findElement(By.xpath("//select[@aria-label='State']"));
    	 Select selectState = new Select(stateDropdown);
    	 selectState.selectByVisibleText("New South Wales");

    }
    
    @Test(priority = 11)
    public void summaryvalidation() 
    {
        WebElement nextButton = driver.findElement(By.className("next_button-two"));


        nextButton.click();
        System.out.println("Next button clicked after delay.");
       
    } 
        
    @Test(priority = 10)
    public void contactsection()
    {
        WebElement section = driver.findElement(By.id("contact_details"));
        System.out.println(section.getText());
    }
    
/*
    @Test(priority = 12)
    public void selectDateOfBirth() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

            // Click the DOB input field to open the calendar
            WebElement dobField = wait.until(ExpectedConditions.elementToBeClickable(By.className("my_date_picker")));
            dobField.click();

            WebElement yearDropdown = driver.findElement(By.className("ui-datepicker-year")); // Update selector
            yearDropdown.click();
            Select yearSelect = new Select(yearDropdown);
            yearSelect.selectByVisibleText("1990"); 

            WebElement monthDropdown = driver.findElement(By.cssSelector("ui-datepicker-month")); // Update selector
            monthDropdown.click();
            Select month = new Select(monthDropdown);
            month.selectByVisibleText("Feb"); 

            WebElement day = driver.findElement(By.xpath("//td[@data-handler='selectDay' and @data-month='1' and @data-year='2025']/a[text()='18']"));
            day.click();

            System.out.println("Date of Birth selected successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
*/
    @Test(priority = 12)
    public void selectDateOfBirth() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Find the date input field
            WebElement dobField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@data-id='202']")));

            // Use JavaScript to set the date
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value = '20/02/1990'; arguments[0].dispatchEvent(new Event('change')); arguments[0].dispatchEvent(new Event('blur'));", dobField);

            System.out.println("Date of Birth entered successfully using JavaScript!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    @Test(priority = 13)
    public void NDIDdetails() throws InterruptedException
    {
    	WebElement mobileNumber = driver.findElement(By.cssSelector("input[data-id='64']"));
    	mobileNumber.sendKeys("9003776976");
    	
    	WebElement phoneNumber = driver.findElement(By.cssSelector("input[data-id='65']"));
    	phoneNumber.sendKeys("9003776976");
    	
    	WebElement emailField = driver.findElement(By.cssSelector("input[data-id='66']"));
    	emailField.sendKeys("test@gmail.com");
    	  	
      	WebElement address = driver.findElement(By.id("address"));
    	address.clear();
    	address.sendKeys("Dubbo NSW 2830, Australia");
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("pac-item")));

        if (!suggestions.isEmpty()) {
            suggestions.get(0).click(); 
        } else {
            System.out.println("No address suggestions found!");
        }	
        
        WebElement ndisField = driver.findElement(By.cssSelector("input[data-id='71']"));
        ndisField.sendKeys("9007666555");
        
        WebElement radioButton = driver.findElement(By.id("label-80206"));
        radioButton.click();
        
        WebElement nextButton = driver.findElement(By.id("about_form_next"));
        nextButton.click();
        
        WebElement checkbox = driver.findElement(By.cssSelector("input[data-id='85']"));
        checkbox.click();
        
        
        WebElement nextButton1 = driver.findElement(By.id("about_form_next"));
        nextButton1.click();
        
        WebElement checkbox1 = driver.findElement(By.id("checked-43"));
        checkbox1.click();
        
        WebElement checkbox2 = driver.findElement(By.id("checked-44"));
        checkbox2.click();

    	
    try {
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement captchaFrame = wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[contains(@src, 'recaptcha')]")));
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

     @Test(priority = 19)
     public void submit() {
   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

   try {
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@id='g-recaptcha-response' and string-length(@value) > 0]")));
       System.out.println("reCAPTCHA successfully completed.");
   } catch (Exception e) {
       System.out.println("reCAPTCHA not detected as completed. Proceeding with submit.");
   }

   WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".next_button.submit.steps")));
   button.click();
   System.out.println("Submit button clicked.");
}
    	

    }
    

  

    
 

 
