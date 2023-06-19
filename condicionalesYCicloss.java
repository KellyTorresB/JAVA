package condicionalesYCicloss;
import java.util.Scanner;
public class condicionalesYCicloss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* int edad1 = 31; //final agregar una propiedad de constante
		edad1 = 55;
		System.out.println("La edad esa : " + edad1);
	
		final int edad = 31; //final agregar una propiedad de constante
		//edad = 55;
		System.out.println("La edad es : " +edad);
		
		double sueldo = 167.89898989d;
		float sueldo2 = 167.8989f;
		long sueldo4 = 1678930202801923948l;
		int sueldo3 = 167;
		
		System.out.println(sueldo);
		System.out.println(sueldo2);
		System.out.println(sueldo3);
		
		*Condicionales
		*if
		*else
		*else if
		*switch
		*/
		
		//System.out.println("programa para calcular la hora");
		//Equivalente al prompt en JS se llama  scanner 
		//var hora es = prompt ("mensaje");
		
		//Scanner hora = new Scanner(System.in);
		Scanner hora = new Scanner(System.in);
		
		System.out.println("Por favor, ingresa una hora en un formato en  de 24 horas");
		
		//int hora = 13; declaramos una variable
		
		int valorIngresado = hora.nextInt();
		
		if(valorIngresado >= 0 && valorIngresado <=24) {//true
			System.out.println("Buenos días solecito");
		}
		
	}

}
