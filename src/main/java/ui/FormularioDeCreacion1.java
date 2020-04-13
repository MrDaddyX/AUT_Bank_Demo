package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioDeCreacion1 extends PageObject {
	
	private  FormularioDeCreacion1() {}
	
	
	//Primer llenado de el formulario
	public static final Target BOX_TITLE = Target.the("Combo box de titulo")
			.locatedBy("/html/body/div[1]/div/div/div[2]/form/div[1]/select");
	
	public static final Target TITLE_MR = Target.the("Titulo a elegir (Mr)")
			.locatedBy("/html/body/div[1]/div/div/div[2]/form/div[1]/select/option[2]");
	
	public static final Target INPUT_FIRST_NAME = Target.the("Ingreso de Primer nombre")
			.locatedBy("//*[@id=\"firstName\"]");
	
	public static final Target INPUT_LAST_NAME = Target.the("Ingreso de apellido")
			.locatedBy("//*[@id=\"lastName\"]");
	
	public static final Target SELECT_GENDER_M = Target.the("Seleccionar genero (M)")
			.locatedBy("(//*[@id=\"gender\"])[1]");
	
	public static final Target INPUT_DATE_OF_BIRTH = Target.the("Ingreso de fecha de cumpleaños")
			.locatedBy("//*[@id=\"dob\"]");
	
	public static final Target INPUT_NUMBER_SOCIAL_SECURITY = Target.the("Ingreso de el numero de seguridad social")
			.locatedBy("//*[@id=\"ssn\"]");
	
	public static final Target INPUT_EMAIL = Target.the("Ingreso de email")
			.locatedBy("//*[@id=\"emailAddress\"]");
	
	public static final Target INPUT_PASSWORD = Target.the("Ingreso de contraseña")
			.locatedBy("//*[@id=\"password\"]");
	
	public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Ingreso para confirmar contraseña")
			.locatedBy("//*[@id=\"confirmPassword\"]");
	
	public static final Target BUTTON_NEXT = Target.the("Boton de continuar")
			.locatedBy("/html/body/div[1]/div/div/div[2]/form/button");
}
