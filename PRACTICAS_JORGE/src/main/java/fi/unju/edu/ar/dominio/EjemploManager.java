package fi.unju.edu.ar.dominio;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.log4j.Logger;

public class EjemploManager {
	
	final static Logger logger = Logger.getLogger(EjemploManager.class);
	
	
	public static void mostrarMensaje() throws Exception {

		logger.info("logger generado");
		
		LocalDateTime horafecha = LocalDateTime.now();
		
		logger.info("fecha y hora actual : "+horafecha.getHour());


		        // Obtén la fecha y hora actual
		        Date fechaHoraActual = new Date();

		        // Define el patrón de formato que deseas
		        String patronFormato = "HH:mm:ss dd - MMMM - yyyy ";

		        // Crea un objeto SimpleDateFormat con el patrón
		        SimpleDateFormat formato = new SimpleDateFormat(patronFormato);

		        // Utiliza el objeto formato para formatear la fecha y hora
		        String fechaHoraFormateada = formato.format(fechaHoraActual);

		        // Imprime la fecha y hora formateada
		        System.out.println("Fecha y hora formateada: " + fechaHoraFormateada);

		        
		
	}
}
