package q2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: q2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2537f extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46811a;

    public C2537f(InputStream inputStream) {
        super(inputStream);
        this.f46811a = Integer.MIN_VALUE;
    }

    public final long a(long j9) {
        int i9 = this.f46811a;
        if (i9 == 0) {
            return -1L;
        }
        return (i9 == Integer.MIN_VALUE || j9 <= ((long) i9)) ? j9 : i9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i9 = this.f46811a;
        return i9 == Integer.MIN_VALUE ? super.available() : Math.min(i9, super.available());
    }

    public final void c(long j9) {
        int i9 = this.f46811a;
        if (i9 == Integer.MIN_VALUE || j9 == -1) {
            return;
        }
        this.f46811a = (int) (((long) i9) - j9);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i9) {
        super.mark(i9);
        this.f46811a = i9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int i9 = super.read();
        c(1L);
        return i9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        int iA = (int) a(i10);
        if (iA == -1) {
            return -1;
        }
        int i11 = super.read(bArr, i9, iA);
        c(i11);
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        super.reset();
        this.f46811a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j9) throws IOException {
        long jA = a(j9);
        if (jA == -1) {
            return -1L;
        }
        long jSkip = super.skip(jA);
        c(jSkip);
        return jSkip;
    }
}
