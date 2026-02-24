package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class awx extends awy implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final awx f20860a = new awx();
    private static final long serialVersionUID = 0;

    private awx() {
    }

    private Object readResolve() {
        return f20860a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awy
    public final awy a() {
        return axh.f20886a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awy, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        atp.k(comparable);
        atp.k(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
