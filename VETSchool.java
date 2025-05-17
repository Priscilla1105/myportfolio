import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VETSchool {
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
        driver.get("https://peopleperformance.com.au/vet-school/?step=course");
        System.out.println("Page loaded successfully.");
    }
    
    @Test(priority = 2)
        public void course()

        {
    	WebElement dropdown = driver.findElement(By.id("course-qualifi-code"));
        Select select = new Select(dropdown);
       select.selectByVisibleText("CPC10120 Certificate I In Construction");      
       WebElement dropdown1 = driver.findElement(By.id("course-commence"));
       Select select1 = new Select(dropdown1);
       select1.selectByVisibleText("Term 2 (2025)");
    
    
        WebElement radioBtn = driver.findElement(By.id("preference1-tuesday"));
        radioBtn.click();
        WebElement radioBtn1 = driver.findElement(By.id("preference2-wednesday"));
        radioBtn1.click();
        WebElement fridayRadio = driver.findElement(By.id("preference3-friday"));
        fridayRadio.click();
        WebElement mondayRadio = driver.findElement(By.id("preference4-monday"));
        mondayRadio.click();
        
        WebElement nextButton = driver.findElement(By.className("next_button"));
        nextButton.click();

}
    @Test(priority = 3)
    public void aboutyourself()
    {
    	WebElement titleDropdown = driver.findElement(By.id("personalDetails"));
    	Select select = new Select(titleDropdown);
    	select.selectByVisibleText("Mr");
    	
    	WebElement firstNameInput = driver.findElement(By.id("first-name"));
    	firstNameInput.sendKeys("Test"); 
    	WebElement familyNameInput = driver.findElement(By.id("family-name"));
    	familyNameInput.sendKeys("testd"); 

    	
    	WebElement birthdateInput = driver.findElement(By.id("birthdate"));
    	birthdateInput.sendKeys("21/08/1999"); 
    	
    	  birthdateInput.sendKeys(Keys.TAB);

    	  try {
              Thread.sleep(2000); 
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
        
    	  WebElement femaleRadioButton = driver.findElement(By.id("gender-female"));
          femaleRadioButton.click();
    	
    	WebElement mobileField = driver.findElement(By.id("mobile-phone"));
    	mobileField.sendKeys("7474747474");
    	
    	WebElement emailField = driver.findElement(By.id("student-email"));
    	emailField.sendKeys("student@example.com");
    	
    	WebElement personalEmail = driver.findElement(By.id("student-personal-email"));
    	personalEmail.sendKeys("personal@example.com");
    	
    	WebElement parentEmail = driver.findElement(By.id("parent-email"));
    	parentEmail.sendKeys("parent@example.com");


    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        WebElement streetInput = driver.findElement(By.id("street-number"));

        streetInput.sendKeys("323 Castlereagh Street Haymarket NSW,Australia");

        WebElement firstSuggestion = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("pac-item")));

        Actions actions = new Actions(driver);
        actions.moveToElement(firstSuggestion).click().perform();
        
        WebElement sameAsHomeRadio = driver.findElement(By.id("same-as"));
        sameAsHomeRadio.click();

        WebElement parentGuardianName = driver.findElement(By.id("parentGuardian-name1"));
        parentGuardianName.sendKeys("testa");

        WebElement parentGuardianPhone = driver.findElement(By.id("parentGuardianPhone1"));
        parentGuardianPhone.sendKeys("4545453434");
        
        WebElement parentGuardianEmail = driver.findElement(By.id("parentGuardian-email1"));
        parentGuardianEmail.sendKeys("parent@example.com");
        
        WebElement contactName = driver.findElement(By.id("contact-name"));
        contactName.sendKeys("test");
        
        WebElement contactPhone = driver.findElement(By.id("contact-phone-number"));
        contactPhone.sendKeys("9876543210");
        WebElement relationshipDropdown = driver.findElement(By.id("relationship"));
        Select select1 = new Select(relationshipDropdown);
        select1.selectByVisibleText("Parent");

        
        WebElement nextButton = driver.findElement(By.cssSelector(".next_button.next.next_form_btn"));
        nextButton.click();


    }
    @Test(priority = 4)
    public void employment() throws InterruptedException
    {
    
    	WebElement selfEmployedRadio = driver.findElement(By.id("self-employed"));
        selfEmployedRadio.click();
        
        Thread.sleep(2000);
        
        WebElement schoolingNoRadio = driver.findElement(By.id("schooling-no"));
        schoolingNoRadio.click();
        
        
        WebElement usiField = driver.findElement(By.id("usi-field_1"));
        usiField.sendKeys("1234567890");
        
        Thread.sleep(2000);
        
        WebElement cNoRadio = driver.findElement(By.id("c-no"));
        cNoRadio.click();
        WebElement studyReasonDropdown = driver.findElement(By.id("studyReason"));
        Select select = new Select(studyReasonDropdown);
        select.selectByVisibleText("Studying as part of school program");
        
        WebElement disabilityNoRadio = driver.findElement(By.id("disability-no"));
        disabilityNoRadio.click();        
        
        WebElement prevQualificationNoRadio = driver.findElement(By.id("prev-qualification-no"));

        prevQualificationNoRadio.click();

        WebElement permissionToPublishNoRadio = driver.findElement(By.id("permission-to-publish-no"));

        permissionToPublishNoRadio.click();

        WebElement organiseTimeRadio = driver.findElement(By.id("organiseTime2"));
        organiseTimeRadio.click();
        
        WebElement abilityToReadEnglishRadio = driver.findElement(By.id("abilityToReadEnglish2"));

        abilityToReadEnglishRadio.click();

        WebElement abilityToWriteEnglishRadio = driver.findElement(By.id("abilityToWriteEnglish5"));

        abilityToWriteEnglishRadio.click();
        
        WebElement abilityToSpeakEnglishRadio = driver.findElement(By.id("abilityToSpeakEnglish2"));

        abilityToSpeakEnglishRadio.click();

        WebElement numericSkillsRadio = driver.findElement(By.id("numericSkills3"));

        numericSkillsRadio.click();

        WebElement needAssistanceForLanguageNoRadio = driver.findElement(By.id("needAssistanceForLanguage-no"));
        needAssistanceForLanguageNoRadio.click();

        WebElement nextButton = driver.findElement(By.className("next_button"));

        nextButton.click();
    }
    
    @Test(priority = 4)
    public void citizenship()  
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement aboriginalCheckBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("aboriginal-check")));
    	aboriginalCheckBox.click();


    	


    }
}
    
