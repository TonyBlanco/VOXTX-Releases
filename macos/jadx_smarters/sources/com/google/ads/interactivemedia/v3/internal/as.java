package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class as extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20612b;

    public as(String str, Throwable th, boolean z9, int i9) {
        super(str, th);
        this.f20611a = z9;
        this.f20612b = i9;
    }

    public static as a(String str, Throwable th) {
        return new as(str, th, true, 1);
    }

    public static as b(String str, Throwable th) {
        return new as(str, th, true, 0);
    }

    public static as c(String str, Throwable th) {
        return new as(str, th, true, 4);
    }

    public static as d(String str) {
        return new as(str, null, false, 1);
    }
}
