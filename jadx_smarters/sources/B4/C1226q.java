package b4;

import d4.AbstractC1684a;
import java.io.InputStream;

/* JADX INFO: renamed from: b4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1226q extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1224o f17592a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1227s f17593c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17597g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17595e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17596f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f17594d = new byte[1];

    public C1226q(InterfaceC1224o interfaceC1224o, C1227s c1227s) {
        this.f17592a = interfaceC1224o;
        this.f17593c = c1227s;
    }

    public final void a() {
        if (this.f17595e) {
            return;
        }
        this.f17592a.a(this.f17593c);
        this.f17595e = true;
    }

    public void c() {
        a();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f17596f) {
            return;
        }
        this.f17592a.close();
        this.f17596f = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f17594d) == -1) {
            return -1;
        }
        return this.f17594d[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) {
        AbstractC1684a.g(!this.f17596f);
        a();
        int i11 = this.f17592a.read(bArr, i9, i10);
        if (i11 == -1) {
            return -1;
        }
        this.f17597g += (long) i11;
        return i11;
    }
}
