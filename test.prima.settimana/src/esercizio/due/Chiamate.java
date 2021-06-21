package esercizio.due;

public class Chiamate {
	public double durata;
	public String numero;
	public String info;
	
	public Chiamate(double durata,String numero) {
		this.durata=durata;
		this.numero=numero;	
	}
	public String infoChiamata(String info) {
		info= numero + durata;
		return info;
	}
}

