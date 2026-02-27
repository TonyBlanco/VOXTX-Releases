package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class bqx extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f22118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f22119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22120c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f22124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f22126i;

    public bqx(Iterable iterable) {
        this.f22118a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f22120c++;
        }
        this.f22121d = -1;
        if (b()) {
            return;
        }
        this.f22119b = bqu.f22116c;
        this.f22121d = 0;
        this.f22122e = 0;
        this.f22126i = 0L;
    }

    private final void a(int i9) {
        int i10 = this.f22122e + i9;
        this.f22122e = i10;
        if (i10 == this.f22119b.limit()) {
            b();
        }
    }

    private final boolean b() {
        this.f22121d++;
        if (!this.f22118a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f22118a.next();
        this.f22119b = byteBuffer;
        this.f22122e = byteBuffer.position();
        if (this.f22119b.hasArray()) {
            this.f22123f = true;
            this.f22124g = this.f22119b.array();
            this.f22125h = this.f22119b.arrayOffset();
        } else {
            this.f22123f = false;
            this.f22126i = btf.e(this.f22119b);
            this.f22124g = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte bA;
        if (this.f22121d == this.f22120c) {
            return -1;
        }
        if (this.f22123f) {
            bA = this.f22124g[this.f22122e + this.f22125h];
        } else {
            bA = btf.a(((long) this.f22122e) + this.f22126i);
        }
        a(1);
        return bA & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) throws IOException {
        if (this.f22121d == this.f22120c) {
            return -1;
        }
        int iLimit = this.f22119b.limit();
        int i11 = this.f22122e;
        int i12 = iLimit - i11;
        if (i10 > i12) {
            i10 = i12;
        }
        if (this.f22123f) {
            System.arraycopy(this.f22124g, i11 + this.f22125h, bArr, i9, i10);
        } else {
            int iPosition = this.f22119b.position();
            this.f22119b.get(bArr, i9, i10);
        }
        a(i10);
        return i10;
    }
}
