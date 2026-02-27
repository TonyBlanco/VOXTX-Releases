package P1;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import okio.Segment;

/* JADX INFO: loaded from: classes.dex */
public class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f6943a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Charset f6944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f6945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6947f;

    public class a extends ByteArrayOutputStream {
        public a(int i9) {
            super(i9);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i9 = ((ByteArrayOutputStream) this).count;
            if (i9 > 0 && ((ByteArrayOutputStream) this).buf[i9 - 1] == 13) {
                i9--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i9, b.this.f6944c.name());
            } catch (UnsupportedEncodingException e9) {
                throw new AssertionError(e9);
            }
        }
    }

    public b(InputStream inputStream, int i9, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(c.f6949a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f6943a = inputStream;
        this.f6944c = charset;
        this.f6945d = new byte[i9];
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, Segment.SIZE, charset);
    }

    public final void c() throws IOException {
        InputStream inputStream = this.f6943a;
        byte[] bArr = this.f6945d;
        int i9 = inputStream.read(bArr, 0, bArr.length);
        if (i9 == -1) {
            throw new EOFException();
        }
        this.f6946e = 0;
        this.f6947f = i9;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f6943a) {
            try {
                if (this.f6945d != null) {
                    this.f6945d = null;
                    this.f6943a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d() {
        return this.f6947f == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String e() {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f6943a
            monitor-enter(r0)
            byte[] r1 = r7.f6945d     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L83
            int r1 = r7.f6946e     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f6947f     // Catch: java.lang.Throwable -> L11
            if (r1 < r2) goto L14
            r7.c()     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r1 = move-exception
            goto L8b
        L14:
            int r1 = r7.f6946e     // Catch: java.lang.Throwable -> L11
        L16:
            int r2 = r7.f6947f     // Catch: java.lang.Throwable -> L11
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.f6945d     // Catch: java.lang.Throwable -> L11
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L11
            if (r4 != r3) goto L42
            int r3 = r7.f6946e     // Catch: java.lang.Throwable -> L11
            if (r1 == r3) goto L2f
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L11
            r6 = 13
            if (r5 != r6) goto L2f
            goto L30
        L2f:
            r4 = r1
        L30:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L11
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.f6944c     // Catch: java.lang.Throwable -> L11
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L11
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + 1
            r7.f6946e = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r5
        L42:
            int r1 = r1 + 1
            goto L16
        L45:
            P1.b$a r1 = new P1.b$a     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f6947f     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f6946e     // Catch: java.lang.Throwable -> L11
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
        L51:
            byte[] r2 = r7.f6945d     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f6946e     // Catch: java.lang.Throwable -> L11
            int r5 = r7.f6947f     // Catch: java.lang.Throwable -> L11
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L11
            r2 = -1
            r7.f6947f = r2     // Catch: java.lang.Throwable -> L11
            r7.c()     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f6946e     // Catch: java.lang.Throwable -> L11
        L63:
            int r4 = r7.f6947f     // Catch: java.lang.Throwable -> L11
            if (r2 == r4) goto L51
            byte[] r4 = r7.f6945d     // Catch: java.lang.Throwable -> L11
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L11
            if (r5 != r3) goto L80
            int r3 = r7.f6946e     // Catch: java.lang.Throwable -> L11
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L11
        L76:
            int r2 = r2 + 1
            r7.f6946e = r2     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L80:
            int r2 = r2 + 1
            goto L63
        L83:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            throw r1     // Catch: java.lang.Throwable -> L11
        L8b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.b.e():java.lang.String");
    }
}
