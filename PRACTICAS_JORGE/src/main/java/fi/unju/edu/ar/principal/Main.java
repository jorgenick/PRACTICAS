package fi.unju.edu.ar.principal;

import fi.unju.edu.ar.manager.VisitaManager;

public class Main {

	public static void main(String[] args) {

		VisitaManager visita =  new VisitaManager();
		
		visita.mostrarVisita();
		
		
		try {
			visita.agregarVisita();
			visita.agregarVisita();
			
		} catch (Exception e){
			
		}

		
	}

}
