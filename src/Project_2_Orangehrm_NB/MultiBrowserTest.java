package Project_2_Orangehrm_NB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
public class MultiBrowserTest {

    static String browser = "Firefox";

    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    static WebDriver driver; // global driver declaration

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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
