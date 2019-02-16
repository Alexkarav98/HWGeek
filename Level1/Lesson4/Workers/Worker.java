import java.text.MessageFormat;

public class Worker {
    private String name;
    private String position;
    private String email;
    private String phone; //Можно было использовать long
    private double salary;
    private int age;
    Worker(String name,String position,String email,String phone,double salary,int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }//Это конструктор класса для работников
    public String workerInfo() {
        String image = "fullName: {0}, position: {1}, email: {2}, phone: {3}, salary: {4}, age: {5}";
        return MessageFormat.format(image, this.name, this.position, this.email, this.phone, this.salary, this.age);
    }
    public int getAge() {
        return age;
    }

} //Не увидел смысла в "сеттерак" т.к для задания нужны только геттеры
