package javaLab5.lab5_10;
import java.util.Scanner;

class ProjectTask {
    protected String description;
    protected int baseHours;

    public ProjectTask(String description, int baseHours) {
        this.description = description;
        this.baseHours = baseHours;
    }

    public double calculateCost() {
        return baseHours * 50.0;
    }
}

class ComplexTask extends ProjectTask {
    protected double setupFee;

    public ComplexTask(String description, int baseHours, double setupFee) {
        super(description, baseHours);
        this.setupFee = setupFee;
    }

    @Override
    public double calculateCost() {
        return (super.calculateCost() * 1.10) + setupFee;
    }
}

class SimpleTask extends ProjectTask {
    public SimpleTask(String description, int baseHours) {
        super(description, baseHours);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost();
    }
}

public class Lab5_10 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        System.out.println( "ComplexTask." );
        String complexDesc = getValue.nextLine();
        int complexHours = Integer.parseInt(getValue.nextLine());
        double complexFee = Double.parseDouble(getValue.nextLine());

        System.out.println( "SimpleTask." );
        String simpleDesc = getValue.nextLine();
        int simpleHours = Integer.parseInt(getValue.nextLine());

        ComplexTask ct = new ComplexTask(complexDesc, complexHours, complexFee);
        SimpleTask st = new SimpleTask(simpleDesc, simpleHours);

        ProjectTask[] tasks = {ct, st};

        for (ProjectTask task : tasks) {
            System.out.println(task.calculateCost());
        }
        
        getValue.close();
    }
}