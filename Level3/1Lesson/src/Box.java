import java.util.ArrayList;

public class Box <T extends Friut> {

    //Не стал в main прописывать всё
    private ArrayList<T> box = new ArrayList<>();
    public Box(){
    }
    public float getWeight(){
        float weight = 0f;
        for (T o : box){
            weight += o.getweight();
        }
        return weight;
    }
    public boolean compare(Box anotherBox){
        if (getWeight()== anotherBox.getWeight())
            return true;
        return false;
    }
    public void shiftIn(Box<T> anotherBox){
        anotherBox.box.addAll(box);
        box.clear();
    }
    public void addFruit(T fruit, int amount){
        for (int i = 0;i < amount;i++)
            box.add(fruit);
    }
}

