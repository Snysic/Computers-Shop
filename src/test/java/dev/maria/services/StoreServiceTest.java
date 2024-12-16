package dev.maria.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StoreServiceTest {
    StoreService service;

    @BeforeEach
    void setUp() {
        service = new StoreService("1", "Olena", "123456789");
        service.addComputerToStore("Lenovo", 16, "Intel Core i7", "Windows 11", 999.99);
        service.addComputerToStore("Apple", 8, "M1", "macOS", 1299.99);
    }

    @Test
    void testAddComputerToStore() {
        service.addComputerToStore("HP", 8, "Intel Core i5", "Windows 11", 699.99);
        assertNotNull(service.findComputerByBrand("HP"));
    }

    @Test
    void testFindComputerByBrand() {
        assertEquals("Lenovo", service.findComputerByBrand("Lenovo").getBrand());
    }

    @Test
    void testListAllComputers() {
        String expected = "Lenovo, 16 GB, Intel Core i7, Windows 11, $999.99\n" + "Apple, 8 GB, M1, macOS, $1299.99\n";
        assertEquals(expected, service.listAllComputers());
    }

    @Test
    void testRemoveComputerByBrand() {
        assertTrue(service.removeComputerByBrand("Lenovo"));
        assertNull(service.findComputerByBrand("Lenovo"));
        assertFalse(service.listAllComputers().contains("Lenovo, 16 GB, Intel Core i7, Windows 11, $999.99\n"));
    }
}
