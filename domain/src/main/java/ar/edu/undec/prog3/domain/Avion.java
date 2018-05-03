package ar.edu.undec.prog3.domain;

import java.util.Collection;

public class Avion {

	private final Integer idAvion;
	private final String modelo;
	private final String matricula;
	private final Collection<Asiento> listaAsientos;

	public Avion(Integer idAvion, String modelo, String matricula, Collection<Asiento> listaAsientos) {
		this.idAvion = idAvion;
		this.modelo = modelo;
		this.matricula = matricula;
		this.listaAsientos = listaAsientos;
	}

}
