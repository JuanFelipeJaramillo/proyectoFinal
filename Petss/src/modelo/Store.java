package modelo;

public class Store {

	private User raiz;
	private Mascotas raizM;
	private Inventario raizI;
	private int inventarioTotal;

	public Store() {
		raiz = null;
		raizM = null;
		raizI = null;
		inventarioTotal = 0;

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

	public void agregarUsuario(String nombre, String apellido, String fechaNacimiento, String correo, String genero,
			String contraseña) {

		User add = new User(nombre, apellido, fechaNacimiento, correo, contraseña, genero);
		User reco = raiz;
		agregarUser(reco, add);

	}

	// buscar

	public User searchU(User reco, User search) {

		User r = null;

		if (reco.compareTo(search) == 0) {
			r = reco;
		} else {
			if (reco.compareTo(search) == 1) {
				searchU(reco.getDerecha(), search);
				
			} else if (reco.compareTo(search) == -1) {
				searchU(reco.getIzquierda(), search);
			}
		}

		return r;

	}

	public User searchUsuario(String nombre, String apellido, String fechaNacimiento, String correo, String genero,
			String contraseña) {
		User search = new User(nombre, apellido, fechaNacimiento, correo, contraseña, genero);
		User res = null;
		User reco = this.raiz;

		res = searchU(reco, search);

		return res;
	}

	public void modificarUsuario(String nombre, String apellido, String fechaNacimiento, String correo, String genero,
			String contraseña) {

		User reco = this.raiz;
		User dado = new User(nombre, apellido, fechaNacimiento, correo, genero, contraseña);
		User buscar = searchU(reco, dado);

		buscar = dado;

	}

	// agregar un elemento al inventario
	public void agregarI(Inventario recoI, Inventario nuevo) {

		if (recoI == null) {
			recoI = nuevo;
			inventarioTotal++;
		} else {

			if (recoI.compareTo(nuevo) == 1) {
				agregarI(recoI.getIzquierda(), nuevo);
			} else if (recoI.compareTo(nuevo) == -1) {
				agregarI(recoI.getIzquierda(), nuevo);
			}

		}

	}

	public void agregarInventario(String tipoProducto, String nombreProducto, String codigoProducto,
			double precioProducto, int unidadesInventario) {

		Inventario nuevo = new Inventario(tipoProducto, nombreProducto, codigoProducto, precioProducto,
				unidadesInventario);
		Inventario recoI = this.getRaizI();

		agregarI(recoI, nuevo);

	}

	public Inventario searchI(Inventario recoI, Inventario nuevo) {
		Inventario s = null;
		
		if(recoI != null) {
			 
			if(recoI.compareTo(nuevo) == 0) {
				 s = recoI;
			 }
			else if(recoI.compareTo(nuevo) == 1) {
					searchI(recoI.getDerecha(), nuevo);
				}
			else {
				searchI(recoI.getIzquierda(), nuevo);
			}
			
			
		}

		return s;

	}

	public Inventario searchInventario(String tipoProducto, String nombreProducto, String codigoProducto,
			double precioProducto, int unidadesInventario) {

		Inventario nuevo = new Inventario(tipoProducto, nombreProducto, codigoProducto, precioProducto, unidadesInventario);
		Inventario recoI = this.getRaizI();

		Inventario buscado = searchI(recoI, nuevo);

		return buscado;

	}
	
	public  void eliminarInventario() {
		
	}

	public void agregarMascota(String nombre, int edad, char sexo, String raza, String tipo) {

		Mascotas add = new Mascotas(nombre, edad, sexo, raza, tipo);
		Mascotas reco = this.raizM;
		Mascotas anterion = null;

	}

}
