#include <stdio.h>

int main() {

printf("Enter the depth : (km) ");
 scanf("%d",&depth);

int celcius_at_depth(int depth){
return 10*depth+20;

}

int celcius = celcius_at_depth(depth);

int fahrenheit(int celcius
) {
return 1.8*celcius + 32;
}

int fahrenheit = fahrenheit(celcius);

printf("Depth : %d ",depth);
printf("Celcius at depth %d is %d : ",depth,celcius);
printf("Fahrenheit at depth %d is %d : ",depth,fahrenheit);
return (0);

}
