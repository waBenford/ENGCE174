package javaLab5.lab5_12;
import java.util.Scanner;

class Service {
    protected String name;
    protected double basePrice;

    public Service(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double calculateFinalPrice() {
        return basePrice;
    }
}

class BasicService extends Service {
    public BasicService(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * 1.05;
    }
}

class PremiumService extends Service {
    protected double premiumRate;

    public PremiumService(String name, double basePrice, double premiumRate) {
        super(name, basePrice);
        this.premiumRate = premiumRate;
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * (1 + premiumRate);
    }
}

public class Lab5_12 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        System.out.println("BasicService");
        String basicName = getValue.nextLine();
        double basicPrice = Double.parseDouble(getValue.nextLine());
        BasicService bs = new BasicService(basicName, basicPrice);

        System.out.println("PremiumService");
        String premiumName = getValue.nextLine();
        double premiumPrice = Double.parseDouble(getValue.nextLine());
        double rate = Double.parseDouble(getValue.nextLine());
        PremiumService ps = new PremiumService(premiumName, premiumPrice, rate);

        Service[] services = {bs, ps};

        for (Service s : services) {
            System.out.println(s.calculateFinalPrice());
        }

        getValue.close();
    }
}