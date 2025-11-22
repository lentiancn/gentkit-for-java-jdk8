package com.gentkit.color.utils;

import com.gentkit.exception.GlobalException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ColorHexUtilsTest {

    // -- String normalize(final String hexColor, final String defaultValue)

    @DisplayName("normalize_shouldReturnDefaultValue_whenHexColorIsNull")
    @Test
    public void normalize_shouldReturnDefaultValue_whenHexColorIsNull() {
        assertEquals("#666666", ColorHexUtils.normalize(null, "#666666"));
    }

    @DisplayName("normalize_shouldReturnHexColor_whenHexColorCorrectAndNotStartWithSharp")
    @Test
    public void normalize_shouldReturnHexColor_whenHexColorCorrectAndNotStartWithSharp() {
        assertEquals("#123456", ColorHexUtils.normalize("123456", "#666666"));
    }

    @DisplayName("normalize_shouldReturnDefaultValue_whenHexColorIncludeInvalidCharacters")
    @Test
    public void normalize_shouldReturnDefaultValue_whenHexColorIncludeInvalidCharacters() {
        assertEquals("#666666", ColorHexUtils.normalize("12345L", "#666666"));
    }

    @DisplayName("normalize_shouldReturnHexColor_whenHexColor3DigitFormat")
    @Test
    public void normalize_shouldReturnHexColor_whenHexColor3DigitFormat() {
        assertEquals("#112233", ColorHexUtils.normalize("#123", "#666666"));
    }

    @DisplayName("normalize_shouldReturnHexColor_whenHexColor4DigitFormat")
    @Test
    public void normalize_shouldReturnHexColor_whenHexColor4DigitFormat() {
        assertEquals("#112233", ColorHexUtils.normalize("#1234", "#666666"));
    }

    @DisplayName("normalize_shouldReturnDefaultValue_whenHexColor5DigitFormat")
    @Test
    public void normalize_shouldReturnDefaultValue_whenHexColor5DigitFormat() {
        assertEquals("#666666", ColorHexUtils.normalize("#12345", "#666666"));
    }

    @DisplayName("normalize_shouldReturnHexColor_whenHexColor6DigitFormat")
    @Test
    public void normalize_shouldReturnHexColor_whenHexColor6DigitFormat() {
        assertEquals("#123456", ColorHexUtils.normalize("#123456", "#666666"));
    }

    @DisplayName("normalize_shouldReturnDefaultValue_whenHexColorOtherDigitFormat")
    @Test
    public void normalize_shouldReturnDefaultValue_whenHexColorOtherDigitFormat() {
        assertEquals("#666666", ColorHexUtils.normalize("#1234567", "#666666"));
    }

    // -- String normalize(final String hexColor)

    @DisplayName("normalize_shouldReturnHexColor_whenHexColorNormal")
    @Test
    public void normalize_shouldReturnHexColor_whenHexColorNormal() {
        assertEquals("#123456", ColorHexUtils.normalize("#123456"));
    }

    @DisplayName("normalize_shouldThrowException_whenHexColorIsBlank")
    @Test
    public void normalize_shouldThrowException_whenHexColorIsBlank() {
        assertThrows(GlobalException.class, () -> ColorHexUtils.normalize(""));
    }
}