package com.google.ads.interactivemedia.v3.internal;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: com.google.ads.interactivemedia.v3.internal.do, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public class Cdo extends cz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22733b;

    public Cdo() {
        super(b(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.f22733b = 1;
    }

    public Cdo(IOException iOException, int i9, int i10) {
        super(iOException, b(i9, i10));
        this.f22733b = i10;
    }

    public Cdo(String str, IOException iOException, int i9) {
        super(str, iOException, b(i9, 1));
        this.f22733b = 1;
    }

    public static Cdo a(IOException iOException, dc dcVar, int i9) {
        String message = iOException.getMessage();
        int i10 = iOException instanceof SocketTimeoutException ? AdError.CACHE_ERROR_CODE : iOException instanceof InterruptedIOException ? 1004 : (message == null || !com.google.ads.interactivemedia.v3.impl.data.k.d(message).matches("cleartext.*not permitted.*")) ? AdError.INTERNAL_ERROR_CODE : 2007;
        return i10 == 2007 ? new dn(iOException, dcVar) : new Cdo(iOException, i10, i9);
    }

    private static int b(int i9, int i10) {
        return i9 == 2000 ? i10 != 1 ? AdError.SERVER_ERROR_CODE : AdError.INTERNAL_ERROR_CODE : i9;
    }
}
