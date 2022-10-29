package principal;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Juego;
import entidades.Jugador;
import entidades.RevolverAgua;

public class Principal {
	  static Scanner leer=new Scanner(System.in);
	 public static void main(String[] args) {
	        // TODO code application logic here
	     
	           RevolverAgua r=new RevolverAgua();
	        Juego juego=new Juego();
	        ArrayList<Jugador> listaJugadores=new ArrayList<Jugador>();
	        
	        do{
	            System.out.print("nombre: ");
	            Jugador j1=new Jugador(leer.nextLine());
	            listaJugadores.add(j1);
	            
	        }while(repetir("ingresar otro jugador?S/N") && 
	                Juego.getMAX_JUGADORES()>listaJugadores.size());
	        
	       
	       
	        
	        r.llenarRevolver();
	        System.out.println("---------Estado inicial del juego-----------------------------------");
	        System.out.println("atributos del revolver ");
	        System.out.println("posición actual: "+r.getPosicionActual());
	        System.out.println("posición Agua: "+r.getPosicionAgua());
	        System.out.println("--------------------------------------------------------------------");
	      
	        juego.llenarJuego(listaJugadores, r);
	        
	        
	        System.out.println("El perdedoer es: " + juego.ronda());
	        for(Jugador j:listaJugadores)
	              System.out.println(j.toString());
	        
	        System.out.println("FIN");
	       leer.close(); 
	        
	    }
	 
	 static boolean repetir(String s) {
	 do {
		 System.out.println(s);
		 String opc=leer.nextLine();
		 if(!(opc.equalsIgnoreCase("s") || opc.equalsIgnoreCase("n")))
			 System.out.println("Debe ingresar \"s\" o \"n\"");
		 else 
			 return (opc.equalsIgnoreCase("s")|| !opc.equalsIgnoreCase("n"));	 
		
		 }while(true);

	 }
	    
	}
