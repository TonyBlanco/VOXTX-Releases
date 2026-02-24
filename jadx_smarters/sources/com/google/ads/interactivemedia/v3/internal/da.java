package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class da extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cy f22674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dc f22675b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f22679f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22677d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22678e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f22676c = new byte[1];

    public da(cy cyVar, dc dcVar) {
        this.f22674a = cyVar;
        this.f22675b = dcVar;
    }

    private final void b() throws IOException {
        if (this.f22677d) {
            return;
        }
        this.f22674a.b(this.f22675b);
        this.f22677d = true;
    }

    public final void a() throws IOException {
        b();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f22678e) {
            return;
        }
        this.f22674a.d();
        this.f22678e = true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (read(this.f22676c) == -1) {
            return -1;
        }
        return this.f22676c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) throws IOException {
        af.w(!this.f22678e);
        b();
        int iA = this.f22674a.a(bArr, i9, i10);
        if (iA == -1) {
            return -1;
        }
        this.f22679f += (long) iA;
        return iA;
    }
}
