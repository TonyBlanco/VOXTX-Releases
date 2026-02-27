package q2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: q2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2533b extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46801a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46802c;

    public C2533b(InputStream inputStream, long j9) {
        super(inputStream);
        this.f46801a = j9;
    }

    public static InputStream c(InputStream inputStream, long j9) {
        return new C2533b(inputStream, j9);
    }

    public final int a(int i9) throws IOException {
        if (i9 >= 0) {
            this.f46802c += i9;
        } else if (this.f46801a - ((long) this.f46802c) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f46801a + ", but read: " + this.f46802c);
        }
        return i9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f46801a - ((long) this.f46802c), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        return a(super.read());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i9, int i10) {
        return a(super.read(bArr, i9, i10));
    }
}
