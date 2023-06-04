import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int choice = -1;
       do {
       System.out.println("\n --------Menu--------");
        System.out.println("1) Faclty");
        System.out.println("2) Student");
        System.out.println("0) Exit");
        System.out.println("\nEnter your choice ....\n ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("this is Faclty portion");
                break;
            case 2:
                System.out.println("this is Student portion");
                break;
            case 0:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Wrong input ");
                break;
        }
        
    }while (choice!=0); 
    } 
}
