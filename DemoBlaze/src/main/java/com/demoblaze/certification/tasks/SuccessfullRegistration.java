package com.demoblaze.certification.tasks;

import com.demoblaze.certification.interactions.WaitAlert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import static com.demoblaze.certification.userinterfaces.HomePage.*;
import static com.demoblaze.certification.utils.Constant.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SuccessfullRegistration implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SIGN_UP_BUTTON),
                Enter.theValue(USER).into(SIGN_USERNAME),
                Enter.theValue(PASS).into(SIGN_PASSWORD),
                Click.on(BUTTON_SIGN_UP_MODAL),
                WaitAlert.waitAlert()
        );
    }
    public static SuccessfullRegistration completeRegistration(){return instrumented(SuccessfullRegistration.class);}
}
