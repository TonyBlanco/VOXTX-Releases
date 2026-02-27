package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class dr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f22736a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f22737b;

    public final synchronized Map a() {
        try {
            if (this.f22737b == null) {
                this.f22737b = Collections.unmodifiableMap(new HashMap(this.f22736a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f22737b;
    }
}
