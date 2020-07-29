public class SaatliCalisan extends Calisan
{
	private double ucret;
	private double saat;
	
	public SaatliCalisan(String ad, String soyad, String Tc, double saatlikUcret, double calismaSaati)
	{
		super(ad,soyad,Tc);
		setUcret(saatlikUcret);
		setSaat(calismaSaati);
	}
	
	public void setUcret(double saatlikUcret)
	{
		ucret = saatlikUcret;
	}
	
	public double getUcret()
	{
		return ucret;
	}
	
	public void setSaat(double calismaSaati)
	{
		if( (calismaSaati>0.0) && (calismaSaati<=168) )
			saat = calismaSaati;
		else
			throw new IllegalArgumentException("Calisma saati 0 ile 168 arasinda olmalidir.");
	}
	
	public double getSaat()
	{
		return saat;
	}
	
	public double kazanc()
	{
		if(getSaat() <= 40)
			return getSaat() * getUcret();
		else
			return 40*getUcret()+(getSaat()-40)*getUcret()*1.5;
	}

	public String toString()
	{
		return String.format("Saatli Calisan: %s \n %s: %.2f; %s: %.2f",super.toString(),
				"Saatlik Ucreti: ", getUcret(), "Calisma Saati: ", getSaat());
	}
	
}