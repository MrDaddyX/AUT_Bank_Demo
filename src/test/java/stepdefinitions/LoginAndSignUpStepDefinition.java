package stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ElMensaje;
import questions.ElUsuario;
import tasks.HacerLogin;
import tasks.LlenarFormulario;
import tasks.Logout;
import tasks.Loguearse;
import ui.Login;
import utils.WebDriverFactory;

public class LoginAndSignUpStepDefinition {
	
	@Before
	public void antesDelTest() {
		
		OnStage.setTheStage(new OnlineCast());
		OnStage.theActorCalled("Analista").entersTheScene();
	}
	
	@Dado("que el usuario entra al home del aplicativo")
	public void queElUsuarioEntraAlHomeDelAplicativo() {
		
		//Se inicia el driver y en la pagina en especifico
		theActorInTheSpotlight().whoCan(BrowseTheWeb.with(WebDriverFactory.web().onPage("http://dbankdemo.com/login")));
	}
	
	@Dado("desea crear un usuario")
	public void deseaCrearUnUsuario2() {

		//Le da click en el hiperlink para crear user
		theActorInTheSpotlight().attemptsTo(Click.on(Login.LABEL_SIGNUP));
		//Llena el formulario
		theActorInTheSpotlight().attemptsTo(LlenarFormulario.correctamente());
	}

	@Cuando("crea el usuario desea validar el correcto login y logout")
	public void creaElUsuarioDeseaValidarElCorrectoLogueo() {
		
		//se hace el login para la trazabilidad
		theActorInTheSpotlight().attemptsTo(HacerLogin.correctamente());
	}

	@Entonces("podra ver que su usuario se loguea y hace logout correctamente")
	public void podraVerQueSuUsuarioSeLogueaYHaceLogoutCorrectamente() {
		
		//Se valida el mensaje de usuario
		theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElUsuario.estaLogueado(), equalTo(true)));
		//Hace logout para finalizar la trazabilidad
		theActorInTheSpotlight().attemptsTo(Logout.correctamente());
	}
	
	@Y("desea loguearse con (.*) (.*)")
	public void deseaLoguearseConUserXX(String user, String password) {
		
		//Entra un usuario y contraseña mandado desde el feature
		theActorInTheSpotlight().attemptsTo(Loguearse.con(user, password));
	}
	
	@Entonces("podra ver el mensaje de error (.*)")
	public void podraVerElMensajeDeError(String mensaje) {
		
		//Se valida el mensaje de error de el login
		theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElMensaje.es(mensaje), equalTo(true)));
	}

}
