import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public static void main(String[] args) {

        //Initialize Driver
        String path = "C:\\Users\\isoto\\Downloads\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();

        //Step 1.- Open app
        System.out.println("Step 1.- Open app");
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Dropdown")).click();

         By dropdown = By.id("dropdown");
         Select dropdownElement = new Select(driver.findElement(dropdown));
         dropdownElement.selectByValue("1");
    }

}
