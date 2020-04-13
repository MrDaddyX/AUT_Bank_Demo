package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import ui.Login;
import utils.TiempoDeEspera;

public class HacerLogin implements Task{
	
	String password;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		password = actor.recall("password");
		
		TiempoDeEspera.de(1000);
		actor.attemptsTo(SendKeys.of(password).into(Login.INPUT_PASSWORD));
		TiempoDeEspera.de(300);
		actor.attemptsTo(Click.on(Login.BUTTON_SIGNIN));
		TiempoDeEspera.de(1000);
		
	}
	
	public static HacerLogin correctamente() {
		return Tasks.instrumented(HacerLogin.class);
		
	}
}
