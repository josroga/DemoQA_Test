package co.com.sofka.stepdefinitions;

import co.com.sofka.model.FormularioModel;
import co.com.sofka.page.FormularioPage;
import co.com.sofka.setup.WebSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.util.util.crerUsuario;


public class FormularioStepDefinition extends WebSetup {
    FormularioPage formularioPage;
    FormularioModel formularioModel;

    @Given("que el usuario esta en la pagina de registro {int}")
    public void queElUsuarioEstaEnLaPaginaDeRegistro(Integer tipoDriver) {
        generalSetup(tipoDriver);

    }

    @When("ingresa su informacion correctamente")
    public void ingresaSuInformacionCorrectamente() {
           formularioModel=crerUsuario();
           formularioPage = new FormularioPage(driver,formularioModel);
            formularioPage.llenarFormulario();
        System.out.println("estoy en el test1");

    }

    @When("envia el formulario")
    public void enviaElFormulario() {


    }

    @Then("deberia observar un mensaje de registro exitoso")
    public void deberiaObservarUnMensajeDeRegistroExitoso() {
        quiteDrive();

    }
}
