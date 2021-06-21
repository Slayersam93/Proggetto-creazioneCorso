package esercizio.tre;

public class Carrello {
	public Cliente cliente;
	public Articolo [] articoli;
	public static final int NUMERO_MASSIMO_ARTICOLI= 100;
	
	public Carrello(Cliente cliente, Articolo[]articoli) {
		this.cliente= cliente;
		this.articoli = new Articolo[100]; 
	}
}