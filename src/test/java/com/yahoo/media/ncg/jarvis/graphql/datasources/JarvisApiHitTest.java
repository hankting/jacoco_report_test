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

    @Test
    void testIsTypeOffnet() {
        var jarvisHit = new JarvisApiHit()
            .setId("dummyId")
            .setType("ymedia:type=offnet");
        assertTrue(jarvisHit.isTypeOffnet());
    }

//    @Test
//    void testIsTypeTest() {
//        var jarvisHit = new JarvisApiHit()
//            .setId("dummyId")
//            .setType("ymedia:type=test");
//        assertTrue(jarvisHit.isTypeTest());
//    }

//    @Test
//    void testIsTypeTest2() {
//        var jarvisHit = new JarvisApiHit()
//            .setId("dummyId")
//            .setType("ymedia:type=test2");
//        assertTrue(jarvisHit.isTypeTest2());
//    }

//    @Test
//    void testIsCarmotContent() {
//        var jarvisHit = new JarvisApiHit()
//            .setId("dummyId")
//            .setType("ymedia:type=test");
//        assertTrue(jarvisHit.isCarmotContent());
//    }
}
