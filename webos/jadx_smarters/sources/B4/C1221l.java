package b4;

import O2.C0897l1;
import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import d4.AbstractC1684a;
import d4.k0;
import java.net.URLDecoder;
import r5.AbstractC2675d;

/* JADX INFO: renamed from: b4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1221l extends AbstractC1216g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1227s f17587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f17588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17590h;

    public C1221l() {
        super(false);
    }

    @Override // b4.InterfaceC1224o
    public long a(C1227s c1227s) throws C0897l1, C1225p {
        v(c1227s);
        this.f17587e = c1227s;
        Uri uriNormalizeScheme = c1227s.f17598a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        AbstractC1684a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrI1 = k0.i1(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrI1.length != 2) {
            throw C0897l1.b("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrI1[1];
        if (strArrI1[0].contains(";base64")) {
            try {
                this.f17588f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e9) {
                throw C0897l1.b("Error while parsing Base64 encoded string: " + str, e9);
            }
        } else {
            this.f17588f = k0.s0(URLDecoder.decode(str, AbstractC2675d.f49722a.name()));
        }
        long j9 = c1227s.f17604g;
        byte[] bArr = this.f17588f;
        if (j9 > bArr.length) {
            this.f17588f = null;
            throw new C1225p(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i9 = (int) j9;
        this.f17589g = i9;
        int length = bArr.length - i9;
        this.f17590h = length;
        long j10 = c1227s.f17605h;
        if (j10 != -1) {
            this.f17590h = (int) Math.min(length, j10);
        }
        w(c1227s);
        long j11 = c1227s.f17605h;
        return j11 != -1 ? j11 : this.f17590h;
    }

    @Override // b4.InterfaceC1224o
    public void close() {
        if (this.f17588f != null) {
            this.f17588f = null;
            u();
        }
        this.f17587e = null;
    }

    @Override // b4.InterfaceC1224o
    public Uri getUri() {
        C1227s c1227s = this.f17587e;
        if (c1227s != null) {
            return c1227s.f17598a;
        }
        return null;
    }

    @Override // b4.InterfaceC1220k
    public int read(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f17590h;
        if (i11 == 0) {
            return -1;
        }
        int iMin = Math.min(i10, i11);
        System.arraycopy(k0.j(this.f17588f), this.f17589g, bArr, i9, iMin);
        this.f17589g += iMin;
        this.f17590h -= iMin;
        t(iMin);
        return iMin;
    }
}
