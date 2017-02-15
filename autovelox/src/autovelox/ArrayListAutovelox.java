package autovelox;
import java.util.*;
public class ArrayListAutovelox {
	
	private ArrayList ar;
	
	public ArrayListAutovelox(){
		ar = new ArrayList();
	}
	
	
	
	public void aggiungi(Autovelox n){
		ar.add(n);
	}
	
	
	
	public void stampa(){
		int i;
		if(ar.size() == 0)
			System.out.println("L'arraylist e vuoto");
		else
			for(i=0;i< ar.size();i++)
				System.out.print((Autovelox)ar.get(i)+"\n");
	}
	
}
