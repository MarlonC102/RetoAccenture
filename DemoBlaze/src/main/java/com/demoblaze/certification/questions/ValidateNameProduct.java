package com.demoblaze.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateNameProduct implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return actor.recall("Title");
    }
    public static ValidateNameProduct validateNameProduct(){return new ValidateNameProduct();}
}
