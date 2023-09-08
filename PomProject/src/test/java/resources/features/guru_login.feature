Feature: Iniciar Sesion de forma exitosa
    Yo como aprendiz
    Necesito iniciar sesion en la pagina de guru
    Para validar que el mensaje sea correcto

  Scenario: Iniciar sesion en Guru99
    Given Deseo ir a la pagina de "https://demo.guru99.com/v4/"
    When  Ingreso el nombre de usuario "mngr526498" y la contrasenia "busudAd"
    Then  Valido que el titulo sea "Manger Id : mngr526498"