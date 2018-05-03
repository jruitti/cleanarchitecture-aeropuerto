package ar.edu.undec.prog3.domain;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;

public class Vuelo {

	private final String codigoVuelo;
	private final Aeropuerto salida;
	private final LocalDateTime fechaHoraSalida;
	private final Aeropuerto arribo;
	private final LocalDateTime fechaHoraArribo;
	private final Aerolinea aerolinea;
	private final Collection<Piloto> pilotos;
	private final Avion avion;
	private final Collection<Pasajero> pasajeros;

	public Vuelo(String codigoVuelo, Aeropuerto salida, LocalDateTime fechaHoraSalida, Aeropuerto arribo,
			LocalDateTime fechaHoraArribo, Aerolinea aerolinea, Collection<Piloto> pilotos, Avion avion,
			Collection<Pasajero> pasajeros) {
		this.codigoVuelo = codigoVuelo;
		this.salida = salida;
		this.fechaHoraSalida = fechaHoraSalida;
		this.arribo = arribo;
		this.fechaHoraArribo = fechaHoraArribo;
		this.aerolinea = aerolinea;
		this.pilotos = pilotos;
		this.avion = avion;
		this.pasajeros = pasajeros;
	}

	public Long getDurationInMinutes() {
		return Duration.between(fechaHoraSalida, fechaHoraArribo).toMinutes();

	}

	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Piloto> getPilotos() {
		return pilotos;
	}

}
