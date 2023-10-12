package ZapatosCanada;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Almacen {
	
	@SuppressWarnings("unused")

	public static void main(String[] args) {
	
	agujetas agujetasNegras = new agujetas("cafes", "cordon", 2);
	Zapatos ZapatosHombre = new Zapatos (8, 1500, "nego",new Date(), false);
	Zapatos ZapatosMujer = new Zapatos ();
	Zapatos ZapatosBebe = new Zapatos (500, "blano,", new Date());

	
	   System.out.println	( "ZapatosHombre" + ZapatosHombre);	   
	   System.out.println ("ZapatosMujer" + ZapatosMujer);
	   System.out.println ("ZapatosBebe" + ZapatosBebe);
	   
	   
	   System.out.println ("precio de 50 Zapatos" + "  " + ZapatosHombre.getPrecio() * (50));

	   System.out.println ("precio de 50 Zapatos mas IVA" + "  " + ZapatosHombre.getPrecio() * (50) 
			   *(1.16));

	   ZapatosMujer.setTalla(4);
	   ZapatosMujer.setPrecio(1299);
	   ZapatosMujer.setColor("rosa");
	   ZapatosMujer.setPiel(true);
	   ZapatosMujer.setFecha(new Date());
	   
	   ZapatosBebe.setTalla(1);
	   ZapatosBebe.setPiel(true);
	   
	   System.out.println	( "ZapatosHombre" + ZapatosHombre);	   
	   System.out.println ("ZapatosMujer" + ZapatosMujer);
	   System.out.println ("ZapatosBebe" + ZapatosBebe);
	   
	   if (( ZapatosHombre.getPrecio() >= ZapatosMujer.getPrecio()) &&
	         (ZapatosHombre.getPrecio() >= ZapatosBebe.getPrecio())) { 
	        	 
	      	   System.out.println ( " el zapato es mas caro cuesta 1299");
	  } else {}
	       	   System.out.println (" cuesta menos ");

	         

   
	   System.out.println ( "Color de Zapatos:"+ ZapatosHombre.getColor() +" " + ZapatosMujer.getColor()
	   +"  " + ZapatosBebe.getColor());

	   System.out.println("Zapatos:" + ZapatosHombre.getTalla()+"-"+ ZapatosHombre.getPrecio()+" ,  "+ ZapatosMujer.getTalla()
	   + "-"+ ZapatosMujer.getPrecio() +" ,  " + ZapatosBebe.getTalla()+"-" +ZapatosBebe.getPrecio());
	
	
       
		   Date fechaDeCreacion = ZapatosHombre.getFecha();
		   LocalDate fecha = fechaDeCreacion.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		   fecha = fecha.plusYears (03);
		   fecha = fecha.plusMonths (02);	
		   fecha = fecha.plusDays (01);
		   System.out.println("fecha nueva: " + fecha);	
   	   
	   ZapatosMujer.setFecha(new Date (123,7,1));
	   System.out.println ("ZapatosMujer" + ZapatosMujer);

	   double resultado = 4089;
	   System.out.println ("la suma de los precios es: " + resultado);
	   double resultadoSuma = sumarPrecio (ZapatosHombre.getPrecio(), ZapatosMujer.getPrecio(),ZapatosBebe.getPrecio());
	   
	   double resultado1 = promedio (ZapatosHombre.getPrecio(), ZapatosMujer.getPrecio(),ZapatosBebe.getPrecio());
	   System.out.println (" El promedio de los Zapatos es: " + resultado1);

	   int numeroEntrada= (int) resultado1;
		double resultadoRaiz=Math.sqrt(numeroEntrada);
		
		System.out.println("La raiz cuadrada de "+numeroEntrada+" es "+resultadoRaiz);
		
	    Date fechaActual = new Date();
	    SimpleDateFormat formatoHora = new SimpleDateFormat("mm:ss");
	    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
	    System.out.println ("la fecha de hoy es: "+formatoFecha.format(fechaActual) +"  "+ formatoHora.format(fechaActual));
	   }
	   
	   static double promedio (int num1, int num2, int num3) {
	   double resultado =   num1+  num2 + num3;
	   double suma = resultado / 4;
	   return suma; 
	   }
	 
	   static double sumarPrecio (double precioUno, double precioDos, double precioTres) {
	   double resultado = precioUno + precioDos + precioTres;
	   return resultado; 
	   
	   }
	   
	
}