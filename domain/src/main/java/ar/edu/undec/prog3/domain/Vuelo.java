package ar.edu.undec.prog3.domain;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Collection;
import java.util.Locale;

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
		StringBuilder stringFlight = new StringBuilder();
		stringFlight.append("Vuelo " + this.codigoVuelo + " - " + this.avion.getModelo() + "\r\n");
		stringFlight.append(fechaHoraSpanish(this.fechaHoraSalida) + " " + this.salida.getCodigo() + " ("
				+ this.salida.getCiudad() + " - " + this.salida.getNombre() + ")" + "\r\n");
		stringFlight.append(fechaHoraSpanish(this.fechaHoraArribo) + " " + this.arribo.getCodigo() + " ("
				+ this.arribo.getCiudad() + " - " + this.arribo.getNombre() + ")" + "\r\n");
		stringFlight.append(
				"Operado por " + this.aerolinea.getNombre() + ". Duración " + this.getDurationInHoursAndMinutes());
		return stringFlight.toString();
	}

	private String getDurationInHoursAndMinutes() {
		return Duration.between(fechaHoraSalida, fechaHoraArribo).toHours() + "h "
				+ Duration.between(fechaHoraSalida, fechaHoraArribo).toMinutes() % 60 + "m";
	}

	private String fechaHoraSpanish(LocalDateTime pDateTime) {
		Locale argentina = new Locale("es", "AR");
		String dia = pDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, argentina).toLowerCase();

		return dia.substring(0, 1).toUpperCase() + dia.substring(1) + " " + pDateTime.getDayOfMonth() + " de "
				+ pDateTime.getMonth().getDisplayName(TextStyle.FULL, argentina) + " " + pDateTime.getHour() + ":"
				+ pDateTime.getMinute();
	}

	public Collection<Piloto> getPilotos() {
		return pilotos;
	}

}
