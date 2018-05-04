package ar.edu.undec.prog3.domain.repository;

import java.util.Collection;

import ar.edu.undec.prog3.domain.Aeropuerto;

public interface AirportRepository {

	Collection<Aeropuerto> allAirports();
}
