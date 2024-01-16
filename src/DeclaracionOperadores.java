
public class DeclaracionOperadores {
	
	public static void main(String[] args) {
		
		/* Operadores en Java
		 
	 	* Aritméticos:
	 		* Suma: +
	 		* resta: -
	 		* multiplicación: *
	 		* división: /
	 		
	 	* Lógicos, relacionales y booleanos: 
	 		* mayor que: >
	 		* menor que: <
	 		* mayor o menor que: <>
	 		* distinto que: !=
	 		* igual que: == 
	 		* Conjunción (y/and) lógico: &&
	 		* Disyunción (o/or) lógico: ||
	 		
 		* Incremento y decremento 
 			* incremento (en uno): ++
 			* decremento (en uno): --
 			* incremento en n°: += n° 
 			* decremento en n°: -= n°
 			
			* Concatenación (Solo para string/char):
				* Unir cadenas: +*/
		
		int a = 5;
		int b;
		b = 7;
		
		// Suma
		int c = a+b;
		System.out.println("Suma: "+c);
		
		// Incremento
		c++;
		System.out.println("Incremento en 1: "+c);
		
		// Decremento
		c--;
		System.out.println("Decremento en 1: "+c);
		
		// Incremento en n°
		c += 3;
		System.out.println("Incremento en n° (3): "+c);
		
		// Decremento en n°
		c -= 5;
		System.out.println("Decremento en n° (5): "+c);
		
		/* División: si se realiza con cualquier dato que no sea decimal, hara el redonde automáticamente.
		Es por esto que si se sabe que se va a trabajar con decimales, es mejor declarar previamente las variables con
		el tipo de dato que corresponda a decimal (float o double). La otra forma es convertir el tipo de dato en la 
		misma acción a realizar */
		
		//División con enteros SIN conversión de tipos
		
		int d;
		d = c/4;
		System.out.println("División de enteros sin conversión de tipos (10/4): "+d);
		
		//División con enteros CON conversión de tipos

		float d2;
		float c2 = c;
		d2 = c2/4;
		System.out.println("División de enteros con conversión de tipos (10/4): "+d2);
		
		/*Las divisiones entre decimales que sean enteros siempre mostrarán como resultado X.0, aunque sean enteros, por
		reglas de Java.*/
	}
 
}
