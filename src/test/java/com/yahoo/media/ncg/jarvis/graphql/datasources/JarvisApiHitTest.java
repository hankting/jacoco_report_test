package com.yahoo.media.ncg.jarvis.graphql.datasources;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class JarvisApiHitTest {

    @Test
    void testIsTypeBlogPost() {
        var jarvisHit = new JarvisApiHit()
            .setId("dummyId")
            .setType("ymedia:type=blogpost");
        assertTrue(jarvisHit.isTypeBlogPost());
    }
}
