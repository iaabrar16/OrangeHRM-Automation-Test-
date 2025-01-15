import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchEmployee {
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


        // Enter the username (valid)
        WebElement UserNameInput = driver.findElement(By.name("username"));
        UserNameInput.sendKeys("Admin");

        // Enter the username (valid)
        WebElement PasswordInput = driver.findElement(By.name("password"));
        PasswordInput.sendKeys("admin123");

        // Locate the login button and click
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        loginBtn.click();


        // Locate the PIM menu and click
        WebElement PIM_Menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
        PIM_Menu.click();

        // Locate the employeeName input and send value
        WebElement employeeName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
        employeeName.sendKeys("Ismail Aabrar");

        // Locate the employeeId input and send value
        WebElement employeeId = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input"));
        employeeId.sendKeys("0403");

        // Locate the save button and click
        WebElement save_button = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
        save_button.click();




        // Wait for 2 seconds to observe it
        Thread.sleep(2000);

        // Profile Menu click
        WebElement name_bar = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span"));
        name_bar.click();

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
