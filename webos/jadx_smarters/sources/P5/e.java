package P5;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class e implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f7297h = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f7298a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f7301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f7302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f7303g = new byte[16];

    public class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7304a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f7305b;

        public a(StringBuilder sb) {
            this.f7305b = sb;
        }

        @Override // P5.e.d
        public void a(InputStream inputStream, int i9) {
            if (this.f7304a) {
                this.f7304a = false;
            } else {
                this.f7305b.append(", ");
            }
            this.f7305b.append(i9);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f7307c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7309b;

        public b(int i9, int i10) {
            this.f7308a = i9;
            this.f7309b = i10;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f7308a + ", length = " + this.f7309b + "]";
        }
    }

    public final class c extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7310a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7311c;

        public c(b bVar) {
            this.f7310a = e.this.Y(bVar.f7308a + 4);
            this.f7311c = bVar.f7309b;
        }

        public /* synthetic */ c(e eVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f7311c == 0) {
                return -1;
            }
            e.this.f7298a.seek(this.f7310a);
            int i9 = e.this.f7298a.read();
            this.f7310a = e.this.Y(this.f7310a + 1);
            this.f7311c--;
            return i9;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i9, int i10) throws IOException {
            e.n(bArr, "buffer");
            if ((i9 | i10) < 0 || i10 > bArr.length - i9) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i11 = this.f7311c;
            if (i11 <= 0) {
                return -1;
            }
            if (i10 > i11) {
                i10 = i11;
            }
            e.this.v(this.f7310a, bArr, i9, i10);
            this.f7310a = e.this.Y(this.f7310a + i10);
            this.f7311c -= i10;
            return i10;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i9);
    }

    public e(File file) throws IOException {
        if (!file.exists()) {
            l(file);
        }
        this.f7298a = o(file);
        q();
    }

    public static void c0(byte[] bArr, int i9, int i10) {
        bArr[i9] = (byte) (i10 >> 24);
        bArr[i9 + 1] = (byte) (i10 >> 16);
        bArr[i9 + 2] = (byte) (i10 >> 8);
        bArr[i9 + 3] = (byte) i10;
    }

    public static void d0(byte[] bArr, int... iArr) {
        int i9 = 0;
        for (int i10 : iArr) {
            c0(bArr, i9, i10);
            i9 += 4;
        }
    }

    public static void l(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileO = o(file2);
        try {
            randomAccessFileO.setLength(4096L);
            randomAccessFileO.seek(0L);
            byte[] bArr = new byte[16];
            d0(bArr, 4096, 0, 0, 0);
            randomAccessFileO.write(bArr);
            randomAccessFileO.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFileO.close();
            throw th;
        }
    }

    public static Object n(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static RandomAccessFile o(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    public static int r(byte[] bArr, int i9) {
        return ((bArr[i9] & 255) << 24) + ((bArr[i9 + 1] & 255) << 16) + ((bArr[i9 + 2] & 255) << 8) + (bArr[i9 + 3] & 255);
    }

    public final void T(int i9) throws IOException {
        this.f7298a.setLength(i9);
        this.f7298a.getChannel().force(true);
    }

    public int V() {
        if (this.f7300d == 0) {
            return 16;
        }
        b bVar = this.f7302f;
        int i9 = bVar.f7308a;
        int i10 = this.f7301e.f7308a;
        return i9 >= i10 ? (i9 - i10) + 4 + bVar.f7309b + 16 : (((i9 + 4) + bVar.f7309b) + this.f7299c) - i10;
    }

    public final int Y(int i9) {
        int i10 = this.f7299c;
        return i9 < i10 ? i9 : (i9 + 16) - i10;
    }

    public final void b0(int i9, int i10, int i11, int i12) throws IOException {
        d0(this.f7303g, i9, i10, i11, i12);
        this.f7298a.seek(0L);
        this.f7298a.write(this.f7303g);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f7298a.close();
    }

    public void g(byte[] bArr) {
        h(bArr, 0, bArr.length);
    }

    public synchronized void h(byte[] bArr, int i9, int i10) {
        int iY;
        try {
            n(bArr, "buffer");
            if ((i9 | i10) < 0 || i10 > bArr.length - i9) {
                throw new IndexOutOfBoundsException();
            }
            j(i10);
            boolean zM = m();
            if (zM) {
                iY = 16;
            } else {
                b bVar = this.f7302f;
                iY = Y(bVar.f7308a + 4 + bVar.f7309b);
            }
            b bVar2 = new b(iY, i10);
            c0(this.f7303g, 0, i10);
            w(bVar2.f7308a, this.f7303g, 0, 4);
            w(bVar2.f7308a + 4, bArr, i9, i10);
            b0(this.f7299c, this.f7300d + 1, zM ? bVar2.f7308a : this.f7301e.f7308a, bVar2.f7308a);
            this.f7302f = bVar2;
            this.f7300d++;
            if (zM) {
                this.f7301e = bVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void i() {
        try {
            b0(4096, 0, 0, 0);
            this.f7300d = 0;
            b bVar = b.f7307c;
            this.f7301e = bVar;
            this.f7302f = bVar;
            if (this.f7299c > 4096) {
                T(4096);
            }
            this.f7299c = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void j(int i9) throws IOException {
        int i10 = i9 + 4;
        int iS = s();
        if (iS >= i10) {
            return;
        }
        int i11 = this.f7299c;
        do {
            iS += i11;
            i11 <<= 1;
        } while (iS < i10);
        T(i11);
        b bVar = this.f7302f;
        int iY = Y(bVar.f7308a + 4 + bVar.f7309b);
        if (iY < this.f7301e.f7308a) {
            FileChannel channel = this.f7298a.getChannel();
            channel.position(this.f7299c);
            long j9 = iY - 4;
            if (channel.transferTo(16L, j9, channel) != j9) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i12 = this.f7302f.f7308a;
        int i13 = this.f7301e.f7308a;
        if (i12 < i13) {
            int i14 = (this.f7299c + i12) - 16;
            b0(i11, this.f7300d, i13, i14);
            this.f7302f = new b(i14, this.f7302f.f7309b);
        } else {
            b0(i11, this.f7300d, i13, i12);
        }
        this.f7299c = i11;
    }

    public synchronized void k(d dVar) {
        int iY = this.f7301e.f7308a;
        for (int i9 = 0; i9 < this.f7300d; i9++) {
            b bVarP = p(iY);
            dVar.a(new c(this, bVarP, null), bVarP.f7309b);
            iY = Y(bVarP.f7308a + 4 + bVarP.f7309b);
        }
    }

    public synchronized boolean m() {
        return this.f7300d == 0;
    }

    public final b p(int i9) throws IOException {
        if (i9 == 0) {
            return b.f7307c;
        }
        this.f7298a.seek(i9);
        return new b(i9, this.f7298a.readInt());
    }

    public final void q() throws IOException {
        this.f7298a.seek(0L);
        this.f7298a.readFully(this.f7303g);
        int iR = r(this.f7303g, 0);
        this.f7299c = iR;
        if (iR <= this.f7298a.length()) {
            this.f7300d = r(this.f7303g, 4);
            int iR2 = r(this.f7303g, 8);
            int iR3 = r(this.f7303g, 12);
            this.f7301e = p(iR2);
            this.f7302f = p(iR3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f7299c + ", Actual length: " + this.f7298a.length());
    }

    public final int s() {
        return this.f7299c - V();
    }

    public synchronized void t() {
        try {
            if (m()) {
                throw new NoSuchElementException();
            }
            if (this.f7300d == 1) {
                i();
            } else {
                b bVar = this.f7301e;
                int iY = Y(bVar.f7308a + 4 + bVar.f7309b);
                v(iY, this.f7303g, 0, 4);
                int iR = r(this.f7303g, 0);
                b0(this.f7299c, this.f7300d - 1, iY, this.f7302f.f7308a);
                this.f7300d--;
                this.f7301e = new b(iY, iR);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f7299c);
        sb.append(", size=");
        sb.append(this.f7300d);
        sb.append(", first=");
        sb.append(this.f7301e);
        sb.append(", last=");
        sb.append(this.f7302f);
        sb.append(", element lengths=[");
        try {
            k(new a(sb));
        } catch (IOException e9) {
            f7297h.log(Level.WARNING, "read error", (Throwable) e9);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final void v(int i9, byte[] bArr, int i10, int i11) throws IOException {
        RandomAccessFile randomAccessFile;
        int iY = Y(i9);
        int i12 = iY + i11;
        int i13 = this.f7299c;
        if (i12 <= i13) {
            this.f7298a.seek(iY);
            randomAccessFile = this.f7298a;
        } else {
            int i14 = i13 - iY;
            this.f7298a.seek(iY);
            this.f7298a.readFully(bArr, i10, i14);
            this.f7298a.seek(16L);
            randomAccessFile = this.f7298a;
            i10 += i14;
            i11 -= i14;
        }
        randomAccessFile.readFully(bArr, i10, i11);
    }

    public final void w(int i9, byte[] bArr, int i10, int i11) throws IOException {
        RandomAccessFile randomAccessFile;
        int iY = Y(i9);
        int i12 = iY + i11;
        int i13 = this.f7299c;
        if (i12 <= i13) {
            this.f7298a.seek(iY);
            randomAccessFile = this.f7298a;
        } else {
            int i14 = i13 - iY;
            this.f7298a.seek(iY);
            this.f7298a.write(bArr, i10, i14);
            this.f7298a.seek(16L);
            randomAccessFile = this.f7298a;
            i10 += i14;
            i11 -= i14;
        }
        randomAccessFile.write(bArr, i10, i11);
    }
}
