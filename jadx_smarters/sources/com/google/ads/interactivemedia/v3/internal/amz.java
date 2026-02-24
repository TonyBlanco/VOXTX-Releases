package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class amz implements ash {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f20299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20300b;

    public amz(ana anaVar, int i9) {
        this.f20300b = i9;
        this.f20299a = anaVar;
    }

    public amz(aru aruVar, int i9) {
        this.f20300b = i9;
        this.f20299a = aruVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ash
    public final void a(int i9, long j9) {
        aru aruVar;
        long jCurrentTimeMillis;
        if (this.f20300b != 0) {
            Object obj = this.f20299a;
            jCurrentTimeMillis = System.currentTimeMillis();
            aruVar = (aru) obj;
        } else {
            aruVar = ((ana) this.f20299a).f20304d;
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        aruVar.d(i9, jCurrentTimeMillis - j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ash
    public final void b(int i9, long j9, String str) {
        aru aruVar;
        long jCurrentTimeMillis;
        if (this.f20300b != 0) {
            Object obj = this.f20299a;
            jCurrentTimeMillis = System.currentTimeMillis();
            aruVar = (aru) obj;
        } else {
            aruVar = ((ana) this.f20299a).f20304d;
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        aruVar.e(i9, jCurrentTimeMillis - j9, str);
    }
}
