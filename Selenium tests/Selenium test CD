 package org.example.snippet;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumEasy {

 
 @Test
    public void BootstrapDatePickersExampleWritinddate (){

            WebDriverManager.chromedriver().setup();
            WebDriver chrome = new ChromeDriver();
            chrome.manage().window().maximize();
            chrome.get("https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html");
            WebElement Chose = chrome.findElement(By.xpath("//span[@class='input-group-addon']"));
            Chose.click();
            WebElement SelectectMonth =chrome.findElement(By.xpath("//th[@class='datepicker-switch']"));//finfd button to click moths menu
            SelectectMonth.click();
            int ActualYear=2022;
            int WhatYearDoYouwant=2016;
WebElement Previous =chrome.findElement (By.xpath("/html/body/div[3]/div[2]/table/thead/tr[2]/th[1]"));

for (int i=ActualYear-WhatYearDoYouwant; i>0;i--)
{
    Previous.click();
}



List<WebElement> Months= chrome.findElements(By.xpath("//span[@class='month']"));
 String NameofMonthYouWanted="Jun";
 String NameOfMonthinFor;

           for ( WebElement month: Months){//Fuction that search name moths and pick them Option Jan,Feb,mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec

               NameOfMonthinFor=month.getText();


if(NameOfMonthinFor.equals(NameofMonthYouWanted)) {

    month.click();
    break;

               }
           }
           List <WebElement> Days=chrome.findElements(By.xpath("//td[@class='day']"));
           String WhatnumberdayYouWant="6";
           for(WebElement day:Days){

               if(day.getText().equals(WhatnumberdayYouWant)){
                   day.click();
                   break;
               }
           }
        }
}
