package ar.edu.undec.prog3.interactor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;

import org.junit.jupiter.api.Test;

import ar.edu.undec.prog3.domain.Ciudad;
import ar.edu.undec.prog3.domain.interactor.CreateCityUseCase;
import ar.edu.undec.prog3.domain.repository.CityRepository;

class CreateCityUseCaseTest {

	@Test
	void createCity_NormalPath_ReturnsCityWithID() {

		Ciudad newCity = new Ciudad(1, "Chilecito", "5360");
		FakeCityRepository fakeRepository = new FakeCityRepository();
		CreateCityUseCase useCaseToTest = new CreateCityUseCase(fakeRepository);

		Ciudad createdCity = useCaseToTest.createCity(newCity);

		assertEquals(createdCity, newCity);

	}

}

class FakeCityRepository implements CityRepository {

	@Override
	public Ciudad save(Ciudad pCity) {
		return pCity;
	}

	@Override
	public Ciudad update(Ciudad pCity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ciudad findById(int pID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Ciudad> findAllCities() {
		// TODO Auto-generated method stub
		return null;
	}

}
