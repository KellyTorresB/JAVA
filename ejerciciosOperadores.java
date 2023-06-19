package operadoresLogicos;

import java.util.Scanner;

public class ejerciciosOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Los operadores logicos se utilizan para cambiar valores booleanos y nos devuelven un resultado verdadero, falsos 
		 */
		//&& and (Y)
		//|| or (o) para al simbolo es alt + 124
		//! not (no)
		
		//int a =5;
		//int b =3;
		
		/*System.out.println( a == b && a > b );
		System.out.println( !(a == b) && a > b );
		System.out.println( a == b || a > b );*/
		
		//Ejercicio de pares e impares 
		
		Scanner read = new Scanner(System.in);
		int a;
		System.out.println("Ingrese un nuemro entero:");
		a = read.nextInt();
		
		if (a%2==0) {
			System.out.println("El numero "+ a + " es impar");
		}else {
			System.out.println("El numero "+ a + " es impar");
		}
		read.close();
		
	}

}
