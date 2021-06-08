
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int priceOne = this.squares * this.pricePerSquare;
        int priceTwo = compared.squares * compared.pricePerSquare;
        if (priceOne > priceTwo) {
            return priceOne - priceTwo;
        }
        return priceTwo - priceOne;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int priceOne = this.squares * this.pricePerSquare;
        int priceTwo = compared.squares * compared.pricePerSquare;
        if (priceOne > priceTwo) {
            return true;
        }
        return false;
    }

}
