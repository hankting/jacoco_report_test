package com.yahoo.media.ncg.jarvis.graphql.datasources;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class JarvisApiHit {

    public static final String TYPE_STORY = "ymedia:type=story";
    public static final String TYPE_VIDEO = "ymedia:type=cavideo";
    public static final String TYPE_EDITORIAL_PACKAGE = "ymedia:type=editorial-package";
    public static final String TYPE_BLOGPOST = "ymedia:type=blogpost";
    public static final String TYPE_OFFNET = "ymedia:type=offnet";
    public static final String TYPE_OUTLINK = "ymedia:type=outlink";
    public static final String TYPE_SLIDESHOW = "ymedia:type=slideshow";
    public static final String TYPE_STORY_CLUSTER = "ymedia:type=story-cluster";
//    public static final String TYPE_TEST = "ymedia:type=test";
//    public static final String TYPE_TEST2 = "ymedia:type=test2";
//    public static final String TYPE_TEST3 = "ymedia:type=test3";

    private String id;
    private String type;
    private List<IdWithType> storyline;

    @Data
    @Accessors(chain = true)
    public static class IdWithType {
        private String id;
        private String type;
    }

    public boolean isTypeStory() {
        return TYPE_STORY.equalsIgnoreCase(type);
    }

    public boolean isTypeVideo() {
        return TYPE_VIDEO.equalsIgnoreCase(type);
    }

    public boolean isTypeEditorialPackage() {
        return TYPE_EDITORIAL_PACKAGE.equalsIgnoreCase(type);
    }

    public boolean isTypeBlogPost() {
        return TYPE_BLOGPOST.equalsIgnoreCase(type);
    }

    public boolean isTypeOffnet() {
        return TYPE_OFFNET.equalsIgnoreCase(type);
    }

    public boolean isTypeOutlink() {
        return TYPE_OUTLINK.equalsIgnoreCase(type);
    }

    public boolean isTypeSlideshow() {
        return TYPE_SLIDESHOW.equalsIgnoreCase(type);
    }

    public boolean isTypeStoryCluster() {
        return TYPE_STORY_CLUSTER.equalsIgnoreCase(type);
    }

    public boolean isCarmotContent() {
        return isTypeStory()
               || isTypeVideo()
               || isTypeStoryCluster()
               || isTypeOffnet()
               || isTypeSlideshow()
               || isTypeOutlink()
               || isTypeBlogPost();
    }

    public boolean isCarmotEditorialPackage() {
        return isTypeEditorialPackage();
    }

//    public boolean isTypeTest() {
//        return TYPE_TEST.equalsIgnoreCase(type);
//    }
//
//    public boolean isTypeTest2() {
//        return TYPE_TEST2.equalsIgnoreCase(type);
//    }
//
//    public boolean isTypeTest3() {
//        return TYPE_TEST3.equalsIgnoreCase(type);
//    }
}

