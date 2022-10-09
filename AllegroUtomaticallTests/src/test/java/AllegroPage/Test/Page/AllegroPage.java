package AllegroPage.Test.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;


import java.util.List;

public class AllegroPage {
    @FindBy(xpath = "//div [@class='mzaq_1']")
    public List<WebElement> Dzialy;

    @FindBy(xpath = "//input [@class='msts_pt mgmw_wo mr3m_1 mli2_1 mjyo_6x mse2_40 mqu1_40 mp4t_0 m3h2_0 mryx_0 munh_0 mg9e_0 mj7a_0 mh36_0 mvrt_8 mlkp_6x mefy_5r mldj_0 mm2b_0 ozg4u mh85_0 _535b5_Y5CDc']")
public WebElement InputCzegoszukasz ;

    @FindBy(xpath = "//button [@class='b1vwg b11ha b12bn mr3m_0 mli2_0 mh85_0 mh85_56_m msbw_0 mtag_0 _535b5_CsxPR']")
    public WebElement przyciskSzukaj ;
    protected WebDriver chrome;

@FindBy(xpath = "//select [@class='mr3m_1 m7er_k4 mj6k_n7 sy40i mgn2_14 mp0t_0a mqu1_21 mgmw_wo mli8_k4']")
  public WebElement Wszedzie;


    Assertion hardAssert = new Assertion();
    Assertion softAssert = new SoftAssert();

    public void SzukanieZWłączonymSewlektorem(String CochceszWpisac,String nazwaWselectcie){
        Select selectWszędzie= new Select(Wszedzie);

       selectWszędzie.selectByVisibleText(nazwaWselectcie);
szukajbezkategori(CochceszWpisac);

    }
    public void szukajbezkategori(String WhatYouwanttowrite){


        InputCzegoszukasz.sendKeys(WhatYouwanttowrite);
softAssert.assertEquals(InputCzegoszukasz.getText(),WhatYouwanttowrite);
        przyciskSzukaj.click();


    }
    public  void   pokażDziały() {
        for(WebElement Dzial:  Dzialy)
        {

            System.out.println(Dzial.getText());
        }
    }
    public  void PrzeklikajWszystkieDziały()  {

        for(WebElement Dzial: Dzialy)
        {
            Dzial.click();


        }
    }





    public  void  clickDział(String nazwaDzialu)  {


        for(WebElement Dzial:  Dzialy)
        {
            if(Dzial.getText().equals(nazwaDzialu))
            {
                Dzial.click();
                break;
            }
        }
    }

    public AllegroPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }






}

