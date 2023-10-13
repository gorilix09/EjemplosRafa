package mafe;


public class practica {


	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int num1= 10;
		int num2 = 15;		
		int num3 = 5;
		
		
	   if (( num1 >num2) && (num1 > num3)) {
	//if ((num2 > num1) && (num2 >num3))
	//if ((num3>num2) && (num3 > num1 ))
		   System.out.println("mas caro"+ num1);
	   }else {
		   System.out.println("son diferente");
  
		   int num= 1;
		   while (num<=10) {
			      System.out.println(num);
			      num++;
		    }
		   int i = 10; //iterador

	        do {
	            System.out.println("El valor es: " + i);
	          i++; //incremento
	        } while (i <= 10); // expresión
	        
	      //  String resultado = null;
	        int numero1 = 0;
	        do {
	            System.out.println(numero1);

	        	  numero1 = numero1 + 1;
	        	//  resultado = resultado + numero1;
	        	} while (numero1 <= 10);
		    

		//String resultado = (num1 >= 10)? "son iguales" : "son diferentes";
	   }      
	}
}
