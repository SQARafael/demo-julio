package is.demo.serenity.steps;
/*
 * @(#) IncioSesionSteps.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import io.cucumber.datatable.DataTable;
import is.demo.serenity.models.Credenciales;
import is.demo.serenity.pageObject.InicioSesionPage;
import is.demo.serenity.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class IncioSesionSteps {
   @Page
    InicioSesionPage inicio;

   @Step("Abrir el navegador")
    public void abrirNavegador(){
       inicio.openUrl("https://demo.serenity.is/Account/Login/?ReturnUrl=%2F");
   }

    @Step("Enviar Campo Usuario")
    public void enviarUsuario(){

        String usuario = Credenciales.data().get(0).get("Usuario");

       //Limpia el campo de usurio
       inicio.getDriver().findElement(inicio.getTxtUsuario()).clear();

       //Envia el usuario
        inicio.getDriver().findElement(inicio.getTxtUsuario())
                .sendKeys(usuario);

    }

    @Step("Enviar Campo clave")
    public void enviarClave(){

        String clave = Credenciales.data().get(0).get("Clave");
        //Limpia el campo de clave
        inicio.getDriver().findElement(inicio.getTxtClave()).clear();

        //Envia el clave
        inicio.getDriver().findElement(inicio.getTxtClave())
                .sendKeys(clave);

    }

    @Step("Clic iniciar sesion")
    public void clicBtnInicio(){
       inicio.getDriver().findElement(inicio.getBtnInicioSesion()).click();

    }


}
