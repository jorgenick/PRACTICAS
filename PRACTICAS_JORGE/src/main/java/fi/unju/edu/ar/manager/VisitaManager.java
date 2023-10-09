package fi.unju.edu.ar.manager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import fi.unju.edu.ar.dominio.Tecnico;
import fi.unju.edu.ar.dominio.Visita;

public class VisitaManager {

	private static Tecnico tecnico1 = new Tecnico("jorge", "ELECTROMECANICO");
	private static LocalDateTime fechaInicioVisita = LocalDateTime.of(2023, 10, 8, 10, 30);
	private static LocalDateTime fechaFinVisita = LocalDateTime.of(2023, 10, 8, 16, 30);
	public static Visita visita = new Visita(tecnico1, fechaInicioVisita, fechaFinVisita);
	private static List<Visita> listaVisitas = new ArrayList<Visita>();
	private final Logger logger = Logger.getLogger(VisitaManager.class);
	
	public void mostrarVisita() {
		System.out.println(visita);
		
		System.out.println("tamaño lista : "+listaVisitas.size());
	}
	
	public void agregarVisita() {
		if (listaVisitas.size()==0) {
			listaVisitas.add(visita);
		logger.info("se agrego la primera visita correctamente");
			
		}else {
			for (Visita v : listaVisitas) {
				if (v.getTecnico().getNombreTecnico().equals(visita.getTecnico().getNombreTecnico())
						&& visita.getFechaInicioVisita().isBefore(v.getFechaInicioVisita())) {
					logger.warn("el tecnico ya se encuentra en la lista");
				}
			}
			
		}
		
		
	}

}
