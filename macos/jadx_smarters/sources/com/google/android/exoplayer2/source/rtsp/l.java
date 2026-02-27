package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import b4.AbstractC1223n;
import b4.C1227s;
import b4.S;
import b4.T;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.source.rtsp.g;
import d4.AbstractC1684a;
import d4.k0;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f25742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f25743b;

    public l(long j9) {
        this.f25742a = new T(AdError.SERVER_ERROR_CODE, w5.f.d(j9));
    }

    @Override // b4.InterfaceC1224o
    public long a(C1227s c1227s) {
        return this.f25742a.a(c1227s);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public String c() {
        int localPort = getLocalPort();
        AbstractC1684a.g(localPort != -1);
        return k0.D("RTP/AVP;unicast;client_port=%d-%d", Integer.valueOf(localPort), Integer.valueOf(localPort + 1));
    }

    @Override // b4.InterfaceC1224o
    public void close() {
        this.f25742a.close();
        l lVar = this.f25743b;
        if (lVar != null) {
            lVar.close();
        }
    }

    @Override // b4.InterfaceC1224o
    public /* synthetic */ Map e() {
        return AbstractC1223n.a(this);
    }

    @Override // b4.InterfaceC1224o
    public void g(S s9) {
        this.f25742a.g(s9);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public int getLocalPort() {
        int localPort = this.f25742a.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // b4.InterfaceC1224o
    public Uri getUri() {
        return this.f25742a.getUri();
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public boolean i() {
        return true;
    }

    public void j(l lVar) {
        AbstractC1684a.a(this != lVar);
        this.f25743b = lVar;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public g.b l() {
        return null;
    }

    @Override // b4.InterfaceC1220k
    public int read(byte[] bArr, int i9, int i10) throws T.a {
        try {
            return this.f25742a.read(bArr, i9, i10);
        } catch (T.a e9) {
            if (e9.f17591a == 2002) {
                return -1;
            }
            throw e9;
        }
    }
}
