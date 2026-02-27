package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class avc extends ave {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ avf f20783a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avc(avf avfVar) {
        super(avfVar);
        this.f20783a = avfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ave
    public final Object a(int i9) {
        return this.f20783a.f20791b[i9];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f20783a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iF = axo.F(obj);
        int iF2 = this.f20783a.f(obj, iF);
        if (iF2 == -1) {
            return false;
        }
        this.f20783a.k(iF2, iF);
        return true;
    }
}
