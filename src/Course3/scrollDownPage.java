package Course3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollDownPage {
    public static void main(String[] args) throws InterruptedException {
    	
        System.setProperty("webdriver.chrome.driver", "E:\\_Tanya\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        
        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Mushka Zelenushka");
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("07/04/2020");
        Thread.sleep(2000);
                       
        driver.quit();
    }
}


