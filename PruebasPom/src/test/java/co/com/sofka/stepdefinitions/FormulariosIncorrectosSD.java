package co.com.sofka.stepdefinitions;

import co.com.sofka.setup.WebSetup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormulariosIncorrectosSD extends WebSetup {
    @When("ingresa su informacion imcompleta")
    public void ingresaSuInformacionImcompleta() {
        System.out.println("Estoy en el test 2");

    }
    @Then("deberia recibir un mensaje de error")
    public void deberiaRecibirUnMensajeDeError() {
        quiteDrive();

    }

}
