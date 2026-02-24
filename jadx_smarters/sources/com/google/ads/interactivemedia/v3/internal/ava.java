package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class ava extends ave {
    public ava(avf avfVar) {
        super(avfVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ave
    public final /* bridge */ /* synthetic */ Object a(int i9) {
        return new aux(this.f20789b, i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iE = this.f20789b.e(key);
            if (iE != -1 && com.google.ads.interactivemedia.v3.impl.data.k.c(this.f20789b.f20790a[iE], value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int iF = axo.F(key);
        int iF2 = this.f20789b.f(key, iF);
        if (iF2 == -1 || !com.google.ads.interactivemedia.v3.impl.data.k.c(this.f20789b.f20790a[iF2], value)) {
            return false;
        }
        this.f20789b.k(iF2, iF);
        return true;
    }
}
