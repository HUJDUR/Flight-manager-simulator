package simulator;

public class Checks {	
	
	public static boolean provjeraAerdroma(String imeAerodroma) {
		
		if (imeAerodroma.length() > 3 || imeAerodroma.length() < 3) {
			System.out.println("Ime aerodroma treba imati tacno 3 slova.");
			return false;
		}
		
		for (int i = 0; i < UI.aerodromi.size(); i++) {
			if (imeAerodroma == UI.aerodromi.get(i).getImeAerodroma()) {
				System.out.println("Vec postoji aerodrom sa unijetim imenom.");
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean provjeraZracneLinije(String imeZracneLinije) {
		
		if (imeZracneLinije.length() >= 6) {
			System.out.println("Ime zracne linije treba imati maksimalno 5 slova.");
			return false;
		}
		
		for (int i = 0; i < UI.linije.size(); i++) {
			if (imeZracneLinije == UI.linije.get(i).getImeZracneLinije()) {
				System.out.println("Vec postoji zracna linija sa unijetim imenom.");
				return false;
			}
		}
		
		return true;
	}

}
