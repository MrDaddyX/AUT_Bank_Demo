package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Login extends PageObject{
	
	private Login() {}
	
	public static final Target INPUT_USERNAME = Target.the("Ingreso de usuario")
			.locatedBy("//*[@id=\"username\"]");
	
	public static final Target INPUT_PASSWORD = Target.the("Ingreso de contraseña")
			.locatedBy("//*[@id=\"password\"]");
	
	public static final Target BUTTON_SIGNIN = Target.the("Boton de ingreso")
			.locatedBy("//*[@id=\"submit\"]");
	
	public static final Target LABEL_SIGNUP = Target.the("Link de creacion de formulario")
			.locatedBy("/html/body/div[1]/div/div/div[2]/form/div[4]/p/a");
	
	public static final Target LABEL_ERROR_LOGIN = Target.the("Mensaje error login")
			.locatedBy("/html/body/div[1]/div/div/div[2]/div");
	
	public static final Target ALERT_USER_CREATED = Target.the("Alerta de correcto logueo de usuario")
			.locatedBy("//*[@id=\"submit\"]");

}
