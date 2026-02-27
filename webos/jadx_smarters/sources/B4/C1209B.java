package b4;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import b4.InterfaceC1224o;
import com.facebook.ads.AdError;
import d4.AbstractC1684a;
import d4.k0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: b4.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1209B extends AbstractC1216g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RandomAccessFile f17472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f17473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17475h;

    /* JADX INFO: renamed from: b4.B$a */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    /* JADX INFO: renamed from: b4.B$b */
    public static final class b implements InterfaceC1224o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public S f17476a;

        @Override // b4.InterfaceC1224o.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1209B a() {
            C1209B c1209b = new C1209B();
            S s9 = this.f17476a;
            if (s9 != null) {
                c1209b.g(s9);
            }
            return c1209b;
        }
    }

    /* JADX INFO: renamed from: b4.B$c */
    public static class c extends C1225p {
        public c(String str, Throwable th, int i9) {
            super(str, th, i9);
        }

        public c(Throwable th, int i9) {
            super(th, i9);
        }
    }

    public C1209B() {
        super(false);
    }

    public static RandomAccessFile x(Uri uri) throws c {
        int i9 = AdError.INTERNAL_ERROR_2006;
        try {
            return new RandomAccessFile((String) AbstractC1684a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e9) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new c(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e9, 1004);
            }
            if (k0.f39777a < 21 || !a.b(e9.getCause())) {
                i9 = 2005;
            }
            throw new c(e9, i9);
        } catch (SecurityException e10) {
            throw new c(e10, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e11) {
            throw new c(e11, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // b4.InterfaceC1224o
    public long a(C1227s c1227s) throws c {
        Uri uri = c1227s.f17598a;
        this.f17473f = uri;
        v(c1227s);
        RandomAccessFile randomAccessFileX = x(uri);
        this.f17472e = randomAccessFileX;
        try {
            randomAccessFileX.seek(c1227s.f17604g);
            long length = c1227s.f17605h;
            if (length == -1) {
                length = this.f17472e.length() - c1227s.f17604g;
            }
            this.f17474g = length;
            if (length < 0) {
                throw new c(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            this.f17475h = true;
            w(c1227s);
            return this.f17474g;
        } catch (IOException e9) {
            throw new c(e9, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // b4.InterfaceC1224o
    public void close() {
        this.f17473f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f17472e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e9) {
                throw new c(e9, AdError.SERVER_ERROR_CODE);
            }
        } finally {
            this.f17472e = null;
            if (this.f17475h) {
                this.f17475h = false;
                u();
            }
        }
    }

    @Override // b4.InterfaceC1224o
    public Uri getUri() {
        return this.f17473f;
    }

    @Override // b4.InterfaceC1220k
    public int read(byte[] bArr, int i9, int i10) throws c {
        if (i10 == 0) {
            return 0;
        }
        if (this.f17474g == 0) {
            return -1;
        }
        try {
            int i11 = ((RandomAccessFile) k0.j(this.f17472e)).read(bArr, i9, (int) Math.min(this.f17474g, i10));
            if (i11 > 0) {
                this.f17474g -= (long) i11;
                t(i11);
            }
            return i11;
        } catch (IOException e9) {
            throw new c(e9, AdError.SERVER_ERROR_CODE);
        }
    }
}
