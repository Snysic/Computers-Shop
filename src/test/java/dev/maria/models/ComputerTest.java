package dev.maria.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComputerTest {
    private Computer computer;

    @BeforeEach
    void setUp() {
        computer = new Computer("Lenovo", 16, "Intel Core i7", "Windows 11", 999.99);
    }
    @Test
    void testComputerConstructorAndGetters() {
        assertEquals("Lenovo", computer.getBrand());
        assertEquals(16, computer.getMemoryCapacity());
        assertEquals("Intel Core i7", computer.getProcessorFeatures());
        assertEquals("Windows 11", computer.getOperatingSystem());
        assertEquals(999.99, computer.getPrice());
    }


    @Test
    void testSetBrand() {
        computer.setBrand("Apple");
        assertEquals("Apple", computer.getBrand());
    }

    @Test
    void testSetMemoryCapacity() {
        computer.setMemoryCapacity(8);
        assertEquals(8, computer.getMemoryCapacity());
    }

    @Test
    void testSetOperatingSystem() {
        computer.setOperatingSystem("macOS");
        assertEquals("macOS", computer.getOperatingSystem());
    }

    @Test
    void testSetPrice() {
        computer.setPrice(1299.99);
        assertEquals(1299.99, computer.getPrice());
    }

    @Test
    void testSetProcessorFeatures() {
        computer.setProcessorFeatures("M1");
        assertEquals("M1", computer.getProcessorFeatures());
    }
}
