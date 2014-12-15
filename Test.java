package lab24;

public class Test {

	public static void main(String[] args) 
	{
		Toy prva = new Toy("ime", "tip", 12.12, 5, 21);
		Toy druga = new Toy("ime2", "tip2", 12.20, 10, 15);
		Toy treca = new Toy("ime3", "tip3", 12.32, 1989, 12);
		Toy cetvrta = new Toy("ime4", "tip4", 12.42, 4, 1989, 11);
		Toy kopija = new Toy(prva);
		System.out.println(prva);
		System.out.println(druga);
		System.out.println(treca);
		System.out.println(cetvrta);
		System.out.println(kopija);
		ToyStore prodavnica = new ToyStore("Prva prodavnica");
		prodavnica.dodajIgracku(prva);
		prodavnica.dodajIgracku(druga);
		prodavnica.dodajIgracku(treca);
		prodavnica.dodajIgracku(cetvrta);
		System.out.println(prodavnica.toString());
	}

}
