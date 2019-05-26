package simulator;

public class Menu {
	
	public static void menu() {
		
		System.out.println("Koju uslugu trebate?\n 1. Kreacija aerodroma\n 2. Kreacija aviokompanije\n 3. Kreacija leta\n 4. Rezervisanje mjesta\n-----------------------------------------------");

		try {
			int unosKorisnika = UI.input.nextInt();
			
			if (unosKorisnika <= 0 || unosKorisnika > 4) 
				System.out.println("Unijeli ste pogresan broj");
			
			switch (unosKorisnika) {
			case 1 : kreacijaAerodroma();
			break;
			case 2 : kreacijaAviokompanije();
			break;
			case 3 : kreacijaLeta();
			break;
			case 4 : rezervisanjeMjesta();
			break;
			}
		} catch (Exception e) {
			System.out.println("Pogresan unos.");
		}
	}
	
	public static void kreacijaAerodroma() {
		System.out.println("Unesite ime aerodroma:");
		String imeAerodroma = UI.input.next();
		MenuInput.unosAerodroma(imeAerodroma);
	}
	
	public static void kreacijaAviokompanije() {
		System.out.println("Unesite ime aviokompanije:");
		String imeZracneLinije = UI.input.next();
		MenuInput.unosAviokompanije(imeZracneLinije);
	}
		
	public static void kreacijaLeta() {
		System.out.println("Unesite aerodrom, aviokompaniju, mjesto polaska, destinaciju kao i broj mjesta u avionu:");
		String imeAerodroma = UI.input.next();
		String imeAviokompanije = UI.input.next();
		String origin = UI.input.next();
		String destinacija = UI.input.next();
		int brojMjesta = UI.input.nextInt();
		MenuInput.unosLeta(imeAerodroma, imeAviokompanije, origin, destinacija, brojMjesta);
	}
	
	public static void rezervisanjeMjesta() {
		System.out.println("Uneiste destinaciju koju zelite posjetiti:");
		String destinacija = UI.input.next();
		MenuInput.rezervisanjeMjesta(destinacija);
	}
}
