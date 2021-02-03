package gestores;

import java.util.ResourceBundle;

public class GestorQueries {

	private static final ResourceBundle rb;
		
		static {
			rb = ResourceBundle.getBundle("ficheros.ficheroQueries");
		}
		
	///
		
	public static String obtenerQuery(String clave){
			return rb.getString(clave);
	}
	
}
