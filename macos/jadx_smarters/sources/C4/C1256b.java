package c4;

import android.support.v4.media.session.PlaybackStateCompat;
import b4.C1227s;
import b4.InterfaceC1222m;
import c4.InterfaceC1255a;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.k0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: c4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1256b implements InterfaceC1222m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1255a f18197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1227s f18200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public File f18202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OutputStream f18203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C1273s f18206j;

    /* JADX INFO: renamed from: c4.b$a */
    public static final class a extends InterfaceC1255a.C0213a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    /* JADX INFO: renamed from: c4.b$b, reason: collision with other inner class name */
    public static final class C0214b implements InterfaceC1222m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC1255a f18207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f18208b = 5242880;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18209c = 20480;

        @Override // b4.InterfaceC1222m.a
        public InterfaceC1222m a() {
            return new C1256b((InterfaceC1255a) AbstractC1684a.e(this.f18207a), this.f18208b, this.f18209c);
        }

        public C0214b b(InterfaceC1255a interfaceC1255a) {
            this.f18207a = interfaceC1255a;
            return this;
        }
    }

    public C1256b(InterfaceC1255a interfaceC1255a, long j9, int i9) {
        AbstractC1684a.h(j9 > 0 || j9 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j9 != -1 && j9 < PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
            AbstractC1681B.j("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f18197a = (InterfaceC1255a) AbstractC1684a.e(interfaceC1255a);
        this.f18198b = j9 == -1 ? Long.MAX_VALUE : j9;
        this.f18199c = i9;
    }

    @Override // b4.InterfaceC1222m
    public void a(C1227s c1227s) throws a {
        AbstractC1684a.e(c1227s.f17606i);
        if (c1227s.f17605h == -1 && c1227s.d(2)) {
            this.f18200d = null;
            return;
        }
        this.f18200d = c1227s;
        this.f18201e = c1227s.d(4) ? this.f18198b : Long.MAX_VALUE;
        this.f18205i = 0L;
        try {
            c(c1227s);
        } catch (IOException e9) {
            throw new a(e9);
        }
    }

    public final void b() {
        OutputStream outputStream = this.f18203g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            k0.o(this.f18203g);
            this.f18203g = null;
            File file = (File) k0.j(this.f18202f);
            this.f18202f = null;
            this.f18197a.i(file, this.f18204h);
        } catch (Throwable th) {
            k0.o(this.f18203g);
            this.f18203g = null;
            File file2 = (File) k0.j(this.f18202f);
            this.f18202f = null;
            file2.delete();
            throw th;
        }
    }

    public final void c(C1227s c1227s) {
        long j9 = c1227s.f17605h;
        this.f18202f = this.f18197a.a((String) k0.j(c1227s.f17606i), c1227s.f17604g + this.f18205i, j9 != -1 ? Math.min(j9 - this.f18205i, this.f18201e) : -1L);
        OutputStream fileOutputStream = new FileOutputStream(this.f18202f);
        if (this.f18199c > 0) {
            C1273s c1273s = this.f18206j;
            if (c1273s == null) {
                this.f18206j = new C1273s(fileOutputStream, this.f18199c);
            } else {
                c1273s.a(fileOutputStream);
            }
            fileOutputStream = this.f18206j;
        }
        this.f18203g = fileOutputStream;
        this.f18204h = 0L;
    }

    @Override // b4.InterfaceC1222m
    public void close() throws a {
        if (this.f18200d == null) {
            return;
        }
        try {
            b();
        } catch (IOException e9) {
            throw new a(e9);
        }
    }

    @Override // b4.InterfaceC1222m
    public void write(byte[] bArr, int i9, int i10) throws a {
        C1227s c1227s = this.f18200d;
        if (c1227s == null) {
            return;
        }
        int i11 = 0;
        while (i11 < i10) {
            try {
                if (this.f18204h == this.f18201e) {
                    b();
                    c(c1227s);
                }
                int iMin = (int) Math.min(i10 - i11, this.f18201e - this.f18204h);
                ((OutputStream) k0.j(this.f18203g)).write(bArr, i9 + i11, iMin);
                i11 += iMin;
                long j9 = iMin;
                this.f18204h += j9;
                this.f18205i += j9;
            } catch (IOException e9) {
                throw new a(e9);
            }
        }
    }
}
