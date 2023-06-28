import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class attendanceprogram {
	public static void main(String[] args) {
		int exit = -1;
		Scanner sc = new Scanner(System.in);
		while(exit!=0){
			try {
				System.out.print("Enter Number : ");
				exit = sc.nextInt();
				FileWriter fw = new FileWriter("demo.csv",true);
				String s = "" + exit;
				fw.write(s);
				System.out.println("Successfully");
				fw.close();

			} catch (Exception e) {
				
			}
		}
	}
}
