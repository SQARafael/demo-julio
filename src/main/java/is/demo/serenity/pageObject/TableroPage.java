package is.demo.serenity.pageObject;
/*
 * @(#) TableroPage.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class TableroPage extends PageObject {

    @FindBy(xpath = "//h1[.='Dashboard']")
    public WebElementFacade LBLDashboard;
}
