<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>MASTER JAVA</title>
		
		<link rel="stylesheet" type="text/css" href="css/estilos.css"/>
		
		<script type="text/javascript" src="js/externalJS.js"></script>

	</head>
	
	<body onload="posicionarFoco();">
	
		<div align="center">
		
		<h1>- ACCESO USUARIOS -</h1>
		
		<img src="imagenes/login.png"/>
		
		<br/><br/>
		
		<form action="LoginServlet" method="POST">
		
		<fieldset>
		
		<div id="datos">
		
		<label>USUARIO: </label>
		
			<input type="text" id="user" value="${param.user}" name="user"
				maxlength="10" size="12"/>
		
		<br/><br/>
		
		<label>PASSWORD: </label>
		
			<input type="text" id="pass" value="${param.pass}" name="pass"
				maxlength="10" size="12"/>
				
		</div>
		
		<br/><br/>
		
		<input type="submit" value="ENTRAR"/>
		
		</fieldset>
		
		</form>
			
		</div>
	
	</body>
	
</html>