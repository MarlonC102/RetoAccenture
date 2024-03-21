package com.demoblaze.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateAlert implements Question {
    @Override
    public String answeredBy(Actor actor) {
        String Alert = actor.recall("Alert");
        return Alert;
    }
    public static ValidateAlert textAlert(){return new ValidateAlert();}
}
