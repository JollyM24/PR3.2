package com.company;
import java.util.*;

public class Circle {
    int r;
    String name;
    public Circle(String name, int r){
        this.name=name;
        this.r=r;
    }

    public void setRadius(int r){
        r=this.r;
    }

    public int getRadius(){
        return r;
    }

    public String getName(){
        return name;
    }

    public int getDiameter(){
        return r*2;
    }

    public double getArea(){
        return Math.PI * Math.pow(r, 2);
    }

    public String toString(){
        return (getName() + ": radius = " + getRadius() + "; area = " + (float)getArea() + ";");
    }

    public static void main(String[] args){
        System.out.println("      Задание №1");
        System.out.print("Введите значение  окружности: ");
        Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();
        Circle circle1 = new Circle("circle1", radius);
        Circle circle2 = new Circle("circle2", 4);
        Circle circle3 = new Circle("circle3", 4 * radius);

        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(circle3.toString());
    }
}
