package ru.geekbrains.classes;



import ru.geekbrains.classes.animals.*;
import ru.geekbrains.classes.obstacles.Course;
import ru.geekbrains.classes.obstacles.Cross;
import ru.geekbrains.classes.obstacles.Wall;
import ru.geekbrains.classes.obstacles.Water;

public class Main {
    public static void main(String[] args) {
        Course c= new Course(new Cross(200),new Wall(20),new Water(150));
        Team team1 = new Team("Team Virtus pro",
                new Member("Solo",200,20,3000),
                new Member("No[o]ne",100,10,2000),
                new Member("Ramzess",150,5,3000),
                new Member("9Pasha",100,200,1500));
        Team team2 = new Team("Team Navi",
                new Member("Dendy",200,20,3000),
                new Member("Lil",100,10,2000),
                new Member("velheor",150,5,3000),
                new Member("GeneRal",100,200,1000));
        c.doIt(team1);
        c.doIt(team2);
        System.out.println(" RESULTS");
        team1.showResults();
        System.out.println();
        team2.showResults();

    }
}
