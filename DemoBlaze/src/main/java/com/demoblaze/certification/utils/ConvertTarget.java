package com.demoblaze.certification.utils;

public class ConvertTarget {
    public static String createDynamicTarget(String data,String base){
        String xpath = "//base[contains(text(),'Xpath')]";
        xpath= xpath.replace("Xpath",data).replace("base",base);
        return xpath;
    }

}
