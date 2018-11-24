package modelo;

public class User {
	
	
	private String userName;
	private String password;
	private String apellido;
	private String fechaNacimiento;
	private String eMail;
	private String genero;
	
	private User izquierda;
	private User derecha;
	
	public User(String userName, String password, String apellido, String fechaNacimiento, String eMail, String genero,User izquierda, User derecha) {
		this.izquierda = null;
		this.derecha = null;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public User getIzquierda() {
		return izquierda;
	}

	public void setIzquierda(User izquierda) {
		this.izquierda = izquierda;
	}

	public User getDerecha() {
		return derecha;
	}

	public void setDerecha(User derecha) {
		this.derecha = derecha;
	}
	
	public int compareTo(User n) {
		// TODO Auto-generated method stub
		int c = 0;
		
		if(userName.compareTo(n.getUserName()) == 1) {
			c = 1;
		}
		else if(userName.compareTo(n.getUserName()) == -1) {
			c = -1;
		}
		else {
			c = 0;
		}
		
		return c;
	}
	
	
	//crear una excepcion de verificacion que iria en el else
	public int  verificacionUser(String n, String p) {
	
		int i = 0;
		if(userName.equals(n) && password.equals(p)) {
			i = 1;
		}
		else {
			i = -1;
		}
		
		return i;
		
	}

	

	

}
