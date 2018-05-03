package ar.edu.undec.prog3.domain.interactor;

import ar.edu.undec.prog3.domain.Ciudad;
import ar.edu.undec.prog3.domain.repository.CityRepository;

public class CreateCityUseCase {

	private final CityRepository cityRepository;

	public CreateCityUseCase(CityRepository pCity) {
		this.cityRepository = pCity;
	}

	public Ciudad createCity(Ciudad pCity) {
		return this.cityRepository.save(pCity);
	}

}
