package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class auw extends auk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f20772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f20773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ avf f20774c;

    public auw(avf avfVar, int i9) {
        this.f20774c = avfVar;
        this.f20772a = avfVar.f20790a[i9];
        this.f20773b = i9;
    }

    public final void a() {
        int i9 = this.f20773b;
        if (i9 != -1) {
            avf avfVar = this.f20774c;
            if (i9 <= avfVar.f20792c && com.google.ads.interactivemedia.v3.impl.data.k.c(avfVar.f20790a[i9], this.f20772a)) {
                return;
            }
        }
        this.f20773b = this.f20774c.c(this.f20772a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk, java.util.Map.Entry
    public final Object getKey() {
        return this.f20772a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i9 = this.f20773b;
        if (i9 == -1) {
            return null;
        }
        return this.f20774c.f20791b[i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auk, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i9 = this.f20773b;
        if (i9 == -1) {
            this.f20774c.put(this.f20772a, obj);
            return null;
        }
        Object obj2 = this.f20774c.f20791b[i9];
        if (com.google.ads.interactivemedia.v3.impl.data.k.c(obj2, obj)) {
            return obj;
        }
        this.f20774c.C(this.f20773b, obj);
        return obj2;
    }
}
