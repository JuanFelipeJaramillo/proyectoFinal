package modelo;

public class Inventario {
	
	private Inventario anterior;
	private Inventario siguiente;
	
	private String tipoProducto;
	private String nombreProducto;
	private String codigoProducto;
	private double precioProducto;
	private int unidadesInventario;
	
	
	public Inventario(String tipoProducto, String nombreProducto, String codigoProducto, double precioProducto, int unidadesInventario) {
		
		this.tipoProducto=tipoProducto;
		this.nombreProducto=nombreProducto;
		this.codigoProducto=codigoProducto;
		this.precioProducto=precioProducto;
		this.unidadesInventario=unidadesInventario;
		anterior = null;
		siguiente=null;
	}


	public String getTipoProducto() {
		return tipoProducto;
	}


	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}


	public String getNombreProducto() {
		return nombreProducto;
	}


	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}


	public String getCodigoProducto() {
		return codigoProducto;
	}


	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}


	public double getPrecioProducto() {
		return precioProducto;
	}


	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}


	public int getUnidadesInventario() {
		return unidadesInventario;
	}


	public void setUnidadesInventario(int unidadesInventario) {
		this.unidadesInventario = unidadesInventario;
	}
	

	public Inventario getAnterior() {
		return anterior;
	}


	public void setAnterior(Inventario anterior) {
		this.anterior = anterior;
	}


	public Inventario getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(Inventario siguiente) {
		this.siguiente = siguiente;
	}


	@Override
	public String toString() {
		return "Inventario [tipoProducto=" + tipoProducto + ", nombreProducto=" + nombreProducto + ", codigoProducto="
				+ codigoProducto + ", precioProducto=" + precioProducto + ", unidadesInventario=" + unidadesInventario
				+ "]";
	}
	

}
