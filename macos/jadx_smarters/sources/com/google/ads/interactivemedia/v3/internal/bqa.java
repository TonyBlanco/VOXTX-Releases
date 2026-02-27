package com.google.ads.interactivemedia.v3.internal;

import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes3.dex */
final class bqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22026b;

    public bqa(Object obj, int i9) {
        this.f22025a = obj;
        this.f22026b = i9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bqa)) {
            return false;
        }
        bqa bqaVar = (bqa) obj;
        return this.f22025a == bqaVar.f22025a && this.f22026b == bqaVar.f22026b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f22025a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f22026b;
    }
}
