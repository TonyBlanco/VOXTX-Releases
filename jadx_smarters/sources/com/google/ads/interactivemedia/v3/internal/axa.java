package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
final class axa extends avo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ axb f20864a;

    public axa(axb axbVar) {
        this.f20864a = axbVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i9) {
        atp.j(i9, this.f20864a.f20867c);
        axb axbVar = this.f20864a;
        int i10 = i9 + i9;
        Object obj = axbVar.f20866b[i10];
        obj.getClass();
        Object obj2 = axbVar.f20866b[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20864a.f20867c;
    }
}
