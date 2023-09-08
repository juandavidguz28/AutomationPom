package com.panditassolutions.actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Action {
    //Todas las interacciones que el usuario haria con la pagina

    public static void navegateTo(WebDriver driver,  String url) {

        driver.navigate().to(url);
    }


    public static void fillInput(WebDriver driver, By target, String text) {
        WebElement inputElement = driver.findElement(target);

        // Asegurarse de que el elemento está visible y se puede interactuar con él
        if (inputElement.isDisplayed() && inputElement.isEnabled()) {
            inputElement.clear();  // Limpiar cualquier texto existente en el campo de entrada
            inputElement.sendKeys(text);  // Ingresar el texto proporcionado
        } else {
            // Puedes manejar aquí el caso en que el elemento no esté visible o no se pueda interactuar
            System.out.println("Elemento no está visible o no se puede interactuar con él.");
        }
    }



    public static void click(WebDriver driver, By target){

        driver.findElement(target).click();
    }

    public static String getElementText(WebDriver driver, By selector) {
        return driver.findElement(selector).getText();
    }
}
