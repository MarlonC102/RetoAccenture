package com.demoblaze.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.demoblaze.certification.userinterfaces.HomePage.*;
import static com.demoblaze.certification.utils.Constant.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SuccessfullLogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN_BUTTON),
                Enter.theValue(USER).into(LOGIN_USERNAME),
                Enter.theValue(PASS).into(LOGIN_PASSWORD),
                Click.on(BUTTON_LOGIN_MODAL)
        );
    }
    public static SuccessfullLogin entryToThePage(){return instrumented(SuccessfullLogin.class);}
}
