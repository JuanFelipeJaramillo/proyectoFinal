package modelo;

public class Producto extends Inventario {
	
	
	private Producto siguiente;

	public Producto(String tipoProducto, String nombreProducto, String codigoProducto, double precioProducto, int unidadesInventario) {
		super(tipoProducto, nombreProducto, codigoProducto, precioProducto, unidadesInventario);
		
		this.siguiente = null;
		
	}

	public Producto getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Producto siguiente) {
		this.siguiente = siguiente;
	}

}
