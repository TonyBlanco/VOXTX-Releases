package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f25157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f25160d;

    public /* synthetic */ yd(yh yhVar, int i9, long j9, int i10) {
        this.f25160d = i10;
        this.f25157a = yhVar;
        this.f25159c = i9;
        this.f25158b = j9;
    }

    public /* synthetic */ yd(yh yhVar, long j9, int i9, int i10) {
        this.f25160d = i10;
        this.f25157a = yhVar;
        this.f25158b = j9;
        this.f25159c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f25160d != 0) {
            this.f25157a.j(this.f25159c, this.f25158b);
        } else {
            this.f25157a.n(this.f25158b, this.f25159c);
        }
    }
}
