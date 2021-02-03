package patronFachadaDAO;

import interfaces.GestorFachadaInterfaz;

public class GestorFachada implements GestorFachadaInterfaz {

	private final GestorBD gestorBD;
	
	public GestorFachada(){
		gestorBD = new GestorBD();
	}

	@Override
	public boolean newUser(String user, String pass) {
		return gestorBD.newUser(user, pass);
	}
	
}
