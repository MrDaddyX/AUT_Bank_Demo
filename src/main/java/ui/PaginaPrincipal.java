package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipal extends PageObject{

	private PaginaPrincipal() {}
	
	public static final Target LABEL_USERNAME = Target.the("Label con el nombre de usuario")
			.locatedBy("//*[@id=\"right-panel\"]/div[1]/div[2]/div/div/ol/li");
	
	public static final Target ICON_PROFILE = Target.the("Icono de usuario")
			.locatedBy("//*[@id=\"header\"]/div/div[2]/div[1]");
	
	public static final Target LABEL_LOGOUT = Target.the("label para hacer logout")
			.locatedBy("//*[@id=\"header\"]/div/div[2]/div[1]/div/a[3]");
	
}
