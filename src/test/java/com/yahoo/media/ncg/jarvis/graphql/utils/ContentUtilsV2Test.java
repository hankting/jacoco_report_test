package com.yahoo.media.ncg.jarvis.graphql.utils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class ContentUtilsV2Test {

    @Test
    void testPass() {
        assertFalse(ContentUtilsV2.isEmpty("a"));
    }

}
