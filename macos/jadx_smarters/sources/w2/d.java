package W2;

import O2.C0936z0;
import O2.D1;
import U2.h;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer;
import com.google.android.exoplayer2.ext.av1.Gav1Decoder;
import d4.a0;
import d4.k0;
import e4.AbstractC1741d;
import e4.InterfaceC1735A;

/* JADX INFO: loaded from: classes3.dex */
public class d extends AbstractC1741d {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f10227h0 = ((k0.l(1280, 64) * k0.l(720, 64)) * 6144) / 2;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final int f10228Z;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f10229e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int f10230f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Gav1Decoder f10231g0;

    public d(long j9, Handler handler, InterfaceC1735A interfaceC1735A, int i9) {
        this(j9, handler, interfaceC1735A, i9, 0, 4, 4);
    }

    public d(long j9, Handler handler, InterfaceC1735A interfaceC1735A, int i9, int i10, int i11, int i12) {
        super(j9, handler, interfaceC1735A, i9);
        this.f10230f0 = i10;
        this.f10228Z = i11;
        this.f10229e0 = i12;
    }

    @Override // e4.AbstractC1741d
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final Gav1Decoder V(C0936z0 c0936z0, CryptoConfig cryptoConfig) {
        a0.a("createGav1Decoder");
        int i9 = c0936z0.f6468n;
        if (i9 == -1) {
            i9 = f10227h0;
        }
        Gav1Decoder gav1Decoder = new Gav1Decoder(this.f10228Z, this.f10229e0, i9, this.f10230f0);
        this.f10231g0 = gav1Decoder;
        a0.c();
        return gav1Decoder;
    }

    @Override // e4.AbstractC1741d
    public h S(String str, C0936z0 c0936z0, C0936z0 c0936z02) {
        return new h(str, c0936z0, c0936z02, 3, 0);
    }

    @Override // O2.E1
    public final int a(C0936z0 c0936z0) {
        return ("video/av01".equalsIgnoreCase(c0936z0.f6467m) && c.a()) ? c0936z0.f6454H != 0 ? D1.a(2) : D1.b(4, 16, 0) : D1.a(0);
    }

    @Override // O2.C1, O2.E1
    public String getName() {
        return "Libgav1VideoRenderer";
    }

    @Override // e4.AbstractC1741d
    public void t0(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) throws b {
        Gav1Decoder gav1Decoder = this.f10231g0;
        if (gav1Decoder == null) {
            throw new b("Failed to render output buffer to surface: decoder is not initialized.");
        }
        gav1Decoder.z(videoDecoderOutputBuffer, surface);
        videoDecoderOutputBuffer.release();
    }

    @Override // e4.AbstractC1741d
    public void v0(int i9) {
        Gav1Decoder gav1Decoder = this.f10231g0;
        if (gav1Decoder != null) {
            gav1Decoder.A(i9);
        }
    }
}
