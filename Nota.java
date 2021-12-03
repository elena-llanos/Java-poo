package poo;


public class Nota {

	private String nombreAsignatura;
	private double puntuacion;
	private String anotacion;

	public Nota() {

	}

	public Nota(String nombre, double puntuacion) {
		this.nombreAsignatura = nombre;
		this.puntuacion = puntuacion;
	}

	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getAnotacion() {
		return anotacion;
	}

	public void setAnotacion(String anotacion) {
		this.anotacion = anotacion;
	}

}
