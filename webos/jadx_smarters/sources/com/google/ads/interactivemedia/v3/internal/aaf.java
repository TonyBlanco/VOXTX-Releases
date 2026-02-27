package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class aaf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f18633a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f18634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f18636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f18639g;

    public final void a(aae aaeVar, aad aadVar) {
        if (this.f18635c > 0) {
            aaeVar.f(this.f18636d, this.f18637e, this.f18638f, this.f18639g, aadVar);
            this.f18635c = 0;
        }
    }

    public final void b() {
        this.f18634b = false;
        this.f18635c = 0;
    }

    public final void c(aae aaeVar, long j9, int i9, int i10, int i11, aad aadVar) {
        af.x(this.f18639g <= i10 + i11, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f18634b) {
            int i12 = this.f18635c;
            int i13 = i12 + 1;
            this.f18635c = i13;
            if (i12 == 0) {
                this.f18636d = j9;
                this.f18637e = i9;
                this.f18638f = 0;
            }
            this.f18638f += i10;
            this.f18639g = i11;
            if (i13 >= 16) {
                a(aaeVar, aadVar);
            }
        }
    }

    public final void d(zi ziVar) throws IOException {
        if (this.f18634b) {
            return;
        }
        ziVar.f(this.f18633a, 0, 10);
        ziVar.h();
        byte[] bArr = this.f18633a;
        int i9 = yo.f25184a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f18634b = true;
        }
    }
}
