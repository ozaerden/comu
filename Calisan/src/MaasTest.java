public class MaasTest
{

	public static void main(String[] args)
	{
		MaasliCalisan calisan1 = new MaasliCalisan("Elif","Kuru","1122",800.00);

		SaatliCalisan calisan2 = new SaatliCalisan("Ayse","Engin","3344",16.75,40);

		KomisyonluCalisan calisan3 = new KomisyonluCalisan("Ali", "Yilmaz", "4455", 10000, 0.06);
		
		AsgariArtiKomisyonCalisani calisan4 = new AsgariArtiKomisyonCalisani("Veli", "Kaya", "6677", 5000, 0.04, 300);
	
		System.out.printf("%s\n %s: %.2f\n\n", calisan1, "Kazanci: ", calisan1.kazanc());
		System.out.printf("%s\n %s: %.2f\n\n", calisan2, "Kazanci: ", calisan2.kazanc());
		System.out.printf("%s\n %s: %.2f\n\n", calisan3, "Kazanci: ", calisan3.kazanc());
		System.out.printf("%s\n %s: %.2f\n\n", calisan4, "Kazanci: ", calisan4.kazanc());
	
		Calisan[] calisanlar = new Calisan[4];
		calisanlar[0] = calisan1;
		calisanlar[1] = calisan2;
		calisanlar[2] = calisan3;
		calisanlar[3] = calisan4;
		
		for(Calisan suankiCalisan:calisanlar)
		{
			System.out.println(suankiCalisan);
			
			if(suankiCalisan instanceof AsgariArtiKomisyonCalisani)
			{
				AsgariArtiKomisyonCalisani calisan = (AsgariArtiKomisyonCalisani) suankiCalisan;
				calisan.setAsgariUcret(1.10*calisan.getAsgariUcret());
				System.out.printf("Kazanci: %.2f\n\n", suankiCalisan.kazanc());
			}
			
		}
		
	}

}