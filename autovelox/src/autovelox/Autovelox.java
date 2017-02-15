package autovelox;

import java.io.*;

public class Autovelox {
	private String latitudine;
	private String longitudine;
	private String comune;
	private String provincia;
	private String regione;

	public Autovelox() {
		latitudine = null;
		longitudine = null;
		comune = null;
		provincia = null;
		regione = null;
	}

	public Autovelox(String latitudine, String longitudine, String co, String provincia, String regione) {
		this.latitudine = latitudine;
		this.longitudine = longitudine;
		this.comune = co;
		this.provincia = provincia;
		this.regione = regione;
	}

	public void setLatitudine(String latitudine) {
		this.latitudine = latitudine;
	}

	public void setLongitudine(String longitudine) {
		this.longitudine = longitudine;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public String getLatitudine() {
		return latitudine;
	}

	public String getLongitudine() {
		return longitudine;
	}

	public String getComune() {
		return comune;
	}

	public String getProvincia() {
		return provincia;
	}

	public String getRegione() {
		return regione;
	}

	public String toString(){
		return "\nIl comune di "+comune+" in provincia di "+provincia+" nella regione "+regione+" ha latitudine di "+latitudine+" e longitudine di "+longitudine;
	}
}