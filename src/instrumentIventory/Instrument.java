package instrumentIventory;

public class Instrument {
    private boolean onSale;
    private double price;
    private int numInStock;
    public Instrument(boolean onSale, double price, int numInStock){
        this.onSale = onSale;
        this.price = price;
        this.numInStock = numInStock;
    }
    public double getPrice(){
        if(onSale){
            return price -(price*0.15);
        }
        return price;
    }
    public double appyEmplyeeDiscount(){
        if(onSale){
            return price * 0.75;
        }
        else{
            return price;
        }

    }
    public void setOnSale(boolean onSale){
        this.onSale = onSale;
    }
    public boolean getOnSale() {
        return onSale;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getNumInStock(){
        return numInStock;
    }
    public void setNumInStock(int stock){
        numInStock = stock;
    }

}
