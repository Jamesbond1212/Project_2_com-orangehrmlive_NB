package Project_2_Orangehrm_NB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
/**
 * 1. Setup Chrome browser
 * 2. Open URL "https://opensource-demo.orangehrmlive.com/";
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class LoginTest {

    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //open the URL into browser
        driver.get(baseUrl);
        //maximise the browser
        driver.manage().window().maximize();
        // we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is " + title);

        // get the current url
        System.out.println("Current URL " + driver.getCurrentUrl());
        // get page source
        System.out.println("Page source " + driver.getPageSource());
        // Find the Username field element
        WebElement usernameField = driver.findElement(By.name("username"));
        // Type the username to the username field element
        usernameField.sendKeys("jamesbond1212@gmail.com");
        // Find the password field element & Type the password to the password field element
        driver.findElement(By.name("password")).sendKeys("bond007");

        // Close The browser
        driver.close();

    }
}
