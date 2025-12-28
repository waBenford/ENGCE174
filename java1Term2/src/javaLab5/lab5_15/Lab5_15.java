package javaLab5.lab5_15;
import java.util.Scanner;

class RentalVehicle {
    protected String model;
    protected double rentalRate;

    public RentalVehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

class Car extends RentalVehicle {
    public Car(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate + 100.0;
    }
}

class Motorcycle extends RentalVehicle {
    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
    }
}

public class Lab5_15 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        System.out.println("Car Info");
        String carModel = getValue.nextLine();
        double carRate = Double.parseDouble(getValue.nextLine());
        Car car = new Car(carModel, carRate);

        System.out.println("Motorcycle Info");
        String motoModel = getValue.nextLine();
        double motoRate = Double.parseDouble(getValue.nextLine());
        Motorcycle moto = new Motorcycle(motoModel, motoRate);

        RentalVehicle[] vehicles = {car, moto};

        double totalRentalFee = 0;
        for (RentalVehicle v : vehicles) {
            totalRentalFee += v.calculateFee();
        }

        System.out.println(totalRentalFee);

        getValue.close();
    }
}