// import java.util.Scanner;
// public  class hello{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number : ");
//     int num = sc.nextInt();
//     if(num%2==0){
//       System.out.println(num +" is odd ...");
//     } 
//     else{
//       System.out.println(num + " is even ...");
//     }
//   }
// }

// import java.util.Scanner;
// public class hello{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println(("Enter number : "));
//     int num = sc.nextInt();
//     if(num>0){
//       System.out.println("You entered number is positive ...");
//     }
//     else if(num==0){
//       System.out.println("You entered number is 0 ...");
//     }
//     else{
//       System.out.println("you entered number is negative ...");
//     }

//   }
// }

// import java.util.Scanner;
// public class hello{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println(("Enter number : "));
//     int num = sc.nextInt();
//     if(num>0){
//       if(num%2==0){
//         System.out.println("This number is Odd ...");
//       }else{
//         System.out.println("This number is Even ...");
//       }
//       System.out.println("You entered number is positive ...");
//     }
//     else if(num==0){
//       System.out.println("You entered number is 0 ...");
//     }
//     else{
//       System.out.println("you entered number is negative ...");
//     }

//   }
// }

// import java.util.Scanner;
// public class hello{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println(("Enter first number : "));
//     int n1 = sc.nextInt();
//     System.out.println(("Enter second number : "));
//     int n2 = sc.nextInt();
//     int max = (n1>n2)? n1 : n2;
//     System.out.println(max + " this is max "); 

//   }
// }

// import java.util.Scanner;
// public class hello{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print(("Enter first number : "));
//     int n1 = sc.nextInt();
//     System.out.print(("Enter second number : "));
//     int n2 = sc.nextInt();
//     System.out.print(("Enter third number : "));
//     int n3 = sc.nextInt();
//     int max = (n1>n2) ? (n1>n3) ? n1 : (n2>n1) ? (n2>n3) ? n2 : n3 ;
//     System.out.println(max + " this is max "); 

//   }
// }

import java.util.Scanner;

public class hello {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(("Enter number : "));
    int num = sc.nextInt();
    switch (num) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Thuseday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("You Entered wrong number : ");

    }
  }
}