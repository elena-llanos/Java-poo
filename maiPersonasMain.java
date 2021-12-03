package poo;

import java.util.Scanner;

public class PersonasMain {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Persona p1 = addPersona();
		Persona p2 = addPersona();
		
		System.out.println("Nombre: " + p1.getNombre() + ", " +
				"Apellidos: " + p1.getApellidos() + ", " +
				"DNI: " + p1.getDNI() + ", " +
				"Edad: " + p1.getEdad() + ", " +
				"Casado: " + p1.getCasado() + " ");
				
		
		System.out.println("Nombre: " + p2.getNombre() + ", " +
				"Apellidos: "  + p2.getApellidos() + ", " +
				"DNI: " + p2.getDNI() + ", " +
				"Edad: " + p2.getEdad() + ", " +
				"Casado: " + p2.getCasado() + " ");
		
		if(p1.getEdad() > p2.getEdad()) {
			System.out.println(p1.getNombre() + " " + p1.getApellidos() + " es mayor que " +
					p2.getNombre() + " " + p2.getApellidos() + "");
		}else {
			System.out.println(p2.getNombre() + " " + p2.getApellidos() + " es mayor que " +
					p1.getNombre() + " " + p1.getApellidos() + "");
		}
		
		sc.close();
	}

	
	public static Persona addPersona() {
		boolean ctrl = true;
		String nombre = null, apellidos = null, DNI=null;
		int edad=0;
		boolean casado = true;
		do {
			try {
				System.out.println("PERSONA:");
				System.out.println("Introduce nombre");
				nombre = sc.nextLine();
				System.out.println("Introduce apellidos");
				apellidos = sc.nextLine();
				System.out.println("Introduce edad");
				edad = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduce DNI");
				DNI = sc.nextLine();
				System.out.println("Introduce casado");
				casado= sc.nextBoolean();
				sc.nextLine();
				ctrl = false;
			}catch(Exception e) {
				System.out.println("Error al introducir dato");
			}
		}while(ctrl);

		Persona p = new Persona(nombre, apellidos, edad, DNI, casado);
		return p;
	}

}
