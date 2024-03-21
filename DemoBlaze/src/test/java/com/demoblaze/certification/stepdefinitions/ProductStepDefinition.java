package com.demoblaze.certification.stepdefinitions;

import com.demoblaze.certification.questions.ValidateAlert;
import com.demoblaze.certification.questions.ValidateNameProduct;
import com.demoblaze.certification.questions.ValidatePurchase;
import com.demoblaze.certification.tasks.BuyProduct;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;
import java.util.Map;

import static com.demoblaze.certification.utils.Constant.*;
import static com.demoblaze.certification.utils.ConvertTarget.createDynamicTarget;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class ProductStepDefinition {
    @Given("The user is on the main page of the DemoBlaze page to purchase")
    public void theUserIsOnTheMainPageOfTheDemoBlazePageToPurchase() {
        theActorInTheSpotlight().wasAbleTo(Open.url(URL));
    }
    @When("Enter the category and buy the product")
    public void enterTheCategoryAndBuyTheProduct(List<Map<String,String>> Data) {
        theActorInTheSpotlight().remember("CategoryXpath",createDynamicTarget(Data.get(0).get("Category").trim(),"a"));
        theActorInTheSpotlight().remember("ProductXpath",createDynamicTarget(Data.get(0).get("Product").trim(),"a"));
        theActorInTheSpotlight().remember("Product",Data.get(0).get("Product"));
        theActorInTheSpotlight().attemptsTo(BuyProduct.BuyProduct());
    }
    @Then("validate that the purchase is successful")
    public void validateThatThePurchaseIsSuccessful() {
        theActorInTheSpotlight().should(seeThat(ValidatePurchase.textAlertPurchase(),equalTo(MESSAGE_PURCHASE_ALERT)));
    }
    @And("the name are the input data")
    public void theCategoryAndNameAreTheInputData() {
        theActorInTheSpotlight().should(seeThat(ValidateNameProduct.validateNameProduct(),equalTo(theActorInTheSpotlight().recall("Product"))));
    }
    @And("the purchase alert message")
    public void thePurchaseAlertMessage() {
        theActorInTheSpotlight().should(seeThat(ValidateAlert.textAlert(), equalTo(ALERT_MESSAGE_BUY)));
    }
}
