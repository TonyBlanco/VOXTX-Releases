package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class avb extends ave {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ avf f20782a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avb(avf avfVar) {
        super(avfVar);
        this.f20782a = avfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ave
    public final Object a(int i9) {
        return this.f20782a.f20790a[i9];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f20782a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iF = axo.F(obj);
        int iD = this.f20782a.d(obj, iF);
        if (iD == -1) {
            return false;
        }
        this.f20782a.j(iD, iF);
        return true;
    }
}
