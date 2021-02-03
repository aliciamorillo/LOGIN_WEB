package patronFachadaDAO;

import gestores.GestorQueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestorBD {
	
	public static boolean newUser(String user, String pass){
		
		//CONSTANTES:
		final String DRIVER     = "com.mysql.jdbc.Driver";
        final String USER       = "root";
        final String PASS   	= "";
        final String URL        = "jdbc:mysql://localhost:3306/login";
                
        // 1. CARGAR DRIVER EN MEMORIA:
        try {
            Class.forName(DRIVER);
            
        } catch (ClassNotFoundException cnfe) {
            System.out.println("ERROR AL CARGAR LOS DRIVERS EN MEMORIA");
            cnfe.printStackTrace();
        }
        
        //2. CONEXION BBDD -> OBJ Connection
        Connection conexion = null;
        
        try {
            conexion = DriverManager.getConnection(URL, USER, PASS);
            
        } catch (SQLException sqle) {
            System.out.println("ERROR AL CREAR EL OBJETO CONEXION");
            sqle.printStackTrace();
        }
        
        //3. OBJETO SENTENCIA -> PreparedStatement:
        
        final String querySQL = GestorQueries.obtenerQuery("login.acceso");
        
        PreparedStatement ps = null;
        ResultSet rs		 = null;
        
        int count	 = -1;
        boolean isOk = false;
        
        try {
			ps = conexion.prepareStatement(querySQL);
			
			ps.setString(1, user);
			ps.setString(2, pass);
			
			rs = ps.executeQuery();
            
			isOk = rs.next();
			
			
		} catch (SQLException sqle) {
			System.out.println("- ERROR AL GENERAR EL OBJETO -");
			sqle.printStackTrace();
		
		} finally {
			
			try {
                ps.close();
            } catch(SQLException sqle) {
                System.out.println("ERROR AL CERRAR LA INSTRUCCION STATEMENT.");
                System.out.println(sqle);
            }
			
			try {
				conexion.close();
				System.out.println("- CONNECTION CERRADO -");
			} catch (SQLException sqle) {
				System.out.println("ERROR AL CERRAR LA CONEXION.");
                System.out.println(sqle);
			}
		}
        
		return isOk;
	}
	
}


