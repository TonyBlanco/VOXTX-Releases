package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xg implements Comparator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f25050c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ xg f25049b = new xg(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ xg f25048a = new xg(0);

    private /* synthetic */ xg(int i9) {
        this.f25050c = i9;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        xh xhVar = (xh) obj;
        xh xhVar2 = (xh) obj2;
        return this.f25050c != 0 ? xhVar.f25051a - xhVar2.f25051a : Float.compare(xhVar.f25053c, xhVar2.f25053c);
    }
}
