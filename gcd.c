#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Greatest Common Divisor of Two Positive Integers\n");

    long a,b;
    char choice,y,n;

    do{

        printf("Enter the first positive integer (a): ");
        scanf("%ld", &a);

        printf("Enter the second positive integer (b): ");
        scanf("%ld", &b);

        printf("Greatest common divisor of %ld and %ld is: %d", a, b, gcd(a,b));

        printf("\nDo you want to continue? Press Y or N for Yes/No: ");
        scanf("%s", &choice);

    }
    while(choice != 'n');

    printf("The program has terminated.\n");

    return 0;
}

int gcd(long a, long b)
{
    if (a == 0){
        return b;
    }
 	while (b != 0){
    	   if (a > b){
               a = a - b;
           }
           else{
               b = b - a;
           }
  	}
  	return a;
}
