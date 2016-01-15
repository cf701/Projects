import java.util.Scanner;
import java.text.NumberFormat;
import java.lang.Math;
public class Average
{
   public static void main(String[ ]args)
   {
   //Declaration
   double a, b ,c ,d, average;
   Scanner scan = new Scanner(System.in);
   //Assignment
   System.out.print("Enter value 1: ");
      a = scan.nextDouble();
   System.out.print("Enter value 2: ");
      b = scan.nextDouble();
   System.out.print("Enter value 3: ");
      c = scan.nextDouble();
   System.out.print("Enter value 4: ");
      d = scan.nextDouble();
   //Process
   average = (a + b + c + d)/4 * 7;
   //Output
   System.out.println(average);
  }
}