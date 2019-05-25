package simulator;

public class Menu {
	
	public static void menu() {
		
		System.out.println("Koju uslugu trebate?\n 1. Kreacija aerodroma\n 2. Kreacija zracne linije\n 3. Kreacija leta\n 4. Rezervisanje mjesta\n-----------------------------------------------");

		try {
			int unosKorisnika = UI.input.nextInt();
			
			if (unosKorisnika <= 0 || unosKorisnika > 4) 
				System.out.println("Unijeli ste pogresan broj");
			
			switch (unosKorisnika) {
			case 1 : kreacijaAerodroma();
			break;
			case 2 : kreacijaZracneLinije();
			break;
			case 3 : 
			case 4 : 
			}
		} catch (Exception e) {
			System.out.println("Pogresan unos.");
		}
	}
	
	public static void kreacijaAerodroma() {
		System.out.println("Unesite ime aerodroma:");
		String imeAerodroma = UI.input.nextLine();
		MenuInput.unosAerodroma(imeAerodroma);
	}
	
	public static void kreacijaZracneLinije() {
		System.out.println("Unesite ime zracne linije:");
		String imeZracneLinije = UI.input.nextLine();
		MenuInput.unosZracneLinije(imeZracneLinije);
	}
	
}
