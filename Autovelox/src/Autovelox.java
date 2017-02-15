public class Autovelox {
	// attributi
	String latitudine;
	String longitudine;
	String comune;
	String provincia;
	String regione;

	// costruttori
	public Autovelox() {
		latitudine = null;
		longitudine = null;
		comune = null;
		provincia = null;
		regione = null;
	}

	public Autovelox(String longitudine, String provincia, String comune, String latitudine, String regione) {
		this.latitudine = latitudine;
		this.longitudine = longitudine;
		this.comune = comune;
		this.provincia = provincia;
		this.regione = regione;
	}

	// set
	public void setLatitudine(String latitudine) {
		this.latitudine = latitudine;
	}

	public void setLongitudine(String longitudine) {
		this.longitudine = longitudine;
	}

	public void setComine(String comune) {
		this.comune = comune;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public void setRegiione(String regione) {
		this.regione = regione;
	}

	// get
	public String getLatitudine() {
		return this.latitudine;
	}

	public String getLongitudine() {
		return this.longitudine;
	}

	public String getComune() {
		return this.comune;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public String getRegione() {
		return this.regione;
	}

	// toString
	public String toString() {
		return "\nLongitudine: " + longitudine + " Provincia: " + provincia + " Comune: " + comune + " Latitudine: "+ latitudine + " Regione: " + regione;
	}

}
