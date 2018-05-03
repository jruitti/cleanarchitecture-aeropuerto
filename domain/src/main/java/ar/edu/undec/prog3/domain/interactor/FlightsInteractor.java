package ar.edu.undec.prog3.domain.interactor;

import java.util.Collection;
import java.util.LinkedList;

import ar.edu.undec.prog3.domain.Piloto;
import ar.edu.undec.prog3.domain.Vuelo;

public class FlightsInteractor {

	public static Integer getPilotFligthHours(Piloto piloto) {

		final Collection<Vuelo> allFlights = new LinkedList<Vuelo>();

		Long horas = 0L;
		for (final Vuelo theFlight : allFlights) {
			horas += theFlight.getDurationInMinutes();
		}

		return horas.intValue();
	}

}
