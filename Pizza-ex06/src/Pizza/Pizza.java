import java.util.ArrayList;

public class Pizza implements MenuItem {
	private PizzaCrust crust;
	private PizzaSauce sauce;
	private ArrayList<PizzaTopping> Toppings;
	private ArrayList<MenuItem> selectionList;
	public Pizza() {
		this.crust = null;
		this.sauce = null;
		this.Toppings = new ArrayList<PizzaTopping>();
		this.selectionList= new ArrayList<MenuItem>();
	}
    public PizzaSauce getSauce() {
		return this.sauce;
	}
	public void setSauce(PizzaSauce sauce) {
		this.sauce = sauce;
		this.selectionList.add(sauce);
		
	}
	public PizzaCrust getCrust() {
		return this.crust;
	}
	public void setCrust(PizzaCrust crust) {
		this.crust = crust;
		this.selectionList.add(crust);
	}
	public ArrayList<PizzaTopping> getTopping() {
		return this.Toppings;
	}
	public void setToppings(ArrayList<PizzaTopping> Toppings) {
		this.Toppings = Toppings;
	}
	
	public void addTopping(PizzaTopping topping) {
		this.Toppings.add(topping);
		this.selectionList.add(topping);
	}
	
	public void display() {
		System.out.println("Pizza: $" + this.getPrice());
		System.out.println("    " + this.crust.toNiceString());
		System.out.println("    " + this.sauce.toString());
		for (PizzaTopping t : this.Toppings) {
			System.out.println("    " + t.toNiceString());
		}
	}
	
	

	@Override
	public Double getPrice() {
		Double totalPrice = 0.0;
		for (MenuItem m : this.selectionList) {
			totalPrice += m.getPrice();
		}
		return totalPrice;
	}
}



