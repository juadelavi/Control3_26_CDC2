package is.c3.model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.logging.Logger;

import is.c3.model.GestionProductos;
import is.c3.model.Pelicula;

/**
 * Clase para gestionar las películas de un cine
 */
public class Cine implements GestionProductos<Pelicula> {
	private static Logger log = Logger.getLogger(Cine.class.getName());

	private List<Pelicula> peliculas;

	public Cine() {
		peliculas = new ArrayList<Pelicula>();
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}
	
	@Override
	public Boolean find(Pelicula pelicula){
		return peliculas.contains(pelicula);
	}
	
	@Override
	public List<Pelicula> findAll(){
		return new ArrayList<>(peliculas);
	}

	@Override
	public void save(Pelicula pelicula) {
	    if (pelicula != null) {          
	        peliculas.add(pelicula);     
	        log.fine("Película guardada: " + pelicula.getTitulo());
	    }
	}

	@Override
	public void delete(Pelicula pelicula) {
		log.fine("Se va a eliminar la pelicula de nombre: " + pelicula.getTitulo());	
		peliculas.remove(pelicula);
	}
	
	@Override
	public void deleteAll() {
		log.fine("Se van a eliminar todas las películas");	
		peliculas.clear();

	}
	
	@Override
	public void saveAll(Pelicula[] t) {
	    if (t != null) {
	        for (int i = 0; i < t.length; i++) {
	            Pelicula p = t[i];
	            if (p != null) {
	                peliculas.add(p);
	                log.fine("Película añadida: " + p.getTitulo());
	            }
	        }
	    }
	}
}	
