import java.io.FileInputStream;
import java.io.IOException;

public class practice{
    public static void main(String[] args) {
        
        try {
            FileInputStream obj = new FileInputStream("data.txt");
            int a;
            while((a=obj.read())!= -1){
                System.out.println((char)a);
            }
        } 
        catch(IOException e){

        }
    }
}
