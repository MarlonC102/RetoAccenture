package com.demoblaze.certification.questions;
import com.demoblaze.certification.interactions.WaitUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.demoblaze.certification.userinterfaces.HomePage.NAME_OF_USER;

public class ValidateName implements Question {
    @Override
    public String answeredBy(Actor actor) {
        WaitUser.WaitUser(NAME_OF_USER);
        String name = NAME_OF_USER.resolveFor(actor).getText();
        name = name.replace("Welcome ","");
        return name;
    }
    public static ValidateName validateName(){return new ValidateName();}
}
