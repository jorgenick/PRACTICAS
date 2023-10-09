package fi.unju.edu.ar.dominio;

public class Tecnico {
	
	private String nombreTecnico;
	private String especialidad;
	
	public Tecnico(String nombreTecnico, String especialidad) {
		super();
		this.nombreTecnico = nombreTecnico;
		this.especialidad = especialidad;
	}

	public String getNombreTecnico() {
		return nombreTecnico;
	}

	public void setNombreTecnico(String nombreTecnico) {
		this.nombreTecnico = nombreTecnico;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Tecnico [nombreTecnico=" + nombreTecnico + ", especialidad=" + especialidad + "]";
	}
	
	
	

}
