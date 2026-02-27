package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class sl extends eg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f24517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f24518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final be[] f24519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object[] f24520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f24521h;

    public sl(Collection collection, ui uiVar) {
        super(uiVar);
        int size = collection.size();
        this.f24517d = new int[size];
        this.f24518e = new int[size];
        this.f24519f = new be[size];
        this.f24520g = new Object[size];
        this.f24521h = new HashMap();
        Iterator it = collection.iterator();
        int iC = 0;
        int iB = 0;
        int i9 = 0;
        while (it.hasNext()) {
            sn snVar = (sn) it.next();
            be[] beVarArr = this.f24519f;
            be beVarK = snVar.f24522a.k();
            beVarArr[i9] = beVarK;
            this.f24518e[i9] = iC;
            this.f24517d[i9] = iB;
            iC += beVarK.c();
            iB += this.f24519f[i9].b();
            Object[] objArr = this.f24520g;
            Object obj = snVar.f24523b;
            objArr[i9] = obj;
            this.f24521h.put(obj, Integer.valueOf(i9));
            i9++;
        }
        this.f24515b = iC;
        this.f24516c = iB;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int b() {
        return this.f24516c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int c() {
        return this.f24515b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eg
    public final int r(Object obj) {
        Integer num = (Integer) this.f24521h.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eg
    public final int s(int i9) {
        return cq.b(this.f24517d, i9 + 1, false, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eg
    public final int t(int i9) {
        return cq.b(this.f24518e, i9 + 1, false, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eg
    public final int u(int i9) {
        return this.f24517d[i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eg
    public final int v(int i9) {
        return this.f24518e[i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eg
    public final be w(int i9) {
        return this.f24519f[i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eg
    public final Object z(int i9) {
        return this.f24520g[i9];
    }
}
