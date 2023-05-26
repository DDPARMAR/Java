
import java.util.Scanner;
public class odd_even_and_po_ne {
      

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(("Enter number : "));
    int num = sc.nextInt();
    if(num>0){
      if(num%2==0){
        System.out.println("This number is Odd ...");
      }else{
        System.out.println("This number is Even ...");
      }
      System.out.println("You entered number is positive ...");
    }
    else if(num==0){
      System.out.println("You entered number is 0 ...");
    }
    else{
      System.out.println("you entered number is negative ...");
    }

  }

}

