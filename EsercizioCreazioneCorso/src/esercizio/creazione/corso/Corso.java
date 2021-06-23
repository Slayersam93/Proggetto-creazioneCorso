package esercizio.creazione.corso;
public class Corso {
	public String titolo;
	public String durata;
	public Livello livello;
	public double costo;
	
	public Corso(String titolo, String durata, Livello livello, double costo) {
		this.titolo = titolo;
		this.durata = durata;
		this.livello = livello;
		this.costo = costo;
	}
}
