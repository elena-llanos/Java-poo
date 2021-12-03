package poo;

import java.util.ArrayList;

public class Alumno {

	private String apellido;
	private String nombre;
	private ArrayList<Nota> notas;

	public Alumno() {

	}
	
	public Alumno(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void ponerNota(Nota n) {
		this.notas.add(n);
	}
	
	@Override
	public String toString() {
		return "Alumno [apellido=" + apellido + ", nombre=" + nombre + ", notas=" + notas + "]";
	}

}
