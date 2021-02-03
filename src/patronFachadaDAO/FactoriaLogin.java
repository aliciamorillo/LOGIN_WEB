package patronFachadaDAO;

import interfaces.GestorFachadaInterfaz;

public class FactoriaLogin {
	
	public static GestorFachadaInterfaz obtenerGestorLogin(){
		
		return new GestorFachada();
		
	}

}
