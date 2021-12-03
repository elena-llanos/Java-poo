package poo;

/**
 * Clase Taxi con sus atributos, getters y setters necesarios.
 *
 */

public class Taxi {

	private String provincia = "Bizkaia";
	private String matricula;
	private String municipio;
	private int tipoMotor;

	public Taxi() {
		
	}
		
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public void setTipoMotor(int tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getMunicipio() {
		return municipio;
	}

	public int getTipoMotor() {
		return tipoMotor;
	}

	public String getProvincia() {
		return provincia;
	}

}
