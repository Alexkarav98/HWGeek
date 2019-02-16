public class DogSmall extends dog {
    public boolean swim(double swim) {
        return (swim > 0 && swim <= 5);
    }
    public boolean run(double run){
        return (run > 200 && run <= 400);
    }
}
