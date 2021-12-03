package poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonaMain {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		String nombre;
		String apellidos;
		int edad ;
		
		int numeroUsuario;
		String dni;
		
//----------------------------------------------------------------------Persona 1----///		


		System.out.println("Dime tu nombre");
		nombre = teclado.nextLine();
		persona1.setNombre(nombre);
		System.out.println(persona1.getNombre());


		System.out.println("Dime tu apellido");
		apellidos = teclado.nextLine();
		persona1.setApellidos(apellidos);
		System.out.println(persona1.getApellidos());

		System.out.println("Dime tu edad");
		edad = teclado.nextInt();
		persona1.setEdad(edad);
		System.out.println(persona1.getEdad());

		

		numeroUsuario = pedirNumero("Dime tu estado civil 1- C // 2 -S ");

			if(numeroUsuario == 1) {
				persona1.setCasado(true);
				System.out.println(persona1.getCasado());
	
			}else if(numeroUsuario ==2) {
				persona1.setCasado(false);
				System.out.println(persona1.getCasado());
	
			}

		System.out.println("Dime tu DNI");
		dni = teclado.nextLine();
		persona1.setDni(dni);
		System.out.println(persona1.getDni());

//---------------------------------------------------------------------Persona 2----///

		System.out.println("Dime tu nombre");
		nombre = teclado.nextLine();
		persona2.setNombre(nombre);
		System.out.println(persona2.getNombre());


		System.out.println("Dime tu apellido");
		apellidos = teclado.nextLine();
		persona2.setApellidos(apellidos);
		System.out.println(persona2.getApellidos());

		System.out.println("Dime tu edad");
		edad = teclado.nextInt();
		persona2.setEdad(edad);
		System.out.println(persona2.getEdad());

		

		numeroUsuario = pedirNumero("Dime tu estado civil 1- C // 2 -S ");

			if(numeroUsuario == 1) {
				persona2.setCasado(true);
				System.out.println(persona2.getCasado());
	
			}else if(numeroUsuario ==2) {
				persona2.setCasado(false);
				System.out.println(persona2.getCasado());
	
			}

		System.out.println("Dime tu DNI");
		dni = teclado.nextLine();
		persona2.setDni(dni);
		System.out.println(persona2.getDni());

	}
	public static int pedirNumero(String pregunta)	{
		int numeroMetido = 0;
		boolean esUnNumero = false;
		while(!esUnNumero) {
			try {
				System.out.println(pregunta);
				numeroMetido = teclado.nextInt();
				esUnNumero = true;

			} catch (InputMismatchException ex) {

				System.out.println("Por favor, introduzca un número, con letras no funciona");
				teclado.next();
			}
		}
		return numeroMetido;
	}
}
