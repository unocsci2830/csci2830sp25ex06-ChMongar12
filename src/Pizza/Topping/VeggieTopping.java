package Pizza.Topping;
public class VeggieTopping extends PizzaTopping {
    @Override
    public String toString() {
        return "Veggie Topping";
    }
    public Double getPrice(){
        return 2.5;
    }
}