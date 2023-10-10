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
	
	private static LocalDateTime fechaInicioVisita2 = LocalDateTime.of(2023, 10, 8, 20, 30);
	private static LocalDateTime fechaFinVisita2 = LocalDateTime.of(2023, 10, 8, 21, 30);
	
	public static Visita visita = new Visita(tecnico1, fechaInicioVisita, fechaFinVisita);
	public static Visita visita2 = new Visita(tecnico1, fechaInicioVisita2, fechaFinVisita2);
	
	private static List<Visita> listaVisitas = new ArrayList<Visita>();
	private final Logger logger = Logger.getLogger(VisitaManager.class);
	
	public void mostrarVisita() {
		System.out.println(visita);
		
		System.out.println("tamaño lista : "+listaVisitas.size());
	}
	
	public void agregarVisita() throws Exception {
		if (listaVisitas.size()==0) {
			listaVisitas.add(visita);
		logger.info("se agrego la primera visita correctamente");
			
		}else {
			for (Visita v : listaVisitas) {
				if (
						v.getTecnico().getNombreTecnico().equals(visita2.getTecnico().getNombreTecnico())
						&& 
						(
							(
							(visita2.getFechaInicioVisita().isBefore(v.getFechaInicioVisita()))
							&&
							(visita2.getFechaFinVisita().isBefore(v.getFechaInicioVisita()))
							)
								||
							(
							(visita2.getFechaInicioVisita().isAfter(v.getFechaFinVisita()))
							&&
							(visita2.getFechaFinVisita().isAfter(v.getFechaFinVisita()))
							)
						)
				) 
				
					logger.warn("visita agregada.. con tecnico ya recurrido");
				
				else {
					
					logger.warn("el tecnico elegido esta ocupado en ese horario");
					
				}
				
			}
			
		}
		
		
	}

}
