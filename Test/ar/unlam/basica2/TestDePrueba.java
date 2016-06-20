package ar.unlam.basica2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDePrueba {


	
	
	@Test
	public void testHastaQueEntregaPremio() {
		Tragamonedas Maquina1 = new Tragamonedas();
				
		System.out.println("Valor Inincial " + Maquina1.tambor1.getPosicion() + "-" + Maquina1.tambor2.getPosicion() + "-" + Maquina1.tambor3.getPosicion());
		do{
		Maquina1.activar();
		
		System.out.println(Maquina1.tambor1.getPosicion() + "-" + Maquina1.tambor2.getPosicion() + "-" + Maquina1.tambor3.getPosicion());
		}while(!Maquina1.entregarPremio());
		
		if (Maquina1.entregarPremio())
			System.out.println("JACKPOT");
	
	}
}
