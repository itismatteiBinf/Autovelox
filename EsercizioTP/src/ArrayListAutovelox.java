//Manganaro
import java.util.*;
public class ArrayListAutovelox {
	private ArrayList ar;
	
	public ArrayListAutovelox(){
		ar= new ArrayList();
	}
	
	public void aggiungi(Autovelox s){
		ar.add(s);
	}
	
	public void stampa(){
		int i;
		if(ar.size()==0)
			System.out.print("\nArrayList vuota.");
		else
			for(i=0;i<ar.size();i++)
				System.out.print("\n"+ar.get(i));
	}
}
