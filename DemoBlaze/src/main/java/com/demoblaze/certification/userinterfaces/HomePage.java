package com.demoblaze.certification.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    private HomePage(){
    }
    public static final Target SIGN_UP_BUTTON = Target.the("button for sign up").
            located(By.id("signin2"));
    public static final Target SIGN_USERNAME = Target.the("input sign username").
            located(By.id("sign-username"));
    public static final Target SIGN_PASSWORD = Target.the("input sign-password").
            located(By.id("sign-password"));
    public static final Target BUTTON_SIGN_UP_MODAL = Target.the("button sign up on modal").
            locatedBy("//button[contains(text(),'Sign up')]");
    public static final Target LOGIN_BUTTON = Target.the("button for login").
            located(By.id("login2"));
    public static final Target LOGIN_USERNAME = Target.the("input login username").
            located(By.id("loginusername"));
    public static final Target LOGIN_PASSWORD = Target.the("input login password").
            located(By.id("loginpassword"));
    public static final Target BUTTON_LOGIN_MODAL = Target.the("button login on modal").
            locatedBy("//button[contains(text(),'Log in')]");
    public static final Target NAME_OF_USER = Target.the("name of user ").
            located(By.id("nameofuser"));
    public static final Target CART_BUTTON = Target.the("cart button").
            locatedBy("//a[contains(text(),'Cart')]");
}
