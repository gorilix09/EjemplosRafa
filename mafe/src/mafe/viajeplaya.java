package mafe;

import java.text.SimpleDateFormat;

import java.util.Date;

public class viajeplaya {

	   public static void main(String[] args) {
		


		   Date fechaActual = new Date();
	       SimpleDateFormat formatoHora = new SimpleDateFormat("mm:ss");
	       SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
	       System.out.println ("la fecha de hoy es: "+formatoFecha.format(fechaActual) +"  "+ formatoHora.format(fechaActual));
		   
		   double resultado = promedio (10,8,10,10);
		   System.out.println (resultado);

		   }
		   static double promedio (int num1, int num2, int num3, int num4) {
		   double resultado =   num1+  num2 + num3 + num4;
		   double suma = resultado / 4;
		   return suma; 
		   }
		 
	   }


