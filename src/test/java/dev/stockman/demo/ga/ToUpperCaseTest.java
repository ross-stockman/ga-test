package dev.stockman.demo.ga;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToUpperCaseTest {

    private final ToUpperCase sut = new ToUpperCase();

    @Test
    void testNull() {
        Assertions.assertThrows(NullPointerException.class, () -> sut.toUpper(null));
        String str = null;
        Assertions.assertThrows(NullPointerException.class, () -> sut.toUpper(str));
    }

    @Test
    void testToUpper() {
        Assertions.assertEquals("TEST", sut.toUpper("TEST"));
        Assertions.assertEquals("TEST", sut.toUpper("test"));
        Assertions.assertEquals("TEST", sut.toUpper("TesT"));
    }
}
