package Pizza.Crust;

public class ThinCrust extends PizzaCrust {
    @Override
    public String toString() {
        return "Thin Crust";
    }
    public Double getPrice(){
        return 1.0;
    }
}