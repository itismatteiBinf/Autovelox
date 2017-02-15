//Mascheroni
public class Autovelox {
	private String lati, longi, comune, provincia, regione;
	
	public Autovelox(){
		lati=longi=comune=provincia=regione=null;
	}
	
	public Autovelox (String l, String lo, String co, String pro, String re){
		lati=l;
		longi=lo;
		comune=co;
		provincia=pro;
		regione=re;
	}
	
	public void setLongitudine(String lo){
		longi=lo;
	}
	public void setLatitudine(String l) {
		lati=l;
	}
	public void setComune(String c){
		comune=c;
	}
	public void setRegione(String r){
		regione=r;
	}
	public void setProvincia(String p){
		provincia=p;
	}
	
	
	public String getRegione(){
		return regione;
	}
	public String getComune(){
		return comune;
	}
	public String getLatitudine(){
		return lati;
	}
	public String getLongitudine(){
		return longi;
	}
	public String getProvincia(){
		return provincia;
	}
	
	public String toString (){
		return"\n"+provincia+"\n"+comune+"\n"+regione+"\n"+longi+"\n"+lati;
	}
}
