package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
class ace {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18900d;

    public ace(int i9) {
        this.f18900d = i9;
    }

    public static int e(int i9) {
        return i9 & 16777215;
    }

    public static int f(int i9) {
        return (i9 >> 24) & 255;
    }

    public static String g(int i9) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i9 >> 24) & 255));
        sb.append((char) ((i9 >> 16) & 255));
        sb.append((char) ((i9 >> 8) & 255));
        sb.append((char) (i9 & 255));
        return sb.toString();
    }

    public String toString() {
        return g(this.f18900d);
    }
}
