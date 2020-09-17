package com.company;

public class Leg {
    int fingers;
    String RightOrLeft;
    int size;

    Leg(String side, int size){
        fingers = 5;
        RightOrLeft = side;
        setSize(size);
    }

    public int getFingers(){
        return fingers;
    }

    public void setFingers(int fingers){
        this.fingers=fingers;
    }

    public String getSide(){
        return RightOrLeft;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size=size;
    }

    @Override
    public String toString() {
        return ("   " + getSide() + " leg - " + getFingers() + " fingers; size: " + getSize());
    }
}
