package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class bfw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap f21225a = new HashMap();

    public final bfx a() {
        if (this.f21225a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        bfx bfxVar = new bfx(Collections.unmodifiableMap(this.f21225a));
        this.f21225a = null;
        return bfxVar;
    }
}
