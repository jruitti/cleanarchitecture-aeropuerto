package ar.edu.undec.prog3.domain.repository;

import java.util.Collection;

import ar.edu.undec.prog3.domain.Piloto;
import ar.edu.undec.prog3.domain.Vuelo;

public interface FlightRepository {

	Collection<Vuelo> getFlights(Piloto aPilot);

}