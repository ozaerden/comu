#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Iki Pozitif Sayinin En Buyuk Ortak Bolenini Bulma\n");

    long x,y;
    int sonuc;
    char secim,e,h;

    do{

        printf("Birinci Pozitif Sayiyi Giriniz (x)  : ");
        scanf("%ld", &x);

        printf("Ikinci Pozitif Sayiyi Giriniz  (y)  : ");
        scanf("%ld", &y);

        sonuc = gcd(x,y);
        printf("gcd(x,y): %d", sonuc);

        printf("\nDevam etmek ister misiniz Evet(e)/Hayir(h): ");
        scanf("%s", &secim);

    }
    while(secim != 'h');

    printf("Program Sonlanmistir ...\n");

    return 0;
}

int gcd(long x, long y)
{
    if (x == 0){
  		return y;
  	}
 	while (y != 0) {
    	   if (x > y) {
      		x = x - y;
          }
    	   else {
      		y = y - x;
    	   }
  	}
  	return x;
}
