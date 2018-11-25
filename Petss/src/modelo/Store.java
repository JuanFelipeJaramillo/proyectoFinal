package modelo;

import java.util.ArrayList;

public class Store {

	private User raiz;
	private Mascotas raizM;
	private Inventario raizI;
	private Producto primerNodo;
	private Servicios primerNodoS;

	private int inventarioTotal;

	public Store() {
		raiz = null;
		raizM = null;
		raizI = null;
		inventarioTotal = 0;
		primerNodo = null;
		primerNodoS = null;

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

	public Producto getPrimerNodo() {
		return primerNodo;
	}

	public void setPrimerNodo(Producto primerNodo) {
		this.primerNodo = primerNodo;
	}

	public Servicios getPrimerNodoS() {
		return primerNodoS;
	}

	public void setPrimerNodoS(Servicios primerNodoS) {
		this.primerNodoS = primerNodoS;
	}

	public int getInventarioTotal() {
		return inventarioTotal;
	}

	public void setInventarioTotal(int inventarioTotal) {
		this.inventarioTotal = inventarioTotal;
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

		if (recoI != null) {

			if (recoI.compareTo(nuevo) == 0) {
				s = recoI;
			} else if (recoI.compareTo(nuevo) == 1) {
				searchI(recoI.getDerecha(), nuevo);
			} else {
				searchI(recoI.getIzquierda(), nuevo);
			}

		}

		return s;

	}

	public Inventario searchInventario(String tipoProducto, String nombreProducto, String codigoProducto,
			double precioProducto, int unidadesInventario) {

		Inventario nuevo = new Inventario(tipoProducto, nombreProducto, codigoProducto, precioProducto,
				unidadesInventario);
		Inventario recoI = this.getRaizI();

		Inventario buscado = searchI(recoI, nuevo);

		return buscado;

	}

	private ArrayList<Inventario> recoInorden(Inventario nodo,ArrayList<Inventario> inOrden) {
		
		if (nodo == null) {
			
			recoInorden(nodo.getIzquierda(), inOrden);
			inOrden.add(nodo);
			recoInorden(nodo.getIzquierda(), inOrden);
		}

		return inOrden;
	}

	public void listaProducto() {

		Inventario reco = this.raizI;
		ArrayList<Inventario> inOrden = null;
		Producto siguiente = this.primerNodo;
		Servicios sig = this.primerNodoS;

		inOrden = recoInorden(reco, inOrden);

		for (int i = 0; i < inOrden.size(); i++) {
			
			if(inOrden.get(i) != null) {
				
				if (inOrden.get(i).tipoProducto.equals("Producto")) {

					if (siguiente == null) {

						siguiente = (Producto) inOrden.get(i);
					}

				}
			}

		}

		for (int i = 0; i < inOrden.size(); i++) {
			
			if(inOrden.get(i) != null) {
				
				if (inOrden.get(i).tipoProducto.equals("Servicios")) {

					if (sig == null) {

						sig = (Servicios) inOrden.get(i);
					}

				}
				
				sig = sig.getSiguiente();
			}

			
		}

	}
	
	//revisar si funciona
	
	public void eliminarP(Inventario hijo, Inventario padre, Inventario found) {
		
		if(found.isHoja() == true) {
			found = null;
		}
		else {
			if(found.getDerecha() == null) {
				found = found.getIzquierda();
			}
			else if(found.getIzquierda() == null) {
				found = found.getDerecha();
			}
			else {
				
				if(hijo.isHoja() == true) {
					hijo.setIzquierda(found.getIzquierda());
					hijo.setDerecha(found.getDerecha());
					found = hijo;
					padre.setIzquierda(null);
				}
				
				eliminarP(hijo.getIzquierda(), padre.getIzquierda(), found);
				
			}
		}
		
	}


	public void agotadoProductoInventario(Producto buy) {
		
		if(buy.isAgotado() == true) {
			Inventario delete = (Inventario) buy;
			Inventario recoI = this.raizI;
			
			Inventario found = searchI(recoI, delete);
			Inventario padre = found.getDerecha();
			
			
			Inventario hijo = padre.getIzquierda();
			
		}
		
	}
	
	public void productoAgotado(Producto buy) {
		
		if(buy.isAgotado() == true) {
			Producto sig = this.primerNodo.getSiguiente();
			Producto atras = this.primerNodo;
			
			if(primerNodo.compareTo(buy) == 0) {
				this.primerNodo = primerNodo.getSiguiente();
			}
			
			while(sig.compareTo(buy) == -1 || sig.compareTo(buy) == 0) {
				
				if(sig.compareTo(buy) == 0) {
					atras.setSiguiente(sig.getSiguiente());
					sig.setSiguiente(null);
				}
				
				sig = sig.getSiguiente();
				atras = sig;
				
			}
			
			
		}
	}

	public void agregarMascota(String nombre, int edad, char sexo, String raza, String tipo) {

		Mascotas add = new Mascotas(nombre, edad, sexo, raza, tipo);
		Mascotas reco = this.raizM;
		Mascotas anterion = null;

	}
	
//Lista de compra cliente
	
	public void agregarCompra(Producto codigoP) {
		
		
		Inventario reco = this.raizI;
		Inventario compra = searchI(reco,codigoP);
		
		
		
		
		
		
	}

}
