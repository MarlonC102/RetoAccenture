package com.demoblaze.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class WaitUser implements Interaction {
    private final Target target;

    public WaitUser (Target target){
        this.target= target;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        if (!target.resolveFor(actor).isVisible()){
            WebDriverWait wait = new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOf(target.resolveFor(actor)));
        }
    }
    public static WaitUser WaitUser(Target target) {
        return Tasks.instrumented(WaitUser.class,target);
    }
}
