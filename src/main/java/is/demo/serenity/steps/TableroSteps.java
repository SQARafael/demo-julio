package is.demo.serenity.steps;
/*
 * @(#) TableroSteps.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import is.demo.serenity.pageObject.TableroPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class TableroSteps {
    @Page
    TableroPage tableroPage;

    @Step("Validar mensaje en pantalla")
    public void validarMsj(){

        Assert.assertTrue(
                tableroPage.LBLDashboard.isDisplayed()
        );


    }
}
