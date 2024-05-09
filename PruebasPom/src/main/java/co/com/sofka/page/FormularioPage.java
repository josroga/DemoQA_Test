package co.com.sofka.page;

import co.com.sofka.model.FormularioModel;
import co.com.sofka.page.function.FunctionsCommons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioPage extends FunctionsCommons {
    private FormularioModel usuario;


    // Localizadores
    private final By CAMPO_NOMBRE = By.id("firstName");
    private final By CAMPO_APELLIDO = By.id("lastName");


    public FormularioPage(WebDriver driver, FormularioModel usuario) {
        super(driver);
        this.usuario = usuario;
    }


    // funciones
    public void llenarFormulario(){
        typeInto(CAMPO_NOMBRE, usuario.getNombre());
        typeInto(CAMPO_APELLIDO, usuario.getApellido());

    }
}
