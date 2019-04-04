import java.util.ArrayList;
import java.util.List;

public class Box<E extends Fruit> {
    private List<E> fruits = new ArrayList<>();

    public void add(E fruit){
        fruits.add(fruit);
    }
    public void moveAll(Box<E> anotherbox){
        for (E fruit: fruits){
            anotherbox.add(fruit);
        }
        fruits.clear();
    }
    public boolean compareTo(Box<?> anotherbox){
        return Math.abs(this.getWeght() - anotherbox.getWeght()) < 0.0001;
    }
    public double getWeght(){
        double sum = 0.0;
        for (E fruit: fruits){
            sum += fruit.getWeight();
        }
        return sum;
    }
}
