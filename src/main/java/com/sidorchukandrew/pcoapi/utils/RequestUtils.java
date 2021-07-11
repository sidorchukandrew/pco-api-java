package com.sidorchukandrew.pcoapi.utils;

public class RequestUtils {
    public static String toQueryParam(String label) {
        StringBuilder builder = new StringBuilder();
        builder.append("where[");
        builder.append(label);
        builder.append("]");

        return builder.toString();
    }
}
