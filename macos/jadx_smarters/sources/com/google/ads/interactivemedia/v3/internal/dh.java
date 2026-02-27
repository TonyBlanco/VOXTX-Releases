package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dh implements atm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22715c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dh f22714b = new dh(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ dh f22713a = new dh(0);

    private /* synthetic */ dh(int i9) {
        this.f22715c = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atm
    public final boolean a(Object obj) {
        return this.f22715c != 0 ? ((Map.Entry) obj).getKey() != null : ((String) obj) != null;
    }
}
