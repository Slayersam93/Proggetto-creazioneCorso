package esercizio.uno;

public class Rettangolo {
	public double altezza;
	public double larghezza;
	public Rettangolo(double altezza, double larghezza) {
		this.altezza= altezza;
		this.larghezza= larghezza;
	}
	public double calcolaPerimetro() {
		double perimetro= 2*(altezza+larghezza);
		return perimetro; 
	}
	public double calcolaArea () {
		double area= altezza * larghezza;
		return area;
	}
} 
//commento di test github