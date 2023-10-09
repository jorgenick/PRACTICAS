package fi.unju.edu.ar.dominio;

import java.time.Duration;
import java.time.LocalDateTime;

public class Visita {
	
	private Tecnico tecnico;
	private LocalDateTime fechaInicioVisita;
	private LocalDateTime fechaFinVisita;
	private long horasTotalesVisita;
	
	
	public Visita() {
		
	}
	
	public Visita(Tecnico tecnico, LocalDateTime fechaInicioVisita, LocalDateTime fechaFinVisita) {
		super();
		this.tecnico = tecnico;
		this.fechaInicioVisita = fechaInicioVisita;
		this.fechaFinVisita = fechaFinVisita;
		this.horasTotalesVisita = obtenerHorasTotalesVisita(fechaInicioVisita,fechaFinVisita);
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public LocalDateTime getFechaInicioVisita() {
		return fechaInicioVisita;
	}

	public void setFechaInicioVisita(LocalDateTime fechaInicioVisita) {
		this.fechaInicioVisita = fechaInicioVisita;
	}

	public LocalDateTime getFechaFinVisita() {
		return fechaFinVisita;
	}

	public void setFechaFinVisita(LocalDateTime fechaFinVisita) {
		this.fechaFinVisita = fechaFinVisita;
	}

	public long getHorasTotalesVisita() {
		return horasTotalesVisita;
	}

	public void setHorasTotalesVisita(long horasTotalesVisita) {
		this.horasTotalesVisita = horasTotalesVisita;
	}

	@Override
	public String toString() {
		return "Visita [tecnico=" + tecnico + ", fechaInicioVisita=" + fechaInicioVisita + ", fechaFinVisita="
				+ fechaFinVisita + ", horasTotalesVisita=" + horasTotalesVisita + "]";
	}
	
	
	public long obtenerHorasTotalesVisita(LocalDateTime fechaInicioVisita, LocalDateTime fechaFinVisita) {
		long totalHoras = 0;
		Duration duracion = Duration.between(fechaInicioVisita, fechaFinVisita);
		totalHoras = duracion.toHours();
		return totalHoras;
	}

}
