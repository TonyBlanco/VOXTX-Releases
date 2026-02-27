package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f39116a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f39117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f39118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f39119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f39120f;

    public n(InputStream inputStream) {
        this(inputStream, 4096);
    }

    public n(InputStream inputStream, int i9) {
        this.f39120f = -1L;
        this.f39116a = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i9);
    }

    public void a(long j9) throws IOException {
        if (this.f39117c > this.f39119e || j9 < this.f39118d) {
            throw new IOException("Cannot reset");
        }
        this.f39116a.reset();
        e(this.f39118d, j9);
        this.f39117c = j9;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f39116a.available();
    }

    public long c(int i9) {
        long j9 = this.f39117c + ((long) i9);
        if (this.f39119e < j9) {
            d(j9);
        }
        return this.f39117c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f39116a.close();
    }

    public final void d(long j9) {
        try {
            long j10 = this.f39118d;
            long j11 = this.f39117c;
            if (j10 >= j11 || j11 > this.f39119e) {
                this.f39118d = j11;
                this.f39116a.mark((int) (j9 - j11));
            } else {
                this.f39116a.reset();
                this.f39116a.mark((int) (j9 - this.f39118d));
                e(this.f39118d, this.f39117c);
            }
            this.f39119e = j9;
        } catch (IOException e9) {
            throw new IllegalStateException("Unable to mark: " + e9);
        }
    }

    public final void e(long j9, long j10) throws IOException {
        while (j9 < j10) {
            long jSkip = this.f39116a.skip(j10 - j9);
            if (jSkip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j9 += jSkip;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i9) {
        this.f39120f = c(i9);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f39116a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i9 = this.f39116a.read();
        if (i9 != -1) {
            this.f39117c++;
        }
        return i9;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int i9 = this.f39116a.read(bArr);
        if (i9 != -1) {
            this.f39117c += (long) i9;
        }
        return i9;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        int i11 = this.f39116a.read(bArr, i9, i10);
        if (i11 != -1) {
            this.f39117c += (long) i11;
        }
        return i11;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        a(this.f39120f);
    }

    @Override // java.io.InputStream
    public long skip(long j9) throws IOException {
        long jSkip = this.f39116a.skip(j9);
        this.f39117c += jSkip;
        return jSkip;
    }
}
