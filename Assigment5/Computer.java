package Assigment5;

import java.util.Objects;

public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }
    public int getRamSize(){
        return ramSize;
    }
    public double getProcessorSpeed(){
        return processorSpeed;
    }
    public double computerPower(){
        return ramSize*processorSpeed;
    }
    @Override
    public String toString(){
        return "Computer{"+
                "manufacturer = "+manufacturer+
                ",processor ="+processorSpeed+
                ",ramSize ="+ramSize+
                ",processorSpeed ="+processorSpeed+
                "}";

    }
    @Override
    public boolean equals(Object o) {
        if (this == null) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ramSize== computer.ramSize && processorSpeed == computer.processorSpeed && manufacturer.equals(computer.manufacturer)&&processor.equals(computer.processor);
    }
    @Override
    public int hashCode(){
        return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer("Dell", "Intel i5", 16, 3.5);
        Computer computer2 = new Computer("Dell", "Intel i5", 16, 3.5);
        Computer computer3 = new Computer("HP", "AMD Ryzen 5", 8, 3.7);
        System.out.println("Computer1 and Computer2 are equal: " + computer1.equals(computer2));
        System.out.println("Computer1 and Computer3 are equal: " + computer1.equals(computer3));
        System.out.println("Computer1 hashCode: " + computer1.hashCode());
        System.out.println("Computer2 hashCode: " + computer2.hashCode());
        System.out.println("Computer3 hashCode: " + computer3.hashCode());
        System.out.println("Computer1 and Computer2 hashCodes are equal: " + (computer1.hashCode() == computer2.hashCode()));
        System.out.println("Computer1 and Computer3 hashCodes are equal: " + (computer1.hashCode() == computer3.hashCode()));
    }

    }

