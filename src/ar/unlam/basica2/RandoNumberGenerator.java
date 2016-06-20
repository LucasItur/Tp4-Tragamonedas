package ar.unlam.basica2;

public class RandoNumberGenerator implements NumberGenerator {

	/* post: devuelve el número de posición en la que se
	 *   * encuentra el Tambor. Es un valor comprendido  
	 * * entre 1 y 10.  */
	
	public RandoNumberGenerator() {
		
	}
	
	
	@Override
	public Integer generate() {
		
		return (int)(Math.random()*10+1);
	}


}