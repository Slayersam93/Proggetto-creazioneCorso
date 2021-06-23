package esercizio.creazione.corso;

public class Docente {
	public String nome;
	public String cognome;
	public boolean liberoProfessionista;
	
	public Docente(String nome, String cognome, Boolean liberoProfessionista) {
		this.nome = nome;
		this.cognome = cognome;	
		this.liberoProfessionista = liberoProfessionista;
	}
	public boolean isLiberoProfessionista() {
		return liberoProfessionista;
	}
	}
