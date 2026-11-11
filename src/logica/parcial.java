package logica;

public class parcial {
	
	public String hallarRaices(int a, int b, int c) throws Exception{
		
		double determinante = Math.pow(b,2) - 4*a*c;
		if( determinante < 0) {
			throw new Exception("Hay raiz compleja");
		} else if (a == 0) {
			throw new Exception("Valor a invalido");
		}else {
			double raizUno = ((-b)+Math.sqrt(determinante))/2*a;
			double raizDos = ((-b)-Math.sqrt(determinante))/2*a;
			
			return "" + raizUno + "," + raizDos;
		}
		
		
	
		
		
	}

}
