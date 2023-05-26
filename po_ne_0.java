import java.util.Scanner;

public class po_ne_0 {
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(("Enter number : "));
    int num = sc.nextInt();
    if(num>0){
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
