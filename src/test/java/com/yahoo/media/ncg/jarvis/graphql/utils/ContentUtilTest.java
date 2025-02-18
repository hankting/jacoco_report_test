package com.yahoo.media.ncg.jarvis.graphql.utils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class ContentUtilTest {

    @Test
    public void testIsValidUuid() {
        assertTrue(ContentUtils.isValidUuid(UUID.randomUUID().toString()));
    }

    @Test
    public void testIsInValidUuid() {
        assertFalse(ContentUtils.isValidUuid("aa"));
    }

    @Test
    public void testIsEmpty() {
        assertFalse(ContentUtils.isValidUuid(""));
    }

    @Test
    public void testIsBlank() {
        assertFalse(ContentUtils.isValidUuid(" "));
    }
}
