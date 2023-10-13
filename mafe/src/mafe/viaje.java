package mafe;

import java.util.Date;

public class viaje {
	
	private int Costo;
	private double Kilometros;
	private int dias;
	private Date fecha;

	public viaje (int Costo, double kilometros, int dias, Date fecha) {
	this.Costo = Costo;
	this.Kilometros = kilometros;
	this.dias = dias;
	this.fecha = fecha; 
	
	
		
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCosto() {
		return Costo;
	}

	public void setCosto(int costo) {
		Costo = costo;
	}

	public double getKilometros() {
		return Kilometros;
	}

	public void setKilometros(double kilometros) {
		Kilometros = kilometros;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	
	
	
	}

	@Override
	public String toString() {
		return "viaje [Costo=" + Costo + ", Kilometros=" + Kilometros + ", dias=" + dias + ", fecha=" + fecha + "]";
	}
}
