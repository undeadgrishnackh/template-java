package org.undeadgrishnackh.kata.dummy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DummyTest {
    @Test
    @DisplayName("Should create a dummy object - ✅")
    void shouldCreateADummyObject() {
        Dummy dummy = new Dummy("Test Name");
        Assertions.assertNotNull(dummy);
        Assertions.assertEquals(dummy.getName(), "Test Name");
    }
}