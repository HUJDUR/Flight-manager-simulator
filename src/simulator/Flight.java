package simulator;

import java.util.ArrayList;

public class Flight {
	
	private Airport aerodrom;
	private Airline aviokompanija;
	private String origin;
	private String destinacija;
	private ArrayList<Seat> mjesta = new ArrayList<>();
	
	public Flight(Airport aerodrom, Airline aviokompanija, String origin, String destinacija, ArrayList<Seat> mjesta) {
		this.aerodrom = aerodrom;
		this.aviokompanija = aviokompanija;
		this.origin = origin;
		this.destinacija = destinacija;
		this.mjesta = mjesta;
	}

	public String getDestinacija() {
		return destinacija;
	}
	
	public Airport getAerodrom() {
		return aerodrom;
	}
	
	public Airline getAviokompanija() {
		return aviokompanija;
	}

	public void setAviokompanija(Airline aviokompanija) {
		this.aviokompanija = aviokompanija;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public ArrayList<Seat> getMjesta() {
		return mjesta;
	}

	public void setMjesta(ArrayList<Seat> mjesta) {
		this.mjesta = mjesta;
	}

	public void setAerodrom(Airport aerodrom) {
		this.aerodrom = aerodrom;
	}

	public void setDestinacija(String destinacija) {
		this.destinacija = destinacija;
	}

	public static Flight getFlight(String destinacija) {
		
		for (int i = 0; i < UI.letovi.size(); i++) {
			if (destinacija.equals(UI.letovi.get(i).destinacija))
				return UI.letovi.get(i);
		}
		
		return null;
	}
	
}
