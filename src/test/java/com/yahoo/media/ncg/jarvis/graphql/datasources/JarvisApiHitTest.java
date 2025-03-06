package com.yahoo.media.ncg.jarvis.graphql.datasources;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class JarvisApiHitTest {

    @Test
    void testIsTypeBlogPost() {
        var jarvisHit = new JarvisApiHit()
            .setId("dummyId")
            .setType("ymedia:type=blogpost");
        assertTrue(jarvisHit.isTypeBlogPost());
    }

//    @Test
//    void testIsTypeOffnet() {
//        var jarvisHit = new JarvisApiHit()
//            .setId("dummyId")
//            .setType("ymedia:type=offnet");
//        assertTrue(jarvisHit.isTypeOffnet());
//    }
//
//    @Test
//    void testIsTypeOutlink() {
//        var jarvisHit = new JarvisApiHit()
//            .setId("dummyId")
//            .setType("ymedia:type=outlink");
//        assertTrue(jarvisHit.isTypeOutlink());
//    }
//
//    @Test
//    void testIsTypeSlideShow() {
//        var jarvisHit = new JarvisApiHit()
//            .setId("dummyId")
//            .setType("ymedia:type=slideshow");
//        assertTrue(jarvisHit.isTypeSlideshow());
//    }
//
//    @Test
//    void testIsTypeEditorialPackage() {
//        var jarvisHit = new JarvisApiHit()
//            .setId("dummyId")
//            .setType("ymedia:type=editorial-package");
//        assertTrue(jarvisHit.isTypeEditorialPackage());
//    }
//
    @Test
    void testIsTypeStory() {
        var jarvisHit = new JarvisApiHit()
            .setId("dummyId")
            .setType("ymedia:type=story2");
        assertTrue(jarvisHit.isTypeStory());
    }
//
//    @Test
//    void testIsTypeStoryCluster() {
//        var jarvisHit = new JarvisApiHit()
//            .setId("dummyId")
//            .setType("ymedia:type=story-cluster");
//        assertTrue(jarvisHit.isTypeStoryCluster());
//    }
//
//    @Test
//    void testIsTypeVideo() {
//        var jarvisHit = new JarvisApiHit()
//            .setId("dummyId")
//            .setType("ymedia:type=cavideo");
//        assertTrue(jarvisHit.isTypeVideo());
//    }
//
//    private static Stream<Arguments> testIsCarmotContentArguments() {
//        return Stream.of(
//            Arguments.of("ymedia:type=blogpost", true),
//            Arguments.of("ymedia:type=offnet", true),
//            Arguments.of("ymedia:type=outlink", true),
//            Arguments.of("ymedia:type=slideshow", true),
//            Arguments.of("ymedia:type=story-cluster", true),
//            Arguments.of("ymedia:type=story", true),
//            Arguments.of("ymedia:type=cavideo", true),
//            Arguments.of("ymedia:type=editorial-package", false)
//        );
//    }
//
//    @ParameterizedTest
//    @MethodSource("testIsCarmotContentArguments")
//    void testIsCarmotContent(String contentType, boolean isCarmotContent) {
//        var jarvisHit = new JarvisApiHit()
//            .setId("dummyId")
//            .setType(contentType);
//        assertEquals(isCarmotContent, jarvisHit.isCarmotContent());
//    }
//
//    private static Stream<Arguments> testIsCarmotEditorialPackageArguments() {
//        return Stream.of(
//            Arguments.of("ymedia:type=editorial-package", true),
//            Arguments.of("ymedia:type=blogpost", false)
//        );
//    }
//
//    @ParameterizedTest
//    @MethodSource("testIsCarmotEditorialPackageArguments")
//    void testIsCarmotEditorialPackage(String contentType, boolean isCarmotEditorialPackage) {
//        var jarvisHit = new JarvisApiHit()
//            .setId("dummyId")
//            .setType(contentType);
//        assertEquals(isCarmotEditorialPackage, jarvisHit.isCarmotEditorialPackage());
//    }
}
