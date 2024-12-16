package dev.maria.models;

public class Computer {
    private String brand;
    private int memoryCapacity;
    private String processorFeatures;
    private String operatingSystem;
    private double price;

    public Computer(String brand, int memoryCapacity, String processorFeatures, String operatingSystem, double price) {
        this.brand = brand;
        this.memoryCapacity = memoryCapacity;
        this.processorFeatures = processorFeatures;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public String getProcessorFeatures() {
        return processorFeatures;
    }

    public void setProcessorFeatures(String processorFeatures) {
        this.processorFeatures = processorFeatures;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
}
