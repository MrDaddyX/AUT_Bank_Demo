package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginAndSignUpStepDefinition {
	
	@Before
	public void antesDelTest() {
		
		OnStage.setTheStage(new OnlineCast());
		OnStage.theActorCalled("Analista").entersTheScene();
	}
	
	@Dado("que el usuario entra al home del aplicativo")
	public void queElUsuarioEntraAlHomeDelAplicativo() {
	    
	}

	@Dado("desea crear un usuario (.*) (.*)")
	public void deseaCrearUnUsuario(String user, String password) {
	    
	}

	@Cuando("crea el usuario desea validar el correcto logueo")
	public void creaElUsuarioDeseaValidarElCorrectoLogueo() {
	    
	}

	@Entonces("podra ver que su usuario se loguea correctamente")
	public void podraVerQueSuUsuarioSeLogueaCorrectamente() {
	    
	}

}
