package modServDao.modelo;

public class Usuario {
	
	private String usuario;
	private String passwor;
	private boolean isValido;
	private boolean isActivo;
	
	public Usuario() {
	}

	public Usuario(String usuario, String passwor) {
		this.usuario = usuario;
		this.passwor = passwor;
		this.isValido = false;
		this.isActivo = true;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPasswor() {
		return passwor;
	}

	public void setPasswor(String passwor) {
		this.passwor = passwor;
	}

	public boolean isValido() {
		return isValido;
	}

	public void setValido(boolean isValido) {
		this.isValido = isValido;
	}

	public boolean isActivo() {
		return isActivo;
	}

	public void setActivo(boolean isActivo) {
		this.isActivo = isActivo;
	}
	
}
