package entidades;

public class Jugador {
	  static private int id;// (representa el número del jugador), 
	    private int idJugador;
	    private String nombre;// (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y 
	    private boolean mojado;//(indica si está mojado o no el jugador).
	    static{
	        id=0;
	    }
	//. El número de jugadores será decidido por el
	//usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6

	    public Jugador( String nombre) {
	        id = ++id;
	        idJugador=id;
	        this.nombre = nombre+id;
	        this.mojado = false;
	    }

	    
	    
	public boolean disparo(RevolverAgua r){//: el método, recibe el revolver de agua y llama a los métodos de
	// mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
	//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
	//devuelve true, sino false
	
		mojado=r.mojar();
	    if(!mojado)
	    	r.siguienteChorro();
		return mojado;
		
	}

	    @Override
	    public String toString() {
	        return "Jugador{" + "idJugador=" + idJugador + ", nombre=" + nombre + ", mojado=" + mojado + '}';
	    }


	 


	}


