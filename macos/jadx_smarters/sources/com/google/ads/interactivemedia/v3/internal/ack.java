package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class ack implements ach {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cj f18921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18925e;

    public ack(acd acdVar) {
        cj cjVar = acdVar.f18899a;
        this.f18921a = cjVar;
        cjVar.F(12);
        this.f18923c = cjVar.l() & 255;
        this.f18922b = cjVar.l();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ach
    public final int a() {
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ach
    public final int b() {
        return this.f18922b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ach
    public final int c() {
        int i9 = this.f18923c;
        if (i9 == 8) {
            return this.f18921a.i();
        }
        if (i9 == 16) {
            return this.f18921a.m();
        }
        int i10 = this.f18924d;
        this.f18924d = i10 + 1;
        if (i10 % 2 != 0) {
            return this.f18925e & 15;
        }
        int i11 = this.f18921a.i();
        this.f18925e = i11;
        return (i11 & 240) >> 4;
    }
}
