package ar.edu.undec.prog3.domain;

public class Pasajero {

	private final Integer idPasajero;
	private final String cuil;
	private final String apellido;
	private final String nombres;
	private final String telefono;

	public Pasajero(Integer idPasajero, String cuil, String apellido, String nombres, String telefono) {
		this.idPasajero = idPasajero;
		this.cuil = cuil;
		this.apellido = apellido;
		this.nombres = nombres;
		this.telefono = telefono;
	}

}
