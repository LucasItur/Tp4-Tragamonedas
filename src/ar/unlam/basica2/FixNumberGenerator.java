package ar.unlam.basica2;

public class FixNumberGenerator implements NumberGenerator {

	Integer F;	
	
	public FixNumberGenerator(Integer number){
		this.F=number;	
	}
	
	
	/* Este generador devolverá siempre number cuando se llame al método generate()  */
	
	
	@Override
	public Integer generate() {
		return  F;
	}

	/* post: devuelve el número de posición en la que se  
	 * * encuentra el Tambor. Es un valor comprendido  
	 * * entre 1 y 10.  */

}
