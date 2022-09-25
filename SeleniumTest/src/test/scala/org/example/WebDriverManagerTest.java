package org.example;

 import io.github.bonigarcia.wdm.WebDriverManager;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.testng.annotations.Test;

import static org.bouncycastle.asn1.crmf.SinglePubInfo.web;

public class WebDriverManagerTest {
    @Test
public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome=new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://www.google.pl/webhp?sourceid=chrome-instant&ion=1&ie=UTF-8&rct=j");


    }

}
