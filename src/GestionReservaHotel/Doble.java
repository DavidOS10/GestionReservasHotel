package GestionReservaHotel;

import hotel.Habitacion;

/**
 * La clase Doble representa una habitación doble en un hotel.
 * Hereda de la clase Habitacion y agrega atributos específicos
 * como la presencia de un mini bar y el descuento aplicable.
 * 
 * @author josep
 * @version 1.0
 */
public class Doble extends Habitacion {
	
	/**
	 * Indica si la habitación tiene un minibar o no.
	 */
	private boolean miniBar;
	
	/**
	 * El descuento aplicable a la habitación, en porcentaje.
	 */
	private int descuento;
	
	/**
	 * Retorna si la habitación tiene un minibar o no.
	 * 
	 * @return true si la habitación tiene un minibar, false en caso contrario.
	 */
	public boolean isMiniBar() {
		return miniBar;
	}
	
	/**
	 * Establece si la habitación tiene un minibar o no.
	 * 
	 * @param miniBar true si la habitación tiene un minibar, false en caso contrario.
	 */
	public void setMiniBar(boolean miniBar) {
		this.miniBar = miniBar;
	}
	
	/**
	 * Retorna el descuento aplicable a la habitación.
	 * 
	 * @return el descuento aplicable a la habitación, en porcentaje.
	 */
	public int getDescuento() {
		return descuento;
	}
	
	/**
	 * Establece el descuento aplicable a la habitación.
	 * 
	 * @param descuento el descuento aplicable a la habitación, en porcentaje.
	 */
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	/**
	 * Indica si la habitación tiene un minibar o no.
	 * 
	 * @deprecated Usa el método isMiniBar() en su lugar.
	 */
	@Deprecated
	public void tieneMinibar() {
		
	}
	
	/**
	 * Calcula el descuento aplicable a la habitación.
	 */
	public void calcularDescuento() {
		
	}
}
