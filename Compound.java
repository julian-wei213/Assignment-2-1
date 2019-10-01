import  java.util.Scanner;

class Compound{
     public static void main( String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Compound Formula");
         System.out.println("--------------------------------");
         System.out.println("Enter Starting deposit");
         System.out.println(" ");
         int a = sc.nextInt();
         System.out.println("Enter interest rate");
         System.out.println(" ");
         double b = sc.nextDouble();
         System.out.println("Enter the number of years you plan to invest");
         System.out.println(" ");
         int c = sc.nextInt();
         
         double d = a*Math.pow(1+b,c);
         
         System.out.println("You will have this much" + d);
        }
}
