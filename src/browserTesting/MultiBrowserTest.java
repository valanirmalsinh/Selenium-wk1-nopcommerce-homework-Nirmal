package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "firefox";
    static String baseUrl = "https://demo.nopcommerce.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }

        // Open the URL in the Browser
        driver.get(baseUrl);

        // Get the title of the Page
        String title = driver.getTitle();

        // Printing the Title
        System.out.println(title);

        // Print the Page Source
        System.out.println("Page Source : " + driver.getPageSource());

        // Find the login link element
        WebElement loginLink = driver.findElement(By.linkText("Log in"));

        // Click on Login Link element
        loginLink.click();

        // Find email field Element
        WebElement emailField = driver.findElement(By.id("Email"));

        // Type the email address to email field element
        emailField.sendKeys("abc123@gmail.com");

        //Find Password field Element
        driver.findElement(By.name("Password")).sendKeys("abc123");

        // Close the browser
        driver.close();
    }
}