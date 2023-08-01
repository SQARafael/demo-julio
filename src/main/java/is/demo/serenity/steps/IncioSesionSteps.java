package is.demo.serenity.steps;
/*
 * @(#) IncioSesionSteps.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import io.cucumber.datatable.DataTable;
import is.demo.serenity.pageObject.InicioSesionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

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
    public void enviarUsuario(DataTable dataTable){

       //Limpia el campo de usurio
       inicio.getDriver().findElement(inicio.getTxtUsuario()).clear();

       //Envia el usuario
        inicio.getDriver().findElement(inicio.getTxtUsuario())
                .sendKeys(dataTable.asLists().get(1).get(0));

    }

    @Step("Enviar Campo clave")
    public void enviarClave(DataTable dataTable){
        //Limpia el campo de clave
        inicio.getDriver().findElement(inicio.getTxtClave()).clear();

        //Envia el clave
        inicio.getDriver().findElement(inicio.getTxtClave())
                .sendKeys(dataTable.asLists().get(1).get(1));

    }

    @Step("Clic iniciar sesion")
    public void clicBtnInicio(){
       inicio.getDriver().findElement(inicio.getBtnInicioSesion()).click();

    }


}
