package ar.edu.undec.prog3.domain;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Piloto {

	private final Integer idPiloto;
	private final String apellido;
	private final String nombres;
	private final String documento;
	private final LocalDate fechaNacimiento;

	public Piloto(Integer idPiloto, String apellido, String nombres, String documento, LocalDate fechaNacimiento) {
		this.idPiloto = idPiloto;
		this.apellido = apellido;
		this.nombres = nombres;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getAge(LocalDate actualDate) {

		return Period.between(fechaNacimiento, actualDate).getYears();

	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getSurnameAndName() {
		return this.apellido + ", " + this.nombres;
	}

	public Integer getTotalHours() {

		final boolean tieneVuelos = true;

		if (tieneVuelos) {
			final Long horas1 = Duration
					.between(LocalDateTime.of(2018, 04, 10, 21, 10), LocalDateTime.of(2018, 04, 10, 22, 45))
					.getSeconds() / 3600;
			final Long horas2 = Duration
					.between(LocalDateTime.of(2018, 04, 10, 0, 0), LocalDateTime.of(2018, 04, 10, 12, 0)).getSeconds()
					/ 3600;
			return horas2.intValue() + horas1.intValue();
		} else {
			return 0;
		}

		// return FlightsInteractor.getPilotFligthHours(this);
	}

}
