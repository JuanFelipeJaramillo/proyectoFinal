package modelo;

public class Store {

	private User raiz;

	public Store() {
		raiz = null;
	}

	public User getRaiz() {
		return raiz;
	}

	public void setRaiz(User raiz) {
		this.raiz = raiz;
	}

	// se encarga del registro de los clientes

	public void agregarUser(User r, User nuevo) {

		if (r == null) {
			r = nuevo;
		} else {

			if (r.compareTo(nuevo) == 1) {
				if (r.getIzquierda() == null) {
					r.setIzquierda(nuevo);
				} else {
					agregarUser(r.getIzquierda(), nuevo);
				}
			} else if (r.compareTo(nuevo) == -1) {
				if (r.getDerecha() == null) {
					r.setDerecha(nuevo);
				} else {
					agregarUser(r.getDerecha(), nuevo);
				}
			}

		}

	}

	public void agregarUsuario(String nombre, String apellido, String fechaNacimiento, String correo, String genero, String contraseña) {

		User add = new User (nombre, apellido, fechaNacimiento, correo, contraseña, genero, null, null);
		User reco = raiz;
		agregarUser(reco, add);

	}
	
	//buscar 
	
	public User searchU(User reco, User search) {
		
		User r = null;
		
		if(reco.compareTo(search) == 0) {
			r = reco;
		}
		else {
			if(reco.compareTo(search) == 1) {
				searchU(reco.getDerecha(), search);
			}
			else if(reco.compareTo(search) == -1) {
				searchU(reco.getIzquierda(), search);
			}
		}
		
		return r;
		
	}
	
	public User searchUsuario(String nombre, String apellido, String fechaNacimiento, String correo, String genero, String contraseña) {
		User search = new User(nombre, apellido, fechaNacimiento, correo, contraseña, genero, null, null);
		User res = null;
		User reco = this.raiz;
		
		res = searchU(reco, search);
		
		return res;
	}
	
	public void modificarUsuario(String nombre, String apellido, String fechaNacimiento, String correo, String genero, String contraseña) {
		
		User reco = this.raiz;
		User dado =  new User(nombre, apellido, fechaNacimiento, correo, genero, contraseña, null, null); 
		User buscar = searchU(reco, dado);
		
		buscar = dado;
		
		
	}

	
	

}
