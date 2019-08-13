import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome
{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("http://www.google.com");

    }

}