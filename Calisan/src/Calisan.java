public abstract class Calisan
{
	private String isim;
	private String soyisim;	
	private String TcNumarasi;
	
	public Calisan(String ad, String soyad, String Tc)
	{
		isim = ad;
		soyisim = soyad;
		TcNumarasi = Tc;
	}
	
	public void setIsim(String ad)
	{
		isim = ad;
	}
	
	public String getIsim()
	{
		return isim;
	}
	
	public void setSoyisim(String soyad)
	{
		soyisim = soyad;
	}
	
	public String getSoysim()
	{
		return soyisim;
	}
	
	public void setTcNumarasi(String Tc)
	{
		TcNumarasi = Tc;
	}
	
	public String getTcNumarasi()
	{
		return TcNumarasi;
	}
	
	public String toString()
	{
		return String.format("%s %s \n %s : %s", getIsim(), getSoysim(),"Tc Numarasi: ",getTcNumarasi());
	}
	
	public abstract double kazanc();
	
}