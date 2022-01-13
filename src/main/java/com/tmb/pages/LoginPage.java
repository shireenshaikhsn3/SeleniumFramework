package com.tmb.pages;

import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitType;
import com.tmb.reports.ExtentLogger;
import com.tmb.reports.ExtentManager;
import com.tmb.utils.SeleniumUtils;
import org.apache.commons.math3.stat.inference.TestUtils;
import org.openqa.selenium.By;

import static com.tmb.utils.SeleniumUtils.*;


public class LoginPage {

   private static final By TXTBOX_USERNAME = By.id("txtUsername");
   private static final By TXTBOX_PASSWORD = By.id("txtPassword");
    private static final By BTN_LOGIN = By.id("btnLogin");

    private  LoginPage  setUsername(String username) {
          sendkeys ( TXTBOX_USERNAME,username,"Username " ) ;

         return this;
    }

   private  LoginPage setPassword(String password) {
       sendkeys (TXTBOX_PASSWORD,password,"Password ") ;

        return this;
    }

    private  HomePage  setLogin() {
        click ( BTN_LOGIN, "Login Button "  ) ;


        return new HomePage();//page chaining
    }
    public HomePage loginToApplication(String username,String password){//method chaining
         return  setUsername(username).setPassword(password ).setLogin() ;

    }
 }


