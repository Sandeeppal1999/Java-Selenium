package rahulShetty.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class SignIn {
    public static void main(String [] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        WebElement userName=driver.findElement(By.id("inputUsername"));
        userName.sendKeys("sandeep");
        WebElement password= driver.findElement(By.name("inputPassword"));
        password.sendKeys("Sandeep!12233");
        driver.findElement(By.className("signInBtn")).click();
        String loginErrorMessage= driver.findElement(By.className("error")).getText();
        System.out.println(loginErrorMessage);
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("Sandeep");
        driver.findElement(By.xpath("//input[@type=\"text\"][2]")).sendKeys("sandeep@12334.com");
        driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(4)")).sendKeys("1234567890");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText=driver.findElement(By.xpath(" //p[@class='infoMsg']")).getText();
        System.out.println(passwordText);
        driver.findElement(By.cssSelector("button[class*=\"go-to-login\"]")).click();
        Thread.sleep(1000);
        userName.sendKeys("sandeep");
        password.sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("input[value=\"rmbrUsername\"]")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[@class=\"submit signInBtn\"]")).click();
        driver.close();

    }
}
