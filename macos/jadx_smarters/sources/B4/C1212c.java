package b4;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import d4.AbstractC1684a;
import d4.k0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: b4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1212c extends AbstractC1216g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f17564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f17565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f17566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17568i;

    /* JADX INFO: renamed from: b4.c$a */
    public static final class a extends C1225p {
        public a(Throwable th, int i9) {
            super(th, i9);
        }
    }

    public C1212c(Context context) {
        super(false);
        this.f17564e = context.getAssets();
    }

    @Override // b4.InterfaceC1224o
    public long a(C1227s c1227s) throws a {
        try {
            Uri uri = c1227s.f17598a;
            this.f17565f = uri;
            String strSubstring = (String) AbstractC1684a.e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            v(c1227s);
            InputStream inputStreamOpen = this.f17564e.open(strSubstring, 1);
            this.f17566g = inputStreamOpen;
            if (inputStreamOpen.skip(c1227s.f17604g) < c1227s.f17604g) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long j9 = c1227s.f17605h;
            if (j9 != -1) {
                this.f17567h = j9;
            } else {
                long jAvailable = this.f17566g.available();
                this.f17567h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f17567h = -1L;
                }
            }
            this.f17568i = true;
            w(c1227s);
            return this.f17567h;
        } catch (a e9) {
            throw e9;
        } catch (IOException e10) {
            throw new a(e10, e10 instanceof FileNotFoundException ? 2005 : AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // b4.InterfaceC1224o
    public void close() {
        this.f17565f = null;
        try {
            try {
                InputStream inputStream = this.f17566g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e9) {
                throw new a(e9, AdError.SERVER_ERROR_CODE);
            }
        } finally {
            this.f17566g = null;
            if (this.f17568i) {
                this.f17568i = false;
                u();
            }
        }
    }

    @Override // b4.InterfaceC1224o
    public Uri getUri() {
        return this.f17565f;
    }

    @Override // b4.InterfaceC1220k
    public int read(byte[] bArr, int i9, int i10) throws a {
        if (i10 == 0) {
            return 0;
        }
        long j9 = this.f17567h;
        if (j9 == 0) {
            return -1;
        }
        if (j9 != -1) {
            try {
                i10 = (int) Math.min(j9, i10);
            } catch (IOException e9) {
                throw new a(e9, AdError.SERVER_ERROR_CODE);
            }
        }
        int i11 = ((InputStream) k0.j(this.f17566g)).read(bArr, i9, i10);
        if (i11 == -1) {
            return -1;
        }
        long j10 = this.f17567h;
        if (j10 != -1) {
            this.f17567h = j10 - ((long) i11);
        }
        t(i11);
        return i11;
    }
}
