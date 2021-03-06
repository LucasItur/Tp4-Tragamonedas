package ar.unlam.basica2;

public class Tragamonedas{
	 
	 private NumberGenerator generator = new FixNumberGenerator(1);
	 protected Tambor tambor1 = new Tambor(generator);
	 protected Tambor tambor2 = new Tambor(generator);
	 protected Tambor tambor3 = new Tambor(generator);
	 
	//* post: los 3 Tambores del Tragamonedas están 
	//*  * en la posición 1.  

	public Tragamonedas(){
		
	}

	/* post: activa el Tragamonedas haciendo girar 
	 *  * sus 3 Tambores.  */

	public void activar(){
		tambor1.girar();
		tambor2.girar();
		tambor3.girar();
	
	}

	/* post: indica si el Tragamonedas entrega un premio
	 * 
	 *   * a partir de la posición de sus 3 Tambores.
	 *   */
 
	public Boolean entregarPremio(){
		return (tambor1.getPosicion()==tambor2.getPosicion())&&(tambor1.getPosicion()==tambor3.getPosicion());
		
	}
}