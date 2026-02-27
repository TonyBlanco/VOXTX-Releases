package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class axh extends awy implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final axh f20886a = new axh();
    private static final long serialVersionUID = 0;

    private axh() {
    }

    private Object readResolve() {
        return f20886a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awy
    public final awy a() {
        return awx.f20860a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awy, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        atp.k(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
