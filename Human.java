package com.company;

public class Human {
    String Hname;
    int age;
    String gender;
    int iq;
    String hair;
    private Hand hand_Left;
    private Hand hand_Right;
    private Leg leg_Left;
    private Leg leg_Right;
    private Head head;

    Human(String Hname, int age, String gender, int iq, String hair, int size){
        setHname(Hname);
        hand_Right = new Hand("Right");
        hand_Left = new Hand("Left");
        leg_Right = new Leg("Right", size);
        leg_Left = new Leg("Left", size);
        head = new Head(age, gender, iq, hair);
    }


    public void setHname(String Hname){
        this.Hname=Hname;
    }

    public String getHname(){
        return Hname;
    }

    @Override
    public String toString() {
        return ("Human: " + getHname() + "\n" + head.toString() + ";\n" + hand_Right.toString() + ";\n" + hand_Left.toString()
        + "; \n" + leg_Right.toString() + ";\n" + leg_Left.toString());
    }

    public static void main(String[] args) {
        Human human1 = new Human("Bob", 19, "male", 130, "blonde", 42);
        Human human2 = new Human("Betty", 22, "female", 120, "black", 38);
        Human human3 = new Human("Robert", 15, "male", 95, "brown", 37);
        Human human4 = new Human("Rebeca", 17, "female", 107, "blonde", 36);

        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
    }
}
