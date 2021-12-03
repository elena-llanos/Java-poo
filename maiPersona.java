package poo;

public class Persona {

	private String nombre;
	private String apellidos;
	private int edad;
	private boolean casado;
	private String DNI;
	
	public Persona() {
		
	}
	public Persona(String nombre, String apellidos, int edad, String DNI, 
			boolean casado) {
		this.nombre =nombre;
		this.apellidos =apellidos;
		this.edad = edad;
		this.DNI = DNI;
		this.casado = casado;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getApellidos() {
		return apellidos;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	public String getDNI() {
		return DNI;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public boolean getCasado() {
		return casado;
	}
	
/*
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + 
				", edad=" + edad + ", DNI=" + DNI +
				", sexo=" + sexo + ", peso=" + peso + 
				 ", altura=" + altura + "]";
	}
	*/
}
