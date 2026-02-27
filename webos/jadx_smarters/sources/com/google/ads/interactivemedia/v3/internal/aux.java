package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class aux extends auk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final avf f20775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f20776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f20777c;

    public aux(avf avfVar, int i9) {
        this.f20775a = avfVar;
        this.f20776b = avfVar.f20791b[i9];
        this.f20777c = i9;
    }

    private final void a() {
        int i9 = this.f20777c;
        if (i9 != -1) {
            avf avfVar = this.f20775a;
            if (i9 <= avfVar.f20792c && com.google.ads.interactivemedia.v3.impl.data.k.c(this.f20776b, avfVar.f20791b[i9])) {
                return;
            }
        }
        this.f20777c = this.f20775a.e(this.f20776b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk, java.util.Map.Entry
    public final Object getKey() {
        return this.f20776b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i9 = this.f20777c;
        if (i9 == -1) {
            return null;
        }
        return this.f20775a.f20790a[i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i9 = this.f20777c;
        if (i9 == -1) {
            this.f20775a.q(this.f20776b, obj);
            return null;
        }
        Object obj2 = this.f20775a.f20790a[i9];
        if (com.google.ads.interactivemedia.v3.impl.data.k.c(obj2, obj)) {
            return obj;
        }
        this.f20775a.B(this.f20777c, obj);
        return obj2;
    }
}
