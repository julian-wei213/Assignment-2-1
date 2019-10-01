import  java.util.Scanner;

class Dist{
     public static void main( String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Distance Formula");
         System.out.println("--------------------------------");
         System.out.println("x coordinate for first point");
         System.out.println(" ");
         int a = sc.nextInt();
         System.out.println("y coordinate for first point");
         System.out.println(" ");
         int b = sc.nextInt();
         System.out.println("x coordinate for second point");
         System.out.println(" ");
         int c = sc.nextInt();
         System.out.println("y coordinate for second point");
         System.out.println(" ");
         int d = sc.nextInt();
         
         double e = Math.sqrt(Math.pow(c-a,2) + Math.pow(d-b,2));
         
         System.out.println("The Distance between the two points is " + e);
        }
}