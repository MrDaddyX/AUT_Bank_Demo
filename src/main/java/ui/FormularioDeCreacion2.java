package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioDeCreacion2 extends PageObject {
	
	private  FormularioDeCreacion2() {}
	
	//Segunda parte del formulario
	public static final Target INPUT_ADDRESS = Target.the("Ingreso de direccion")
			.locatedBy("//*[@id=\"address\"]");
	
	public static final Target INPUT_LOCALITY = Target.the("Ingreso de ciudad")
			.locatedBy("//*[@id=\"locality\"]");
	
	public static final Target INPUT_REGION = Target.the("Ingreso de Region")
			.locatedBy("//*[@id=\"region\"]");
	
	public static final Target INPUT_POSTAL_CODE = Target.the("Ingreso de codigo postal")
			.locatedBy("//*[@id=\"postalCode\"]");
	
	public static final Target INPUT_COUNTRY = Target.the("Ingreso de pais")
			.locatedBy("//*[@id=\"country\"]");
	
	public static final Target INPUT_HOME_PHONE = Target.the("Ingreso de telefono")
			.locatedBy("//*[@id=\"homePhone\"]");
	
	public static final Target INPUT_MOBILE_PHONE = Target.the("Ingreso de telefono movil")
			.locatedBy("//*[@id=\"mobilePhone\"]");
	
	public static final Target INPUT_WORK_PHONE = Target.the("Ingreso de telefono del trabajo")
			.locatedBy("//*[@id=\"workPhone\"]");
	
	public static final Target INPUT_AGREE_TERMS = Target.the("check box de aceptar los terminos")
			.locatedBy("//*[@id=\"agree-terms\"]");
	
	
	public static final Target BUTTON_REGISTER = Target.the("Boton de registrar")
			.locatedBy("/html/body/div[1]/div/div/div[2]/form/button");
}
