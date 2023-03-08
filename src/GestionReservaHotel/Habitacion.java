package GestionReservaHotel;
/**
 * 
 * @author josep
 * @version 1.0
 */
public class Habitacion {
	/** 
	 * 
	 * El número de la habitación.
	 *  */
	private int numeroHabitaciones;
	
	/** El estado actual de la habitación*/
	private String estado;
	
	/** El número de camas en la habitación. */
	private int numCamas;
	
	/** El tipo de habitación */
	private String tipoHabitacion;
	
	/**
	 * Obtiene el número de la habitación.
	 * @return el número de la habitación
	 */
	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}
	
	/**
	 * Establece el número de la habitación.
	 * @param numeroHabitaciones el nuevo número de la habitación
	 */
	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}
	
	/**
	 * Obtiene el estado actual de la habitación.
	 * @return el estado actual de la habitación
	 */
	public String getEstado() {
		return estado;
	}
	
	/**
	 * Establece el estado actual de la habitación.
	 * @param estado el nuevo estado de la habitación
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	/**
	 * Obtiene el número de camas en la habitación.
	 * @return el número de camas en la habitación
	 */
	public int getNumCamas() {
		return numCamas;
	}
	
	/**
	 * 
	 * Establece el número de camas en la habitación.
	 * @param numCamas el nuevo número de camas en la habitación
	 */
	public void setNumCamas(int numCamas) {
		this.numCamas = numCamas;
	}
	
	/**
	 * Obtiene el tipo de habitación.
	 * @return el tipo de habitación
	 */
	public String getTipoHabitacion() {
		return tipoHabitacion;
	}
	
	/**
	 * Establece el tipo de habitación.
	 * @param tipoHabitacion el nuevo tipo de habitación
	 */
	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	
	/**
	 * Intenta reservar la habitación si está disponible.
	 */
	public void reservarHabitacion() {
		if (estado.equals("vacant")) {
			estado = "full";
			System.out.println("La habitación ha sido reservada.");
		} else {
			System.out.println("La habitación no está disponible para reservar.");
		}
	}
	
	/**
	 * Libera la habitación si está ocupada.
	 */
	public void liberarHabitacion() {
		if (estado.equals("full")) {
			estado = "vacant";
			System.out.println("La habitación ha sido liberada.");
		} else {
			System.out.println("La habitación no está ocupada.");
		}
	}
	
	/**
	 * Comprueba si la habitación está disponible.
	 * @return true si la habitación está disponible, false si está ocupada
	 */
	public boolean estaDisponible() {
		return false;
		
	}

	
}
