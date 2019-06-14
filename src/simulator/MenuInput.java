package simulator;

import java.util.ArrayList;

public class MenuInput {
	
	public static void unosAerodroma(String imeAerodroma) {
		
		if (Checks.provjeraAerdroma(imeAerodroma) == true) {
			System.out.println("Aerodrom je uspjesno kreiran.\n");
			UI.aerodromi.add(new Airport(imeAerodroma));
		}
		
		Menu.menu();
	}
	
	public static void unosAviokompanije(String imeAviokompanije) {
		
		if (Checks.provjeraAviokompanije(imeAviokompanije) == true) {
			System.out.println("Aviokompanija je uspjesno kreiran.\n");
			UI.aviokompanije.add(new Airline(imeAviokompanije));
		}
		
		Menu.menu();
	}
	
	public static void unosLeta(String imeAerodroma, String imeAviokompanije, String origin, String destinacija, int brojMjesta) {
		
		if (Checks.provjeraLeta(imeAerodroma, imeAviokompanije, origin, destinacija, brojMjesta) == true) {
			System.out.println("Let je uspjesno kreiran.\n");
			ArrayList<Seat> mjesta = new ArrayList<>();
			for (int i = 0; i < brojMjesta; i++) 
				mjesta.add(new Seat(false));
			UI.letovi.add(new Flight(Airport.getAirport(imeAerodroma), Airline.getAirline(imeAviokompanije), origin, destinacija, mjesta));
		}
		
		Menu.menu();
	}
	
	public static void rezervisanjeMjesta(String destinacija) {
		
		if (Checks.provjeraRezervisanja(destinacija) == true) {
			System.out.printf("Rezervisali ste mjesto za %s, avion polece sa %s aerodroma.\n", destinacija, Flight.getFlight(destinacija).getAerodrom().getImeAerodroma());
			for (int i = 0; i < Flight.getFlight(destinacija).getMjesta().size(); i++) {
				if (Flight.getFlight(destinacija).getMjesta().get(i).isStanje() == false) 
					Flight.getFlight(destinacija).getMjesta().get(i).setStanje(true);
			}	
			
		} else 
			System.out.println("Sva mjesta su popunjena.\n");
	
		Menu.menu();
	}
}
