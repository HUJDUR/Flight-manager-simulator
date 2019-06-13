package simulator;

public class Airline {
	
	private String imeAviokompanije;
	
	Airline() {

	}
	
	Airline(String imeAviokompanije) {
		this.imeAviokompanije = imeAviokompanije;
	}

	public String getimeAviokompanije() {
		return imeAviokompanije;
	}
	
	public static Airline getAirline(String imeAviokompanije) {
		
		for (int i = 0; i < UI.aviokompanije.size(); i++) {
			if (imeAviokompanije.equals(UI.aviokompanije.get(i).imeAviokompanije))
				return UI.aviokompanije.get(i);
		}
		
		return null;
	}
	
}
