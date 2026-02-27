package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class vb extends up {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f24827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final uv f24828e;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f24829p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f24830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f24831r;

    public vb(cy cyVar, dc dcVar, C1333s c1333s, int i9, long j9, long j10, long j11, long j12, long j13, int i10, long j14, uv uvVar) {
        super(cyVar, dcVar, c1333s, i9, j9, j10, j11, j12, j13);
        this.f24826c = i10;
        this.f24827d = j14;
        this.f24828e = uvVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wy
    public final void e() throws IOException {
        if (this.f24829p == 0) {
            zo zoVarC = c();
            zoVarC.a(this.f24827d);
            uv uvVar = this.f24828e;
            long j9 = this.f24753a;
            long j10 = j9 == -9223372036854775807L ? -9223372036854775807L : j9 - this.f24827d;
            long j11 = this.f24754b;
            uvVar.e(zoVarC, j10, j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.f24827d);
        }
        try {
            dc dcVarB = this.f24780g.b(this.f24829p);
            dv dvVar = this.f24787n;
            zb zbVar = new zb(dvVar, dcVarB.f22692e, dvVar.b(dcVarB));
            do {
                try {
                    if (this.f24830q) {
                        break;
                    }
                } finally {
                    this.f24829p = zbVar.d() - this.f24780g.f22692e;
                }
            } while (this.f24828e.c(zbVar));
            af.e(this.f24787n);
            this.f24831r = !this.f24830q;
        } catch (Throwable th) {
            af.e(this.f24787n);
            throw th;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ve
    public final boolean g() {
        return this.f24831r;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wy
    public final void r() {
        this.f24830q = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ve
    public final long s() {
        return this.f24838o + ((long) this.f24826c);
    }
}
