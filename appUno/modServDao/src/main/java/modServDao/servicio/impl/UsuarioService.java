package modServDao.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import modServDao.modelo.Usuario;
import modServDao.servicio.IUsuarioService;

@Component
public class UsuarioService implements IUsuarioService {

	private static List<Usuario> usuarios;
	{
		usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario("user1","pass1"));
		usuarios.add(new Usuario("user2","pass2"));
		usuarios.add(new Usuario("user3","pass3"));
		usuarios.add(new Usuario("user4","pass4"));
	}
	
	@Override
	public List<Usuario> getList() {
		return usuarios;
	}

	@Override
	public Usuario getUsuario(Usuario usr) {
		Usuario resUsr = null;
		if( !usr.isValido() ) {
			resUsr = buscarUsuario(usr.getUsuario(),usr.getPasswor()); 
		}			
		return resUsr;
	}

	@Override
	public Usuario create(Usuario usr) {
		Usuario resUsr = buscarUsuario(usr.getUsuario(),usr.getPasswor());
		if( resUsr == null) {
			usr.setActivo(true);
			usuarios.add(usr);
			return null;
		}else {
			return resUsr;
		}
	}

	@Override
	public Usuario delete(Usuario usr) {
		Usuario resUsr = buscarUsuario(usr.getUsuario(),usr.getPasswor());
		if( usr.isActivo() ) {
			resUsr.setActivo(false);
		}
		return resUsr;
	}

	@Override
	public Usuario update(Usuario usr) {
		Usuario resUsr = buscarUsuario(usr.getUsuario());
		if(resUsr != null) {
			usuarios.remove(resUsr);
			usr.setActivo(true);
			usuarios.add(usr);
			return usr;
		}else {
			return null;
		}
	}

	private Usuario buscarUsuario(String usuario) {
		Usuario resUsr = null;
		for(Usuario usrL : usuarios) {
			if( usuario.equalsIgnoreCase(usrL.getUsuario())) {
				resUsr = usrL;
				return resUsr;
			}
		}
		return null;
	}

	private Usuario buscarUsuario(String usuario, String passwor) {
		Usuario resUsr = null;
		for(Usuario usrL : usuarios) {
			if( usuario.equalsIgnoreCase(usrL.getUsuario()) &&
				passwor.equalsIgnoreCase(usrL.getPasswor())) {
				resUsr = usrL;
				return resUsr;
			}
		}
		return null;
	}	
	
}
