import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            float cir,pi=3.1416f,rad;
            System.out.print("Enter the Circumference: ");
            cir=input.nextFloat();
            rad=cir/2*pi;
            System.out.printf("The radius is: %.2f", rad);
        }catch(Exception e){
            System.out.print("Invalid Input");
        }
    }
    
}
