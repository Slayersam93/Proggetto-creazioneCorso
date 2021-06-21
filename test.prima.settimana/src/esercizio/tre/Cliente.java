package esercizio.tre;

import java.time.LocalDate;

public class Cliente {
	public String nome;
	public String cognome;
	public String codiceCliente;
	public String eMail;
	public LocalDate dataDiIscrizione;
	public Cliente(String nome, String cognome, String codiceCliente, String eMail, LocalDate dataDiIscrizione) {
		this.nome= nome;
		this.cognome= cognome;
		this.codiceCliente= codiceCliente;
		this.eMail= eMail;
		this.dataDiIscrizione= dataDiIscrizione;
	}
}
