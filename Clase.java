package poo;

import java.util.ArrayList;

//import modelo.Alumno;

public class Clase {

	private static String[][] a = { { "Salinas", "Ana" }, { "Valencia", "Valeria" }, { "Zuñiga", "Alesander" },
			{ "Moreno", "Aritza" }, { "Mantxobas", "Ander" }, { "Lucena", "Eder" }, { "Urkiza", "Gorka" },
			{ "Llanos", "Elena" } };
	
	private static int [] arrayNotas =  {5, 6, 5, 6, 8, 6, 9, 10};
	
	private static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	private static ArrayList<Nota> notas = new ArrayList<Nota>();

	public static void main(String[] args) {
		crearAlumnos();
		for (int i = 0; i < alumnos.size(); i++) {
			//System.out.println(alumnos.get(i));
			System.out.println(alumnos.get(i).getNombre() + " " + alumnos.get(i).getApellido());
		}
	}
	
	public static void crearAlumnos() {
		Alumno alu;
		for (int i = 0; i < a.length; i++) {
			alu = new Alumno(a[i][0], a[i][1]);
			alumnos.add(alu);
		}
	}
	
	public static void crearNotas() {
		
	}
	public static void addNotas() {
		
	}


}
