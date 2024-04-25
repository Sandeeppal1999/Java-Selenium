import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch{
    public static void main (String [] agrs){
//        WebDriver drive= new ChromeDriver();
//        WebDriver drive= new FirefoxDriver();
        WebDriver drive = new EdgeDriver();
        drive.get("https://rahulshettyacademy.com/");
        System.out.println(drive.getTitle());
        drive.close();
    }
}