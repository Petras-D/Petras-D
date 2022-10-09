package AllegroPage.Test;

import AllegroPage.Test.Page.AllegroPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;


public class AllegroTest extends  baseTest {

@BeforeMethod
public void setup(){


}

@Test
public void select(){
    AllegroPage alegro=new AllegroPage(chrome);
    alegro.SzukanieZWłączonymSewlektorem("złoto","Dziecko");
}
    @Test
    public void KliknijWszystkieDzialy()  {
        AllegroPage alegro=new AllegroPage(chrome);

        alegro.pokażDziały();



    }
    @Test
    public void SzukajBezNiczego(){
        AllegroPage alegro=new AllegroPage(chrome);
    alegro.szukajbezkategori("monety");
    }
}
