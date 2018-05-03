package ar.edu.undec.prog3.domain.interactor;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.undec.prog3.domain.Piloto;

public class PilotsInteractor {

	public static String orderPilotsByAgeDesc(LinkedList<Piloto> pilotList) {
		final List<Piloto> orderedPilots = pilotList.stream().sorted(Comparator.comparing(Piloto::getFechaNacimiento))
				.collect(Collectors.toList());
		String returnString = "";
		for (final Piloto piloto : orderedPilots) {
			returnString += piloto.getSurnameAndName() + " - " + piloto.getAge(LocalDate.now()) + " años.\r\n";
		}
		return returnString;
	}

	public static Integer getFlightHours(Piloto aPilot) {
		// TODO Auto-generated method stub
		return aPilot.getTotalHours().intValue();

	}

}
