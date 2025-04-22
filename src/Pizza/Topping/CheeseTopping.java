
package Pizza.Topping;
public class CheeseTopping extends PizzaTopping {
    @Override
    public String toString() {
        return "Cheese Topping";
    }
    public Double getPrice(){
        return 2.5;
    }
}