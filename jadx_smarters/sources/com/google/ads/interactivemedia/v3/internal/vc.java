package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vc extends uu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f24832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f24833b;

    public vc(cy cyVar, dc dcVar, C1333s c1333s, int i9, byte[] bArr) {
        super(cyVar, dcVar, 3, c1333s, i9, -9223372036854775807L, -9223372036854775807L);
        this.f24832a = bArr == null ? cq.f22645f : bArr;
    }

    public abstract void a(byte[] bArr, int i9) throws IOException;

    public final byte[] c() {
        return this.f24832a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wy
    public final void e() throws IOException {
        try {
            this.f24787n.b(this.f24780g);
            int iA = 0;
            int i9 = 0;
            while (iA != -1 && !this.f24833b) {
                byte[] bArr = this.f24832a;
                int length = bArr.length;
                if (length < i9 + Http2.INITIAL_MAX_FRAME_SIZE) {
                    this.f24832a = Arrays.copyOf(bArr, length + Http2.INITIAL_MAX_FRAME_SIZE);
                }
                iA = this.f24787n.a(this.f24832a, i9, Http2.INITIAL_MAX_FRAME_SIZE);
                if (iA != -1) {
                    i9 += iA;
                }
            }
            if (!this.f24833b) {
                a(this.f24832a, i9);
            }
            af.e(this.f24787n);
        } catch (Throwable th) {
            af.e(this.f24787n);
            throw th;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wy
    public final void r() {
        this.f24833b = true;
    }
}
