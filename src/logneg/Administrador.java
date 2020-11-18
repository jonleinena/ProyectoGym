package logneg;
/**
 * Esta es la clase administrador que es "clase hija" de TrabajadorGym
 * @author Nora y V�ctor
 * 
 */
public class Administrador extends TrabajadorGym{
	private String nombreAdmin;
	private String contrasenya;
	
	
	public Administrador(){
		super();
	}
	/**
	 * Atributos del administrador
	 * 
	 * @param dni		
	 * @param email			
	 * @param nombreAdmin		
	 * @param contrasenya
	 * 			
	 */
	
	public Administrador(String dni, String email, String nombreAdmin, String contrasenya) {
		super(dni, email);
		this.nombreAdmin = nombreAdmin;
		this.contrasenya = contrasenya;
	}
	
	/**
	 * Este m�todo obtiene el nombre del administrador
	 * 
	 * @return nombreAdmin
	 */
	public String getNombre() {
		return nombreAdmin;
	}
	
	/**
	 * Este m�todo fija el nombre del administrador
	 * @param nombreAdmin
	 */
	public void setNombre(String nombre) {
		this.nombreAdmin = nombre;
	}
	
	/**
	 * Este m�todo obtiene la contrase�a del administrador
	 * 
	 * @return contrasenya
	 */
	public String getContrasenya() {
		return contrasenya;
	}
	
	/**
	 * Este m�todo fija la contrase�a del administrador
	 * @param contrasenya
	 */
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	
	
}
