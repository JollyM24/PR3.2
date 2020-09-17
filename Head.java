package com.company;

public class Head {
    int age;
    String gender;
    int iq;
    String hair;

    Head(int age, String gender, int iq, String hair){
        setAge(age);
        setGender(gender);
        setIQ(iq);
        setHair(hair);
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }

    public void setIQ(int iq){
        this.iq=iq;
    }
    public int getIQ(){
        return iq;
    }

    public void setHair(String hair){
        this.hair=hair;
    }
    public String getHair(){
        return hair;
    }

    @Override
    public String toString() {
        return ("   Head - age: " + getAge() + "; gender: " + getGender() + "; IQ: " + getIQ()
        + "; hair: " + getHair());
    }
}
