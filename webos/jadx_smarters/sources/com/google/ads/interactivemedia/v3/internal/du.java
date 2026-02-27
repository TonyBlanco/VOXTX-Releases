package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class du extends ct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f22740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f22742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AssetFileDescriptor f22743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InputStream f22744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f22745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22746g;

    public du(Context context) {
        super(false);
        this.f22740a = context.getResources();
        this.f22741b = context.getPackageName();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.InterfaceC1310k
    public final int a(byte[] bArr, int i9, int i10) throws dt {
        if (i10 == 0) {
            return 0;
        }
        long j9 = this.f22745f;
        if (j9 == 0) {
            return -1;
        }
        if (j9 != -1) {
            try {
                i10 = (int) Math.min(j9, i10);
            } catch (IOException e9) {
                throw new dt(null, e9, AdError.SERVER_ERROR_CODE);
            }
        }
        InputStream inputStream = this.f22744e;
        int i11 = cq.f22640a;
        int i12 = inputStream.read(bArr, i9, i10);
        if (i12 == -1) {
            if (this.f22745f == -1) {
                return -1;
            }
            throw new dt("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
        }
        long j10 = this.f22745f;
        if (j10 != -1) {
            this.f22745f = j10 - ((long) i12);
        }
        g(i12);
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.ads.interactivemedia.v3.internal.cy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(com.google.ads.interactivemedia.v3.internal.dc r18) throws com.google.ads.interactivemedia.v3.internal.dt {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.du.b(com.google.ads.interactivemedia.v3.internal.dc):long");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final Uri c() {
        return this.f22742c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final void d() throws dt {
        this.f22742c = null;
        try {
            try {
                InputStream inputStream = this.f22744e;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f22744e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f22743d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e9) {
                        throw new dt(null, e9, AdError.SERVER_ERROR_CODE);
                    }
                } finally {
                    this.f22743d = null;
                    if (this.f22746g) {
                        this.f22746g = false;
                        h();
                    }
                }
            } catch (IOException e10) {
                throw new dt(null, e10, AdError.SERVER_ERROR_CODE);
            }
        } catch (Throwable th) {
            this.f22744e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f22743d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f22743d = null;
                    if (this.f22746g) {
                        this.f22746g = false;
                        h();
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new dt(null, e11, AdError.SERVER_ERROR_CODE);
                }
            } catch (Throwable th2) {
                this.f22743d = null;
                if (this.f22746g) {
                    this.f22746g = false;
                    h();
                }
                throw th2;
            }
        }
    }
}
