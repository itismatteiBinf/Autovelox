import java.util.Scanner;
import java.io.*;

public class FileAutovelox {
	// attributi
	private String longitudine, provincia, comune, latitudine, regione;
	Scanner s;

	// costruttori
	public FileAutovelox() {
		longitudine = provincia = comune = latitudine = regione = null;
		s = null;
	}

	public FileAutovelox(String st) {
		longitudine = provincia = comune = latitudine = regione = null;
		try {
			FileReader fIn = new FileReader(st);
			BufferedReader fI = new BufferedReader(fIn);
			s = new Scanner(fI);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	// ricerca
	public ArrayAutovelox cerca(String comune) {
		ArrayAutovelox ar = new ArrayAutovelox();
		s.useDelimiter(";");

		while (s.hasNext()) {
			try {
				this.longitudine = s.next();
				this.provincia = s.next();
				this.comune = s.next();
				s.next();
				s.next();
				s.next();
				this.latitudine = s.next();
				s.next();
				s.next();
				this.regione = s.next();

				this.longitudine = togliVirgolette(longitudine);
				this.provincia = togliVirgolette(provincia);
				this.comune = togliVirgolette(this.comune);
				this.latitudine = togliVirgolette(latitudine);
				this.regione = togliVirgolette(regione);

				if (comune.compareToIgnoreCase(this.comune) == 0) {
					Autovelox a = new Autovelox(longitudine, provincia, this.comune, latitudine, regione);
					ar.add(a);
				}

			} catch (Exception e) {
				System.out.println(e);
			}
		}

		// controllo sull'array
		if (ar.size() <= 0)
			ar = null;
		return ar;
	}

	//metodo per togliere le virgolette alle variabili
	private String togliVirgolette(String s1) {
		return s1.substring(1, s1.length() - 1);
	}
} 
