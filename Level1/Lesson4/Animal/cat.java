public class cat extends Animal {
    public boolean run(double run){
        return (run > 0 && run <= 200);
    }
    public boolean jump(double jump){
        return (jump > 0 && jump <= 2);
    }
    public boolean swim(double swim){
        return false;
    }

}
