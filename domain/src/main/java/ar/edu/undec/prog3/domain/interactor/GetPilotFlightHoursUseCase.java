package ar.edu.undec.prog3.domain.interactor;

import java.util.Collection;

import ar.edu.undec.prog3.domain.Piloto;
import ar.edu.undec.prog3.domain.Vuelo;
import ar.edu.undec.prog3.domain.repository.FlightRepository;

public class GetPilotFlightHoursUseCase {

	private final FlightRepository flightRepository;

	public GetPilotFlightHoursUseCase(FlightRepository flightRepository) {
		this.flightRepository = flightRepository;
	}

	public int getPilotFlightHours(Piloto aPilot) {
		Collection<Vuelo> pilotFlights = flightRepository.getFlights(aPilot);
		int flightHours = 0;
		for (Vuelo vuelo : pilotFlights) {
			flightHours += vuelo.getDurationInMinutes();
		}
		return flightHours / 60;
	}

}
