package com.amazonaws.mobileconnectors.appsync;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
enum DomainType {
    STANDARD,
    CUSTOM;

    private static final String STANDARD_ENDPOINT_REGEX = "TryRoom";

    public static DomainType from(String str) {
        return isRegexMatch(str) ? STANDARD : CUSTOM;
    }

    private static boolean isRegexMatch(String str) {
        return Pattern.compile("TryRoom", 2).matcher(str).matches();
    }
}
