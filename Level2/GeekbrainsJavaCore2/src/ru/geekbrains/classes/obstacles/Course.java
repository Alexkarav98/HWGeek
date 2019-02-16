package ru.geekbrains.classes.obstacles;


import ru.geekbrains.classes.animals.Participant;
import ru.geekbrains.classes.animals.Team;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles){
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        for (Participant c : team.getMembers()){
            for (Obstacle o : obstacles){
                o.doIt(c);
                if ( c.isOnDistance());
            }
        }
    }

}
