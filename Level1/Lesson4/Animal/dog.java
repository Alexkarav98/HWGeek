public class dog extends Animal{
    public boolean run(double run){
        return (run > 0 && run <= 600);
    }
    public boolean jump(double jump){
        return (jump > 0 && jump <= 0.5);
    }

    @Override
    public boolean swim(double swim) {
        return (swim > 0 && swim <= 10);
    }
}
