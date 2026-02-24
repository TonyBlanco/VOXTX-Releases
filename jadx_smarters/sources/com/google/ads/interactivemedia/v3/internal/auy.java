package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class auy extends ave {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ avf f20778a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auy(avf avfVar) {
        super(avfVar);
        this.f20778a = avfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ave
    public final /* bridge */ /* synthetic */ Object a(int i9) {
        return new auw(this.f20778a, i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iC = this.f20778a.c(key);
            if (iC != -1 && com.google.ads.interactivemedia.v3.impl.data.k.c(value, this.f20778a.f20791b[iC])) {
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
        int iD = this.f20778a.d(key, iF);
        if (iD == -1 || !com.google.ads.interactivemedia.v3.impl.data.k.c(value, this.f20778a.f20791b[iD])) {
            return false;
        }
        this.f20778a.j(iD, iF);
        return true;
    }
}
