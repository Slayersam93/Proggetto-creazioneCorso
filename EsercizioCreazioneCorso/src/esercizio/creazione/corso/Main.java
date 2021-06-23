package esercizio.creazione.corso;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Corso Java = new Corso("Java", "510 H",Livello.AVANZATO,3500);
		Docente docente = new Docente("Pdor","Kmer", true);
		EdizioneCorso corsoJava = new EdizioneCorso(Java, "02154585", LocalDate.of(2021, 6, 14) ,LocalDate.of(2021, 9, 14),docente);
		Studente s1 = new Studente("Maccio", "Capatonda",LocalDate.of(1998, 5, 15),"Non ho voglia di inventarlo");
		corsoJava.aggiungiStudente(s1);
		Studente s2 = new Studente("Girolamo", "Pastorello",LocalDate.of(1994, 8, 23),"Non ho voglia di inventarlo");
		corsoJava.aggiungiStudente(s2);
		Studente s3 = new Studente("Padre", "Maronno",LocalDate.of(1992, 9, 18),"Non ho voglia di inventarlo");
		corsoJava.aggiungiStudente(s3);
		Studente s4 = new Studente("Ajeje", "Brazorf",LocalDate.of(1989, 7, 25),"Non ho voglia di inventarlo");
		corsoJava.aggiungiStudente(s4);
		Studente s5 = new Studente("Oscar", "Carogna",LocalDate.of(1988, 10, 22),"Non ho voglia di inventarlo");
		corsoJava.aggiungiStudente(s5);
		Studente s6 = new Studente("Mariottide", "Povero",LocalDate.of(1990, 5, 28),"Non ho voglia di inventarlo");
		corsoJava.aggiungiStudente(s6);
		Studente s7 = new Studente("Fernandello", "Scenziato",LocalDate.of(1991, 4, 23),"Non ho voglia di inventarlo");
		corsoJava.aggiungiStudente(s7);
		Studente s8 = new Studente("Ivo", "Avido",LocalDate.of(1988, 4, 25),"Non ho voglia di inventarlo");
		corsoJava.aggiungiStudente(s8);
		Studente s9 = new Studente("Rupert", "Sciamenna",LocalDate.of(1980, 11, 26),"Non ho voglia di inventarlo");
		corsoJava.aggiungiStudente(s9);
		Studente s10 = new Studente("Jerry", "Polemica",LocalDate.of(1982, 7, 30),"Non ho voglia di inventarlo");
		corsoJava.aggiungiStudente(s10);
	
		s1.competenze[0]= new Competenze("Java","Linguaggio java", Livello.INTERMEDIO);
		s2.competenze[0]= new Competenze("Java","Linguaggio java", Livello.PRINCIPIANTE);
		s3.competenze[0]= new Competenze("Java","Linguaggio java", Livello.DIVINO);
		s4.competenze[0]= new Competenze("Java","Linguaggio java", Livello.PRINCIPIANTE);
		s5.competenze[0]= new Competenze("Java","Linguaggio java", Livello.INTERMEDIO);
		s6.competenze[0]= new Competenze("Java","Linguaggio java", Livello.INTERMEDIO);
		s7.competenze[0]= new Competenze("Java","Linguaggio java", Livello.PRINCIPIANTE);
		s8.competenze[0]= new Competenze("Java","Linguaggio java", Livello.DIVINO);
		s9.competenze[0]= new Competenze("Java","Linguaggio java", Livello.AVANZATO);
		s10.competenze[0]= new Competenze("Java","Linguaggio java", Livello.INTERMEDIO);
		
		corsoJava.report();
	}
}