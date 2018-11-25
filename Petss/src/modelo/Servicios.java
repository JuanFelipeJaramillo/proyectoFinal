package modelo;

public class Servicios extends Inventario {
	
	private Servicios siguiente;

	public Servicios(String tipoProducto, String nombreProducto, String codigoProducto, double precioProducto, int unidadesInventario) {
		super(tipoProducto, nombreProducto, codigoProducto, precioProducto, unidadesInventario);
		
		this.siguiente = null;
	}

	public Servicios getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Servicios siguiente) {
		this.siguiente = siguiente;
	}
	

	

}
