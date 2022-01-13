package com.tmb.pages.pagecomponent;

import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;

public class FooterMenucomponet {
     private By lableFooterMessage= By.id("footer");
      public String getFooterLable(){
          return DriverManager .getDriver() .findElement(lableFooterMessage ).getText() ;
      }
}
