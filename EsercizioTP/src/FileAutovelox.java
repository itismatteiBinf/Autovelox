//Manganaro e Viti
import java.util.*;
import java.io.*;
public class FileAutovelox {
	private ArrayListAutovelox a;
	private String nome;
	private Autovelox ar;
	private String longi, pro, com, lati, regio;
	
	public FileAutovelox(){
		nome="autovelox.txt";
		a=new ArrayListAutovelox();
	}
	public FileAutovelox(String n){
		nome=n;
		a=new ArrayListAutovelox();
	}
	
	public void carica(String st1)throws Exception{
		Scanner s = null;
		int r=0;
		try {
		 s = new Scanner(new BufferedReader(new FileReader("autovelox.txt")));
			s.useDelimiter(";");
		 	while (s.hasNext()) {
		 		longi=s.next();
		 		pro=s.next();
		 		com=s.next();
		 		s.next();
		 		s.next();
		 		s.next();
		 		lati=s.next();
		 		s.next();
		 		s.next();
		 		regio=s.next();
		 		
		 		
		 		longi=longi.substring(1, longi.length()-1);
		 		pro=pro.substring(1, pro.length()-1);
		 		com=com.substring(1, com.length()-1);
		 		lati=lati.substring(1, lati.length()-1);
		 		regio=regio.substring(1, regio.length()-1);
		 		r++;
		 		
		 		if(st1.compareToIgnoreCase(com)==0){
		 			ar= new Autovelox(longi, pro, com, lati,regio);
		 			a.aggiungi(ar);
		 		}
		 		
		 	}
		 }catch(Exception e) {
			 if (s != null) {
				 System.out.print(r);
				 s.close();
			 } 
		 }
	}
	
	public void stampa(){
		a.stampa();
	}
}
