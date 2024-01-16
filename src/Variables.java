
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Variables en java: 
		 * Espacio en la memoria en la que se almacenará un valor, que podrá mutar en la la ejecución de un programa.
		 * Se usan ante la necesidad de guardar datos de forma temporal para ser usados eventualmente en le mismo programa.
		 * Se crean especificando el tipo de dato y el nombre de la variable.
		 * Cuando se habla de iniciar una variable se refiere a darle tipo y nombre a una variable. Java no permite usar 
		   variables que no se hayan iniciado. Las variables se pueden crear sin asignar un valor.*/
			
			//Variables creadas vacías o en cero
		
		int intVacio;
		intVacio = 0;
		char charVacio;
		charVacio = ' ';

		//Declaración e iniciación separadas
		byte edad;
		edad = 29;
		
		System.out.println(edad);
		//Declaración e iniciación en una línea
		byte edad2 = 30;
		
		System.out.println(edad2);
		
		/*---------------------------------------------------
		------------Declaración y cambio de valor------------
		-----------------------------------------------------*/
		
		byte edad3 = 10;
		System.out.print(edad3);
		edad3 = 15;
		System.out.println(edad3);
		/*Nota: la diferencia entre print y println es que println hace un salto de línea al terminar su 
		ejecución, y print no. En el caso anterior, se verán los print 10 y 15 unidos (1015). Es bueno para
		concatenaciones sin instrucciones de por medio.*/
		
		/*---------------------------------------------------*/
		
		/*Java es un lenguaje orientado a objetos. En la programación, los objetos tienen
		métodos y características
		Por ejemplo, para java, la consola es un objeto (system.out), con características y métodos.*/
		
		/*---------------------------------------------------*/
		
		/*Declaración múltiple de variables en una línea:
		 * En java, se pueden declarar múltiples variables en una línea,todas de un mismo tipo de dato.
		 * Estas variables pueden ser iniciadas posteriormente sin problema.*/
		
		int operador1, operador2, resultado;
		
		operador1 = 9;
		operador2 = 7;
		resultado = operador1+operador2;
		System.out.println(resultado);
	}

}
