package ar.unlam.basica2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDePrueba {


	@Test
	public void testDeInicioDeTamborEnUno() {
		Tragamonedas Maquina1 = new Tragamonedas();
			
		assertTrue((Maquina1.tambor1.getPosicion()==Maquina1.tambor2.getPosicion())
				&&(Maquina1.tambor1.getPosicion()==Maquina1.tambor3.getPosicion())
				&&Maquina1.tambor1.getPosicion()==1);
	}
	
	
	
	@Test
	public void testQueEntregaPremio() {
		Tragamonedas Maquina2 = new Tragamonedas();
				
		do{
		Maquina2.activar();
		}while(!Maquina2.entregarPremio());
		
		assertTrue(Maquina2.entregarPremio());
	}
		
	
	
}
