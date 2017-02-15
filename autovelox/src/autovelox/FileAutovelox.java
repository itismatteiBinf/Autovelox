package autovelox;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class FileAutovelox {

	private String comune, provincia, regione, latitudine, longitudine;

	public FileAutovelox() {
		comune = null;
		provincia = null;
		regione = null;
		latitudine = null;
		longitudine = null;
	}

	public FileAutovelox(String com, String pro, String reg, String lat, String lon) {
		this.comune = com;
		this.provincia = pro;
		this.regione = reg;
		this.latitudine = lat;
		this.longitudine = lon;
	}

	public ArrayListAutovelox cerca(String comune) {

		String s;
		int riga=0;
		Autovelox ax = new Autovelox();
		double d;
		ArrayListAutovelox a = new ArrayListAutovelox();
		try {
			Scanner scanner = new Scanner(new BufferedReader(new FileReader("C:\\Users\\Jurgen\\Desktop\\autovelox.csv")));
			scanner.useDelimiter(";");
			scanner.useLocale(Locale.US);
			scanner.nextLine();
			while (scanner.hasNext()) {
				s = scanner.next();
				s = s.substring(3, s.length()-1);
				ax.setLongitudine(s);
				s = scanner.next();
				s = s.substring(1, s.length()-1);
				ax.setProvincia(s);
				s = scanner.next();
				s = s.substring(1, s.length()-1);
				ax.setComune(s);
				scanner.next();
				scanner.next();
				scanner.next();
				s = scanner.next();
				s = s.substring(1, s.length()-1);
				ax.setLatitudine(s);
				scanner.next();
				scanner.next();
				s = scanner.next();
				s = s.substring(1, s.length()-1);
				ax.setRegione(s);
				
				if(comune.equalsIgnoreCase(ax.getComune())==true)
				{
					Autovelox n = new Autovelox(ax.getLatitudine(),ax.getLongitudine(),ax.getComune(),ax.getProvincia(),ax.getRegione());
					a.aggiungi(n);
				}
				riga++;
			}
		} catch (Exception e) {
			//System.out.println(e);
		}
		return a;
	}

}