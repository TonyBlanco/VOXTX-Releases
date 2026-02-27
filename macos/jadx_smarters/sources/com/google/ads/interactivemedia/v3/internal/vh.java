package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class vh extends up {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1333s f24841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f24842e;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f24843p;

    public vh(cy cyVar, dc dcVar, C1333s c1333s, int i9, long j9, long j10, long j11, int i10, C1333s c1333s2) {
        super(cyVar, dcVar, c1333s, i9, j9, j10, -9223372036854775807L, -9223372036854775807L, j11);
        this.f24840c = i10;
        this.f24841d = c1333s2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wy
    public final void e() throws IOException {
        zo zoVarC = c();
        zoVarC.a(0L);
        aae aaeVarC = zoVarC.c(this.f24840c);
        aaeVarC.b(this.f24841d);
        try {
            long jB = this.f24787n.b(this.f24780g.b(this.f24842e));
            if (jB != -1) {
                jB += this.f24842e;
            }
            zb zbVar = new zb(this.f24787n, this.f24842e, jB);
            for (int iA = 0; iA != -1; iA = aaeVarC.a(zbVar, a.e.API_PRIORITY_OTHER, true)) {
                this.f24842e += (long) iA;
            }
            aaeVarC.f(this.f24785l, 1, (int) this.f24842e, 0, null);
            af.e(this.f24787n);
            this.f24843p = true;
        } catch (Throwable th) {
            af.e(this.f24787n);
            throw th;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ve
    public final boolean g() {
        return this.f24843p;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wy
    public final void r() {
    }
}
