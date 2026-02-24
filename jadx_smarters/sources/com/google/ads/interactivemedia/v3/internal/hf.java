package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class hf extends eg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f23165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f23166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final be[] f23167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object[] f23168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f23169h;

    public hf(Collection collection, ui uiVar) {
        super(uiVar);
        int size = collection.size();
        this.f23165d = new int[size];
        this.f23166e = new int[size];
        this.f23167f = new be[size];
        this.f23168g = new Object[size];
        this.f23169h = new HashMap();
        Iterator it = collection.iterator();
        int iC = 0;
        int iB = 0;
        int i9 = 0;
        while (it.hasNext()) {
            gu guVar = (gu) it.next();
            this.f23167f[i9] = guVar.a();
            this.f23166e[i9] = iC;
            this.f23165d[i9] = iB;
            iC += this.f23167f[i9].c();
            iB += this.f23167f[i9].b();
            this.f23168g[i9] = guVar.b();
            this.f23169h.put(this.f23168g[i9], Integer.valueOf(i9));
            i9++;
        }
        this.f23163b = iC;
        this.f23164c = iB;
    }

    public final List A() {
        return Arrays.asList(this.f23167f);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int b() {
        return this.f23164c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int c() {
        return this.f23163b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eg
    public final int r(Object obj) {
        Integer num = (Integer) this.f23169h.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eg
    public final int s(int i9) {
        return cq.b(this.f23165d, i9 + 1, false, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eg
    public final int t(int i9) {
        return cq.b(this.f23166e, i9 + 1, false, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eg
    public final int u(int i9) {
        return this.f23165d[i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eg
    public final int v(int i9) {
        return this.f23166e[i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eg
    public final be w(int i9) {
        return this.f23167f[i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eg
    public final Object z(int i9) {
        return this.f23168g[i9];
    }
}
