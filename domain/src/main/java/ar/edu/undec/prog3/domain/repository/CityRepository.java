package ar.edu.undec.prog3.domain.repository;

import java.util.Collection;

import ar.edu.undec.prog3.domain.Ciudad;

public interface CityRepository {

	Ciudad save(Ciudad pCity);

	Ciudad update(Ciudad pCity);

	Ciudad findById(int pID);

	Collection<Ciudad> findAllCities();

}
