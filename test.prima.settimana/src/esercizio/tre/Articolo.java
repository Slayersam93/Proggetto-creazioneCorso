package esercizio.tre;

public class Articolo {
	public String codiceArticolo;
	public String descrizioneArticolo;
	public double prezzo;
	public int giacenze;
	public Articolo (String codiceArticolo,String descrizioneArticolo,double prezzo,int giacenze ) {
		this.codiceArticolo= codiceArticolo;
		this.descrizioneArticolo= descrizioneArticolo;
		this.prezzo= prezzo;
		this.giacenze= giacenze;
	}
	
}
