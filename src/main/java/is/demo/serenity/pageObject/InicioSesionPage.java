package is.demo.serenity.pageObject;
/*
 * @(#) InicioSesionPage.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class InicioSesionPage extends PageObject {

    private final By txtUsuario= By.id("LoginPanel0_Username");
    private final By txtClave= By.id("LoginPanel0_Password");
    private final By btnInicioSesion= By.xpath("//button[@id='LoginPanel0_LoginButton']");

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnInicioSesion() {
        return btnInicioSesion;
    }
}
