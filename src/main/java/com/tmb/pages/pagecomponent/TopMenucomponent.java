package com.tmb.pages.pagecomponent;

import com.tmb.driver.DriverManager;
import com.tmb.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.tmb.utils.SeleniumUtils.*;

public class TopMenucomponent {
    //private  static  final  By LNK_ADMIN = By.id("menu_admin_viewAdminModule");
    private String topMenu= "menu_%replaceable%";

   // private static final By LNK_PIM =By.id("menu_pim_viewPimModule")   ;
   /* @FindBy(id =  "menu_pim_viewPimModule" )
    private WebElement LIN_PIN;

    public  TopMenucomponent()   {
        PageFactory .initElements(DriverManager.getDriver() ,this );

    }*/
    public void clickOnMenu(String menu){
        String pim_viewPimModule = topMenu .replaceAll( "%replaceable%","pim_viewPimModule");
          click( By.id(pim_viewPimModule),menu);
    }

   /* public void clickAdmin(){
        SeleniumUtils.click    (LNK_ADMIN)  ;
    }
    public void clickPIMMenu  (){
        SeleniumUtils.click    (LNK_PIM )  ;
    }*/
}
