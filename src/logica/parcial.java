package logica;

public class Parcial {
	
	public String hallarRaices(double a, double b, double c) throws Exception{
		
		double determinante = Math.pow(b, 2) - 4*a*c;
		if( determinante < 0) {
			throw new Exception("Hay raiz compleja");
		} else if (a == 0) {
			throw new Exception("Valor a invalido");
		}else {
			double raizUno = ((-b)+Math.sqrt(determinante))/(2*a);
			double raizDos = ((-b)-Math.sqrt(determinante))/(2*a);
			
			return "" + raizUno + "," + raizDos;
			
		}
		
		
	
		
		
	}


}
