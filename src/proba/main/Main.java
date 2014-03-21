package proba.main;

public class Main {
	static public void main(String args[]) {
		ProbaClass pr = new ProbaClass();
		pr.setI(10);
		System.out.println(pr.getI());
		MasikClass masik = new MasikClass();
		masik.fgv(pr); //15-re módosítja
		System.out.println(pr.getI());
		System.out.println(pr.c);
		
		int g = 25;
		System.out.println("Uj szöveg "+g);
	}
}
