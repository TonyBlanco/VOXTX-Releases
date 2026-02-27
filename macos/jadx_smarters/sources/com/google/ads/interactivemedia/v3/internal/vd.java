package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class vd extends uu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uv f24834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f24835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f24836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private zo f24837d;

    public vd(cy cyVar, dc dcVar, C1333s c1333s, int i9, uv uvVar) {
        super(cyVar, dcVar, 2, c1333s, i9, -9223372036854775807L, -9223372036854775807L);
        this.f24834a = uvVar;
    }

    public final void a(zo zoVar) {
        this.f24837d = zoVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wy
    public final void e() throws IOException {
        if (this.f24835b == 0) {
            this.f24834a.e(this.f24837d, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            dc dcVarB = this.f24780g.b(this.f24835b);
            dv dvVar = this.f24787n;
            zb zbVar = new zb(dvVar, dcVarB.f22692e, dvVar.b(dcVarB));
            while (!this.f24836c && this.f24834a.c(zbVar)) {
                try {
                } finally {
                    this.f24835b = zbVar.d() - this.f24780g.f22692e;
                }
            }
        } finally {
            af.e(this.f24787n);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wy
    public final void r() {
        this.f24836c = true;
    }
}
