package entidades;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
   private List<Jugador> jugadores;
   private RevolverAgua r;
   private static final int MAX_JUGADORES=6;

    public static int getMAX_JUGADORES() {
        return MAX_JUGADORES;
    }
  

        
    public void llenarJuego(ArrayList<Jugador> jugadores , RevolverAgua r){
        this.jugadores=jugadores;
        this.r=r;
    }
    

    /*ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.*/
   public Jugador ronda(){
	   Scanner leer=new Scanner(System.in);
	   int i=-1;
       int j=1;
       do{  
           
          i++;
          if(i==jugadores.size())
              j++;
          System.out.println("ronda:"+j );
          System.out.println("posicion actual: "+r.getPosicionActual());
          i%=jugadores.size();      
          System.out.println("jugador que va a disparar: " + jugadores.get(i));
           System.out.println("presione enter para continuar");
           
           leer.nextLine();
        }while(!jugadores.get(i).disparo(r));
       
       leer.close();
       return jugadores.get(i);
   } 
}
