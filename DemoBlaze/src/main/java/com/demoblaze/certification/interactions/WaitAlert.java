package com.demoblaze.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitAlert implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriverWait wait = new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), Duration.ofSeconds(100));
        int intentosMaximos = 5,intentoActual = 1;
        boolean alertaVisible = false;
        while (!alertaVisible && intentoActual <= intentosMaximos) {
            try {
                Alert alert = wait.until(ExpectedConditions.alertIsPresent());
                actor.attemptsTo(Switch.toAlert());
                actor.remember("Alert",alert.getText());
                alert.accept();
                alertaVisible = true;
            } catch (NoAlertPresentException e) {
                System.out.println("Intento " + intentoActual + ": No se encontró ninguna alerta presente o no es visible");
                intentoActual++;
            }
        }
    }
    public static WaitAlert waitAlert() {
        return Tasks.instrumented(WaitAlert.class);
    }
}
