package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class aur extends aut {
    public static final aut f(int i9) {
        return i9 < 0 ? aut.f20770b : i9 > 0 ? aut.f20771c : aut.f20769a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aut
    public final int a() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aut
    public final aut b(int i9, int i10) {
        return f(i9 < i10 ? -1 : i9 > i10 ? 1 : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aut
    public final aut c(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aut
    public final aut d(boolean z9, boolean z10) {
        return f(axy.d(z9, z10));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aut
    public final aut e(boolean z9, boolean z10) {
        return f(axy.d(z10, z9));
    }
}
