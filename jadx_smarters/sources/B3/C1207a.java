package b3;

import O2.AbstractC0928w0;
import android.net.Uri;
import b4.AbstractC1216g;
import b4.C1227s;
import d4.k0;
import io.antmedia.rtmp_client.RtmpClient;

/* JADX INFO: renamed from: b3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1207a extends AbstractC1216g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f17468g = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RtmpClient f17469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f17470f;

    static {
        AbstractC0928w0.a("goog.exo.rtmp");
    }

    public C1207a() {
        super(true);
    }

    @Override // b4.InterfaceC1224o
    public long a(C1227s c1227s) throws RtmpClient.a {
        v(c1227s);
        RtmpClient rtmpClient = new RtmpClient();
        this.f17469e = rtmpClient;
        rtmpClient.b(c1227s.f17598a.toString(), false);
        this.f17470f = c1227s.f17598a;
        w(c1227s);
        return -1L;
    }

    @Override // b4.InterfaceC1224o
    public void close() {
        if (this.f17470f != null) {
            this.f17470f = null;
            u();
        }
        RtmpClient rtmpClient = this.f17469e;
        if (rtmpClient != null) {
            rtmpClient.a();
            this.f17469e = null;
        }
    }

    @Override // b4.InterfaceC1224o
    public Uri getUri() {
        return this.f17470f;
    }

    @Override // b4.InterfaceC1220k
    public int read(byte[] bArr, int i9, int i10) throws RtmpClient.a {
        int iC = ((RtmpClient) k0.j(this.f17469e)).c(bArr, i9, i10);
        if (iC == -1) {
            return -1;
        }
        t(iC);
        return iC;
    }
}
