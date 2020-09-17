package com.company;

public class Hand {
    int fingers;
    String RightOrLeft;

    Hand(String side){
        fingers = 5;
       RightOrLeft = side;
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

    @Override
    public String toString() {
        return ("   " + getSide() + " hand - " + getFingers() + " fingers");
    }
}
