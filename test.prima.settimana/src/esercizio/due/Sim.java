package esercizio.due;

public class Sim {
	public String numeroDiTelefono;
	public double creditoResiduo;
	public final static int NUMERO_ULTIME_CHIAMATE = 5; //costante che fissa il numero dell
	public Chiamate [] ultimeChiamate = new Chiamate [NUMERO_ULTIME_CHIAMATE];
	public int numeroChiamateRecenti;
	public Sim(String numeroDiTelefono) {
		this.numeroDiTelefono = numeroDiTelefono;
	}
	// metodo per aggiungere delle chiamate
	public Chiamate aggiungiChiamata(Chiamate ultimaChiamata) {
		if (numeroChiamateRecenti== ultimeChiamate.length) {
			Chiamate restituisci = ultimeChiamate[0];
			for (int i = 1; i>ultimeChiamate.length; i++) {
				ultimeChiamate[i-1] = ultimeChiamate [i];
			}
			ultimeChiamate[ultimeChiamate.length-1]	= ultimaChiamata;
			return restituisci;
		}
		else {
			ultimeChiamate[numeroChiamateRecenti]= ultimaChiamata;
			numeroChiamateRecenti ++;
			return null;
		}
	}
	public void mostraReport() {
		System.out.println("Numero di telefono "+numeroDiTelefono);
		System.out.println("Credito disponibile "+creditoResiduo);
		System.out.println("Lista ultime chiamate");
		for(int i=ultimeChiamate.length-1; i>=0; i--) {
			if (ultimeChiamate[i]!= null) {
				System.out.println("Numero chiamato "+ultimeChiamate[i].numero+ "Durata Chiamata "+ ultimeChiamate[i].durata);
				System.out.println("**********************************************************");
			}
		}
			
	}
}	
