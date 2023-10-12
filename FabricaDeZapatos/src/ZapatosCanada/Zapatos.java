package ZapatosCanada;

import java.util.Date;

public class Zapatos {

	private int talla;
	private int precio;
	private String color;
	private Date fecha;
	private boolean piel;

	
	public  Zapatos ( ) {
	
	}
	public  Zapatos (int precio, String color, Date fecha) {
	this.precio = precio;
	this.color = color; 
	this.fecha = fecha;
	
	}
	public Zapatos(int talla, int precio, String color, Date fecha, boolean piel) {
		
		this.talla = talla;
		this.precio = precio;
		this.color = color;
		this.fecha = fecha; 	
		this.piel = piel;
		
		
	}
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public boolean isPiel() {
		return piel;
	}
	public void setPiel(boolean piel) {
		this.piel = piel;
	}

	
	@Override
	public String toString() {
		return "Zapatos [talla=" + talla + ", precio=" + precio + ", color=" + color + ", fecha=" + fecha + ", piel="
				+ piel + "]";
	}

}

	