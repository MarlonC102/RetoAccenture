package com.demoblaze.certification.tasks;

import com.demoblaze.certification.interactions.WaitAlert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.lang.annotation.Target;

import static com.demoblaze.certification.userinterfaces.CardProduct.*;
import static com.demoblaze.certification.userinterfaces.HomePage.CART_BUTTON;
import static com.demoblaze.certification.userinterfaces.productPage.BUTTON_ADD_PRODUCT;
import static com.demoblaze.certification.utils.Constant.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuyProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String CategoryXpath = actor.recall("CategoryXpath");
        String ProductXpath = actor.recall("ProductXpath");
        actor.attemptsTo(
                Click.on(CategoryXpath),
                Click.on(ProductXpath),
                Click.on(BUTTON_ADD_PRODUCT),
                WaitAlert.waitAlert(),
                Click.on(CART_BUTTON)
        );
        actor.remember("Title",TITLE_PRODUCT.resolveFor(actor).getText());
        actor.attemptsTo(
                Click.on(BUTTON_PLACE_ORDER),
                Enter.theValue(NAME).into(NAME_INPUT),
                Enter.theValue(COUNTRY).into(COUNTRY_INPUT),
                Enter.theValue(CITY).into(CITY_INPUT),
                Enter.theValue(CARD).into(CREDIT_CARD_INPUT),
                Enter.theValue(MONTH).into(MONTH_INPUT),
                Enter.theValue(YEAR).into(YEAR_INPUT),
                Click.on(BUTTON_PURCHASE)
        );
        actor.remember("AlertPurchase",ALERT_MESSAGE_PURCHASE.resolveFor(actor).getText());
    }
    public static BuyProduct BuyProduct(){return instrumented(BuyProduct.class);}
}
