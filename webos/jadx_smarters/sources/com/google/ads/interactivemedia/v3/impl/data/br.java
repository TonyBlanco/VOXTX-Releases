package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.atf;

/* JADX INFO: loaded from: classes3.dex */
@atf(a = ae.class)
public abstract class br {
    public static final String UNKNOWN_CONTENT_TYPE = "unknown";

    private static br create(String str, String str2, String str3, int i9) {
        return new ae(str, str2, str3, i9);
    }

    public static br forError(String str, int i9) {
        return create(str, "", "unknown", i9);
    }

    public static br forResponse(String str, String str2) {
        return forResponse(str, str2, "unknown");
    }

    public static br forResponse(String str, String str2, String str3) {
        return create(str, str2, str3, 0);
    }

    public abstract String content();

    public abstract String contentType();

    public abstract int errorCode();

    public abstract String id();
}
