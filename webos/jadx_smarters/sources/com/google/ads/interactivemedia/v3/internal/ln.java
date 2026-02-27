package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class ln implements uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1333s f23690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f23691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ly f23693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23695f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final bdy f23697h = new bdy((char[]) null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f23696g = -9223372036854775807L;

    public ln(ly lyVar, C1333s c1333s, boolean z9) {
        this.f23690a = c1333s;
        this.f23693d = lyVar;
        this.f23691b = (long[]) lyVar.f23756b;
        f(lyVar, z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final int a(go goVar, ef efVar, int i9) {
        int i10 = this.f23695f;
        boolean z9 = i10 == this.f23691b.length;
        if (z9 && !this.f23692c) {
            efVar.c(4);
            return -4;
        }
        if ((i9 & 2) != 0 || !this.f23694e) {
            goVar.f23064b = this.f23690a;
            this.f23694e = true;
            return -5;
        }
        if (z9) {
            return -3;
        }
        if ((i9 & 1) == 0) {
            this.f23695f = i10 + 1;
        }
        if ((i9 & 4) == 0) {
            byte[] bArrM = this.f23697h.m(((aal[]) this.f23693d.f23755a)[i10]);
            efVar.i(bArrM.length);
            efVar.f22774b.put(bArrM);
        }
        efVar.f22776d = this.f23691b[i10];
        efVar.c(1);
        return -4;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final int b(long j9) {
        int iMax = Math.max(this.f23695f, cq.ao(this.f23691b, j9, true));
        int i9 = this.f23695f;
        this.f23695f = iMax;
        return iMax - i9;
    }

    public final String c() {
        return this.f23693d.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final void d() throws IOException {
    }

    public final void e(long j9) {
        int iAo = cq.ao(this.f23691b, j9, true);
        this.f23695f = iAo;
        if (!this.f23692c || iAo != this.f23691b.length) {
            j9 = -9223372036854775807L;
        }
        this.f23696g = j9;
    }

    public final void f(ly lyVar, boolean z9) {
        int i9 = this.f23695f;
        long j9 = i9 == 0 ? -9223372036854775807L : this.f23691b[i9 - 1];
        this.f23692c = z9;
        this.f23693d = lyVar;
        long[] jArr = (long[]) lyVar.f23756b;
        this.f23691b = jArr;
        long j10 = this.f23696g;
        if (j10 != -9223372036854775807L) {
            e(j10);
        } else if (j9 != -9223372036854775807L) {
            this.f23695f = cq.ao(jArr, j9, false);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final boolean g() {
        return true;
    }
}
