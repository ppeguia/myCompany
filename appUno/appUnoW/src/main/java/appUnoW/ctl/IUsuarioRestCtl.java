package appUnoW.ctl;

import java.util.List;

import org.springframework.http.ResponseEntity;

import modServDao.modelo.Usuario;



public interface IUsuarioRestCtl {
	
	/**
	 * 
	 * @return
	 */
	List<Usuario> getUsuario();
	
	/**
	 * 
	 * @param usr
	 * @param pass
	 * @return
	 */
	 ResponseEntity<Usuario> getUsuario(String usr, String pass);
	 
	 /**
	  * 
	  * @param usr
	  * @return
	  */
	 ResponseEntity<Usuario> createUsuario(Usuario usr);
	 
	 /**
	  * 
	  * @param usuario
	  * @return
	  */
	 ResponseEntity<Usuario> deleteUsuario(Usuario usuario);
	 
	 /**
	  * 
	  * @param usr
	  * @return
	  */
	 ResponseEntity<Usuario> updateCustomer(Usuario usr);
}
