package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import ui.Login;
import ui.PaginaPrincipal;
import utils.TiempoDeEspera;

public class Logout implements Task{
		
	@Override
	public <T extends Actor> void performAs(T actor) {
				
		TiempoDeEspera.de(500);
		actor.attemptsTo(Click.on(PaginaPrincipal.ICON_PROFILE));
		TiempoDeEspera.de(300);
		actor.attemptsTo(Click.on(PaginaPrincipal.LABEL_LOGOUT));
		TiempoDeEspera.de(2000);
	}
	
	public static Logout correctamente() {
		return Tasks.instrumented(Logout.class);
		
	}
}
