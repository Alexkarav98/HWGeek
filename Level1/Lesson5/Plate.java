public class Plate {
    private int food;
    Plate(int food){
        this.food = food;
    }
    boolean decreaseFood(int x){
        int diff = food - x;
        if (diff < 0)
            return false;
        food -= x;
        return true;
    }
    void addFood(int food){
        this.food = food;
    }
    void info(){
        System.out.println("plate:" + food);
    }
}
