package appUnoW.ctl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import appUnoW.ctl.IUsuarioRestCtl;
import modServDao.modelo.Usuario;
import modServDao.servicio.impl.UsuarioService;

@RestController
public class UsuarioRestCtl implements IUsuarioRestCtl {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/usuarios")
	public List<Usuario> getUsuario(){
		return usuarioService.getList();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping("/usuario/{usr}/{pass}")
	public ResponseEntity<Usuario> getUsuario(@PathVariable("usr") String usr, @PathVariable("pass") String pass) {
		
		Usuario usuario = usuarioService.getUsuario(new Usuario(usr,pass));
		if(usuario == null ) {
			return new ResponseEntity("No encontrado usuario por 'usuario':" + usr, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping(value = "/usuario")
	public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usr) {
		Usuario usuario = usuarioService.create(usr);
		if(usuario != null ) {
			return new ResponseEntity("Ya existe el 'usuario':" + usr.getUsuario(), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Usuario>(usr, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@DeleteMapping("/usuario")
	public ResponseEntity<Usuario> deleteUsuario(@RequestBody Usuario usuario) {

		Usuario restUsr = usuarioService.delete(usuario);
		if (null == restUsr) {
			return new ResponseEntity("No existe el 'usuario':" + usuario.getUsuario(), HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);

	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PutMapping("/usuario")
	public ResponseEntity<Usuario> updateCustomer(@RequestBody Usuario usr) {

		Usuario rstUsr = usuarioService.update(usr);

		if (null == rstUsr) {
			return new ResponseEntity("No Customer found for ID " + usr, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Usuario>(rstUsr, HttpStatus.OK);
	}

}
