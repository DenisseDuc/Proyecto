/*Este programa convierte una nota alfabetica a una nota númerica
 * utilizando la estructura Switch
 */
package estructurasdecontrol;

import java.io.IOException;

public class ConversorNotaSwitch {
	
	public static void main(String args[]) throws IOException 
	{

//Introducimos por teclado la nota
		System.out.println("Introduce la nota alfabética");
		char notaAlfab = (char) System.in.read();
		
//Declaramos una nota númerica de tipo entero
		int notaNum = 0;

//Variable booleana para comprobar si la nota es correcta
		boolean notaCorrecta = true;

//Convertimos la nota alfabética a numérica
		switch (notaAlfab) {
			case 'I':
				notaNum = 4;
				break;
			case 'F':
				notaNum = 5;
				break;
			case 'B':
				notaNum = 6;
				break;
			case 'N':
				notaNum = 7;
				break;
			case 'S':
				notaNum = 9;
				break;
			default:
				System.out.println("Error");
				notaCorrecta = false;
				break;
							}
//Comprobamos si la nota es correcta
		if (notaCorrecta) {
			System.out.println("La nota númerica es " + notaNum);
		}
//Enviamos a pantalla la conversión
		
		
	}
}
