import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // Set up ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Enter the username (invalid)
        WebElement userNameInput = driver.findElement(By.name("username"));
        userNameInput.sendKeys("admin");

        // Enter the username (invalid)
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("Admin123");

        // Locate the login button and click
        WebElement try_loginBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        try_loginBtn.click();


        Thread.sleep(5000);


        // Enter the username (valid)
        WebElement UserNameInput = driver.findElement(By.name("username"));
        UserNameInput.sendKeys("Admin");

        // Enter the username (valid)
        WebElement PasswordInput = driver.findElement(By.name("password"));
        PasswordInput.sendKeys("admin123");

        // Locate the login button and click
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        loginBtn.click();


        // Wait for 2 seconds to observe it
        Thread.sleep(2000);

        // Logout
        WebElement logout = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a"));
        logout.click();

        // Wait for 5 seconds to observe it
        Thread.sleep(5000);


        // Close the browser
        driver.quit();
    }
}
