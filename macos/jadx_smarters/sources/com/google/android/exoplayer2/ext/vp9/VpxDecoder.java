package com.google.android.exoplayer2.ext.vp9;

import U2.b;
import U2.c;
import U2.g;
import U2.i;
import android.view.Surface;
import c3.C1254c;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer;
import com.google.android.exoplayer2.decoder.a;
import d4.AbstractC1684a;
import d4.k0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class VpxDecoder extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CryptoConfig f25371n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f25372o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ByteBuffer f25373p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile int f25374q;

    public VpxDecoder(int i9, int i10, int i11, CryptoConfig cryptoConfig, int i12) throws C1254c {
        super(new g[i9], new VideoDecoderOutputBuffer[i10]);
        if (!VpxLibrary.b()) {
            throw new C1254c("Failed to load decoder native libraries.");
        }
        this.f25371n = cryptoConfig;
        if (cryptoConfig != null && !VpxLibrary.vpxIsSecureDecodeSupported()) {
            throw new C1254c("Vpx decoder does not support secure decode.");
        }
        long jVpxInit = vpxInit(false, false, i12);
        this.f25372o = jVpxInit;
        if (jVpxInit == 0) {
            throw new C1254c("Failed to initialize decoder");
        }
        u(i11);
    }

    private native long vpxClose(long j9);

    private native long vpxDecode(long j9, ByteBuffer byteBuffer, int i9);

    private native int vpxGetErrorCode(long j9);

    private native String vpxGetErrorMessage(long j9);

    private native int vpxGetFrame(long j9, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    private native long vpxInit(boolean z9, boolean z10, int i9);

    private native int vpxReleaseFrame(long j9, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    private native int vpxRenderFrame(long j9, Surface surface, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    private native long vpxSecureDecode(long j9, ByteBuffer byteBuffer, int i9, CryptoConfig cryptoConfig, int i10, byte[] bArr, byte[] bArr2, int i11, int[] iArr, int[] iArr2);

    public void A(int i9) {
        this.f25374q = i9;
    }

    @Override // U2.i
    public g g() {
        return new g(2);
    }

    @Override // U2.d
    public String getName() {
        return "libvpx" + VpxLibrary.a();
    }

    @Override // U2.i, U2.d
    public void release() {
        super.release();
        this.f25373p = null;
        vpxClose(this.f25372o);
    }

    @Override // U2.i
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public VideoDecoderOutputBuffer h() {
        return new VideoDecoderOutputBuffer(new a.InterfaceC0238a() { // from class: c3.b
            @Override // com.google.android.exoplayer2.decoder.a.InterfaceC0238a
            public final void a(com.google.android.exoplayer2.decoder.a aVar) {
                this.f18196a.y((VideoDecoderOutputBuffer) aVar);
            }
        });
    }

    @Override // U2.i
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C1254c i(Throwable th) {
        return new C1254c("Unexpected decode error", th);
    }

    @Override // U2.i
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public C1254c j(g gVar, VideoDecoderOutputBuffer videoDecoderOutputBuffer, boolean z9) {
        ByteBuffer byteBuffer;
        int iRemaining;
        ByteBuffer byteBuffer2;
        if (z9 && (byteBuffer2 = this.f25373p) != null) {
            byteBuffer2.clear();
        }
        ByteBuffer byteBuffer3 = (ByteBuffer) k0.j(gVar.f9699d);
        int iLimit = byteBuffer3.limit();
        c cVar = gVar.f9698c;
        long jVpxSecureDecode = gVar.j() ? vpxSecureDecode(this.f25372o, byteBuffer3, iLimit, this.f25371n, cVar.f9675c, (byte[]) AbstractC1684a.e(cVar.f9674b), (byte[]) AbstractC1684a.e(cVar.f9673a), cVar.f9678f, cVar.f9676d, cVar.f9677e) : vpxDecode(this.f25372o, byteBuffer3, iLimit);
        if (jVpxSecureDecode != 0) {
            if (jVpxSecureDecode != -2) {
                return new C1254c("Decode error: " + vpxGetErrorMessage(this.f25372o));
            }
            String str = "Drm error: " + vpxGetErrorMessage(this.f25372o);
            return new C1254c(str, new b(vpxGetErrorCode(this.f25372o), str));
        }
        if (gVar.hasSupplementalData() && (iRemaining = (byteBuffer = (ByteBuffer) AbstractC1684a.e(gVar.f9702g)).remaining()) > 0) {
            ByteBuffer byteBuffer4 = this.f25373p;
            if (byteBuffer4 == null || byteBuffer4.capacity() < iRemaining) {
                this.f25373p = ByteBuffer.allocate(iRemaining);
            } else {
                this.f25373p.clear();
            }
            this.f25373p.put(byteBuffer);
            this.f25373p.flip();
        }
        if (gVar.isDecodeOnly()) {
            return null;
        }
        videoDecoderOutputBuffer.init(gVar.f9701f, this.f25374q, this.f25373p);
        int iVpxGetFrame = vpxGetFrame(this.f25372o, videoDecoderOutputBuffer);
        if (iVpxGetFrame == 1) {
            videoDecoderOutputBuffer.addFlag(Integer.MIN_VALUE);
        } else if (iVpxGetFrame == -1) {
            return new C1254c("Buffer initialization failed.");
        }
        videoDecoderOutputBuffer.format = gVar.f9697a;
        return null;
    }

    public void y(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        if (this.f25374q == 1 && !videoDecoderOutputBuffer.isDecodeOnly()) {
            vpxReleaseFrame(this.f25372o, videoDecoderOutputBuffer);
        }
        super.r(videoDecoderOutputBuffer);
    }

    public void z(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) throws C1254c {
        if (vpxRenderFrame(this.f25372o, surface, videoDecoderOutputBuffer) == -1) {
            throw new C1254c("Buffer render failed.");
        }
    }
}
