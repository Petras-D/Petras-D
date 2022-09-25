package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selectortest {
    @Test
    public void FindElementBYID() {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://testeroprogramowania.github.io/selenium/basics.html");

        By buttonId = By.id("clickOnMe");
        WebElement clickOnMeButton = chrome.findElement(buttonId);
        clickOnMeButton.click();

    }

    @Test
    public void FindElemetntByName() {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://testeroprogramowania.github.io/selenium/basics.html");
        By W3Schol = By.name("IamWeirdLink");
        chrome.findElement(By.name("fname")).click();

    }

    @Test
    public void FindElementByInputLocator() {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://testeroprogramowania.github.io/selenium/basics.html");
        chrome.findElement(By.tagName("input"));
        chrome.findElement(By.tagName("input")).sendKeys("piotrek");
        chrome.close();

    }

    @Test
    public void ClickOnPodstawowastronatestowa() {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://testeroprogramowania.github.io/selenium/");
        By Link = By.linkText("Podstawowa strona testowa");

        chrome.findElement(Link).click();
        By Nazwauzytkownika = By.name("username");
        By Haslo = By.name("password");
        By submit = By.xpath("//input [@type ='submit'] ");
        chrome.findElement(Nazwauzytkownika).clear();
        chrome.findElement(Nazwauzytkownika).sendKeys("Ja");
        chrome.findElement(Haslo).clear();
        chrome.findElement(Haslo).sendKeys("KS");
        ;
        chrome.findElement(submit).click();

        // chrome.close();


    }

    @Test

    public void SzukanieUtworuSpotify() {

        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://open.spotify.com/search");
        By Czegochceszposluchac = By.xpath("//input[@class='Type__TypeElement-goli3j-0 cPwEdQ QO9loc33XC50mMRUCIvf']");
        chrome.findElement(Czegochceszposluchac).sendKeys("Nazwa utworu");

    }

    @Test
    public void LogowanieDoSpotify() {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://accounts.spotify.com/pl/login?continue=https%3A%2F%2Fopen.spotify.com%2F");
        By Email = By.id("login-username");
        By Password = By.id("login-password");
        By LogIn = By.id("login-button");
        chrome.findElement(Email).sendKeys("piotr.duda123@onet.pl");
        chrome.findElement(Password).sendKeys("Kury1234");
        chrome.findElement(LogIn).click();
        chrome.close();

    }

    @Test
    public void WysylanieemailDoZmianyHasla() {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://accounts.spotify.com/en/login");
        WebElement forgotYourPaswowrd = chrome.findElement(By.id("reset-password-link"));
        forgotYourPaswowrd.click();
        chrome.navigate().to("https://www.spotify.com/pl/password-reset/");
        System.out.println(chrome.getCurrentUrl());
        //WebElement Input =chrome.findElement(By.id("form_input "));
        // Input.sendKeys("piotr.duda123@onet.pl");


    }

    @Test
    public void WylogowywanieZSpotify() {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://accounts.spotify.com/pl/login?continue=https%3A%2F%2Fopen.spotify.com%2F");
    }

    @Test
    public void Selectallegro() {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://allegro.pl/?utm_source=tdb&utm_medium=afiliacja&utm_content=AdpumpPoland&tduid=3e4498cfa06c26baaf650283ba3bde51");
        WebElement SelectorKategorie = chrome.findElement(By.xpath("//select[@class='mr3m_1 m7er_k4 mj6k_n7 sy40i mgn2_14 mp0t_0a mqu1_21 mgmw_wo mli8_k4']"));
        Select cars = new Select(SelectorKategorie);
        cars.selectByVisibleText("Moda");
    }

    @Test
    public void Kanban() {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://testujpl.gitlab.io/pomodoro-kanban-test/");
        By przycisk = By.xpath("// button[@class='add-button mat-mini-fab mat-accent']");
        WebElement Przycisk = chrome.findElement(przycisk);
        for (int i = 0; i < 100; i++) {
            Przycisk.click();

        }
    }
}