package com.gentkit.exception.utils;

import org.junit.jupiter.api.Test;

public class ExceptionUtilsTest {

    @Test
    public void throwableToString() {
        ExceptionUtils.throwableToString(new Exception());
    }
}
