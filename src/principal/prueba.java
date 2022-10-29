package principal;

public class prueba {

	public static void main(String[] args) {
		
		if( regresaTrue() || regresaFalse());
		
		String nombre="julia";
		String no2="pepe";
		System.out.println(String.format("nombre %1$s y %2$s con %1$s ",nombre,no2));
		
	}

	
	static boolean  regresaFalse() {
		System.out.println("falso");
		return false;
	}
	static boolean  regresaTrue() {
		System.out.println("true");
		return true;
	}
}
