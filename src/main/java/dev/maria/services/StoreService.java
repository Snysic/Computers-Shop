package dev.maria.services;

import dev.maria.models.Computer;
import dev.maria.models.Store;

public class StoreService {
    private Store store;

    public StoreService(String storeNumber, String storeOwner, String storeTaxIdentifier) {
        this.store = new Store(storeNumber, storeOwner, storeTaxIdentifier);
    }

    public void addComputerToStore(String brand, int memoryCapacity, String processorFeatures, String operatingSystem, double price) {
        Computer newComputer = new Computer(brand, memoryCapacity, processorFeatures, operatingSystem, price);
        store.addComputer(newComputer);
    }

    public boolean removeComputerByBrand(String brand) {
        int initialSize = store.getAllComputers().size();
        store.removeComputerByBrand(brand);
        int finalSize = store.getAllComputers().size();
        return initialSize > finalSize;
    }

    public Computer findComputerByBrand(String brand) {
        return store.findComputerByBrand(brand);
    }

    public String listAllComputers() {
        StringBuilder builder = new StringBuilder();
        for (Computer computer : store.getAllComputers()) {
            builder.append(computer.getBrand())
                .append(", ")
                .append(computer.getMemoryCapacity())
                .append(" GB, ")
                .append(computer.getProcessorFeatures())
                .append(", ")
                .append(computer.getOperatingSystem())
                .append(", $")
                .append(computer.getPrice())
                .append("\n");
        }
        return builder.toString();
    }
}
