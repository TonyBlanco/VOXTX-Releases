package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class sq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f24542a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f24543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private cx f24544c;

    public sq() {
        new HashSet();
        this.f24543b = new HashMap();
    }

    public final void a(cx cxVar) {
        if (cxVar != this.f24544c) {
            this.f24544c = cxVar;
            this.f24542a.clear();
            this.f24543b.clear();
        }
    }
}
