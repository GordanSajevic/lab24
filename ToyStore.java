package lab24;

public class ToyStore {

	private String ime;
	private Toy[] skladiste;
	private int brojIgracaka;
	
	public ToyStore(String ime)
	{
		setIme(ime);
		Toy[] skladiste = new Toy[10];
	}

	
	public void setIme(String ime) {
		if (ime.length() < 1)
		{
			throw new IllegalArgumentException("Ime ne može biti prazno!");
		}
		else
		{
			this.ime = ime;
		}
		
	}
	
	public String toString()
	{
		String strSkladiste = "";
		for (int i=0; i<brojIgracaka; i++)
		{ 
			strSkladiste = skladiste[i] + "\n";
		}
		return strSkladiste;
	}
	
	public String getIme()
	{
		return ime;
	}
	
	public void dodajIgracku(Toy igracka)
	{
		int kolicina = igracka.getKolicina();
		for (int i=0; i<brojIgracaka; i++)
		{
			if (skladiste[i].equals(igracka))
			{
				igracka.setKolicina(kolicina+1);
			}
		}
		skladiste[brojIgracaka] = new Toy(igracka);
		brojIgracaka++;
		if (brojIgracaka == skladiste.length)
		{
			resize();
		}
	}
	
	private void resize() {
		int novaDuzina = skladiste.length * 2;
		Toy[] pomocni = new Toy[novaDuzina];
		for (int i=0; i<skladiste.length; i++)
		{
			pomocni[i] = skladiste[i];
		}
		skladiste = pomocni;
	}


	public void prodajIgracku(Toy igracka)
	{
		for (int i=0; i<brojIgracaka; i++)
		{
			if (skladiste[i].equals(igracka))
			{
				for (int j=i; j<brojIgracaka-1; j++)
				{
					skladiste[j] = skladiste[j+1];
				}
			}
			{
				skladiste[i] = null;
				brojIgracaka--;
			}
		}
	}
}
