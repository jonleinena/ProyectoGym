package logneg;
/**
 * Esta es la clase de l@s trabajadores, recepcionistas del Fitness Centre. Esta clase es hija de TrabajadorGym.
 * 
 * @author Nora y V�ctor
 *
 */
public class Recepcionista extends TrabajadorGym{
	private int numCompraClase;
	
	public Recepcionista(){
		
	}
	/**
	 * Atributos del recepcionista
	 * 
	 * @param numCompraClase
	 */
	public Recepcionista(String dniTrabajador, String emailTrabajador ,int numCompraClase) {
		super(dniTrabajador, emailTrabajador);
		this.numCompraClase = numCompraClase;
	}
	/**
	 * Este m�todo obtiene el n�mero de facturas (compra de una clase del gym)
	 * 
	 * @return numCompraClase
	 */
	public int getNumCompraClase() {
		return numCompraClase;
	}
	/**
	 * Este m�todo fija el n�mero de facturas (compra de una clase del gym)
	 * 
	 * @param numCompraClase
	 */
	public void setNumCompraClase(int numCompraClase) {
		this.numCompraClase = numCompraClase;
	}
	
}
