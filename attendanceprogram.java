import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String exit = "-1";
		Scanner sc = new Scanner(System.in);
		while(!(exit.equals("0"))){
			try {
				System.out.print("Enter Number : ");
				exit = sc.next();
				FileWriter fw = new FileWriter("demo.csv",true);
				fw.write(exit);
				System.out.println("Successfully");
				fw.close();

			} catch (Exception e) {
				
			}
		}
	}
}
