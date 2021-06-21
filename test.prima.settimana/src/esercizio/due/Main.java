package esercizio.due;

public class Main {

	public static void main(String[] args) {
		Sim s= new Sim("335627834");
		s.mostraReport();
		Chiamate c1= new Chiamate(3, "33568795");
		Chiamate c2= new Chiamate(1, "33528776");
		Chiamate c3= new Chiamate(4, "33513322");
		Chiamate c4= new Chiamate(5, "33515441");
		Chiamate c5= new Chiamate(6, "33515458");

		
		s.aggiungiChiamata(c1);
		s.aggiungiChiamata(c2);
		s.aggiungiChiamata(c3);
		s.aggiungiChiamata(c4);
		s.aggiungiChiamata(c5);
		
		s.mostraReport();
		Chiamate c6= new Chiamate(2, "33478511");
		s.aggiungiChiamata(c6);
		Chiamate rimossa = s.aggiungiChiamata(c6);
		System.out.println(rimossa.durata);
		s.mostraReport();
	}

}
