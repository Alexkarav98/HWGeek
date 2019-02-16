package ru.geekbrains.classes.animals;


public class Team implements Info {

    private Participant []members;
    private String teamName;

    public Team(String teamName, Participant... members) {
        this.teamName = teamName;
        this.members= members;
    }

    public Participant[] getMembers() {
        return members;
    }

    public String toString() {
        String result =  "Название комманды: \"" + teamName + "\"\n\n" +
                "Члены комманды: \n" ;
        for (Participant i : members){
            result += i.toString() + "\n";
        }
        return result;
    }

    @Override
    public void showResults() {
        System.out.println("Список членов комманды \"" + teamName +
                "\", прошедших дистанцию:\n");
        for(Participant member: members){
            if (member.isOnDistance()) {
                System.out.println(member);
            }
        }
    }

    @Override
    public void showTeam() {
        System.out.println(this);
    }
}
