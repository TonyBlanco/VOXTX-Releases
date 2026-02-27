package c3;

import O2.C0936z0;
import O2.D1;
import U2.h;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer;
import com.google.android.exoplayer2.ext.vp9.VpxDecoder;
import com.google.android.exoplayer2.ext.vp9.VpxLibrary;
import d4.a0;
import e4.AbstractC1741d;
import e4.InterfaceC1735A;

/* JADX INFO: renamed from: c3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1252a extends AbstractC1741d {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final int f18192Z;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f18193e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int f18194f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public VpxDecoder f18195g0;

    public C1252a(long j9, Handler handler, InterfaceC1735A interfaceC1735A, int i9) {
        this(j9, handler, interfaceC1735A, i9, Runtime.getRuntime().availableProcessors(), 4, 4);
    }

    public C1252a(long j9, Handler handler, InterfaceC1735A interfaceC1735A, int i9, int i10, int i11, int i12) {
        super(j9, handler, interfaceC1735A, i9);
        this.f18194f0 = i10;
        this.f18192Z = i11;
        this.f18193e0 = i12;
    }

    @Override // e4.AbstractC1741d
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public VpxDecoder V(C0936z0 c0936z0, CryptoConfig cryptoConfig) {
        a0.a("createVpxDecoder");
        int i9 = c0936z0.f6468n;
        VpxDecoder vpxDecoder = new VpxDecoder(this.f18192Z, this.f18193e0, i9 != -1 ? i9 : 786432, cryptoConfig, this.f18194f0);
        this.f18195g0 = vpxDecoder;
        a0.c();
        return vpxDecoder;
    }

    @Override // e4.AbstractC1741d
    public h S(String str, C0936z0 c0936z0, C0936z0 c0936z02) {
        return new h(str, c0936z0, c0936z02, 3, 0);
    }

    @Override // O2.E1
    public final int a(C0936z0 c0936z0) {
        return (VpxLibrary.b() && "video/x-vnd.on2.vp9".equalsIgnoreCase(c0936z0.f6467m)) ? !VpxLibrary.c(c0936z0.f6454H) ? D1.a(2) : D1.b(4, 16, 0) : D1.a(0);
    }

    @Override // O2.C1, O2.E1
    public String getName() {
        return "LibvpxVideoRenderer";
    }

    @Override // e4.AbstractC1741d
    public void t0(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) throws C1254c {
        VpxDecoder vpxDecoder = this.f18195g0;
        if (vpxDecoder == null) {
            throw new C1254c("Failed to render output buffer to surface: decoder is not initialized.");
        }
        vpxDecoder.z(videoDecoderOutputBuffer, surface);
        videoDecoderOutputBuffer.release();
    }

    @Override // e4.AbstractC1741d
    public void v0(int i9) {
        VpxDecoder vpxDecoder = this.f18195g0;
        if (vpxDecoder != null) {
            vpxDecoder.A(i9);
        }
    }
}
