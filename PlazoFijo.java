package ejercicioCuentaAhorro;

public class PlazoFijo extends Cuenta{
	
	//1. Atributos
	String plazo;
	float interes;
	
	//2. Metodo para calcular importe del interes
	public float calculoInteres(float cantidad, float interes) {
		float totalInteres = (this.cantidad*this.interes)/100;
		return totalInteres;
	}
	
	

}//clase PlazoFijo
