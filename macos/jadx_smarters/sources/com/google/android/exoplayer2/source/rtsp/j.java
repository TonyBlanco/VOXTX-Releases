package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import b4.AbstractC1216g;
import b4.C1227s;
import com.google.android.exoplayer2.source.rtsp.g;
import d4.AbstractC1684a;
import d4.k0;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends AbstractC1216g implements a, g.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f25737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f25738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f25739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25740h;

    public j(long j9) {
        super(true);
        this.f25738f = j9;
        this.f25737e = new LinkedBlockingQueue();
        this.f25739g = new byte[0];
        this.f25740h = -1;
    }

    @Override // b4.InterfaceC1224o
    public long a(C1227s c1227s) {
        this.f25740h = c1227s.f17598a.getPort();
        return -1L;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public String c() {
        AbstractC1684a.g(this.f25740h != -1);
        return k0.D("RTP/AVP/TCP;unicast;interleaved=%d-%d", Integer.valueOf(this.f25740h), Integer.valueOf(this.f25740h + 1));
    }

    @Override // b4.InterfaceC1224o
    public void close() {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public int getLocalPort() {
        return this.f25740h;
    }

    @Override // b4.InterfaceC1224o
    public Uri getUri() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public boolean i() {
        return false;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.g.b
    public void j(byte[] bArr) {
        this.f25737e.add(bArr);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.a
    public g.b l() {
        return this;
    }

    @Override // b4.InterfaceC1220k
    public int read(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int iMin = Math.min(i10, this.f25739g.length);
        System.arraycopy(this.f25739g, 0, bArr, i9, iMin);
        byte[] bArr2 = this.f25739g;
        this.f25739g = Arrays.copyOfRange(bArr2, iMin, bArr2.length);
        if (iMin == i10) {
            return iMin;
        }
        try {
            byte[] bArr3 = (byte[]) this.f25737e.poll(this.f25738f, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int iMin2 = Math.min(i10 - iMin, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i9 + iMin, iMin2);
            if (iMin2 < bArr3.length) {
                this.f25739g = Arrays.copyOfRange(bArr3, iMin2, bArr3.length);
            }
            return iMin + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }
}
