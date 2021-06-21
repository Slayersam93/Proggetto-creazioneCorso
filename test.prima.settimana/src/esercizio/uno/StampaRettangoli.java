package esercizio.uno;

public class StampaRettangoli {

	public static void main(String[] args) {
		Rettangolo uno = new Rettangolo(7.5, 15);
		Rettangolo due = new Rettangolo(6.5, 13);
		stampaUnRettangolo(uno);
		stampaDueRettangoli(uno, due);
	}
	public static void stampaUnRettangolo(Rettangolo x) {
		System.out.println("Il perimetro del rettangolo e' "+ x.calcolaPerimetro());
		System.out.println("L'area del rettangolo e' "+ x.calcolaArea());
	}
	public static void stampaDueRettangoli(Rettangolo x, Rettangolo y) {
		double perimetri = x.calcolaPerimetro() + y.calcolaPerimetro();
		double aree = x.calcolaArea() + y.calcolaArea();
		System.out.println("Il perimetro del rettangolo e' "+x.calcolaPerimetro());
		System.out.println("L'area del rettangolo e' "+x.calcolaArea());
		System.out.println("Il perimetro del rettangolo e' "+y.calcolaPerimetro());
		System.out.println("L'area del rettangolo e' "+y.calcolaArea());
		System.out.println("La somma dei perimetri e' "+ perimetri);
		System.out.println("La simma delle aree e' "+ aree);
	}
}
