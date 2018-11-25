package modelo;

public class Producto extends Inventario {
	
	
	private Producto siguiente;
	private boolean agotado;

	public Producto(String tipoProducto, String nombreProducto, String codigoProducto, double precioProducto, int unidadesInventario) {
		super(tipoProducto, nombreProducto, codigoProducto, precioProducto, unidadesInventario);
		this.agotado = false;
		this.siguiente = null;
		
	}

	public Producto getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Producto siguiente) {
		this.siguiente = siguiente;
	}

	public boolean isAgotado() {
		return agotado;
	}

	public void setAgotado(boolean agotado) {
		this.agotado = agotado;
	}
	
	private int cantidadExistencia(int c) {
		
		if(unidadesInventario > c) {
			unidadesInventario -= c; 
		}
		else {
			agotado = true;
			unidadesInventario = 0;
		}
		
		return unidadesInventario;
		
	}

	
	
}
