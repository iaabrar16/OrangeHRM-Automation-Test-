import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UserCreate {
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

        // Locate the Add Employee menu and click
        WebElement Add_Employee = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]"));
        Add_Employee.click();

        // First Name
        WebElement firstNameInput = driver.findElement(By.xpath("//input[@name='firstName' and @placeholder='First Name']"));
        firstNameInput.sendKeys("Ismail");


        // Middle Name
        WebElement middleNameInput = driver.findElement(By.xpath("//input[@name='middleName' and @placeholder='Middle Name']"));
        middleNameInput.sendKeys("A");

        // Last Name
        WebElement lastNameInput = driver.findElement(By.xpath("//input[@name='lastName' and @placeholder='Last Name']"));
        lastNameInput.sendKeys("Abrar");

        // click toggle_bar
        WebElement toggle_bar = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span"));
        toggle_bar.click();

        // Wait for 1 seconds to observe it
        Thread.sleep(1000);


        // Generic input field (autocomplete off)
        WebElement Create_UserName = driver.findElement(By.xpath("//input[@autocomplete='off' and not(@type='password')]"));
        Create_UserName.sendKeys("Aabrar16");

        // Password input field
        WebElement Create_passwordInput = driver.findElement(By.xpath("//input[@type='password' and @autocomplete='off']"));
        Create_passwordInput.sendKeys("Aabrar123@");

        // Confirm Password input field
        WebElement confirmPasswordInput = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input"));
        confirmPasswordInput.sendKeys("Aabrar123@");

        // Wait for 2 seconds to observe it
        Thread.sleep(2000);


        // Save button
        WebElement Save_button = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
        Save_button.click();




        // Wait for 5 seconds to observe it
        Thread.sleep(5000);

        // Profile Menu click
        WebElement name_bar = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span"));
        name_bar.click();

        // Wait for 2 seconds to observe it
        Thread.sleep(2000);

        // Logout
        WebElement logout = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a"));
        logout.click();

        // Wait for 2 seconds to observe it
        Thread.sleep(2000);


        // Enter the username (valid)
        WebElement NewNameInput = driver.findElement(By.name("username"));
        NewNameInput.sendKeys("Aabrar16");

        // Enter the username (valid)
        WebElement NewPasswordInput = driver.findElement(By.name("password"));
        NewPasswordInput.sendKeys("Aabrar123@");

        // Locate the login button and click
        WebElement NewloginBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        NewloginBtn.click();


        // Wait for 5 seconds to observe it
        Thread.sleep(5000);


        // Close the browser
        driver.quit();
    }
}
