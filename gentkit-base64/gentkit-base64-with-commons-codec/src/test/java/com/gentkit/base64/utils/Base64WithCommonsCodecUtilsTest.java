package com.gentkit.base64.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Base64WithCommonsCodecUtilsTest {

    // -- byte[] decode(byte[])

    @DisplayName("decode")
    @Test
    public void decode() {
        byte[] value = Base64WithCommonsCodecUtils.decode(new byte[]{77, 84, 73, 122, 78, 68, 85, 50});

        assertArrayEquals(new byte[]{49, 50, 51, 52, 53, 54}, value);
    }

    // -- byte[] decodeFromString(String)

    @DisplayName("decodeFromString")
    @Test
    public void decodeFromString() {
        byte[] value = Base64WithCommonsCodecUtils.decodeFromString("MTIzNDU2");

        assertArrayEquals(new byte[]{49, 50, 51, 52, 53, 54}, value);
    }

    // -- byte[] encode(byte[])

    @DisplayName("encode")
    @Test
    public void encode() {
        byte[] value = Base64WithCommonsCodecUtils.encode("123456".getBytes(StandardCharsets.UTF_8));

        assertArrayEquals(new byte[]{77, 84, 73, 122, 78, 68, 85, 50}, value);
    }

    // -- encodeToStringString encodeToString(byte[])

    @DisplayName("encodeToString")
    @Test
    public void encodeToString() {
        String value = Base64WithCommonsCodecUtils.encodeToString("123456".getBytes(StandardCharsets.UTF_8));

        assertEquals("MTIzNDU2", value);
    }
}