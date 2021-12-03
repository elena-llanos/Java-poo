package poo;

public class Persona {
	private String nombre;
	private String apellidos;
	private boolean casado;
	private String dni;
	
	private int edad;


	public Persona(String nombre, String apellidos, int edad, boolean casado, String dni ) {

		nombre = "elena";
		apellidos = "llanos";
		edad = 0;
		casado = false;
		dni = "1234";
		

	}

	public String getNombre(){
		return nombre;
	}
	public String getApellidos(){
		return apellidos;
	}
	public int getEdad(){
		return edad;
		}
	public boolean getCasado(){
		return true;
		}
	public int getDni(){
		return 1234;
		}
	
	
	public void  setNombre(String nnombre){
		nombre = nnombre;
	}
	public void  setApellidos(String napellidos){
		apellidos = napellidos;
	}
	public void  setEdad(int nedad){
		edad = nedad;
	}
	public void  setCasado(boolean ncasado){
		
		casado = false;
	}
	public void  setDni(String ndni){
		dni = ndni;
	}
	
}
