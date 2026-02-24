package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes3.dex */
public final class cw extends ct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private dc f22669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f22670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22672d;

    public cw() {
        super(false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.InterfaceC1310k
    public final int a(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f22672d;
        if (i11 == 0) {
            return -1;
        }
        int iMin = Math.min(i10, i11);
        System.arraycopy(cq.G(this.f22670b), this.f22671c, bArr, i9, iMin);
        this.f22671c += iMin;
        this.f22672d -= iMin;
        g(iMin);
        return iMin;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final long b(dc dcVar) throws IOException {
        i(dcVar);
        this.f22669a = dcVar;
        Uri uri = dcVar.f22688a;
        String scheme = uri.getScheme();
        af.v("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] strArrAk = cq.ak(uri.getSchemeSpecificPart(), ",");
        if (strArrAk.length != 2) {
            throw as.b("Unexpected URI format: ".concat(String.valueOf(uri)), null);
        }
        String str = strArrAk[1];
        if (strArrAk[0].contains(";base64")) {
            try {
                this.f22670b = Base64.decode(str, 0);
            } catch (IllegalArgumentException e9) {
                throw as.b("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e9);
            }
        } else {
            this.f22670b = cq.ad(URLDecoder.decode(str, ath.f20680a.name()));
        }
        long j9 = dcVar.f22692e;
        int length = this.f22670b.length;
        if (j9 > length) {
            this.f22670b = null;
            throw new cz(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i9 = (int) j9;
        this.f22671c = i9;
        int i10 = length - i9;
        this.f22672d = i10;
        long j10 = dcVar.f22693f;
        if (j10 != -1) {
            this.f22672d = (int) Math.min(i10, j10);
        }
        j(dcVar);
        long j11 = dcVar.f22693f;
        return j11 != -1 ? j11 : this.f22672d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final Uri c() {
        dc dcVar = this.f22669a;
        if (dcVar != null) {
            return dcVar.f22688a;
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final void d() {
        if (this.f22670b != null) {
            this.f22670b = null;
            h();
        }
        this.f22669a = null;
    }
}
