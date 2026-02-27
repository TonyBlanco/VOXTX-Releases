package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fs implements bx {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f22922d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ fs f22921c = new fs(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ fs f22920b = new fs(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ fs f22919a = new fs(0);

    private /* synthetic */ fs(int i9) {
        this.f22922d = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bx
    public final void a(Object obj) {
        int i9 = this.f22922d;
        if (i9 == 0) {
            ((ax) obj).p();
            return;
        }
        ax axVar = (ax) obj;
        if (i9 != 1) {
            return;
        }
        axVar.l(ev.d(new gn(1), 1003));
    }
}
