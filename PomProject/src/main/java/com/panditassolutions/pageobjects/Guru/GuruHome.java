package com.panditassolutions.pageobjects.Guru;

import com.panditassolutions.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class GuruHome extends PageObject {

    public By getTextSelector(String value) {
        return By.xpath(String.format("//*[text()='%s']", value));
    }

    public void validateText(WebDriver driver, String textoEsperado) {
        By selector = getTextSelector(textoEsperado);
        String textoObtenido = Action.getElementText(driver, selector);
        assertEquals(textoEsperado, textoObtenido);
    }



}
