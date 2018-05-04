package ar.edu.undec.prog3.domain.interactor;

import ar.edu.undec.prog3.domain.Aeropuerto;
import ar.edu.undec.prog3.domain.repository.AirportRepository;

public class ShowAirportsUseCase {

	private AirportRepository airportRepository;

	public ShowAirportsUseCase(AirportRepository airportRepository) {
		this.airportRepository = airportRepository;
	}

	public String returnAllAirports() {

		StringBuilder stringResult = new StringBuilder();
		for (Aeropuerto elAeropuerto : this.airportRepository.allAirports()) {
			stringResult.append(elAeropuerto.showDenomination() + "\n");
		}

		return stringResult.toString().substring(0, stringResult.length() - 1);
	}

}
