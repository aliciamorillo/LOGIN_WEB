package servlets;

import gestores.GestorQueries;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import patronFachadaDAO.GestorBD;


public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		procesarPeticion(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		procesarPeticion(request, response);
	}
 
	
	public void procesarPeticion(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
		
        boolean error                       = false;
        String  mensajeErrorCampoUsuario    = "";
        String  mensajeErrorCampoClave      = "";
        
        String user  = request.getParameter("user");
        String pass  = request.getParameter("pass");

        if("".equals(user.trim())) {
            error = true;
            mensajeErrorCampoUsuario = "EL CAMPO USUARIO NO PUEDE ESTAR VACIO";
        }
        
        if("".equals(pass.trim())) {
            error = true;
            mensajeErrorCampoClave = "EL CAMPO CLAVE NO PUEDE ESTAR VACIO";
        } 

        if(error) {
            System.out.println(">>>>> SE HAN DETECTADO ERRORES ... VOLVER A INICIO");
            request.setAttribute("mensajeErrorCampoUsuario",mensajeErrorCampoUsuario);
            request.setAttribute("mensajeErrorCampoClave",mensajeErrorCampoClave);
            
            // SALTO A OTRA PÁGINA:
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            
            return;
        }
        
        
        boolean registradoSINO = GestorBD.newUser(user, pass);
        
        System.out.println(">>>>> ¿EL USUARIO ESTA REGISTRADO? ... " + registradoSINO);

        if(registradoSINO) {            
            request.getRequestDispatcher("/WEB-INF/jsp/bienvenida.jsp").forward(request, response);
        } else {
            request.setAttribute("mensajeError", "USUARIO Y/O CONTRASEÑA INCORRECTOS");
            request.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(request, response);
        }
	}
}
