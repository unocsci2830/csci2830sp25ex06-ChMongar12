package Pizza;



public interface MenuItem  extends Comparable<MenuItem>{
    public Double getPrice();

    public default int compareTo(MenuItem otheritems){
        return(this.getPrice()> otheritems.getPrice())?
                1:
                ((this.getPrice() == otheritems.getPrice())?
                 0:
                    -1);
    }
    public String toNiceString();
}
