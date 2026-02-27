package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes3.dex */
public final class dm extends ct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RandomAccessFile f22729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f22730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f22731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22732d;

    public dm() {
        super(false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.InterfaceC1310k
    public final int a(byte[] bArr, int i9, int i10) throws dl {
        if (i10 == 0) {
            return 0;
        }
        long j9 = this.f22731c;
        if (j9 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f22729a;
            int i11 = cq.f22640a;
            int i12 = randomAccessFile.read(bArr, i9, (int) Math.min(j9, i10));
            if (i12 > 0) {
                this.f22731c -= (long) i12;
                g(i12);
            }
            return i12;
        } catch (IOException e9) {
            throw new dl(e9, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final long b(dc dcVar) throws dl {
        Uri uri = dcVar.f22688a;
        this.f22730b = uri;
        i(dcVar);
        int i9 = AdError.INTERNAL_ERROR_2006;
        try {
            String path = uri.getPath();
            af.s(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f22729a = randomAccessFile;
            try {
                randomAccessFile.seek(dcVar.f22692e);
                long length = dcVar.f22693f;
                if (length == -1) {
                    length = this.f22729a.length() - dcVar.f22692e;
                }
                this.f22731c = length;
                if (length < 0) {
                    throw new dl(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                this.f22732d = true;
                j(dcVar);
                return this.f22731c;
            } catch (IOException e9) {
                throw new dl(e9, AdError.SERVER_ERROR_CODE);
            }
        } catch (FileNotFoundException e10) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new dl(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
            }
            if (cq.f22640a < 21 || !dk.b(e10.getCause())) {
                i9 = 2005;
            }
            throw new dl(e10, i9);
        } catch (SecurityException e11) {
            throw new dl(e11, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e12) {
            throw new dl(e12, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final Uri c() {
        return this.f22730b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final void d() throws dl {
        this.f22730b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f22729a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f22729a = null;
                if (this.f22732d) {
                    this.f22732d = false;
                    h();
                }
            } catch (IOException e9) {
                throw new dl(e9, AdError.SERVER_ERROR_CODE);
            }
        } catch (Throwable th) {
            this.f22729a = null;
            if (this.f22732d) {
                this.f22732d = false;
                h();
            }
            throw th;
        }
    }
}
