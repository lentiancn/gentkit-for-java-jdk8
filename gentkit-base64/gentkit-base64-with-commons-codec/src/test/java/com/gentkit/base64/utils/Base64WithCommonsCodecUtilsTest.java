package com.gentkit.base64.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

public class Base64WithCommonsCodecUtilsTest {

    // -- decode

    @DisplayName("decode")
    @Test
    public void decode() {
        byte[] value = Base64WithCommonsCodecUtils.decode("test".getBytes(StandardCharsets.UTF_8));

        System.out.println(value.length);
    }

    // -- decodeFromString

    @DisplayName("decodeFromString")
    @Test
    public void decodeFromString() {
        byte[] value = Base64WithCommonsCodecUtils.decodeFromString("test");

        System.out.println(value.length);
    }

    // -- encode

    @DisplayName("encode")
    @Test
    public void encode() {
        byte[] value = Base64WithCommonsCodecUtils.encode("test".getBytes(StandardCharsets.UTF_8));

        System.out.println(value.length);
    }

    // -- encodeToString

    @DisplayName("encodeToString")
    @Test
    public void encodeToString() {
        String value = Base64WithCommonsCodecUtils.encodeToString("test".getBytes(StandardCharsets.UTF_8));

        System.out.println(value.length());
    }
}
