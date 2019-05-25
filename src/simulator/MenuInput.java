package simulator;

public class MenuInput {
	
	public static void unosAerodroma(String imeAerodroma) {
		
		if (Checks.provjeraAerdroma(imeAerodroma) == true) {
			System.out.println("Aerodrom je uspjesno kreiran.");
			UI.aerodromi.add(new Airport(imeAerodroma));
		}
	}
	
	public static void unosZracneLinije(String imeZracneLinije) {
		
		if (Checks.provjeraZracneLinije(imeZracneLinije) == true) {
			System.out.println("Zracna linija je uspjesno kreiran.");
			UI.linije.add(new Airline(imeZracneLinije));
		}
	}
	
}
