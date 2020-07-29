public class KomisyonluCalisan extends Calisan
{
	private double haftalikSatis;
	private double komisyonYuzdesi;
	
	public KomisyonluCalisan(String ad, String soyad, String Tc, double satis, double yuzde)
	{
		super(ad,soyad,Tc);
		setHaftalikSatis(satis);
		setKomisyonYuzdesi(yuzde);
	}
	
	public void setKomisyonYuzdesi(double yuzde)
	{
		if(yuzde > 0.0 && yuzde < 1.0)
			komisyonYuzdesi = yuzde;
		else
			throw new IllegalArgumentException("Komisyon yuzdesi 0 ile 1 arasinda olmalidir.");
	}

	public double getKomisyonYuzdesi()
	{
		return komisyonYuzdesi;
	}
	
	public void setHaftalikSatis(double satis)
	{
		if(satis >= 0.0)
			haftalikSatis = satis;
		else
			throw new IllegalArgumentException("Haftalik satis 0'dan buyuk olmalidir.");
	}
	
	public double getHaftalikSatis()
	{
		return haftalikSatis;
	}
	
	public double kazanc()
	{
		return getKomisyonYuzdesi()*getHaftalikSatis();
	}
	
	public String toString()
	{
		return String.format("Komisyon Calisani: &s\n %s : %.2f; %s : %.2f", super.toString(),
				"Haftalik Satis: ", getHaftalikSatis(), "Komisyon Yuzdesi: ", getKomisyonYuzdesi());
	}
}