package com.yahoo.media.ncg.jarvis.graphql.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;

import java.util.UUID;



@Slf4j
public class ContentUtils {
//    public static final ObjectMapper MAPPER = new ObjectMapper()
//        .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
//        .setSerializationInclusion(JsonInclude.Include.NON_NULL);

    public static boolean isValidUuid(String id) {
        try {
            if (Strings.isBlank(id)) {
                return false;
            }
            UUID.fromString(id);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }

//    public static String objectToJsonString(Object value) {
//        if (value != null) {
//            if (value instanceof List || value instanceof Map) {
//                try {
//                    return MAPPER.writeValueAsString(value);
//                } catch (JsonProcessingException e) {
//                    log.error("Error converting object to string", e);
//                }
//            } else {
//                return value.toString();
//            }
//        }
//        return null;
//    }

}
