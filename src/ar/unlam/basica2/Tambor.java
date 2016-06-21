package ar.unlam.basica2;

public class Tambor {
	private Integer slot;
	private NumberGenerator generator = new RandoNumberGenerator();
	
	
	public Tambor(NumberGenerator generator){
	this.slot=generator.generate();
	}
	
	
	
	
	public Integer getPosicion(){
		return slot;
	}
	
	/* post: hace girar el tambor y luego se detiene en
	   * una posición comprendida entre 1 y 10.  */
	
	public void girar(){
		slot=generator.generate();
	}
	
}