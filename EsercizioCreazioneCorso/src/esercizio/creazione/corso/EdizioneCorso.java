package esercizio.creazione.corso;
import java.time.LocalDate;

public class EdizioneCorso {
	public Corso corso;
	public String codice;
	public LocalDate dataDiPartenza;
	public LocalDate dataDiChiusura;
	public final static int NUMERO_MASSIMO_STUDENTI = 15;
	public Studente[] studenti = new Studente[NUMERO_MASSIMO_STUDENTI];
	public Docente docente;
	public boolean aggiungiStudente (Studente s) {
		for (int i=0; i<studenti.length;i++) {
			if(studenti[i]==null) {
				studenti[i]=s;
				return true;
			}
		}
		return false;
	}
	public void report() {
		System.out.println("Codice edizione: "+codice);
		System.out.println("Data di partenza: "+dataDiPartenza);
		System.out.println("Titolo corso:" +corso.titolo);
		System.out.println("--------------------------------------");
		System.out.println("Docente: "+ docente.nome +" "+docente.cognome);
		System.out.println("--------------------------------------");
		for (int i=0; i< studenti.length; i++) {
			if(studenti[i]!=null) {
			System.out.println("Studente: "+studenti[i].nome+" "+studenti[i].cognome);
			for (int j=0; j<studenti[i].competenze.length;j++) {
				if(studenti[i].competenze[j]!=null) {
					System.out.println(studenti[i].competenze[j].nome +" "+studenti[i].competenze[j].area+" "+studenti[i].competenze[j].livello);
					System.out.println("--------------------------------------");
				}
			}
			}
		}
	}
	public EdizioneCorso(Corso corso, String codice, LocalDate dataDiPartenza, LocalDate dataDiChiusura, Docente docente) {
		this.corso = corso;
		this.codice = codice;
		this.dataDiPartenza = dataDiPartenza;
		this.dataDiChiusura = dataDiChiusura;
		this.docente = docente;
	}
}
