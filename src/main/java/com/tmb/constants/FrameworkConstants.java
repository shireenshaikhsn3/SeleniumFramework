package com.tmb.constants;

public final class FrameworkConstants {

    private FrameworkConstants(){}
    private static final String Report_Path =System.getProperty("user.dir")+"/index.html";
public static String getReport_Path(){
    return Report_Path;
}
 }

