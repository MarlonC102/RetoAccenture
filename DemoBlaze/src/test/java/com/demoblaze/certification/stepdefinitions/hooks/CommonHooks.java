package com.demoblaze.certification.stepdefinitions.hooks;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Before;

import static com.demoblaze.certification.utils.Constant.ACTOR_TEST;

public class CommonHooks {
    @Managed
    private WebDriver driver;
    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled(ACTOR_TEST);
    }
}
