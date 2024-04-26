package rahulShetty.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login_verify {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        String name ="Sandeep";
        String userPassword= getPassword(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        WebElement userName=driver.findElement(By.id("inputUsername"));
        userName.sendKeys(name);
        WebElement password= driver.findElement(By.name("inputPassword"));
        password.sendKeys(userPassword);
        userName.sendKeys(name);
        driver.findElement(By.cssSelector("input[value=\"rmbrUsername\"]")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[@class=\"submit signInBtn\"]")).click();
        Thread.sleep(Long.parseLong("1000"));
       String text= driver.findElement(By.xpath("//div[@class=\"login-container\"]")).getText();
        System.out.println(text);
        driver.close();
    }

    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(Long.parseLong("1000"));
        driver.findElement(By.className("reset-pwd-btn")).click();
        String passwordString=driver.findElement(By.className("infoMsg")).getText();
        String [] passwords=passwordString.split("'");
        String password= passwords[1];
        return password;
    }
}
