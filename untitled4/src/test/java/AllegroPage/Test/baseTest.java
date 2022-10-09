package AllegroPage.Test;

import AllegroPage.Test.Page.AllegroPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class baseTest {
protected WebDriver chrome;
@BeforeMethod
    public  void chromeup(){
        WebDriverManager.chromedriver().setup();
    AllegroPage alegro=new AllegroPage(chrome);
       chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://allegro.pl/");
        chrome.switchTo().activeElement().click();



    }
}
