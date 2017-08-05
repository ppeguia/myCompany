<html>
<body>
<h2>Documentación</h2>
<h2>Restfull Services with Spring and Maven </h2>

	<div align="center">
      <table  style="border-collapse: separate; border-spacing: 10px; border: 1px solid black;">
		  <tr>
		    <th>Crud</th>
		    <th>URL</th>
		    <th>JSON-Entrada</th>
		    <th>JSON-Salida</th>
		  </tr>
		  <tr>
		    <td style="width:10%">GET</td>
		    <td style="width:20%">http://localhost:8080/appUnoW/usuarios</td>
		    <td style="width:20%">N/A</td>
		    <td style="width:50%">[{"usuario":"user1","passwor":"pass1","valido":false,"activo":true},{"usuario":"user2","passwor":"pass2","valido":false,"activo":true},{"usuario":"user3","passwor":"pass3","valido":false,"activo":true},{"usuario":"user4","passwor":"pass4","valido":false,"activo":true}]</td>	    
		  </tr>
		  <tr>
		    <td>GET</td>
		    <td>http://localhost:8080/appUnoW/usuario/user4/pass4</td>
		    <td>N/A</td>
		    <td>{"usuario":"user4","passwor":"pass4","valido":false,"activo":true}</td>
		  </tr>
		  <tr>
		    <td>POST</td>
		    <td>http://localhost:8080/appUnoW/usuario</td>
		    <td>{"usuario":"user5","passwor":"pass5"}</td>
		    <td>{"usuario":"user5","passwor":"pass5","valido":false,"activo":true}</td>
		  </tr>
		  <tr>
		    <td>DELETE</td>
		    <td>http://localhost:8080/appUnoW/usuario</td>
		    <td>{"usuario":"user5","passwor":"pass5"}</td>
		    <td>{"usuario":"user5","passwor":"pass5","valido":false,"activo":false}</td>
		  </tr>
		  <tr>
		    <td>PUT</td>
		    <td>http://localhost:8080/appUnoW/usuario</td>
		    <td>{"usuario":"user5","passwor":"pass6"}</td>
		    <td>{"usuario":"user5","passwor":"pass6","valido":false,"activo":true}</td>
		  </tr>
		</table>
    </div>

</body>
</html>
