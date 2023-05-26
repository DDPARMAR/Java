import java.util.Scanner;
public class max_of_2no {
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(("Enter first number : "));
    int n1 = sc.nextInt();
    System.out.println(("Enter second number : "));
    int n2 = sc.nextInt();
    int max = (n1>n2)? n1 : n2;
    System.out.println(max + " this is max "); 

  }
}
