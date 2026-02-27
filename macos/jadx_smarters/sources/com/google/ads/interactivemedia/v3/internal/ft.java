package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ft implements bx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f22926d;

    public /* synthetic */ ft(int i9, ay ayVar, ay ayVar2, int i10) {
        this.f22926d = i10;
        this.f22923a = i9;
        this.f22924b = ayVar;
        this.f22925c = ayVar2;
    }

    public /* synthetic */ ft(hv hvVar, ai aiVar, int i9, int i10) {
        this.f22926d = i10;
        this.f22925c = hvVar;
        this.f22924b = aiVar;
        this.f22923a = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bx
    public final void a(Object obj) {
        if (this.f22926d != 0) {
            return;
        }
        int i9 = this.f22923a;
        Object obj2 = this.f22924b;
        Object obj3 = this.f22925c;
        int i10 = gc.f22939d;
        ((ax) obj).o((ay) obj2, (ay) obj3, i9);
    }
}
