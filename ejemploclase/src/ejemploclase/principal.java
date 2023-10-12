package ejemploclase;

public class principal {
	
	   public static void main(String[] args) {
		   
		   TiposDeVariable masaMuscular = new TiposDeVariable();
		   int Variable = 10;//variable local esta dentro de una clase
		  
		   int peso = masaMuscular.peso; //variable de clase se manda a traer de sonde se encuentre el dato
		   
		   
		   System.out.println (peso);
		   
		   System.out.println (Variable);

	   }

}
