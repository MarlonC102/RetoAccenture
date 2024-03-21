package com.demoblaze.certification.stepdefinitions;

import com.demoblaze.certification.questions.ValidateAlert;
import com.demoblaze.certification.questions.ValidateName;
import com.demoblaze.certification.tasks.SuccessfullLogin;
import com.demoblaze.certification.tasks.SuccessfullRegistration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import static com.demoblaze.certification.utils.Constant.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class UserStepDefinition {
    @Given("The user is on the main page of the DemoBlaze page")
    public void theUserIsOnTheMainPageOfTheDemoBlazePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url(URL));
    }
    @When("The user enters the registration module and enters his username and password.")
    public void theUserEntersTheRegistrationModuleAndEntersHisUsernameAndPassword() {
        theActorInTheSpotlight().attemptsTo(SuccessfullRegistration.completeRegistration(),
                SuccessfullLogin.entryToThePage());
    }
    @Then("The Sign up successful alert will be validated")
    public void theSignUpSuccessfulAlertWillBeValidated() {
        theActorInTheSpotlight().should(seeThat(ValidateAlert.textAlert(), equalTo(ALERT_MESSAGE_REGISTRATION)));
    }
    @And("The name at the top.")
    public void theNameAtTheTop() {
        theActorInTheSpotlight().should(seeThat(ValidateName.validateName(), equalTo(USER)));
    }
}
