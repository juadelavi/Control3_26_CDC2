package is.c3.controller;

import is.c3.model.entities.Cine;
import is.c3.model.entities.PeliculaCine;


public class Gerente {
	public Gerente(Cine cine) {
		super();
		this.cine = cine;
	}

	private Cine cine;
	
	public static void main(String[] args) {
		
		// Crear una nueva instancia del cine
		Cine cine = new Cine();
		Gerente responsable=new Gerente(cine);
		responsable.altaPeliculas();
		responsable.mostrar();	
		
	}
	
	private void altaPeliculas() {
	    // Crear algunas películas
	    PeliculaCine p1 = new PeliculaCine("Captain America: Brave New World", "Julius Onah", 118);
	    PeliculaCine p2 = new PeliculaCine("Mission: Impossible – The Final Reckoning", "Christopher McQuarrie", 163);
	    PeliculaCine p3 = new PeliculaCine("Snow White", "Marc Webb", 109);
	    PeliculaCine p4 = new PeliculaCine("The Marvels", "Nia DaCosta", 105);

	    // Añadir todas las películas de una vez
	    PeliculaCine[] peliculas = {p1, p2, p3};
	    cine.saveAll(peliculas);
	    
	    // Añadir una película mas
	    cine.save(p4);
	   
	}
	
    private void mostrar() {

    	System.out.println("Películas en el cine juadelavi");
		System.out.println(cine.findAll());
    	
    }
}
