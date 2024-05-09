package co.com.sofka.util;

import co.com.sofka.model.FormularioModel;

public class util {
    public static FormularioModel crerUsuario(){
        FormularioModel formularioModel=new FormularioModel();
        formularioModel.setNombre("Jorge");
        formularioModel.setApellido("Rodriguez");
        return formularioModel;
    }
}
