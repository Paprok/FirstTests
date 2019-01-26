package com.codecool.krk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void testNameIsNotNull() {
        Person jon = new Person("John", 30);
        assertNotNull(jon.getName());
    }

    @Test
    public void testAgeBelow0ThrowsException() {
        Person john = new Person();
        assertThrows(IllegalArgumentException.class, () -> {
            john.setAge(-10);
        });
    }
}