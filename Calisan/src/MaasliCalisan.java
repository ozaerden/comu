public class MaasliCalisan extends Calisan
{
	private double haftalikMaas;
	
	public MaasliCalisan(String ad, String soyad, String Tc, double maas)
	{
		super(ad,soyad,Tc);
		setHaftalikMaas(maas);
	}
	
	public void setHaftalikMaas(double maas)
	{
		haftalikMaas = maas<0.0 ? 0.0 : maas;
	}
	
	public double getHaftalikMaas()
	{
		return haftalikMaas;
	}
	
	public double kazanc()
	{
		return getHaftalikMaas();
	}
	
	public String toString() //@Override
	{
		return String.format("Maasli calisan: %s \nHaftalik Maasi: %.2f", super.toString(), getHaftalikMaas());
	}
	
}