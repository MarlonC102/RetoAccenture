package com.demoblaze.certification.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CardProduct {
    private CardProduct(){
    }
    public static final Target BUTTON_PLACE_ORDER = Target.the("button place order").
            locatedBy("//button[@class='btn btn-success']");
    public static final Target NAME_INPUT = Target.the("name input").
            located(By.id("name"));
    public static final Target COUNTRY_INPUT = Target.the("country input").
            located(By.id("country"));
    public static final Target CITY_INPUT = Target.the("city input").
            located(By.id("city"));
    public static final Target CREDIT_CARD_INPUT = Target.the("Credit card input").
            located(By.id("card"));
    public static final Target MONTH_INPUT = Target.the("name input").
            located(By.id("month"));
    public static final Target YEAR_INPUT = Target.the("name input").
            located(By.id("year"));
    public static final Target BUTTON_PURCHASE = Target.the("button Purchase on modal").
            locatedBy("//button[contains(text(),'Purchase')]");
    public static final Target ALERT_MESSAGE_PURCHASE = Target.the("alert message for purchase").
            locatedBy("//h2[contains(text(),'Thank')]");
    public static final Target TITLE_PRODUCT = Target.the("title product").
            locatedBy("//tr[@class='success']/td[2]");

}
