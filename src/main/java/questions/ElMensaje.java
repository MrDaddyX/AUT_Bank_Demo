package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.Login;

public class ElMensaje implements Question<Boolean>{
	
	String mensaje;
	
	public ElMensaje(String mensaje) {
		
		this.mensaje=mensaje;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		
		//Se verifica el mensaje de error
		return Login.LABEL_ERROR_LOGIN.resolveFor(actor).containsText(mensaje); 
	}

	public static ElMensaje es(String mensaje) {
		
		return new ElMensaje(mensaje) ;
	}

}

