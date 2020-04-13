package utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TiempoDeEspera {
	
	private TiempoDeEspera() {}
	private static Logger logger = Logger.getLogger("com.library.books");

	
	public static void de (int tiempoDeEsperaEnMilisegundos) {
		
		try {
			Thread.sleep(tiempoDeEsperaEnMilisegundos);
		} catch (InterruptedException e) {
			logger.log(Level.SEVERE, "No se pudo realizar el tiempo de espera", e);
			Thread.currentThread().interrupt();
		}
		
	}

}
