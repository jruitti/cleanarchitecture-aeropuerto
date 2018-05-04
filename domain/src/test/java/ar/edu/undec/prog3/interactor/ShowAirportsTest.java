package ar.edu.undec.prog3.interactor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.undec.prog3.domain.Aeropuerto;
import ar.edu.undec.prog3.domain.Ciudad;
import ar.edu.undec.prog3.domain.interactor.ShowAirportsUseCase;
import ar.edu.undec.prog3.domain.repository.AirportRepository;

class ShowAirportsTest {

	@Test
	void ShowAirports_ExpectedFormatted_ResultCorrect() {

		FakeAirportRepository fakeRepository = new FakeAirportRepository();
		ShowAirportsUseCase showAirportsUseCase = new ShowAirportsUseCase(fakeRepository);

		String output = showAirportsUseCase.returnAllAirports();
		String expected = "Aeropuerto Capitán Vicente Almandos Almonacid - La Rioja - IRJ\n"
				+ "Aeropuerto Buenos Aires Jorge Newbery - Buenos Aires - AEP\n"
				+ "Aeropuerto El Plumerillo - Mendoza - MDZ\n" + "Aeropuerto Benjamín Matienzo - Tucumán - TUC";

		assertEquals(expected, output);

	}

}

class FakeAirportRepository implements AirportRepository {

	@Override
	public Collection<Aeropuerto> allAirports() {
		List<Aeropuerto> airports = new LinkedList<Aeropuerto>();

		Aeropuerto laRioja = new Aeropuerto(1, "Aeropuerto Capitán Vicente Almandos Almonacid", "IRJ",
				new Ciudad(1, "La Rioja", "5360"));
		Aeropuerto buenosAires = new Aeropuerto(2, "Aeropuerto Buenos Aires Jorge Newbery", "AEP",
				new Ciudad(2, "Buenos Aires", "1000"));
		Aeropuerto mendoza = new Aeropuerto(3, "Aeropuerto El Plumerillo", "MDZ", new Ciudad(3, "Mendoza", "4000"));
		Aeropuerto tucuman = new Aeropuerto(4, "Aeropuerto Benjamín Matienzo", "TUC", new Ciudad(4, "Tucumán", "3000"));

		airports.add(laRioja);
		airports.add(buenosAires);
		airports.add(mendoza);
		airports.add(tucuman);

		return airports;
	}

}
