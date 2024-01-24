package instrumentIventory;

public class Guitar extends StringInstrument{
    private boolean isElectric;
    //constructor
    public Guitar(boolean onSale, double price, int numInStock, int numString, boolean isElectric) {
        super(onSale, price, numInStock, numString);
        this.isElectric = isElectric;

    }

    public boolean getIsElectric(){
        return isElectric;}
    public String toString(){
        String aux="";
        aux += "Num Stock: "+this.getNumInStock()
        +"\nNum Strings: "+ this.getNumString()
        +"\nPrice: " + this.getPrice()
        +"\nOn Sale: "+ this.getOnSale()
        +"\nIs eletric: "+ this.getIsElectric();

        return aux;
    }
}
