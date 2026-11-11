package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;



public class ParcialTest {
	private Parcial parcial;
	
	
	@BeforeEach
	public void setUp() {
		this.parcial = new Parcial();
	}
	
	@Test
	public void dosRaices() throws Exception {
		
		assertEquals("3.0,2.0", this.parcial.hallarRaices(1, -5, 6));
	}
	
	@Test
	public void unaRaiz() throws Exception {
		assertEquals("3.0,3.0", this.parcial.hallarRaices(1, -6, 9));
	}
	
	@Test
	public void excepcionRaizCompleja() throws Exception {
		Exception excepcion = assertThrows(
				Exception.class,
				() -> this.parcial.hallarRaices(1, 4,5)
				);
		
		assertEquals("Hay raiz compleja", excepcion.getMessage());
	}
	
	@Test
	public void excepcionAEsCero() throws Exception {
		Exception excepcion = assertThrows(
				Exception.class,
				() -> this.parcial.hallarRaices(0, 4,5)
				);
		
		assertEquals("Valor a invalido", excepcion.getMessage());
	}
	
	
	

	

	
	
}

