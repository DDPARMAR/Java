/*class = "car"
attribute = make,model,year
 */

 class Car {
    private String make ;
    private String model;
    private int year;

    Car(String m,String mo,int y){
        make  = m;
        model = mo;
        year = y;
    }
    void cardetails(){
        System.out.println("Company name :- "+ make);
        System.out.println("Model name :- "+ model);
        System.out.println("make in the year :- "+ year);
    }

}

public class Cars{
    public static void main(String[] args) {
        Car obj= new Car("Tata","Thar",2000);
        obj.cardetails();
    }
}

