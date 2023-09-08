package com.panditassolutions.stepdefinitions;


import com.panditassolutions.actions.Action;
import com.panditassolutions.pageobjects.Guru.GuruHome;
import com.panditassolutions.pageobjects.Guru.GuruLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GuruLoginStepDefinitions {

    private WebDriver driver; // Mueve la declaración de driver a nivel de clase
    GuruLogin guruLogin;
    GuruHome guruHome;

    @Before
    public void before(){
        WebDriverManager.chromedriver().setup();  // Configura el chromedriver usando WebDriverManager
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("@Before");
    }

    @After
    public void after(){
        System.out.println("@After");
        if (driver != null) {
            driver.quit();  // Cierra el driver después de cada escenario
        }
    }

    @Given("Deseo ir a la pagina de {string}")
    public void deseoIrALaPaginaDe(String url) {
        //guruLogin.open();
        Action.navegateTo(driver, url);

    }
    @When("Ingreso el nombre de usuario {string} y la contrasenia {string}")
    public void ingresoElNombreDeUsuarioYLaContrasenia(String user, String password) {
        guruLogin.login(driver, user, password);

    }
    @Then("Valido que el titulo sea {string}")
    public void validoQueElTituloSea(String title) {
        guruHome.validateText(driver, title);
    }
}
