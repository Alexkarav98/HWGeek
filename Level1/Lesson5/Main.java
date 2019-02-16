public class Main {
    public static void main(String[] args) {
        Cat [] arrCats = new Cat[5];
        arrCats[0] = new Cat("Barsik",10);
        arrCats[1] = new Cat("Dusik",5);
        arrCats[2] = new Cat("Bob",7);
        arrCats[3] = new Cat("Shiva",15);
        arrCats[4] = new Cat("Amely",10);

        Plate plate = new Plate(30);

        for (Cat cat : arrCats){
            cat.eat(plate);
            cat.info();

        /*    if (plate.decreaseFood(15)){
                plate.addFood(30);                  //Это если мы хотим накормит всех котиков и что бы они были сыты и
                                                     постоянно подкдадываем котику еду
            }*/
        }
        plate.addFood(30);                             // Здесь мы просто добавляем еду что бы котики могли потом покушать
        plate.info();
    }
}
