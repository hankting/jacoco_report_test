package com.yahoo.media.ncg.jarvis.graphql.utils;

public class ContentUtilsV2 {
    public static boolean isEmpty(String id) {
        if (id == null) {
            return true;
        }
        if (id.isEmpty()) {
            return true;
        }
        return false;
    }
}
