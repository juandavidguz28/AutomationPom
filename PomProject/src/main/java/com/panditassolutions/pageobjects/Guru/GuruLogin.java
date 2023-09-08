package com.panditassolutions.pageobjects.Guru;

import com.gargoylesoftware.htmlunit.javascript.host.Console;
import com.panditassolutions.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("https://demo.guru99.com/v4/")
public class GuruLogin extends PageObject {

    By userName = By.name("uid");

    By password = By.name("password");
    By btnLogin = By.xpath("//*[@name='btnLogin']");


    public void login(WebDriver driver, String strUserName, String strPassword){

        System.out.println("llegoooooooooo----------------------");
        Action.fillInput(driver, userName, strUserName);
        Action.fillInput(driver, password, strPassword);
        Action.click(driver, btnLogin);

        // Puedes agregar la acción para hacer clic en el botón de inicio de sesión aquí si lo necesitas.
    }
}
