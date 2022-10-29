package entidades;

public class RevolverAgua {

	 private int posicionActual;//posición del tambor que se dispara, puede que esté el agua o no)
	    private int posicionAgua;//posición del tambor donde se encuentra el agua

	    

	    public RevolverAgua() {
	    }

	    
	    
	    public int getPosicionActual() {
	        return posicionActual;
	    }

	    public int getPosicionAgua() {
	        return posicionAgua;
	    }

	    public void setPosicionActual(int posicionActual) {
	        this.posicionActual = posicionActual;
	    }

	    public void setPosicionAgua(int posicionAgua) {
	        this.posicionAgua = posicionAgua;
	    }

	/////////////////métodos    

	public void llenarRevolver(){
	  posicionActual=(int) (Math.random() * 6)+1;
	  posicionAgua=(int)(Math.random()*6)+1;
	//: le pone los valores de posición actual y de posición del agua. Los
	//valores deben ser aleatorios.
	}
	public boolean mojar(){
	//• mojar(): devuelve true si la posición del agua coincide con la posición actual

	return posicionActual==posicionAgua;
	        }

	public void siguienteChorro(){
	     
	posicionActual= (posicionActual==6)?1:++posicionActual;
	 
	}
	        //• siguienteChorro(): cambia a la siguiente posición del tambor

	    @Override
	    public String toString() {
	        return "RevolverAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
	    }



	}