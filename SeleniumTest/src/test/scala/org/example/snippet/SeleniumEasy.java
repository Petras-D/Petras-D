package org.example.snippet;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumEasy {

    @Test
    public void SingleField(){
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://demo.seleniumeasy.com/basic-first-form-demo.html?fbclid=IwAR3R49v4w5bs4IHRiD2pAxsVOLsK_Iuj5S5M2BsnPX07ssZxL05vi3JaWhY");
By EnterMessage = By.id("user-message");
By ButtonShowMessage=By.xpath("// button[@class='btn btn-default']");
WebElement enterMessage=chrome.findElement(EnterMessage);
WebElement buttonShowMessage=chrome.findElement(ButtonShowMessage);
enterMessage.sendKeys("JHFG");
buttonShowMessage.click();
chrome.close();

    }
    @Test
    public void TwoInputs(){

        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://demo.seleniumeasy.com/basic-first-form-demo.html?fbclid=IwAR3R49v4w5bs4IHRiD2pAxsVOLsK_Iuj5S5M2BsnPX07ssZxL05vi3JaWhY");
        By EnterA = By.id("sum1");
        By EnterB = By.id("sum2");
        By ButtonGetTotal = By.xpath("//button[@onclick='return total()']" );
        WebElement enterA = chrome.findElement(EnterA);
        WebElement enterB= chrome.findElement(EnterB);
        WebElement buttonGetTotal= chrome.findElement(ButtonGetTotal);
        enterA.sendKeys("123");
        enterB.sendKeys("321");
        buttonGetTotal.click();

    }
    @Test
public void SingleChecboxDemo(){

    WebDriverManager.chromedriver().setup();
    WebDriver chrome = new ChromeDriver();
    chrome.manage().window().maximize();
    chrome.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    By Checkbox=By.id("isAgeSelected");
    chrome.findElement(Checkbox).click();
    }
    @Test
    public void MultiplkeCherecboxDemo(){
        WebDriverManager.chromedriver().setup();//dokończyc dodają cprzycisk
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        By Option1= By.cssSelector("[value='Male']");
         chrome.findElement(Option1).click();

    }

    @Test
    public void GroupRadioButtonsDemo(){
        WebDriverManager.chromedriver().setup();//dokończyc dodają cprzycisk
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        By Option1= By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input");
By Firstchosse=By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[1]/input");
By buttonGetValues =By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/button");
WebElement ButtonGetValues = chrome.findElement(buttonGetValues);
WebElement Oto5 = chrome.findElement(Firstchosse);
        WebElement male=chrome.findElement(Option1);
        Oto5.click();
        male.click();
        ButtonGetValues.click();

    }
    @Test
    public void SelectList(){
        WebDriverManager.chromedriver().setup();//dokończyc dodają cprzycisk
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        WebElement Select = chrome.findElement(By.id("select-demo"));
Select SelectListDemo= new Select(Select);
SelectListDemo.selectByVisibleText("Sunday");


    }
    @Test
    public void MultiSelectList(){
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        WebElement SElectMultiple = chrome.findElement(By.id("multi-select"));
        Select SelectListDemoMulti= new Select(SElectMultiple);
        SelectListDemoMulti.selectByIndex(1);
        SelectListDemoMulti.selectByIndex(3);
    }
    @Test
public void InputformSubmit(){
        WebDriverManager.chromedriver().setup();
        WebDriver chrome =new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://demo.seleniumeasy.com/input-form-demo.html");
        chrome.findElement(By.cssSelector("#contact_form > fieldset > div:nth-child(2) > div > div > input")).sendKeys("John");//Write to First name
        chrome.findElement(By.cssSelector("#contact_form > fieldset > div:nth-child(3) > div > div > input")).sendKeys("Kowalski");//Write last name
        chrome.findElement(By.name("email")).sendKeys("John.kowalski@gmail.com");
        chrome.findElement(By.name("phone")).sendKeys("+48 21234232");// This number its  random
        chrome.findElement(By.name("address")).sendKeys("broklyn 123");
        chrome.findElement(By.name("city")).sendKeys("London");
        WebElement SelectState=chrome.findElement(By.name("state"));
        Select SelectListState=new Select(SelectState);
        SelectListState.selectByIndex(4);
        chrome.findElement(By.name("zip")).sendKeys("1231");
        chrome.findElement((By.name("website"))).sendKeys("mysite.com");
        chrome.findElement((By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[1]/label/input"))).click();
        chrome.findElement(By.name("comment")).sendKeys("mate this is good projekt :)");
        chrome.findElement(By.xpath("/html/body/div[2]/div/div[2]/section/form/fieldset/div[13]/div/button")).click();

    }
    @Test
    public  void AjaxForm (){
WebDriverManager.chromedriver().setup();
        WebDriver chrome= new ChromeDriver();
chrome.manage().window().maximize();
chrome.get("https://demo.seleniumeasy.com/ajax-form-submit-demo.html");
By Name=By.name("title");
By Comment = By.id("description");
WebElement InpiutName = chrome.findElement(Name);
WebElement InputComment = chrome.findElement(Comment);
InpiutName.sendKeys("john");
InputComment.sendKeys("Its ok");
chrome.findElement(By.id("btn-submit")).click();

    }
    @Test
public void DropDownwithSearchbox() {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://demo.seleniumeasy.com/jquery-dropdown-search-demo.html");
        WebElement Singleselect = chrome.findElement(By.id("country"));
        Select SingleSelect = new Select(Singleselect);
        SingleSelect.selectByIndex(2);

        WebElement countrySelect = chrome.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/select"));
        Select CountrySelect = new Select(countrySelect);
        CountrySelect.selectByIndex(2);
        CountrySelect.selectByIndex(4);

        @Test
         public  void BootstrapDatePickersExample(){
            WebDriverManager.chromedriver().setup();
            WebDriver chrome = new ChromeDriver();
            chrome.manage().window().maximize();
            chrome.get("https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html");

        }


    }


}
