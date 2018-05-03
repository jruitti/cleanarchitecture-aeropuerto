package ar.edu.undec.prog3.domain;

public class Aeropuerto {

	private final Integer idAeropuerto;
	private final String nombre;
	private final String codigo;
	private final Ciudad ciudad;

	public Aeropuerto(Integer idAeropuerto, String nombre, String codigo, Ciudad ciudad) {
		this.idAeropuerto = idAeropuerto;
		this.nombre = nombre;
		this.codigo = codigo;
		this.ciudad = ciudad;
	}

	public String showDenomination() {
		// TODO Auto-generated method stub
		return this.nombre + " - " + this.ciudad.getName() + " - " + this.codigo;
	}

}
