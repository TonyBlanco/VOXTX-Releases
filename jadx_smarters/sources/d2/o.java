package d2;

import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class o extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile byte[] f39557a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39561f;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public o(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.f39560e = -1;
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("buffer is null or empty");
        }
        this.f39557a = bArr;
    }

    public static IOException d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i9 = this.f39560e;
        if (i9 != -1) {
            int i10 = this.f39561f - i9;
            int i11 = this.f39559d;
            if (i10 < i11) {
                if (i9 == 0 && i11 > bArr.length && this.f39558c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i11) {
                        i11 = length;
                    }
                    if (Log.isLoggable("BufferedIs", 3)) {
                        Log.d("BufferedIs", "allocate buffer of length: " + i11);
                    }
                    byte[] bArr2 = new byte[i11];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f39557a = bArr2;
                    bArr = bArr2;
                } else if (i9 > 0) {
                    System.arraycopy(bArr, i9, bArr, 0, bArr.length - i9);
                }
                int i12 = this.f39561f - this.f39560e;
                this.f39561f = i12;
                this.f39560e = 0;
                this.f39558c = 0;
                int i13 = inputStream.read(bArr, i12, bArr.length - i12);
                int i14 = this.f39561f;
                if (i13 > 0) {
                    i14 += i13;
                }
                this.f39558c = i14;
                return i13;
            }
        }
        int i15 = inputStream.read(bArr);
        if (i15 > 0) {
            this.f39560e = -1;
            this.f39561f = 0;
            this.f39558c = i15;
        }
        return i15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f39557a == null || inputStream == null) {
            throw d();
        }
        return (this.f39558c - this.f39561f) + inputStream.available();
    }

    public synchronized void c() {
        this.f39559d = this.f39557a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f39557a = null;
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i9) {
        this.f39559d = Math.max(this.f39559d, i9);
        this.f39560e = this.f39561f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f39557a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw d();
        }
        if (this.f39561f >= this.f39558c && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f39557a && (bArr = this.f39557a) == null) {
            throw d();
        }
        int i9 = this.f39558c;
        int i10 = this.f39561f;
        if (i9 - i10 <= 0) {
            return -1;
        }
        this.f39561f = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i9, int i10) {
        int i11;
        int i12;
        byte[] bArr2 = this.f39557a;
        if (bArr2 == null) {
            throw d();
        }
        if (i10 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw d();
        }
        int i13 = this.f39561f;
        int i14 = this.f39558c;
        if (i13 < i14) {
            int i15 = i14 - i13 >= i10 ? i10 : i14 - i13;
            System.arraycopy(bArr2, i13, bArr, i9, i15);
            this.f39561f += i15;
            if (i15 == i10 || inputStream.available() == 0) {
                return i15;
            }
            i9 += i15;
            i11 = i10 - i15;
        } else {
            i11 = i10;
        }
        while (true) {
            if (this.f39560e == -1 && i11 >= bArr2.length) {
                i12 = inputStream.read(bArr, i9, i11);
                if (i12 == -1) {
                    return i11 != i10 ? i10 - i11 : -1;
                }
            } else {
                if (a(inputStream, bArr2) == -1) {
                    return i11 != i10 ? i10 - i11 : -1;
                }
                if (bArr2 != this.f39557a && (bArr2 = this.f39557a) == null) {
                    throw d();
                }
                int i16 = this.f39558c;
                int i17 = this.f39561f;
                i12 = i16 - i17 >= i11 ? i11 : i16 - i17;
                System.arraycopy(bArr2, i17, bArr, i9, i12);
                this.f39561f += i12;
            }
            i11 -= i12;
            if (i11 == 0) {
                return i10;
            }
            if (inputStream.available() == 0) {
                return i10 - i11;
            }
            i9 += i12;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f39557a == null) {
            throw new IOException("Stream is closed");
        }
        int i9 = this.f39560e;
        if (-1 == i9) {
            throw new a("Mark has been invalidated");
        }
        this.f39561f = i9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j9) {
        byte[] bArr = this.f39557a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null) {
            throw d();
        }
        if (j9 < 1) {
            return 0L;
        }
        if (inputStream == null) {
            throw d();
        }
        int i9 = this.f39558c;
        int i10 = this.f39561f;
        if (i9 - i10 >= j9) {
            this.f39561f = (int) (((long) i10) + j9);
            return j9;
        }
        long j10 = i9 - i10;
        this.f39561f = i9;
        if (this.f39560e == -1 || j9 > this.f39559d) {
            return j10 + inputStream.skip(j9 - j10);
        }
        if (a(inputStream, bArr) == -1) {
            return j10;
        }
        int i11 = this.f39558c;
        int i12 = this.f39561f;
        long j11 = j9 - j10;
        if (i11 - i12 >= j11) {
            this.f39561f = (int) (((long) i12) + j11);
            return j9;
        }
        long j12 = (j10 + ((long) i11)) - ((long) i12);
        this.f39561f = i11;
        return j12;
    }
}
