package dev.maria.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Store {
    private String storeNumber;
    private String storeOwner;
    private String storeTaxIdentifier;
    private List<Computer> computers;

    public String getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(String storeNumber) {
        this.storeNumber = storeNumber;
    }

    public String getStoreOwner() {
        return storeOwner;
    }

    public void setStoreOwner(String storeOwner) {
        this.storeOwner = storeOwner;
    }

    public String getStoreTaxIdentifier() {
        return storeTaxIdentifier;
    }

    public void setStoreTaxIdentifier(String storeTaxIdentifier) {
        this.storeTaxIdentifier = storeTaxIdentifier;
    }

    public Store(String storeNumber, String storeOwner, String storeTaxIdentifier) {
        this.storeNumber = storeNumber;
        this.storeOwner = storeOwner;
        this.storeTaxIdentifier = storeTaxIdentifier;
        this.computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputerByBrand(String brand) {
        computers = computers.stream().filter(computer -> !computer.getBrand().equalsIgnoreCase(brand))
        .collect(Collectors.toList());
    }

    public Computer findComputerByBrand(String brand) {
        return computers.stream()
                .filter(computer -> computer.getBrand().equalsIgnoreCase(brand))
                .findFirst()
                .orElse(null);
    }

    public List<Computer> getAllComputers() {
        return new ArrayList<>(computers);
    }
}
