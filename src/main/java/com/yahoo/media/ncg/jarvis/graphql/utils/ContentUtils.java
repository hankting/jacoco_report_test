package com.yahoo.media.ncg.jarvis.graphql.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;

import java.util.UUID;



@Slf4j
public class ContentUtils {
    private ContentUtils() {
    }

    public static boolean isValidUuid(String id) {
        try {
            if (Strings.isEmpty(id) || Strings.isBlank(id)) {
                return false;
            }
            UUID.fromString(id);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }
}
