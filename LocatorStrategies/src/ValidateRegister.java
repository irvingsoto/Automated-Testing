import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ValidateRegister {
    public static void main(String[] args) {

        System.out.println("Test: ValidateRegister Started");
        //Initialize Driver
        String path = "C:\\Users\\isoto\\Downloads\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        //Step 1.- Open app
        System.out.println("Step 1.- Open app");
        driver.manage().window().maximize();
        driver.get("http://newtours.demoaut.com/");
        if ( driver.getTitle().equals("Welcome: Mercury Tours")) System.out.println("Actual Result: PASSED - app open succesfully");
        else System.out.println("Actual Result: FAILED - app NOT open");

        //Step 2.- Click on "Register" tab




        System.out.println("Step 2.- Click on \"Register\" tab");
        driver.findElement(By.linkText("REGISTER")).click();
        if ( driver.getTitle().equals("Register: Mercury Tours")) System.out.println("Actual Result: Register page is displayed");
        else System.out.println("Actual Result: Register Page is NOT displayed ");

        //Step 3.- Fill al the required fields
        System.out.println("Step 3.- Fill al the required fields");
        try {
            driver.findElement(By.name("firstName")).sendKeys("Irving");
            driver.findElement(By.name("lastName")).sendKeys("Soto");
            driver.findElement(By.name("phone")).sendKeys("33333333");
            driver.findElement(By.id("userName")).sendKeys("somemail@gmail.com");
            driver.findElement(By.name("address1")).sendKeys("Streer 123");
            driver.findElement(By.name("city")).sendKeys("Guadalajara");
            driver.findElement(By.id("email")).sendKeys("Irving_Soto");
            System.out.println("Actual Result: All the required fields are filled");
        }
        catch (Exception e){
            System.out.println("Actual Result: Not posible to fill required fields");
        }

        //Step 3.- Click on submit button
        System.out.println("Step 4.- Click on submit button");
        driver.findElement(By.name("register")).click();
        WebElement message = driver.findElement(By.xpath("//table/tbody/tr[3]/td/p[3]/a/font/b"));
        if (message.getText().contains("Irving_Soto"))  System.out.println("Actual Result: User Registered Succesfully");
        else System.out.println("Actual Result: Not possible to register user");

        //close browser
        driver.quit();













    }
}
