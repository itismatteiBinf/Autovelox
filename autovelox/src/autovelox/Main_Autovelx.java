package autovelox;

import java.io.*;

public class Main_Autovelx {

	public static void main(String args[]) throws IOException {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader t = new BufferedReader(in);
		
		ArrayListAutovelox l;
		String s;

		System.out.print("Dammi il comune : ");
		s = t.readLine();

		System.out.println("Cerco il comune");
		FileAutovelox a1 = new FileAutovelox();
		l = a1.cerca(s);

		l.stampa();
		System.out.println("Programma Terminato!");
	}
}