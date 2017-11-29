/** 
 * Metodo que proporciona el método para calcular el pendulo
 * @author Jorge
 * @version 1.0
 * 
 *
 */
public class Pendulo {
	/**
	 * Representa la aceleración de la gravedad de la tierra
	 */
	public static final double GRAVEDAD = 9.8;
	
	
	/**
	 *
	 * Metodo que calcula el periodo del pendulo
	 * @param longitud de dicho pendulo
	 * @return double representando el periodo de oscilacion
	 * 
	 */

	public static double calcularPeriodo(double longitud) {
		
		return 2 * Math.PI*Math.sqrt(longitud/GRAVEDAD);
		
		
		
	}
}
