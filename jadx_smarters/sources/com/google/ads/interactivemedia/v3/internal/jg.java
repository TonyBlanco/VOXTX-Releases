package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f23353d;

    public /* synthetic */ jg(ji jiVar, C1333s c1333s, eq eqVar, int i9) {
        this.f23353d = i9;
        this.f23350a = jiVar;
        this.f23351b = c1333s;
        this.f23352c = eqVar;
    }

    public /* synthetic */ jg(nn nnVar, no noVar, Exception exc, int i9) {
        this.f23353d = i9;
        this.f23351b = nnVar;
        this.f23352c = noVar;
        this.f23350a = exc;
    }

    public /* synthetic */ jg(tj tjVar, tk tkVar, tb tbVar, int i9) {
        this.f23353d = i9;
        this.f23352c = tjVar;
        this.f23350a = tkVar;
        this.f23351b = tbVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.ads.interactivemedia.v3.internal.no, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.ads.interactivemedia.v3.internal.tk, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.f23353d;
        if (i9 == 0) {
            Object obj = this.f23350a;
            ji jiVar = (ji) obj;
            jiVar.n((C1333s) this.f23351b, (eq) this.f23352c);
            return;
        }
        if (i9 != 1) {
            Object obj2 = this.f23352c;
            tj tjVar = (tj) obj2;
            this.f23350a.ae(tjVar.f24591a, tjVar.f24592b, (tb) this.f23351b);
            return;
        }
        Object obj3 = this.f23351b;
        nn nnVar = (nn) obj3;
        this.f23352c.an(nnVar.f23895a, nnVar.f23896b, (Exception) this.f23350a);
    }
}
