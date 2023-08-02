package is.demo.serenity.stepDefinitions;
/*
 * @(#) InicioSesionStepDefinitions.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.*;
import is.demo.serenity.steps.IncioSesionSteps;
import is.demo.serenity.steps.TableroSteps;
import net.thucydides.core.annotations.Steps;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class InicioSesionStepDefinitions {
    @Steps
    IncioSesionSteps inicioSesion;

    @Steps
    TableroSteps tableroSteps;

    @Dado("que el usuario abre la pagina demo")
    public void queElUsuarioAbreLaPaginaDemo() {
        inicioSesion.abrirNavegador();

    }
    @Cuando("el usuario ingresa las credenciales")
    public void elUsuarioIngresaLasCredenciales(DataTable dataTable) {

        inicioSesion.enviarUsuario();
        inicioSesion.enviarClave();

    }
    @Cuando("de clic en ingresar")
    public void deClicEnIngresar() {
        inicioSesion.clicBtnInicio();

    }
    @Entonces("el usuario podrá ver un mensaje de plataforma.")
    public void elUsuarioPodráVerUnMensajeDePlataforma() {
        tableroSteps.validarMsj();
    }
}
