package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import ui.Login;
import utils.TiempoDeEspera;

public class Loguearse implements Task{
	
	String user;
	String password;
	
	public Loguearse(String user, String password) {
		this.user=user;
		this.password = password;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		if("null".equals(user)) {
			user = "";
		}else if("null".equals(password)) {
			password = "";
		}
		
		TiempoDeEspera.de(2000);
		actor.attemptsTo(SendKeys.of(user).into(Login.INPUT_USERNAME));
		TiempoDeEspera.de(300);
		actor.attemptsTo(SendKeys.of(password).into(Login.INPUT_PASSWORD));
		TiempoDeEspera.de(300);
		actor.attemptsTo(Click.on(Login.BUTTON_SIGNIN));
		TiempoDeEspera.de(1000);
		
	}
	
	public static Loguearse con(String user, String password) {
		return Tasks.instrumented(Loguearse.class, user, password);
		
	}

}
