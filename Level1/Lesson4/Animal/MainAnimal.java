public class MainAnimal {
    public static void main(String[] args) {
        Animal joe = new DogBig();
        Animal vaska = new DogSmall();
        Animal pusik = new cat();
        System.out.println("Большая собака Джо может плавать на 7 метров и бегать на 500" + " "
                +joe.swim(7)+" "+joe.run(500));
        System.out.println("Меленькая собака Васька может плавать на 7 метров и бегать на 500" + " "
                +vaska.swim(7)+" "+vaska.run(500));
        System.out.println("Кот пусик может плавать на 7 метров и бегать на 150 и прыгать на 2 метра" + " "
                +pusik.swim(2)+" "+pusik.run(150) +" "+ pusik.jump(2));
    }
}
