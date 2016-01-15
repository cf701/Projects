//Rainfall.c
#include<stdio.h>
int main()
{
    //declaration
    int i, j, years;
    float inches, sum = 0.0;
    
    printf("Enter the number of years: ");
    scanf("%d", &years);
    //outer loop
    for (i = 1; i <= years; i++)
    {
        //inner loop
        for(j = 0; j < 12; j++)
        {
              printf("Enter the amount of rainfall in inches for month %d: ", j + 1);
              scanf("%f", &inches);
              sum += inches;
              }
    //output
    printf("\nAverage Rainfall\n");
    printf("***************************************\n");
    printf("The number of months: %d\n", j);
    printf("The total inches of rainfall per month: %.2f\n", sum);
    printf("The average rainfall per month is: %.2f\n\n", sum/12);
        
        }
    system("PAUSE");
    return 0;
}
