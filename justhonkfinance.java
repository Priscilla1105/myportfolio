import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class justhonkfinance 
{
	WebDriver driver;
	WebDriver wait;
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
    }

    @Test(priority = 1)
    public void testOpenPage() {
        driver.get("https://beta.justhonkusedcars.com/");
        System.out.println("Page loaded successfully.");
    }

    @Test(priority = 2)
    public void testNavigateTo() {
        driver.navigate().to("https://beta.justhonkusedcars.com/finance-dealer/");
        System.out.println("Navigated to login page.");
    }
    
  /*  @Test(priority = 2)
    public void tradeinvaluation() {
    	WebElement yesButton = driver.findElement(By.id("yesBtn"));
    	yesButton.click();
    	
    	WebElement nameField = driver.findElement(By.id("name"));
    	nameField.sendKeys("test");

    	WebElement emailField = driver.findElement(By.id("email"));
    	emailField.sendKeys("test@example.com");

    	WebElement phoneField = driver.findElement(By.id("phone"));
    	phoneField.sendKeys("0483838383");
    	
    	
    	WebElement getCodeButton = driver.findElement(By.id("getcodeverfiy"));
    	getCodeButton.click();

    } */
    
  /*  @Test(priority = 3)
    public void Financedealer() {
    	
    	
    	WebElement financeTab = driver.findElement(By.id("tab_2_main"));
    	financeTab.click();

    	WebElement yesButton = driver.findElement(By.id("tabtwo-primary"));
    	yesButton.click();
    	
    	WebElement makeDropdown = driver.findElement(By.id("make_find"));
    	Select selectMake = new Select(makeDropdown);
    	int lastMakeIndex = selectMake.getOptions().size() - 1;
    	selectMake.selectByIndex(lastMakeIndex);
    	System.out.println("Selected Make: " + selectMake.getOptions().get(lastMakeIndex).getText());

    	try {
    	    Thread.sleep(5000); 
    	} catch (InterruptedException e) {
    	    e.printStackTrace();
    	}

    	WebElement modelDropdown = driver.findElement(By.id("model_find"));
    	Select selectModel = new Select(modelDropdown);
    	int lastModelIndex = selectModel.getOptions().size() - 1;
    	selectModel.selectByIndex(lastModelIndex);
    	System.out.println("Selected Model: " + selectModel.getOptions().get(lastModelIndex).getText());

    	try {
    	    Thread.sleep(5000); 
    	} catch (InterruptedException e) {
    	    e.printStackTrace();
    	}

    	WebElement yearDropdown = driver.findElement(By.id("year_find"));
    	Select selectYear = new Select(yearDropdown);
    	int lastYearIndex = selectYear.getOptions().size() - 1;
    	selectYear.selectByIndex(lastYearIndex);
    	System.out.println("Selected Year: " + selectYear.getOptions().get(lastYearIndex).getText());

    	try {
    	    Thread.sleep(5000); 
    	} catch (InterruptedException e) {
    	    e.printStackTrace();
    	}

    	WebElement variantDropdown = driver.findElement(By.id("variant_find"));
    	Select selectVariant = new Select(variantDropdown);
    	int lastVariantIndex = selectVariant.getOptions().size() - 1;
    	selectVariant.selectByIndex(lastVariantIndex);
    	System.out.println("Selected Variant: " + selectVariant.getOptions().get(lastVariantIndex).getText());
    	
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    	WebElement resultSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='list-of-api-result']")));
    	String sectionText = resultSection.getText();
    	System.out.println("Section text: " + sectionText);

    	
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	WebElement button1 = driver.findElement(By.cssSelector("button.check_eligibility"));
    	js.executeScript("arguments[0].click();", button1);
    	
    	
    	
    	WebElement titleDropdown = driver.findElement(By.id("title"));

    	Select selectTitle = new Select(titleDropdown);

    	selectTitle.selectByVisibleText("Ms.");

    	WebElement firstNameField = driver.findElement(By.id("firstName"));
    	firstNameField.sendKeys("wagtestbg");
    	
    	WebElement lastNameField = driver.findElement(By.id("lastName"));
    	lastNameField.sendKeys("wagtestbg");

    	
    	WebElement addressInput = driver.findElement(By.id("google_address"));
    	addressInput.clear();

    	addressInput.sendKeys("222 Margaret Street Brisbane City QLD");

    	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));

    	addressInput.sendKeys(Keys.ARROW_DOWN);
    	addressInput.sendKeys(Keys.ENTER);

    	
    	WebElement dobField = driver.findElement(By.id("dob_user"));

    	dobField.clear();

    	dobField.sendKeys("01/01/1999");
    	
    	WebElement phoneField = driver.findElement(By.id("phone_number"));

    	phoneField.clear();

    	phoneField.sendKeys("0434454545");
    	
    	WebElement emailField = driver.findElement(By.id("emailAddress"));

    	emailField.clear();

    	emailField.sendKeys("wagtestbg@gmail.com");
    	
    	
    	WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement nextButton = wait11.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.finance_go")));
    	nextButton.click();

    	WebElement agreeCheckbox = driver.findElement(By.id("f_agreeCheckbox"));

    	JavascriptExecutor js1 = (JavascriptExecutor) driver;
    	js1.executeScript("arguments[0].click();", agreeCheckbox);
    	
    	
    	WebElement submitButton = driver.findElement(By.id("finance_submit"));

    	JavascriptExecutor js11 = (JavascriptExecutor) driver;
    	js11.executeScript("arguments[0].click();", submitButton);
    	
    
    	WebDriverWait wait111 = new WebDriverWait(driver, Duration.ofSeconds(50));

    	WebElement yesButton1 = wait111.until(ExpectedConditions.elementToBeClickable(By.id("finace_next_btn")));
    	yesButton1.click();


    } */
    
	/*@Test(priority = 3)
    public void scheduletestdrive() throws InterruptedException {
    	
    	WebElement scheduleTestDrive = driver.findElement(By.id("tab_5_main"));
    	scheduleTestDrive.click();

    	WebElement button = driver.findElement(By.id("tabfive-primary"));
    	button.click();

    	WebElement makeDropdown = driver.findElement(By.id("make_val_drive_new"));
    	Select selectMake = new Select(makeDropdown);
    	int lastMakeIndex = selectMake.getOptions().size() - 1;
    	selectMake.selectByIndex(lastMakeIndex);
    	System.out.println("Selected Make: " + selectMake.getOptions().get(lastMakeIndex).getText());

    	try {
    	    Thread.sleep(5000); 
    	} catch (InterruptedException e) {
    	    e.printStackTrace();
    	}

    	WebElement modelDropdown = driver.findElement(By.id("model_val_drive"));
    	Select selectModel = new Select(modelDropdown);
    	int lastModelIndex = selectModel.getOptions().size() - 1;
    	selectModel.selectByIndex(lastModelIndex);
    	System.out.println("Selected Model: " + selectModel.getOptions().get(lastModelIndex).getText());

    	try {
    	    Thread.sleep(5000); 
    	} catch (InterruptedException e) {
    	    e.printStackTrace();
    	}

    	WebElement yearDropdown = driver.findElement(By.id("year_val_drive"));
    	Select selectYear = new Select(yearDropdown);
    	int lastYearIndex = selectYear.getOptions().size() - 1;
    	selectYear.selectByIndex(lastYearIndex);
    	System.out.println("Selected Year: " + selectYear.getOptions().get(lastYearIndex).getText());

    	try {
    	    Thread.sleep(5000); 
    	} catch (InterruptedException e) {
    	    e.printStackTrace();
    	}

    	WebElement variantDropdown = driver.findElement(By.id("variant_val_drive"));
    	Select selectVariant = new Select(variantDropdown);
    	int lastVariantIndex = selectVariant.getOptions().size() - 1;
    	selectVariant.selectByIndex(lastVariantIndex);
    	System.out.println("Selected Variant: " + selectVariant.getOptions().get(lastVariantIndex).getText());
    	
    	
    	WebElement bookingButton = driver.findElement(By.id("nextBtn_drive"));
    	bookingButton.click();


    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	WebElement dateElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"datepicker-drive\"]/div/div[1]/table/tbody/tr[4]/td[4]")));
    	dateElement.click();

    	WebElement timeDropdown = driver.findElement(By.id("only_time"));
    	Select selectTime = new Select(timeDropdown);

    	selectTime.selectByVisibleText("10:00 AM");
    	
    	
    	WebElement firstNameInput = driver.findElement(By.id("fist_name_drive"));
    	firstNameInput.clear();
    	firstNameInput.sendKeys("Test");


    	WebElement lastNameInput = driver.findElement(By.id("last_name_drive"));
    	lastNameInput.clear();
    	lastNameInput.sendKeys("testd");

    	
    	WebElement phoneInput = driver.findElement(By.id("phone_form_drive"));
    	phoneInput.clear();
    	phoneInput.sendKeys("0473737373");
    	
    	WebElement emailInput = driver.findElement(By.id("email_form_drive"));
    	emailInput.clear();
    	emailInput.sendKeys("test@example.com");

    	emailInput.sendKeys(Keys.TAB);

    	Thread.sleep(500); 

    	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement smsButton = wait1.until(ExpectedConditions.elementToBeClickable(By.className("how-to-contacts")));
    	smsButton.click();



    	WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement bookingButton1 = wait11.until(ExpectedConditions.elementToBeClickable(By.id("nextBtn_drive_1")));
    	bookingButton1.click();


    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	WebElement continueButton = driver.findElement(By.id("add_to_buy"));
    	js.executeScript("arguments[0].click();", continueButton);

   

    }*/
    
    @SuppressWarnings("deprecation")
	@Test(priority = 4)
    public void Reviewdeposit() throws InterruptedException
      
    {
        
    	WebElement reviewTab = driver.findElement(By.id("tab_4_main"));
    	reviewTab.click();
    	Thread.sleep(1000); 

    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    	    Select selectMake = new Select(driver.findElement(By.id("make_purchase_box")));
    	    int lastMakeIndex = selectMake.getOptions().size() - 1;
    	    selectMake.selectByIndex(lastMakeIndex);
    	    System.out.println("Selected Make: " + selectMake.getOptions().get(lastMakeIndex).getText());

    	    wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("#model_purchase_box option"), 1));

    	    Select selectModel = new Select(driver.findElement(By.id("model_purchase_box")));
    	    int lastModelIndex = selectModel.getOptions().size() - 1;
    	    selectModel.selectByIndex(lastModelIndex);
    	    System.out.println("Selected Model: " + selectModel.getOptions().get(lastModelIndex).getText());

    	    wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("#year_purchase_box option"), 1));

    	    Select selectYear = new Select(driver.findElement(By.id("year_purchase_box")));
    	    int lastYearIndex = selectYear.getOptions().size() - 1;
    	    selectYear.selectByIndex(lastYearIndex);
    	    System.out.println("Selected Year: " + selectYear.getOptions().get(lastYearIndex).getText());

    	    wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("#variant_purchase_box option"), 1));

    	    Select selectVariant = new Select(driver.findElement(By.id("variant_purchase_box")));
    	    int lastVariantIndex = selectVariant.getOptions().size() - 1;
    	    selectVariant.selectByIndex(lastVariantIndex);
    	    System.out.println("Selected Variant: " + selectVariant.getOptions().get(lastVariantIndex).getText());
    	    
    	    
    	    
    	    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    	    WebElement firstNameInput = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("pay_firstname")));
    	    firstNameInput.clear();
    	    firstNameInput.sendKeys("test");
    	    
    	    WebElement lastname = driver.findElement(By.id("pay_lastname"));
    	    lastname.sendKeys("testd");
    	  
    	   	    

        	WebElement addressInput = driver.findElement(By.id("pay_google_address"));
        	addressInput.clear();

        	addressInput.sendKeys("222 Margaret Street Brisbane City QLD");

        	WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(10));
        	wait11.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));

        	addressInput.sendKeys(Keys.ARROW_DOWN);
        	addressInput.sendKeys(Keys.ENTER);

        	
        	WebElement dobField = driver.findElement(By.id("nextpaymentdate"));

        	dobField.clear();

        	dobField.sendKeys("01/01/1999");
        	
        	
            WebElement phoneInput = driver.findElement(By.id("payphone"));

            phoneInput.sendKeys("0485858585");
            
            phoneInput.sendKeys(Keys.TAB);
            
            WebElement emailinput = driver.findElement(By.id("paypost_mail"));

            emailinput.sendKeys("test@gmail.com");
            
            emailinput.sendKeys(Keys.TAB);
                              
            
            WebDriverWait wait111 = new WebDriverWait(driver, Duration.ofSeconds(10));

            try {
                WebElement cardIframe = wait111.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe[name^='__privateStripeFrame']")));
                driver.switchTo().frame(cardIframe);

                WebElement cardNumberField = wait111.until(ExpectedConditions.presenceOfElementLocated(By.name("cardnumber")));
                cardNumberField.sendKeys("4242 4242 4242 4242"); // Test Visa card

                driver.switchTo().defaultContent();

                WebElement expiryIframe = wait111.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe[name^='__privateStripeFrame']")));
                driver.switchTo().frame(expiryIframe);
                
                WebElement expiryField = wait111.until(ExpectedConditions.presenceOfElementLocated(By.name("exp-date")));
                expiryField.sendKeys("12/26");

                driver.switchTo().defaultContent();

                WebElement cvcIframe = wait111.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe[name^='__privateStripeFrame']")));
                driver.switchTo().frame(cvcIframe);

                WebElement cvcField = wait111.until(ExpectedConditions.presenceOfElementLocated(By.name("cvc")));
                cvcField.sendKeys("123");

                driver.switchTo().defaultContent();

                System.out.println("Card details entered successfully.");
            } 
            catch (Exception e) {
                System.out.println("Error entering card details: " + e.getMessage());
            }
            
            WebElement submit = driver.findElement(By.id("strip_btn"));
            submit.click();
            
    	}
    
    

}




    	
   


