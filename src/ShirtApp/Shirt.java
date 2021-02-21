package ShirtApp;

public class Shirt {
    //Create 4 or 5 variables
    //2 or 3 constructor
    //Create 2 or 3 method

    public String color;
    public char size;
    public String make;
    public double price;
    static String sleeves;
    public static int sleeve_size;



    public Shirt(){

    }
    public Shirt(String colorolor, char size, String make, double price){
        this.color = color;
        this.size = size;
        this.make = make;
        this.price = price;
    }
    public Shirt(String color){
        this.color = color;
    }
    public Shirt(char size, double price){
        this.size = size;
        this.price = price;
    }


    public static String putOn(){
        String message = "SHIRT IS ON";
        return message;
    }

    public static String takeOff(){
        String message = "SHIRT IS OFF";
        return message;

    }
}





