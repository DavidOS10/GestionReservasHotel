/**
 * 
 */
package GestionReservaHotel;

import java.util.Date;

/**
 * @author David.O
 * Clase Reserva
 */
public class Reserva {

	/**
	 * Introducimos las variables
	 */
	
	private int numeroReserva;
	private Date fechaEntrada;
	private Date fechaSalida;
	private int numPersonas;

	/**
	 * Generamos getter de numeroReserva.
	 * @return
	 */
	public int getNumeroReserva() {
		return numeroReserva;
	}

	/**
	 * Generamos setter de numeroReserva.
	 * @param numeroReserva
	 */
	public void setNumeroReserva(int numeroReserva) {
		this.numeroReserva = numeroReserva;
	}

	/**
	 * Generamos getter de fechaEntrada.
	 * @return
	 */
	
	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * Generamos setter de fechaEntrada.
	 * @param numeroReserva
	 */
	
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * Generamos getter de fechaSalida.
	 * @return
	 */
	
	public Date getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * Generamos setter de fechaSalida.
	 * @param numeroReserva
	 */
	
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	/**
	 * Generamos getter de numPersonas.
	 * @return
	 */
	
	public int getNumPersonas() {
		return numPersonas;
	}
	
	/**
	 * Generamos setter de numPersonas.
	 * @param numeroReserva
	 */

	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}
	
	/**
	 * Generamos metodo calcularPrecio
	 */
    public void calcularPrecio() {
		
	}
	
    /**
     * Generamos el metodo modificar reserva.
     */
	public void modificarReserva() {
		
	}
}
