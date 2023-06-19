import java.io.FileInputStream;
public class practice{
    public static void main(String[] args) {
        FileInputStream obj = new FileInputStream("txt.txt");
        int a;
        while((a=obj.read())!= -1){
            System.out.println((char)a);
        }
    }
}