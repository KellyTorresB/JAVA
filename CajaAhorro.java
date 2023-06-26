package ejercicioCuentaAhorro;

public class CajaAhorro extends Cuenta {
	
	
	//2. Metodos (heredar datos)
	public CajaAhorro(String titular, float cantidad) {
		super(titular, cantidad);
	}//metodo cajaAhorro
	
	
	public void imprimirDatos() {
		System.out.println("Titular: ");
		System.out.println("Cantidad: ");
	}//imprimirDatos

	
	//toString
	@Override
	public String toString() {
		return "CajaAhorro [titular=" + titular + ", cantidad=" + cantidad + "]";
	}//toString
	

}//clase cajaAhorro
