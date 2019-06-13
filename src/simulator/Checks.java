package simulator;

public class Checks {	
	
	public static boolean provjeraAerdroma(String imeAerodroma) {
		
		if (imeAerodroma.length() > 3 || imeAerodroma.length() < 3) {
			System.out.println("Ime aerodroma treba imati tacno 3 slova.\n");
			return false;
		}
		
		for (int i = 0; i < UI.aerodromi.size(); i++) {
			if (imeAerodroma.equals(UI.aerodromi.get(i).getImeAerodroma())) {
				System.out.println("Vec postoji aerodrom sa unijetim imenom.\n");
				return true;
			}
		}
		
		return true;
	}
	
	public static boolean provjeraAviokompanije(String imeAviokompanije) {
		
		if (imeAviokompanije.length() >= 6) {
			System.out.println("Ime aviokompanije treba imati maksimalno 5 slova.\n");
			return false;
		}
		
		for (int i = 0; i < UI.aviokompanije.size(); i++) {
			if (imeAviokompanije.equals(UI.aviokompanije.get(i).getimeAviokompanije())) {
				System.out.println("Vec postoji aviokompanija sa unijetim imenom.\n");
				return false;
			}
		}
		
		return true;
	}

	public static boolean provjeraLeta(String imeAerodroma, String imeAviokompanije, String origin, String destinacija, int brojMjesta) {
		
		if (Airport.getAirport(imeAerodroma) == null ) {
			System.out.println("Unijeti aerodrom/aviokompanija ne postoji.\n");
			return false;
		}
		
		if (brojMjesta < 0) {
			System.out.println("Broj mjesta ne moze biti negativan broj.\n");
			return false;
		}
		
		return true;
	}
	
	public static boolean provjeraRezervisanja(String destinacija) {
		
		for (int i = 0; i < UI.letovi.size(); i++) {
			if (UI.letovi.get(i).getDestinacija() == destinacija) 
				return true;
		}
		
		for (int i = 0; i < Flight.getFlight(destinacija).getMjesta().size(); i++) {
			if (Flight.getFlight(destinacija).getMjesta().get(i).isStanje() == false) 
				return true;
		}	
			
		return false;
		
		
		
		
		
		
		
		
		
	}
}
