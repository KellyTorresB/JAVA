package entidades;

public class Persona {
	
	//1.-Propiedades o atributos 
	public String nombre;
	public int edad;
	public String correo;
	public String telefono;
	
	//2.-Funciones contructoras (con parametros)
	public Persona(String nombre, int edad, String correo, String telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
		this.telefono =telefono;
		
	}//cierre de parametros 
	
	//3.-Métodos
	public void mostrarInformacion() {
		System.out.println("Nombre" + nombre);
		System.out.println("Edad" + edad);
		System.out.println("Correo" + correo);
		System.out.println("Telefono" + telefono);
	}
//Metodo main es una funcion ejecutora
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instancia de un objeti persona 
		Persona Felipe = new Persona("Felipe", 31, "felipemaqueda@gmail.com", "5512345678");
		
		//Uso del metodo mostrarInformacion que pertenece al objero Felipe
		Felipe.mostrarInformacion();
		
Persona Pelipe = new Persona("Pelipe", 32, "Pelipemaqueda@gmail.com", "5511345678");
		
		Pelipe.mostrarInformacion();
		
Persona Falipa = new Persona("Falipa", 21, "falipamaqueda@gmail.com", "5512245678");
		
		Falipa.mostrarInformacion();
		
Persona Fezipe = new Persona("Fezipe", 81, "fezipemaqueda@gmail.com", "5512335678");
		
		Fezipe.mostrarInformacion();
		
		

	}//cierre main

}//cierre de clase persona 
