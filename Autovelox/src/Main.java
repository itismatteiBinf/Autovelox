
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader ta = new BufferedReader(in);

		String co;
		FileAutovelox fI = new FileAutovelox("autovelox.csv");
		ArrayAutovelox ar = new ArrayAutovelox();

		System.out.println("Inserisci un comune:");
		co = ta.readLine();
		ar = fI.cerca(co);
		if (ar == null)
			System.out.println("Array vuoto!");
		else
			ar.stampa();

	}

}
