package instrumentIventory;

public class Main {
    public static void main(String[] args){
        Guitar guitar = new Guitar(true,100,500,20, true);
        System.out.println(guitar);
        System.out.println("Price with discont: "+guitar.appyEmplyeeDiscount());
    }
}
