package com.gentkit.string.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    // -- boolean isNotNull(String)

    @DisplayName("isNotNull_shouldReturnTrue_whenStringIsNotNull")
    @Test
    public void isNotNull_shouldReturnTrue_whenStringIsNotNull() {
        boolean value = StringUtils.isNotNull("test");

        assertTrue(value);
    }

    @DisplayName("isNotNull_shouldReturnTrue_whenStringIsBlank")
    @Test
    public void isNotNull_shouldReturnTrue_whenStringIsBlank() {
        boolean value = StringUtils.isNotNull("    ");

        assertTrue(value);
    }

    @DisplayName("isNotNull_shouldReturnFalse_whenStringIsNull")
    @Test
    public void isNotNull_shouldReturnFalse_whenStringIsNull() {
        boolean value = StringUtils.isNotNull(null);

        assertFalse(value);
    }

    // -- boolean isNull(String)

    @DisplayName("isNull_shouldReturnTrue_whenStringIsNull")
    @Test
    public void isNull_shouldReturnTrue_whenStringIsNull() {
        boolean value = StringUtils.isNull(null);

        assertTrue(value);
    }

    @DisplayName("isNull_shouldReturnFalse_whenStringIsNotNull")
    @Test
    public void isNull_shouldReturnFalse_whenStringIsNotNull() {
        boolean value = StringUtils.isNull("test");

        assertFalse(value);
    }

    @DisplayName("isNull_shouldReturnFalse_whenStringIsBlank")
    @Test
    public void isNull_shouldReturnFalse_whenStringIsBlank() {
        boolean value = StringUtils.isNull("    ");

        assertFalse(value);
    }

    // -- boolean isNotEmpty(String)

    @DisplayName("isNotEmpty_shouldReturnTrue_whenStringIsNotEmpty")
    @Test
    public void isNotEmpty_shouldReturnTrue_whenStringIsNotEmpty() {
        boolean value = StringUtils.isNotEmpty("test");

        assertTrue(value);
    }

    @DisplayName("isNotEmpty_shouldReturnTrue_whenStringIsBlank")
    @Test
    public void isNotEmpty_shouldReturnTrue_whenStringIsBlank() {
        boolean value = StringUtils.isNotEmpty("    ");

        assertTrue(value);
    }

    @DisplayName("isNotEmpty_shouldReturnFalse_whenStringIsNull")
    @Test
    public void isNotEmpty_shouldReturnFalse_whenStringIsNull() {
        boolean value = StringUtils.isNotEmpty(null);

        assertFalse(value);
    }

    @DisplayName("isNotEmpty_shouldReturnFalse_whenStringIsEmpty")
    @Test
    public void isNotEmpty_shouldReturnFalse_whenStringIsEmpty() {
        boolean value = StringUtils.isNotEmpty("");

        assertFalse(value);
    }

    // -- boolean isEmpty(String)

    @DisplayName("isEmpty_shouldReturnTrue_whenStringIsNull")
    @Test
    public void isEmpty_shouldReturnTrue_whenStringIsNull() {
        boolean value = StringUtils.isEmpty(null);

        assertTrue(value);
    }

    @DisplayName("isEmpty_shouldReturnTrue_whenStringIsEmpty")
    @Test
    public void isEmpty_shouldReturnTrue_whenStringIsEmpty() {
        boolean value = StringUtils.isEmpty("");

        assertTrue(value);
    }

    @DisplayName("isEmpty_shouldReturnFalse_whenStringIsBlank")
    @Test
    public void isEmpty_shouldReturnFalse_whenStringIsBlank() {
        boolean value = StringUtils.isEmpty("    ");

        assertFalse(value);
    }

    @DisplayName("isEmpty_shouldReturnFalse_whenStringIsNotEmpty")
    @Test
    public void isEmpty_shouldReturnFalse_whenStringIsNotEmpty() {
        boolean value = StringUtils.isEmpty("test");

        assertFalse(value);
    }

    // -- boolean isNotBlank(String)

    @DisplayName("isNotBlank_shouldReturnTrue_whenStringIsNotBlank")
    @Test
    public void isNotBlank_shouldReturnTrue_whenStringIsNotBlank() {
        boolean value = StringUtils.isNotBlank("test");

        assertTrue(value);
    }

    @DisplayName("isNotBlank_shouldReturnFalse_whenStringIsNull")
    @Test
    public void isNotBlank_shouldReturnFalse_whenStringIsNull() {
        boolean value = StringUtils.isNotBlank(null);

        assertFalse(value);
    }

    @DisplayName("isNotBlank_shouldReturnFalse_whenStringIsBlank")
    @Test
    public void isNotBlank_shouldReturnFalse_whenStringIsBlank() {
        boolean value = StringUtils.isNotBlank("    ");

        assertFalse(value);
    }

    // -- boolean isBlank(String)

    @DisplayName("isBlank_shouldReturnTrue_whenStringIsBlank")
    @Test
    public void isBlank_shouldReturnTrue_whenStringIsBlank() {
        boolean value = StringUtils.isBlank("    ");

        assertTrue(value);
    }

    @DisplayName("isBlank_shouldReturnTrue_whenStringIsNull")
    @Test
    public void isBlank_shouldReturnTrue_whenStringIsNull() {
        boolean value = StringUtils.isBlank(null);

        assertTrue(value);
    }

    @DisplayName("isBlank_shouldReturnFalse_whenStringIsNotBlank")
    @Test
    public void isBlank_shouldReturnFalse_whenStringIsNotBlank() {
        boolean value = StringUtils.isBlank("test");

        assertFalse(value);
    }

    // -- String strim(String, boolean)

    @DisplayName("strim_shouldNoTrim_whenArg0IsNullArg1IsTrue")
    @Test
    public void strim_shouldNoTrim_whenArg0IsNullArg1IsTrue() {
        String value = StringUtils.strim(null, true);

        assertNull(value);
    }

    @DisplayName("strim_shouldNoTrim_whenArg0IsNullArg1IsFalse")
    @Test
    public void strim_shouldNoTrim_whenArg0IsNullArg1IsFalse() {
        String value = StringUtils.strim(null, false);

        assertNull(value);
    }

    @DisplayName("strim_shouldTrimmed_whenArg0IsNotNullArg1IsTrue")
    @Test
    public void strim_shouldTrimmed_whenArg0IsNotNullArg1IsTrue() {
        String value = StringUtils.strim("  te  st ", true);

        assertEquals("te  st", value);
    }

    @DisplayName("strim_shouldNoTrim_whenArg0IsNotNullArg1IsFalse")
    @Test
    public void strim_shouldNoTrim_whenArg0IsNotNullArg1IsFalse() {
        String value = StringUtils.strim("  te  st ", false);

        assertEquals("  te  st ", value);
    }
}