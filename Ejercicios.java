package tiposDeDatosYVariablesCH27JAVA;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("Hello World");
//Tipos de datos 
		//byte:sirve para representar un valor numerico de 8 bits
		byte salas = 10 ; 
		System.out.println(salas);
		
		//short: sirve para representar un valor numerico de 16 bits
		short asientos = 1120;
		System.out.println(asientos);
		
		//int: sirve para almacenar un valor numerico de 23 bits
		int dulces = 3476;
		System.out.println(dulces);
		
		//long; sirve para representar un valor numerico que el valor numerico 64 bits
		
		long clientes = 313600;
		System.out.println(clientes);
		
		//float y el double si puedes utilizar con numero decimal
		
		//float : sirve para almacenar un valor numerico 32 bits
		float palomitas = 35.5f;
		System.out.println(palomitas);
		
		//double: 
		double ganacia = 23770880.7d;
		System.out.println(ganacia);
		
		//double sirve para representar valores booleanos y solamente tiene dos salidas, verdadero y falso
		//char sirve para representar un caracter o un numero pero solamente uno 
		
		//casting o casteo
		//Sirve para realizar una conversion de tipos de datos o uno mas grande o mas pequeño incluso 
		double num = 59.7d;
		//casteo a entero
		int numInt = (int) num;
		
		System.out.println("double"+numInt);
		
		long numlong = (long) num;
		System.out.println("long"+ numlong );
		
		String cantidad = "85" ;
		String precio = "59.7";
		int cantEntero = Integer.parseInt(cantidad); 
		double precioDouble = Double.parseDouble(precio);
		System.out.println("Elvalor de la compra es :" + (cantEntero * precioDouble));
		
		
		//operadores aritmeticos 
		
		int dias = 28;
		dias = dias / 2;
		System.out.println("días"+ dias);
		
		//operadores de incremento y deccremento 
		
		int p = 0;
		p++;
		p++;
		p++;
		System.out.println(p);
		
		/*operadores relacionales 
		 * ==compara si un operando es igual que otro 
		 * !0 diferente a 
		 * <mayor que 
		 * >menor que 
		 * <=mayor o igual 
		 * >=menor o igual 
		 * 
		 * */
		
		int a = 10;
		int b = 15;
		boolean resultado ; 
		resultado = a == b;
		System.out.println("Resultado de la operacion: " + resultado);
		
		
		
	}

}
