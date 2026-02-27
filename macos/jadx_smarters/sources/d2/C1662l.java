package d2;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import okhttp3.internal.http2.Settings;

/* JADX INFO: renamed from: d2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1662l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f39546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f39547c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f39548a;

    /* JADX INFO: renamed from: d2.l$a */
    public enum a {
        GIF(true),
        JPEG(false),
        PNG_A(true),
        PNG(false),
        UNKNOWN(false);

        private final boolean hasAlpha;

        a(boolean z9) {
            this.hasAlpha = z9;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    /* JADX INFO: renamed from: d2.l$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f39549a;

        public b(byte[] bArr) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            this.f39549a = byteBufferWrap;
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        }

        public short a(int i9) {
            return this.f39549a.getShort(i9);
        }

        public int b(int i9) {
            return this.f39549a.getInt(i9);
        }

        public int c() {
            return this.f39549a.array().length;
        }

        public void d(ByteOrder byteOrder) {
            this.f39549a.order(byteOrder);
        }
    }

    /* JADX INFO: renamed from: d2.l$c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f39550a;

        public c(InputStream inputStream) {
            this.f39550a = inputStream;
        }

        public int a() {
            return this.f39550a.read();
        }

        public int b() {
            return ((this.f39550a.read() << 8) & 65280) | (this.f39550a.read() & 255);
        }

        public short c() {
            return (short) (this.f39550a.read() & 255);
        }

        public int d(byte[] bArr) throws IOException {
            int length = bArr.length;
            while (length > 0) {
                int i9 = this.f39550a.read(bArr, bArr.length - length, length);
                if (i9 == -1) {
                    break;
                }
                length -= i9;
            }
            return bArr.length - length;
        }

        public long e(long j9) throws IOException {
            if (j9 < 0) {
                return 0L;
            }
            long j10 = j9;
            while (j10 > 0) {
                long jSkip = this.f39550a.skip(j10);
                if (jSkip <= 0) {
                    if (this.f39550a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j10 -= jSkip;
            }
            return j9 - j10;
        }
    }

    static {
        byte[] bytes = new byte[0];
        try {
            bytes = "Exif\u0000\u0000".getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        f39546b = bytes;
    }

    public C1662l(InputStream inputStream) {
        this.f39548a = new c(inputStream);
    }

    public static int a(int i9, int i10) {
        return i9 + 2 + (i10 * 12);
    }

    public static boolean e(int i9) {
        return (i9 & 65496) == 65496 || i9 == 19789 || i9 == 18761;
    }

    public static int g(b bVar) {
        ByteOrder byteOrder;
        StringBuilder sb;
        String str;
        String string;
        short sA = bVar.a(6);
        if (sA == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (sA == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Unknown endianness = " + ((int) sA));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.d(byteOrder);
        int iB = bVar.b(10) + 6;
        short sA2 = bVar.a(iB);
        for (int i9 = 0; i9 < sA2; i9++) {
            int iA = a(iB, i9);
            short sA3 = bVar.a(iA);
            if (sA3 == 274) {
                short sA4 = bVar.a(iA + 2);
                if (sA4 >= 1 && sA4 <= 12) {
                    int iB2 = bVar.b(iA + 4);
                    if (iB2 >= 0) {
                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                            Log.d("ImageHeaderParser", "Got tagIndex=" + i9 + " tagType=" + ((int) sA3) + " formatCode=" + ((int) sA4) + " componentCount=" + iB2);
                        }
                        int i10 = iB2 + f39547c[sA4];
                        if (i10 <= 4) {
                            int i11 = iA + 8;
                            if (i11 >= 0 && i11 <= bVar.c()) {
                                if (i10 >= 0 && i10 + i11 <= bVar.c()) {
                                    return bVar.a(i11);
                                }
                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    sb = new StringBuilder();
                                    sb.append("Illegal number of bytes for TI tag data tagType=");
                                    sb.append((int) sA3);
                                }
                            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                string = "Illegal tagValueOffset=" + i11 + " tagType=" + ((int) sA3);
                                Log.d("ImageHeaderParser", string);
                            }
                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                            sb = new StringBuilder();
                            str = "Got byte count > 4, not orientation, continuing, formatCode=";
                            sb.append(str);
                            sb.append((int) sA4);
                        }
                    } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                        string = "Negative tiff component count";
                        Log.d("ImageHeaderParser", string);
                    }
                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                    sb = new StringBuilder();
                    str = "Got invalid format code=";
                    sb.append(str);
                    sb.append((int) sA4);
                }
                string = sb.toString();
                Log.d("ImageHeaderParser", string);
            }
        }
        return -1;
    }

    public final byte[] b() throws IOException {
        short sC;
        int iB;
        long j9;
        long jE;
        do {
            short sC2 = this.f39548a.c();
            if (sC2 != 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Unknown segmentId=" + ((int) sC2));
                }
                return null;
            }
            sC = this.f39548a.c();
            if (sC == 218) {
                return null;
            }
            if (sC == 217) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return null;
            }
            iB = this.f39548a.b() - 2;
            if (sC == 225) {
                byte[] bArr = new byte[iB];
                int iD = this.f39548a.d(bArr);
                if (iD == iB) {
                    return bArr;
                }
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Unable to read segment data, type: " + ((int) sC) + ", length: " + iB + ", actually read: " + iD);
                }
                return null;
            }
            j9 = iB;
            jE = this.f39548a.e(j9);
        } while (jE == j9);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to skip enough data, type: " + ((int) sC) + ", wanted to skip: " + iB + ", but actually skipped: " + jE);
        }
        return null;
    }

    public int c() throws IOException {
        if (!e(this.f39548a.b())) {
            return -1;
        }
        byte[] bArrB = b();
        boolean z9 = false;
        boolean z10 = bArrB != null && bArrB.length > f39546b.length;
        if (z10) {
            int i9 = 0;
            while (true) {
                byte[] bArr = f39546b;
                if (i9 >= bArr.length) {
                    break;
                }
                if (bArrB[i9] != bArr[i9]) {
                    break;
                }
                i9++;
            }
            z9 = z10;
        } else {
            z9 = z10;
        }
        if (z9) {
            return g(new b(bArrB));
        }
        return -1;
    }

    public a d() throws IOException {
        int iB = this.f39548a.b();
        if (iB == 65496) {
            return a.JPEG;
        }
        int iB2 = ((iB << 16) & (-65536)) | (this.f39548a.b() & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        if (iB2 != -1991225785) {
            return (iB2 >> 8) == 4671814 ? a.GIF : a.UNKNOWN;
        }
        this.f39548a.e(21L);
        return this.f39548a.a() >= 3 ? a.PNG_A : a.PNG;
    }

    public boolean f() {
        return d().hasAlpha();
    }
}
