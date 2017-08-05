package modServDao.servicio;

import java.util.List;

import modServDao.modelo.Usuario;

public interface IUsuarioService {
	/**
	 * 
	 * @return
	 */
	List<Usuario> getList();
	
	/**
	 * 
	 * @param usr
	 * @return
	 */
	Usuario getUsuario(Usuario usr);
	
	/**
	 * 
	 * @param usr
	 * @return
	 */
	Usuario create(Usuario usr);
	
	/**
	 * 
	 * @param usr
	 * @return
	 */
	Usuario delete(Usuario usr);
	
	/**
	 * 
	 * @param usr
	 * @return
	 */
	Usuario update(Usuario usr);
}
