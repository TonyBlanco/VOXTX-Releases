package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
final class awr extends awt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f20856a;

    public awr(Comparator comparator) {
        this.f20856a = comparator;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awt
    public final Map a() {
        return new TreeMap(this.f20856a);
    }
}
