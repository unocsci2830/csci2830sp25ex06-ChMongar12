package Pizza.Topping;
public class ChickenTopping extends MeatTopping {
    @Override
    public String toString() {
        return "Chicken";
    }
    public Double getPrice(){
        return 2.5;
    }
}