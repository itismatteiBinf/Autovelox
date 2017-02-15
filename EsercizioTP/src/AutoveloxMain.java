//Martino e Cattaneo
import java.io.*;
public class AutoveloxMain {
	public static void main(String args[])throws Exception{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader t = new BufferedReader(in);
		
		String nome;
		FileAutovelox f = new FileAutovelox();
		
		System.out.print("Inserire un nome: ");
		nome=t.readLine();
		
		f.carica(nome);
		f.stampa();
	}
}
