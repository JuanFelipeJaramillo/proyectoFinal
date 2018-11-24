package modelo;

public class Inventario {
	
	private Inventario derecha;
	private Inventario izquierda;
	
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
		derecha = null;
		izquierda = null;
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
	

	public Inventario getDerecha() {
		return derecha;
	}


	public void setAnterior(Inventario derecha) {
		this.derecha = derecha;
	}


	public Inventario getIzquierda() {
		return izquierda;
	}


	public void setIzquierda(Inventario izquierda) {
		this.izquierda = izquierda;
	}
	
	
	public int compareTo(Inventario a) {
		int r = 0;
		
		if(codigoProducto.compareTo(a.getCodigoProducto()) < 0) {
			r = 1;
		}
		else if(codigoProducto.compareTo(a.getCodigoProducto()) > 0) {
			r = -1;
		}
		
		return r;
		
	}


	@Override
	public String toString() {
		return "Inventario [tipoProducto=" + tipoProducto + ", nombreProducto=" + nombreProducto + ", codigoProducto="
				+ codigoProducto + ", precioProducto=" + precioProducto + ", unidadesInventario=" + unidadesInventario
				+ "]";
	}
	

}
