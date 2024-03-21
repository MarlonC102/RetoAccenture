package com.demoblaze.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidatePurchase implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return actor.recall("AlertPurchase");
    }
    public static ValidatePurchase textAlertPurchase(){return new ValidatePurchase();}
}
