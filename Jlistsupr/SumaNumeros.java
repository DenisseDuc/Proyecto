//Se importa la clase Scanner porque el ordenador no sabe donde encontrarla
	import java.util.Scanner;	
public class SumaNumeros{
	//Este programa suma números
	public static void main(String args){
	
	//Creamos un objeto tipo Scanner
	Scanner entrada = new Scanner (System.in);
	
	//Se introducen los numeros por teclado
	System.out.println("Introduzca número 1");
	int n1 = entrada.nextint();
	System.out.println("Introduzca número 2");	
	int n2 = entrada.nextint();

	//Se alculan los datos
	int suma = n1 + n2;

	//Enviamos a pantalla el resultado
	System.out.println("LA suma es "+ suma);
		}
					}	
