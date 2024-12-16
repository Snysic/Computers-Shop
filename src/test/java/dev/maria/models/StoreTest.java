package dev.maria.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StoreTest {
    private Store store;

    @BeforeEach
    void setUp() {
        store = new Store("1", "Maria", "123456789");
    }

    @Test
    void testSetAndGetStoreNumber() {
        store.setStoreNumber("2");
        assertEquals("2", store.getStoreNumber());
    }

    @Test
    void testSetAndGetStoreOwner() {
        store.setStoreOwner("Inga");
        assertEquals("Inga", store.getStoreOwner());
    }

    @Test
    void testSetAndGetStoreTaxIdentifier() {
        store.setStoreTaxIdentifier("987654321");
        assertEquals("987654321", store.getStoreTaxIdentifier());
    }

    @Test
    void testInitialValuesInConstructor() {
        assertEquals("1", store.getStoreNumber());
        assertEquals("Maria", store.getStoreOwner());
        assertEquals("123456789", store.getStoreTaxIdentifier());
    }
}

