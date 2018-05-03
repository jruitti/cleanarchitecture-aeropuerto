package ar.edu.undec.prog3.domain;

public class Ciudad {

	private final Integer idCiudad;
	private final String nombre;
	private final String codigoPostal;

	public Ciudad(Integer idCiudad, String nombre, String codigoPostal) {
		this.idCiudad = idCiudad;
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
	}

	public String getName() {
		return this.nombre;
	}

}
