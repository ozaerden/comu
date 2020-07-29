public class AsgariArtiKomisyonCalisani extends KomisyonluCalisan
{
	private double asgariUcret;
	
	public AsgariArtiKomisyonCalisani(String ad, String soyad, String Tc, double satis, double yuzde, double ucret)
	{
		super(ad,soyad,Tc,satis,yuzde);
		setAsgariUcret(ucret);
	}
	
	public void setAsgariUcret(double ucret)
	{
		asgariUcret = ucret;
	}
	
	public double getAsgariUcret()
	{
		return asgariUcret;
	}
	
	public double kazanc()
	{
		return getAsgariUcret()+super.kazanc();
	}
	
	public String toString()
	{
		return String.format("Asgari Ucretli: %s; %s: &.2f", super.toString(), "Asgari Ucret: ", getAsgariUcret());
	}
	
}