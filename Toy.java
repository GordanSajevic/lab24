package lab24;

public class Toy {

	private String naziv;
	private String tip;
	private double cijena;
	private int dobnoOgranicenje;
	private int godinaProizvodnje;
	private int kolicina;
	
	public Toy(String nekiNaziv, String nekiTip, double nekaCijena, int nekoOgranicenje, int nekaGodina, int kolicina)
	{
		setNaziv(nekiNaziv);
		setTip(nekiTip);
		setCijena(nekaCijena);
		setOgranicenje(nekoOgranicenje);
		setGodina(nekaGodina);
		setKolicina(kolicina);
	}
	
	public Toy(String nekiNaziv, String nekiTip, double nekaCijena, int kolicina)
	{
		setNaziv(nekiNaziv);
		setTip(nekiTip);
		setCijena(nekaCijena);
		setOgranicenje(0);
		setGodina(2014);
		setKolicina(kolicina);
		
	}
	
	public Toy(String nekiNaziv, String nekiTip, double nekaCijena, int nesto, int kolicina)
	{
		setNaziv(nekiNaziv);
		setTip(nekiTip);
		setCijena(nekaCijena);
		setOgranicenje(nesto);
		setKolicina(kolicina);
		
	}
	
	public Toy(Toy other)
	{
		this.naziv = other.naziv;
		this.tip = other.tip;
		this.cijena = other.cijena;
		this.dobnoOgranicenje = other.dobnoOgranicenje;
		this.godinaProizvodnje = other.godinaProizvodnje;
		this.kolicina = other.kolicina;
	}
	
	public void setGodina(int godinaProizvodnje) 
	{
		if (godinaProizvodnje<1900 && godinaProizvodnje > 2014)
		{
			throw new IllegalArgumentException("Niste ispravno unijeli godinu proizvodnje!");
		}
		else
		{
			this.godinaProizvodnje = godinaProizvodnje;
		}
		
	}

	public void setOgranicenje(int dobnoOgranicenje) 
	{
		if (dobnoOgranicenje > 100)
		{
			setGodina(dobnoOgranicenje);
		}
		else
		{
			this.godinaProizvodnje = 2014;
			this.dobnoOgranicenje = dobnoOgranicenje;
		}
		
	}

	public void setKolicina(int kolicina)
	{
		if (kolicina < 1)
		{
			throw new IllegalArgumentException("Količina ne može biti manja od 1!");
		}
		else
		{
			this.kolicina = kolicina;
		}
	}
	
	public void setCijena(double cijena) 
	{
		if (cijena < 0)
		{
			throw new IllegalArgumentException("Cijena ne može biti manja od nule!");
		}
		else
		{
			this.cijena = cijena;
		}
		
	}

	public void setTip(String tip) 
	{
		if (naziv.length() < 1)
		{
			throw new IllegalArgumentException("Tip ne može biti prazan!");
		}
		else
		{
			this.tip = tip;
		}
		
	}

	public void setNaziv(String naziv) 
	{
		if (naziv.length() < 1)
		{
			throw new IllegalArgumentException("Naziv ne može biti prazan!");
		}
		else
		{
			this.naziv = naziv;
		}
		
	}
	
	public int getKolicina()
	{
		return kolicina;
	}
	
	public String getNaziv()
	{
		return naziv;
	}
	
	public String getTip()
	{
		return tip;
	}
	
	public double getCijena()
	{
		return cijena;
	}
	
	public int getGodina()
	{
		return godinaProizvodnje;
	}
	
	public int getOgranicenje()
	{
		return dobnoOgranicenje;
	}
	
	public String toString()
	{
		String strToy = "Naziv: " + naziv + "\nTip: " + tip + "\nCijena: " 
					+ cijena + "\nZabranjeno za djecu do: " + dobnoOgranicenje
					+ "\nGodina proizvodnje: " + godinaProizvodnje + "\nKoličina: " + kolicina + "\n";
		return strToy;
	}
	
	public boolean equals(Toy other)
	{
		if (this.naziv.equals(other.naziv) && this.tip.equals(other.tip) 
				&& this.cijena==other.cijena && this.godinaProizvodnje==other.godinaProizvodnje 
				&& this.dobnoOgranicenje==other.dobnoOgranicenje)
		{
			return true;
		}
		return false;
	}
	
}
