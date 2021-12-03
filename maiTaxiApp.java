package poo;

import java.util.Scanner;

/**
 * Esta aplicacion crea un objeto tipo Taxi y muestra por pantalla sus características.
 *
 */
public class TaxiApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Crear taxi
		Taxi miTaxi = new Taxi();
		Taxi miTaxi2 = new Taxi();
		
		// Pedir datos
		System.out.println("Introduce la matricula del coche");
		String matr = sc.nextLine();
		System.out.println("Introduce el municipio del coche");
		String muni = sc.nextLine();
		System.out.println("Introduce el tipo de motor del coche (0,1,2)");
		int motor = sc.nextInt();
		sc.nextLine();

		// Asignar datos al taxi
		miTaxi.setMatricula(matr);
		miTaxi.setMunicipio(muni);
		miTaxi.setTipoMotor(motor);

		// Visualizar datos del taxi
		System.out.println("Datos de mi coche");
		System.out.println("Provincia: " + miTaxi.getProvincia());
		System.out.println("Municipio: " + miTaxi.getMunicipio());
		System.out.println("Matricula: " + miTaxi.getMatricula());
		System.out.println("Tipo de motor: " + miTaxi.getTipoMotor());

		sc.close();

	}

}

