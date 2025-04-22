package Pizza.Crust;

import Pizza.MenuItem;

public abstract class PizzaCrust implements MenuItem {
    protected String ingredient;
    protected  boolean isdeepsdish;
    public abstract String toString(); 

	public String toNiceString() {
		return "Crust: " + this.toString() + " $" + this.getPrice();
	}
	
	public String getIngredient() {
		return this.ingredient;
	}
	
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
    public String checkIntegrity(){
        return "";
    }
    public void setIsDeepDish(boolean isdeepsdish){
        this.isdeepsdish = isdeepsdish;
    }
    public Double getPrice(){
        return 1.50;
    }
}