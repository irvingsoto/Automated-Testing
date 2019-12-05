import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts {

    public static void main(String[] args) {

        final TestData data = TestData.TEST_01;


        //Initialize Driver
        String path = "C:\\Users\\isoto\\Downloads\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();

        //Step 1.- Open app
        System.out.println("Step 1.- Open app");
        driver.manage().window().maximize();
        driver.get(data.getUrl());
        driver.findElement(By.linkText("JavaScript Alerts")).click();

        //driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
        //driver.switchTo().alert().accept();

        //driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
        //driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
        driver.switchTo().alert().sendKeys(data.getInput());
        driver.switchTo().alert().accept();

        driver.quit();
    }


    }

