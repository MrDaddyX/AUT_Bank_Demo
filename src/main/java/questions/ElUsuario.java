package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.Login;
import ui.PaginaPrincipal;

public class ElUsuario implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		
		//Se verifica que el usuario se creo correctamente 
		return PaginaPrincipal.LABEL_USERNAME.resolveFor(actor).containsText("Welcome "+actor.recall("firstName")); 
	}

	public static ElUsuario estaLogueado() {
		
		return new ElUsuario() ;
	}

}
