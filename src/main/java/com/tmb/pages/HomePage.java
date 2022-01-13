package com.tmb.pages;

import com.tmb.driver.DriverManager;
import com.tmb.pages.pagecomponent.FooterMenucomponet;
import com.tmb.pages.pagecomponent.TopMenucomponent;

public class HomePage {

    private TopMenucomponent topMenucomponent;
    private FooterMenucomponet footerMenucomponet;


    public HomePage() {
        topMenucomponent = new TopMenucomponent();
        footerMenucomponet = new FooterMenucomponet();

    }


    public String getHomePageTitle() {
        return DriverManager.getDriver().getTitle();
    }

    public void clickOnAdmin() {
        topMenucomponent.clickOnMenu("value");

    }

    public String getFooterText() {
        return  footerMenucomponet.getFooterLable();



    }
}
