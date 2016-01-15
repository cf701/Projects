import java.util.Scanner;
import java.text.NumberFormat;
import java.lang.Math;
public class Convert
{
   public static void main(String[ ]args)
   {
   //Declaration
   Scanner scan = new Scanner(System.in);
   double inch1 = 2;
   double inch2 = 5;
   double inch3 = 10;
   double millimeter1;
   double millimeter2;
   double millimeter3;
   //Assignment
   //Process
   millimeter1 = 25.4 * inch1;
   millimeter2 = 25.4 * inch2;
   millimeter3 = 25.4 * inch3;
   //Output
   System.out.println(millimeter1 + "mm");
   System.out.println(millimeter2 + "mm");
   System.out.println(millimeter3 + "mm");
      }
   }
