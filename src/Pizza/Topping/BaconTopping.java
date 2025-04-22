package Pizza.Topping;

public class BaconTopping extends MeatTopping {
    @Override
    public String toString() {
        return "Bacon";
    }
    public Double getPrice(){
        return 1.50;
    }
}