package poo;

public class Taxi {



	private String provincia;
	private String matricula;
	private String municipio;
	private int motor;


	public Taxi() {

		provincia = "Bizkaia";
		matricula = "CCD8898";
		municipio = "Bilbao";
		motor = 0;



	}

	public String getProvincias(){
		return provincia;
	}
	public String getMatricula(){
		return matricula;
	}
	public String getMunicipio(){
		return municipio;
		}
	public int getMotor(){
		return motor;
	}
	
	public void  setProvincias(String nProvincia){
		provincia = nProvincia;
	}
	public void  setMatricula(String nMatricula){
		matricula = nMatricula;
	}
	public void  setMunicipio(String nMunicipio){
		municipio = nMunicipio;
	}
	public void  setMotor(int nMotor){
		motor = nMotor;
		
	}







}
