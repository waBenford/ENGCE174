package javaLab2.lab2_11;
import java.util.Scanner;

public class Lab2_11 {

    public static void main(String[] args) {
        Scanner getValue = new Scanner( System.in );
        
        System.out.print("Model: ");
        String model = getValue.nextLine();
        
        System.out.print("Year (Current): ");
        int yearCurrent = getValue.nextInt();
        getValue.nextLine(); 

        Car car = new Car(model, yearCurrent);
        
        System.out.print("Year (New): ");
        int yearNew = getValue.nextInt();
        getValue.nextLine();
        
        car.setYear(yearNew);
        
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());

        getValue.close();
    }
}

class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}