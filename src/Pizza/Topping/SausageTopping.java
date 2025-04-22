package Pizza.Topping;
public class SausageTopping extends MeatTopping {
    @Override
    public String toString() {
        return "Sausage";
    }
    public Double getPrice(){
        return 2.5;
    }
}