public class ThickCrust extends PizzaCrust {
    private boolean isDeepDish;
    @Override
    public String toString() {
        return "Thick Crust("+this.ingredient+")";
    }
    public String toNiceString() {
        return "Thick Crust";
    }

    public Boolean getisDeepdich(){
        return this.isDeepDish;
    }
    public void setIsDeepDish(boolean isDeepDish){
        this.isDeepDish = isDeepDish;
    }
    @Override
    public String checkIntegrity(){
        return this.ingredient.equalsIgnoreCase("Cauliflower")? 
                    "Handle carefully: crust might fall apart": 
                    super.checkIntegrity();
    }
    public Double getPrice(){
        return 2.5;
    }



}