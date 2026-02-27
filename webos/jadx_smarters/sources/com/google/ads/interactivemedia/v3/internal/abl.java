package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
final class abl implements abn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f18740a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f18741b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final abt f18742c = new abt();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private abm f18743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f18746g;

    private final long d(zi ziVar, int i9) throws IOException {
        ziVar.g(this.f18740a, 0, i9);
        long j9 = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            j9 = (j9 << 8) | ((long) (this.f18740a[i10] & 255));
        }
        return j9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abn
    public final void a(abm abmVar) {
        this.f18743d = abmVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abn
    public final void b() {
        this.f18744e = 0;
        this.f18741b.clear();
        this.f18742c.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae A[LOOP:0: B:3:0x0005->B:36:0x00ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0121 A[SYNTHETIC] */
    @Override // com.google.ads.interactivemedia.v3.internal.abn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(com.google.ads.interactivemedia.v3.internal.zi r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.abl.c(com.google.ads.interactivemedia.v3.internal.zi):boolean");
    }
}
