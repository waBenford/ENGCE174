package javaLab5.lab5_14;
import java.util.Scanner;

class Shipping {
    protected String trackingId;
    protected double baseFee;

    public Shipping(String id, double baseFee) {
        this.trackingId = id;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee() {
        return baseFee;
    }
}

class StandardShipping extends Shipping {
    public StandardShipping(String id, double baseFee) {
        super(id, baseFee);
    }

    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String id, double baseFee, double insuranceFee) {
        super(id, baseFee);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        return super.calculateTotalFee() + insuranceFee;
    }
}

public class Lab5_14 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        System.out.println("StandardShipping");
        String sId = getValue.nextLine();
        double sFee = Double.parseDouble(getValue.nextLine());
        StandardShipping ss = new StandardShipping(sId, sFee);

        System.out.println("PremiumShipping");
        String pId = getValue.nextLine();
        double pFee = Double.parseDouble(getValue.nextLine());
        double pInsurance = Double.parseDouble(getValue.nextLine());
        PremiumShipping ps = new PremiumShipping(pId, pFee, pInsurance);

        Shipping[] shipments = {ss, ps};

        for (Shipping s : shipments) {
            System.out.println(s.calculateTotalFee());
        }

        getValue.close();
    }
}