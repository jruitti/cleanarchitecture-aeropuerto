package ar.edu.undec.prog3.domain;

public class Aerolinea {

	private final Integer idAerolinea;
	private final String nombre;

	public Aerolinea(Integer idAerolinea, String nombre) {
		this.idAerolinea = idAerolinea;
		this.nombre = nombre;
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

}
