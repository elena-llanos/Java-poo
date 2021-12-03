package poo;

import java.util.Scanner;

public class TaxiApp {

	
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Taxi A1 = new Taxi();
		String municipio;
		String matricula;
		int motor;
		
		
		System.out.println("Introduce un municipio");
		municipio = teclado.next();
		A1.setMunicipio(municipio);
		System.out.println("El municipio introducido es  " + A1.getMunicipio());
		
		System.out.println("Introduce una matricula");
		matricula = teclado.next();
		A1.setMatricula(matricula);
		System.out.println("La matrícula introducida es  " + A1.getMatricula());
		
		System.out.println("Introduce tipo de motor; 0 = Desconocido  1 = Diesel  2 = Gasolina");
		motor = teclado.nextInt();
		A1.setMotor(motor);
		System.out.println("El tipo de motor introducido es  " + A1.getMotor());


		
	}

}
