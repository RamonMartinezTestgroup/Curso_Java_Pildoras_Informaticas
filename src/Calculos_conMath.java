
public class Calculos_conMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Clases
		
				/* Todo programa de java debe estar compuesto de al menos una clase.
				 * Toda clase debe tener al menos un método (como el habitual método main).
				 * Las clases pueden ser propias o predefinidas.

				 * Las clases propias: son las que creamos nosotros.
				 * Las clases predefinidas: están preconstruidas en java, listas para usarlas. Java cuenta con cientos de
				 de clases, como math, string, array, thread, etc. Estas clases vienen dentro de la biblioteca API Java.
				 Para consultar la biblioteca API Java, basta con buscar API Java en cualquier buscador y acceder a la primera
				 opcion (habitualmente), que redirecciona a la documentación.*/
				
				/* Clase Math contiene una serie de métodos para realizar cálculos matemáticos. Algunos de los métodos más 
				usados son:
				 * math.sqrt(n): raíz cuadrada de un número.
				 * math.pow(base, exponente): potencia. Este método trabaja con doubles.
				 * math.sin(ángulo), math.cos(ángulo), math.tan(ángulo), math.atan(ángulo).
				 * math.round(decimal): redondeo de decimal.
				 * math.pi: constante de clase con el valor de PI.*/
		
		double raiz = Math.sqrt(9);
		System.out.println(raiz);
		
		/*---------------------------------------------------*/
		
		//Refundición es la acción de conversión de tipo. Esto se hace anteponiendo el tipo entre paréntesis.
		
		double num1 = 5.85;
		int redondeando = (int)Math.round(num1); //aquí refundimos un long a int.
		System.out.println(redondeando);
		
		/*---------------------------------------------------*/
		
		//Math.pow
		
		double base = 5;
		double exponente = 3;
		int potenciando = (int) Math.pow(base, exponente);
		System.out.println("El resultado de "+base+" elevado a "+exponente+" es "+potenciando);

		
		
	}

}
