package main;

import jdk.internal.access.JavaLangInvokeAccess;

import java.time.LocalDate;

public class Animal {
    public void Swim() {
        if(getType() != null) {
            if(getType().equals("Fish"))
                System.out.println(getNickname()+" плывет");
            else System.out.println(getNickname()+" наблюдает");
        }
    }
    public void ToGo() {
        if(getType() != null) {
            if(getType().equals("Cat"))
                System.out.println(getNickname()+" бежить");
            else System.out.println(getNickname()+" наблюдает");
        }
    }
    public void Fly() {
        if(getType() != null) {
            if(getType().equals("Eagle"))
                System.out.println(getNickname()+" полетел");
            else System.out.println(getNickname()+" наблюдает");
        }
    }

    protected String nickname;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    public Animal(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickname = nickname;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Animal(){this("Хозяйн",new Owner("Хозяйн"),LocalDate.now(),new Illness("Болезн"));}

    public String getNickname() {return nickname;}

    public Owner getOwner() {return owner;}

    public LocalDate getBirthDate() {return birthDate;}

    public Illness getIllness() {return illness;}

    public void setIllness(Illness illness) {this.illness = illness;}

    private void wakeUp() {System.out.println("Wake Up");}

    private void wakeUp(String time) {System.out.println("Wake Up " + time);}

    private void hunt() {System.out.println("hunter");}

    private void eat() {System.out.println("Eat");}

    private void sleep() {System.out.println("Sleep");}

    public void lifeCycle() {wakeUp("12:00");eat();sleep();hunt();}

    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {return  String.format("nickName = %s, bd = %s, owner = %s, illness = %s", nickname, birthDate, owner, illness);}
}

