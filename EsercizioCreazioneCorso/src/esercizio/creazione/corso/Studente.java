package esercizio.creazione.corso;
import java.time.LocalDate;

public class Studente {
	public String nome;
	public String cognome;
	public LocalDate dataDiNascita;
	public String codiceFiscale;
	public Competenze[] competenze = new Competenze [5];	
	public Studente(String nome, String cognome, LocalDate dataDiNascita, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.codiceFiscale = codiceFiscale;
	}
}
