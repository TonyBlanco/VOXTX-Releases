package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class aer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f19400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f19401d;

    public aer(int i9, String str, List list, byte[] bArr) {
        this.f19398a = i9;
        this.f19399b = str;
        this.f19400c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f19401d = bArr;
    }
}
