package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class bmn implements bkm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bof f21726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bke f21728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bjx f21729d;

    public bmn(Object obj, bof bofVar, boolean z9) {
        bke bkeVar = obj instanceof bke ? (bke) obj : null;
        this.f21728c = bkeVar;
        bjx bjxVar = obj instanceof bjx ? (bjx) obj : null;
        this.f21729d = bjxVar;
        boolean z10 = true;
        if (bkeVar == null && bjxVar == null) {
            z10 = false;
        }
        bjh.d(z10);
        this.f21726a = bofVar;
        this.f21727b = z9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkm
    public final bkl a(bjt bjtVar, bof bofVar) {
        if (this.f21726a.equals(bofVar) || (this.f21727b && this.f21726a.d() == bofVar.c())) {
            return new bmo(this.f21728c, this.f21729d, bjtVar, bofVar, this, true);
        }
        return null;
    }
}
