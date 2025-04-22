package Pizza.Sauce;
import Pizza.MenuItem;
public class PizzaSauce implements MenuItem {
    public String toString() {
        return "Pizza Sauce";
    }
    public String toNiceString() {
		return "Sauce: " + this.toString() + " $" + this.getPrice() ;
	}
    @Override
    public Double getPrice(){
        return 2.5;
    }

}