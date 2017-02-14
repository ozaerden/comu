#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int sayi1,sayi2,sayi3,sayi4,tahmin1,tahmin2,tahmin3,tahmin4;
int puan = 250;
int sayac = 0;

int main()
{
    printf("CARK OYUNUNA HOSGELDINIZ!\n");

    srand(time(NULL));

    int gelen;
    char oyuncuSecimi,c,s;

        do
        {
            printf("\nCevirmek icin 'c' giriniz. Oyundan cikmak isterseniz 's' giriniz!\nSeciminiz: ");
            scanf("%s",&oyuncuSecimi);

            switch(oyuncuSecimi)
            {

                case 'c':
                    {
                        gelen = cark_cevir();
                        sayi_uret();

                        printf("%d, %d, %d, %d\n",sayi1,sayi2,sayi3,sayi4);

                        switch(gelen){
                            case 1:
                            {
                            printf("50 Puan! En az bir dogru tahmin gerekiyor.\n");
                            int dogru = tahmin_gir();
                            if(dogru >= 1)
                                {
                                    puan+=50;
                                    printf("Puaniniz %d oldu", puan);
                                }
                            else
                                {
                                    printf("Puan kazanamadiniz!");
                                }
                                break;
                            }

                            case 2:
                            {
                            printf("100 Puan! En az iki dogru tahmin gerekiyor.\n");
                            int dogru = tahmin_gir();
                            if(dogru >= 2)
                                {
                                    puan+=100;
                                    printf("Puaniniz %d oldu", puan);
                                }
                            else
                                {
                                    printf("Puan kazanamadiniz!");
                                }
                                break;
                            }

                            case 3:
                            {
                            printf("250 Puan! En az uc dogru tahmin gerekiyor.\n");
                            int dogru = tahmin_gir();
                            if(dogru >= 3)
                                {
                                    puan+=250;
                                    printf("Puaniniz %d oldu", puan);
                                }
                            else
                                {
                                    printf("Puan kazanamadiniz!");
                                }
                                break;
                            }

                            case 4:
                            {
                                printf("Pas! Puaniniz ayni kalacak.\n");
                                break;
                            }

                            case 5:
                            {
                                printf("Iflas!\n");
                                puan = 0;
                                break;
                            }

                            case 6:
                            {
                                puan -= puan/4;
                                printf("Puaninizin ceyregini kaybettiniz!\nYeni Puan: %d\n",puan);
                                break;
                            }
                        }
                        break;
                    }

                case 's':
                    {
                        printf("\nOyun sona erdi!\n");
                        break;
                    }


            }

        }
        while(oyuncuSecimi != 's' && puan != 0);

    return 0;
}


void sayi_uret()
{
    sayi1 = 1+rand()%10;
    do{
        sayi2=1+rand()%10;
    }
    while(sayi1==sayi2);

    do{
        sayi3=1+rand()%10;
    }
    while(sayi3==sayi1 || sayi3==sayi2);

    do{
        sayi4=1+rand()%10;
    }
    while(sayi4==sayi1 || sayi4==sayi2 || sayi4==sayi1);

}

int cark_cevir()
{
    printf("Cark cevirildi!\n");
    int carkifelek = 1+rand()%6;
    printf("\n%d. Bolum geldi \n", carkifelek);
    return carkifelek;
}

int tahmin_gir()
{
    do{
    printf("Birinci sayiyi gir: ");
    scanf("%d",&tahmin1);

    if(tahmin1>10 || tahmin1<1)
        printf("Lutfen 1 ile 10 arasinda bir sayi giriniz!\n");
    }
    while(tahmin1>10 || tahmin1<1);

    do{
        do{
        printf("Ikinci sayiyi gir: ");
        scanf("%d",&tahmin2);

        if(tahmin2>10 || tahmin2<1)
            printf("Lutfen 1 ile 10 arasinda bir sayi giriniz!\n");
        }
        while(tahmin2>10 || tahmin2<1);

    if(tahmin2==tahmin1)
        printf("Lutfen farkli sayilar giriniz!\n");
    }
    while(tahmin2==tahmin1);


    do{
        do{
        printf("Ucuncu sayiyi gir: ");
        scanf("%d",&tahmin3);

        if(tahmin3>10 || tahmin3<1)
            printf("Lutfen 1 ile 10 arasinda bir sayi giriniz!\n");
        }
        while(tahmin3>10 || tahmin3<1);

    if(tahmin2==tahmin1 || tahmin2==tahmin3)
        printf("Lutfen farkli sayilar giriniz!\n");
    }
    while(tahmin3==tahmin1 || tahmin3==tahmin2);


    do{
        do{
        printf("Dorduncu sayiyi gir: ");
        scanf("%d",&tahmin4);

        if(tahmin4>10 || tahmin4<1)
            printf("Lutfen 1 ile 10 arasinda bir sayi giriniz!\n");
        }
        while(tahmin4>10 || tahmin4<1);

    if(tahmin4==tahmin1 || tahmin4==tahmin2 || tahmin4==tahmin3)
        printf("Lutfen farkli sayilar giriniz!\n");
    }
    while(tahmin4==tahmin1 || tahmin4==tahmin2 || tahmin4==tahmin3);


    if(tahmin1 == sayi1 || tahmin1 == sayi2 || tahmin1 == sayi3 || tahmin1 == sayi4)
        sayac++;
    if(tahmin2 == sayi1 || tahmin2 == sayi2 || tahmin2 == sayi3 || tahmin2 == sayi4)
        sayac++;
    if(tahmin3 == sayi1 || tahmin3 == sayi2 || tahmin3 == sayi3 || tahmin3 == sayi4)
        sayac++;
    if(tahmin4 == sayi1 || tahmin4 == sayi2 || tahmin4 == sayi3 || tahmin4 == sayi4)
        sayac++;

    return sayac;
}
