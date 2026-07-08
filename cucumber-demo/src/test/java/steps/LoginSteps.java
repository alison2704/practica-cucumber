package steps;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class LoginSteps {

    private String usuarioSistema;
    private String contrasenaSistema;
    private boolean accesoOtorgado;

    @Given("que el usuario {string} existe con contraseña {string}")
    public void existeUsuario(String usuario, String contrasena) {
        this.usuarioSistema = usuario;
        this.contrasenaSistema = contrasena;
    }

    @When("intento iniciar sesión con usuario {string} y contraseña {string}")
    public void intentoLogin(String usuario, String contrasena) {

        accesoOtorgado = usuarioSistema.equals(usuario)
                && contrasenaSistema.equals(contrasena);

    }

    @Then("el sistema me da acceso")
    public void sistemaOtorgaAcceso() {
        assertTrue(
                "Se esperaba acceso pero fue denegado",
                accesoOtorgado);
    }

    @Then("el sistema me niega el acceso")
    public void sistemaNiegaAcceso() {
        assertFalse(
                "Se esperaba denegación pero se otorgó acceso",
                accesoOtorgado);
    }
}