package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class cs extends ct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f22654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f22655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InputStream f22656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f22657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22658e;

    public cs(Context context) {
        super(false);
        this.f22654a = context.getAssets();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.InterfaceC1310k
    public final int a(byte[] bArr, int i9, int i10) throws cr {
        if (i10 == 0) {
            return 0;
        }
        long j9 = this.f22657d;
        if (j9 == 0) {
            return -1;
        }
        if (j9 != -1) {
            try {
                i10 = (int) Math.min(j9, i10);
            } catch (IOException e9) {
                throw new cr(e9, AdError.SERVER_ERROR_CODE);
            }
        }
        InputStream inputStream = this.f22656c;
        int i11 = cq.f22640a;
        int i12 = inputStream.read(bArr, i9, i10);
        if (i12 == -1) {
            return -1;
        }
        long j10 = this.f22657d;
        if (j10 != -1) {
            this.f22657d = j10 - ((long) i12);
        }
        g(i12);
        return i12;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final long b(dc dcVar) throws cr {
        try {
            Uri uri = dcVar.f22688a;
            this.f22655b = uri;
            String path = uri.getPath();
            af.s(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            i(dcVar);
            InputStream inputStreamOpen = this.f22654a.open(path, 1);
            this.f22656c = inputStreamOpen;
            if (inputStreamOpen.skip(dcVar.f22692e) < dcVar.f22692e) {
                throw new cr(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long j9 = dcVar.f22693f;
            if (j9 != -1) {
                this.f22657d = j9;
            } else {
                long jAvailable = this.f22656c.available();
                this.f22657d = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f22657d = -1L;
                }
            }
            this.f22658e = true;
            j(dcVar);
            return this.f22657d;
        } catch (cr e9) {
            throw e9;
        } catch (IOException e10) {
            throw new cr(e10, true != (e10 instanceof FileNotFoundException) ? AdError.SERVER_ERROR_CODE : 2005);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final Uri c() {
        return this.f22655b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final void d() throws cr {
        this.f22655b = null;
        try {
            try {
                InputStream inputStream = this.f22656c;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f22656c = null;
                if (this.f22658e) {
                    this.f22658e = false;
                    h();
                }
            } catch (IOException e9) {
                throw new cr(e9, AdError.SERVER_ERROR_CODE);
            }
        } catch (Throwable th) {
            this.f22656c = null;
            if (this.f22658e) {
                this.f22658e = false;
                h();
            }
            throw th;
        }
    }
}
