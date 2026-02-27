package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public final class arf extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20566a;

    public arf(int i9) {
        super("Signal SDK error code: " + i9);
        this.f20566a = i9;
    }

    public final int a() {
        return this.f20566a;
    }
}
