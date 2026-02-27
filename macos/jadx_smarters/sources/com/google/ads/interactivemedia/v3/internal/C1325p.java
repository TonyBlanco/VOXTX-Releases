package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: com.google.ads.interactivemedia.v3.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1325p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f23995a = new SparseBooleanArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23996b;

    public final C1328q a() {
        af.w(!this.f23996b);
        this.f23996b = true;
        return new C1328q(this.f23995a);
    }

    public final void b(int i9) {
        af.w(!this.f23996b);
        this.f23995a.append(i9, true);
    }
}
