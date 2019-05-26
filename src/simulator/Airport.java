package simulator;

public class Airport {
	
	private String imeAerodroma;
	
	public Airport() {

	}
	
	public Airport(String imeAerodroma) {
		this.imeAerodroma = imeAerodroma;
	}

	public String getImeAerodroma() {
		return imeAerodroma;
	}
	
	public static Airport getAirport(String imeAerodroma) {
		
		for(int i = 0; i < UI.aerodromi.size(); i++) {
			if (UI.aerodromi.get(i).imeAerodroma == imeAerodroma)
				return UI.aerodromi.get(i);
		}
		
		return null;
	}
	
}
