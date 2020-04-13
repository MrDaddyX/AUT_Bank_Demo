package tasks;

import org.apache.commons.lang3.RandomStringUtils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import ui.FormularioDeCreacion1;
import ui.FormularioDeCreacion2;
import utils.TiempoDeEspera;


public class LlenarFormulario implements Task{
	
	String firstName = "Alex";
	String lastName = "Uribe";
	String dateBirth = "12/31/2000";
	String email = "change@test.automatizacion.com";
	String password = "Asdf1234";
	String address = "Cra test # test - test";
	String locality = "Medellin";
	String region = "testRegion";
	String postalCode = "050036";
	String country = "Colombia";
	String homePhone = "(034) 111-1111";
	String mobilePhone = "(034) 222-2222";
	String workPhone = "(034) 333-3333";
	String socialSecurityNumber = RandomStringUtils.randomNumeric(3)+"-"+RandomStringUtils.randomNumeric(2)+"-"+RandomStringUtils.randomNumeric(4);

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		email = email.replace("change", RandomStringUtils.randomAlphabetic(7));
		actor.remember("password", password);
		actor.remember("firstName", firstName);
		
		TiempoDeEspera.de(1000);
		actor.attemptsTo(Click.on(FormularioDeCreacion1.BOX_TITLE));
		TiempoDeEspera.de(300);
		actor.attemptsTo(Click.on(FormularioDeCreacion1.TITLE_MR));
		TiempoDeEspera.de(300);
		actor.attemptsTo(SendKeys.of(firstName).into(FormularioDeCreacion1.INPUT_FIRST_NAME));
		TiempoDeEspera.de(300);
		actor.attemptsTo(SendKeys.of(lastName).into(FormularioDeCreacion1.INPUT_LAST_NAME));
		TiempoDeEspera.de(300);
		actor.attemptsTo(Click.on(FormularioDeCreacion1.SELECT_GENDER_M));
		TiempoDeEspera.de(300);
		actor.attemptsTo(SendKeys.of(dateBirth).into(FormularioDeCreacion1.INPUT_DATE_OF_BIRTH));
		TiempoDeEspera.de(300);
		actor.attemptsTo(SendKeys.of(socialSecurityNumber).into(FormularioDeCreacion1.INPUT_NUMBER_SOCIAL_SECURITY));
		TiempoDeEspera.de(300);
		actor.attemptsTo(SendKeys.of(email).into(FormularioDeCreacion1.INPUT_EMAIL));
		TiempoDeEspera.de(300);
		actor.attemptsTo(SendKeys.of(password).into(FormularioDeCreacion1.INPUT_PASSWORD));
		TiempoDeEspera.de(300);
		actor.attemptsTo(SendKeys.of(password).into(FormularioDeCreacion1.INPUT_CONFIRM_PASSWORD));
		TiempoDeEspera.de(300);
		actor.attemptsTo(Click.on(FormularioDeCreacion1.BUTTON_NEXT));
		TiempoDeEspera.de(3000);
		actor.attemptsTo(SendKeys.of(address).into(FormularioDeCreacion2.INPUT_ADDRESS));
		TiempoDeEspera.de(300);
		actor.attemptsTo(SendKeys.of(locality).into(FormularioDeCreacion2.INPUT_LOCALITY));
		TiempoDeEspera.de(300);
		actor.attemptsTo(SendKeys.of(region).into(FormularioDeCreacion2.INPUT_REGION));
		TiempoDeEspera.de(300);
		actor.attemptsTo(SendKeys.of(postalCode).into(FormularioDeCreacion2.INPUT_POSTAL_CODE));
		TiempoDeEspera.de(300);
		actor.attemptsTo(SendKeys.of(country).into(FormularioDeCreacion2.INPUT_COUNTRY));
		TiempoDeEspera.de(300);
		actor.attemptsTo(SendKeys.of(homePhone).into(FormularioDeCreacion2.INPUT_HOME_PHONE));
		TiempoDeEspera.de(300);
		actor.attemptsTo(SendKeys.of(mobilePhone).into(FormularioDeCreacion2.INPUT_MOBILE_PHONE));
		TiempoDeEspera.de(300);
		actor.attemptsTo(SendKeys.of(workPhone).into(FormularioDeCreacion2.INPUT_WORK_PHONE));
		TiempoDeEspera.de(300);
		actor.attemptsTo(Click.on(FormularioDeCreacion2.INPUT_AGREE_TERMS));
		TiempoDeEspera.de(300);
		actor.attemptsTo(Click.on(FormularioDeCreacion2.BUTTON_REGISTER));
		TiempoDeEspera.de(1000);
		
	}
	
	public static LlenarFormulario correctamente() {
		return Tasks.instrumented(LlenarFormulario.class);
		
	}

}
