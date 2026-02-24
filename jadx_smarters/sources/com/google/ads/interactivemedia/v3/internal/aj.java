package com.google.ads.interactivemedia.v3.internal;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet f19903a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f19904b = "media3.common";

    public static synchronized String a() {
        return f19904b;
    }

    public static synchronized void b(String str) {
        if (f19903a.add(str)) {
            f19904b = f19904b + ", " + str;
        }
    }
}
