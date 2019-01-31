import java.util.Scanner;

public class MyClass {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int myInt = 0;
    System.out.print("Choose a number between 1 and 10: ");
    myInt = scan.nextInt();

    switch (myInt){
      case 1:
        System.out.print("1 is a very lonely number.");
        break;
      case 2:
        System.out.print("2 is sometimes called a couple.");
        break;
      case 3:
        System.out.print("Is 3 considered a party?");
        break;
      case 4:
        System.out.print("Most of the time, a hamster got 4 paws.");
        break;
      case 5:
        System.out.print("High 5, human being!");
        break;
      case 6:
        System.out.print("Half a dozen!");
        break;
      case 7:
        System.out.print("I once heard a story of 7 dwarfs.");
        break;
      case 8:
        System.out.print("I feel inferior to The Magic 8-ball.");
        break;
      case 9:
        System.out.print("9 might be three times a party.");
        break;
      case 10:
        System.out.print("There are only 10 kinds of people in the world..");
        break;
    }
  }

}
