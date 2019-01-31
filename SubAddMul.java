
import java.util.Scanner;
 
public class SubAddMul {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  
  System.out.print("Please choose math function \n");
  System.out.print("Enter number for function \n");
  System.out.print("1 for Addition \n");
  System.out.print("2 for Subtraction \n");
  System.out.print("3 for Multiplication \n");
  
  int mathno = in.nextInt();
  
  System.out.print("you have choosen Math function "+mathno);
  
  System.out.print("\n Input first number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input second number: ");
  int num2 = in.nextInt();
   
 if (mathno == 1) {
  System.out.println(num1 + " + " + num2 + " = " + 
  (num1 + num2));
 } else if (mathno == 2) {
  System.out.println(num1 + " - " + num2 + " = " + 
  (num1 - num2));
 } else if (mathno == 3)  {
  System.out.println(num1 + " x " + num2 + " = " + 
  (num1 * num2));
 } else {
	 System.out.print("You havent entered a valid function input so nothing to do");
	 System.out.print("Input First number: "+num1);
	 System.out.print("Input second number: "+num2);
 }
 
 
 }
 
}
