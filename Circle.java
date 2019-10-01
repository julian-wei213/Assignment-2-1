import  java.util.Scanner;

class Circle{
     public static void main( String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Area of a Circle");
         System.out.println("--------------------------------");
         System.out.println("Enter a number for the radius");
         System.out.println(" ");
         int a = sc.nextInt();
         
         double b = Math.pow(a,2) * Math.PI;
         
         System.out.println("The Area is " + b);
        }
}
