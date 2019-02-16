public class Main {
    static final int WorkerArraySize = 5;
    static final int AgeLimit = 40;

    public static void main(String[] args) {
        Worker [] workers=new Worker[WorkerArraySize];
        workers[0] = new Worker("Василий Грюм","Администратор зала","Отсутсвует",
                "89162316854", 80000, 42);
        workers[1] = new Worker("Геша Иванов","Официант","Geshakros@gmail.com",
                "8924703286", 30000,21);
        workers[2] = new Worker("Антон Бирюков","Доставщик пиццы","Resistancetop1@yandex.ru",
                "897654302",25000,24);
        workers[3] = new Worker("Галактион Иванов","Бармен", "lgbtbest@gmail.com",
                "89008889922",65000,23);
        workers[4] = new Worker("Денис Мишкин","ОФициант","DenPBY@mail.ru",
              "87032326480",34000, 22);
        for (Worker worker : workers){
            if (worker.getAge()> AgeLimit){
                System.out.println("Сотрудник старше" + " " + AgeLimit+" "+worker.workerInfo());
            }
            else {
                System.out.println("Сотрудник младше" + " "+AgeLimit+" "+worker.workerInfo());
            }
        }
    }
}
