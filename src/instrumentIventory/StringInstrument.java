package instrumentIventory;

public class StringInstrument extends Instrument{
    private  int numStrings;
    //constructor
    public StringInstrument(boolean onSale, double price, int numInStock, int numStrings) {
        super(onSale, price, numInStock);
        this.numStrings = numStrings;
    }

    //method get
    public int getNumString(){
        return numStrings;
    }
    //method set
    public void setNumString(int numString){
        this.numStrings = numString;
    }
}
