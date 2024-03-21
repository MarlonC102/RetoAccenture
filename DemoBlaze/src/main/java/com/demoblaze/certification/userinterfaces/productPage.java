package com.demoblaze.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class productPage {
    private productPage(){
    }
    public static final Target BUTTON_ADD_PRODUCT = Target.the("button add product").
            locatedBy("//a[contains(text(),'Add to cart')]");
}
