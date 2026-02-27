package com.google.android.exoplayer2.source.rtsp;

import b4.r;
import com.google.android.exoplayer2.source.rtsp.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements a.InterfaceC0243a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25744a;

    public m(long j9) {
        this.f25744a = j9;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a.InterfaceC0243a
    public a a(int i9) throws IOException {
        l lVar = new l(this.f25744a);
        l lVar2 = new l(this.f25744a);
        try {
            lVar.a(K3.i.a(0));
            int localPort = lVar.getLocalPort();
            boolean z9 = localPort % 2 == 0;
            lVar2.a(K3.i.a(z9 ? localPort + 1 : localPort - 1));
            if (z9) {
                lVar.j(lVar2);
                return lVar;
            }
            lVar2.j(lVar);
            return lVar2;
        } catch (IOException e9) {
            r.a(lVar);
            r.a(lVar2);
            throw e9;
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a.InterfaceC0243a
    public a.InterfaceC0243a b() {
        return new k(this.f25744a);
    }
}
