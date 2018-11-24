package modelo;

public class Store {

	private User raiz;
	private Mascotas raizM; 
	private Inventario raizI;
	
	private Inventario reco;

	public Store() {
		raiz = null;
		raizM = null;
		raizI = null;
		this.reco = null;
	}

	public User getRaiz() {
		return raiz;
	}

	public void setRaiz(User raiz) {
		this.raiz = raiz;
	}

	public Mascotas getRaizM() {
		return raizM;
	}

	public void setRaizM(Mascotas raizM) {
		this.raizM = raizM;
	}

	public Inventario getRaizI() {
		return raizI;
	}

	public void setRaizI(Inventario raizI) {
		this.raizI = raizI;
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

	public void agregarUsuario(String nombre, String apellido, String fechaNacimiento, String correo, String genero, String contraseņa) {

		User add = new User (nombre, apellido, fechaNacimiento, correo, contraseņa, genero);
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
	
	public User searchUsuario(String nombre, String apellido, String fechaNacimiento, String correo, String genero, String contraseņa) {
		User search = new User(nombre, apellido, fechaNacimiento, correo, contraseņa, genero);
		User res = null;
		User reco = this.raiz;
		
		res = searchU(reco, search);
		
		return res;
	}
	
	public void modificarUsuario(String nombre, String apellido, String fechaNacimiento, String correo, String genero, String contraseņa) {
		
		User reco = this.raiz;
		User dado =  new User(nombre, apellido, fechaNacimiento, correo, genero, contraseņa); 
		User buscar = searchU(reco, dado);
		
		buscar = dado;
		
		
	}
	
	public void agregarInventario(String tipoProducto, String nombreProducto, String codigoProducto, double precioProducto, int unidadesInventario) {
		
		Inventario nuevo = new Inventario(tipoProducto, nombreProducto, codigoProducto, precioProducto, unidadesInventario);
		
		
	}
	
	
	public void agregarMascota(String nombre, int edad, char sexo, String raza, String tipo) {
		
		Mascotas add = new Mascotas(nombre, edad, sexo, raza, tipo);
		Mascotas reco = this.raizM;
		Mascotas anterion = null;
			
	}

	
	

}
