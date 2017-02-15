import java.util.ArrayList;

public class ArrayAutovelox {
	private ArrayList <Autovelox> ar;

	public ArrayAutovelox() {
		ar = new ArrayList <Autovelox> (1000);
	}

	public void add(Autovelox a) {
		ar.add(a);
	}

	public void stampa() {
		int i;
		Autovelox v=new Autovelox();
		for(i=0;i<ar.size();i++){
			v=ar.get(i);
			System.out.println(v);
		}
			
	}

	public int size() {
		return ar.size();
	}
}
