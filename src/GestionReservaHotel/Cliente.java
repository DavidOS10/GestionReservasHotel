/**
 * 
 */
package GestionReservaHotel;

/**
 * @author David.O
 * Generamos la clase cliente,
 */
public class Cliente {

	/**
	 * Creamos los atributos de la clase 
	 */
	
	private int numeroCliente;
	private String nombreCliente;
	private int telefono;
	
	/**
	 * Generamos getter de numeroCliente.
	 * @return
	 */
	
	public int getNumeroCliente() {
		return numeroCliente;
	}
	
	/**
	 * Generamos setter de fechaSalida.
	 * @param numeroReserva
	 */
	
	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	
	/**
	 * Generamos getter de nombreCliente.
	 * @return
	 */
	
	public String getNombreCliente() {
		return nombreCliente;
	}
	
	/**
	 * Generamos setter de fechaSalida.
	 * @param numeroReserva
	 */
	
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	/**
	 * Generamos getter de telefono.
	 * @return
	 */
	
	public int getTelefono() {
		return telefono;
	}
	
	/**
	 * Generamos setter de fechaSalida.
	 * @param numeroReserva
	 */
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
}
