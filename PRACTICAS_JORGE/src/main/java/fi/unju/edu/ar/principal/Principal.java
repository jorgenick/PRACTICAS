package fi.unju.edu.ar.principal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.apache.log4j.Logger;

import fi.unju.edu.ar.dominio.EjemploManager;

public class Principal {

	final static Logger logger = Logger.getLogger(Principal.class);

	public static void main(String[] args) {

//		LocalTime horaActual = LocalTime.now();
//		LocalTime horaMedioDia = LocalTime.of(12, 30, 47);
//
//		System.out.println("hora actual : " + horaActual.getMinute());
//		System.out.println("hora de medio dia " + horaMedioDia.minusHours(2));
//
//		// Comparar horas
//		LocalTime otraHora = LocalTime.of(11, 20);
//		boolean esAntes = horaActual.isBefore(otraHora);
//		boolean esDespues = horaActual.isAfter(otraHora);
//
//		System.out.println("hora ingresada : " + otraHora);
//		System.out.println("¿Es antes de las 12:00? " + esAntes);
//		System.out.println("¿Es después de las 12:00? " + esDespues);
//
//		// Combinar el día y la hora para obtener una fecha y hora completa
//
//		LocalDate dia = LocalDate.now();
//		LocalTime hora = LocalTime.now();
//		LocalDateTime fechaHora = dia.atTime(hora);
//
//		LocalDateTime fecha2 = LocalDateTime.of(2023, 10, 22, 10, 30);
//
//		System.out.println("Fecha y hora combinada : " + fechaHora);
//		System.out.println("Fecha y hora combinada : " + fecha2);
//
////		EjemploManager ejemploManager = new EjemploManager();
////		ejemploManager.mostrarMensaje();
		
		
		LocalDateTime fechaHora = LocalDateTime.now();
		
		EjemploManager ejemplo = new EjemploManager();
		
		try {
			ejemplo.mostrarMensaje();
		}
		
		catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}
}
