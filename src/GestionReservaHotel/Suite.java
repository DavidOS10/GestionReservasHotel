package GestionReservaHotel;

/**
 * Esta clase es para ver si hay una suite en la habitacion
 * @author josep
 * @version 1.0
 */
public class Suite extends Habitacion{
	/**
	 * 
	 * metros de la habitacion
	 */
private int metros;
// Los servicios que tiene
private String servicios;
//Los gastos de la suite
private int gastos;
/**
 * Para que nos devuelvan los metros de la suite
 * @return metros de la suite
 */
public int getMetros() {
	return metros;
}
/**
 * Aqui tenemos el parametro mettros que se introduce el numero de metros
 * @param metros
 */
public void setMetros(int metros) {
	this.metros = metros;
}

/**
 * obtener los servicios que tiene la suite
 * @return Servicios
 */
public String getServicios() {
	return servicios;
}
/**
 * Aqui tenemos los servicios que se introducen a la suite
 * @param servicios
 */
public void setServicios(String servicios) {
	this.servicios = servicios;
}
/**
 * Para obtener los gastos que han hecho los clientes de la suite 
 * @return
 */
public int getGastos() {
	return gastos;
}
/**
 * Setter para que nos itroduzca los gastos 
 * @param gastos de la suite
 */

public void setGastos(int gastos) {
	this.gastos = gastos;
}
/**
 * calculamos los gastos totales y asi dar el precio
 */
public void calcularGastos() {
	
}
}
