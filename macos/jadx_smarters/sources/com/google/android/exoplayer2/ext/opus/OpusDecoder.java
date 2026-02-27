package com.google.android.exoplayer2.ext.opus;

import U2.b;
import U2.c;
import U2.g;
import U2.i;
import a3.C1085c;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer;
import com.google.android.exoplayer2.decoder.a;
import d4.AbstractC1684a;
import d4.k0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OpusDecoder extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f25361n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f25362o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CryptoConfig f25363p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f25364q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f25365r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f25366s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f25367t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f25368u;

    public OpusDecoder(int i9, int i10, int i11, List list, CryptoConfig cryptoConfig, boolean z9) throws C1085c {
        int i12;
        super(new g[i9], new SimpleDecoderOutputBuffer[i10]);
        if (!OpusLibrary.b()) {
            throw new C1085c("Failed to load decoder native libraries");
        }
        this.f25363p = cryptoConfig;
        if (cryptoConfig != null && !OpusLibrary.opusIsSecureDecodeSupported()) {
            throw new C1085c("Opus decoder does not support secure decode");
        }
        int size = list.size();
        int i13 = 1;
        if (size != 1 && size != 3) {
            throw new C1085c("Invalid initialization data size");
        }
        if (size == 3 && (((byte[]) list.get(1)).length != 8 || ((byte[]) list.get(2)).length != 8)) {
            throw new C1085c("Invalid pre-skip or seek pre-roll");
        }
        int iC = C(list);
        this.f25364q = iC;
        this.f25365r = D(list);
        this.f25368u = iC;
        byte[] bArr = (byte[]) list.get(0);
        if (bArr.length < 19) {
            throw new C1085c("Invalid header length");
        }
        int iA = A(bArr);
        this.f25362o = iA;
        if (iA > 8) {
            throw new C1085c("Invalid channel count: " + iA);
        }
        int iF = F(bArr, 16);
        byte[] bArr2 = new byte[8];
        if (bArr[18] == 0) {
            if (iA > 2) {
                throw new C1085c("Invalid header, missing stream map");
            }
            int i14 = iA == 2 ? 1 : 0;
            bArr2[0] = 0;
            bArr2[1] = 1;
            i12 = i14;
        } else {
            if (bArr.length < iA + 21) {
                throw new C1085c("Invalid header length");
            }
            i13 = bArr[19] & 255;
            i12 = bArr[20] & 255;
            System.arraycopy(bArr, 21, bArr2, 0, iA);
        }
        long jOpusInit = opusInit(48000, iA, i13, i12, iF, bArr2);
        this.f25366s = jOpusInit;
        if (jOpusInit == 0) {
            throw new C1085c("Failed to initialize decoder");
        }
        u(i11);
        this.f25361n = z9;
        if (z9) {
            opusSetFloatOutput();
        }
    }

    public static int A(byte[] bArr) {
        return bArr[9] & 255;
    }

    public static int B(ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.remaining() != 8) {
            return 0;
        }
        long j9 = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
        if (j9 < 0) {
            return 0;
        }
        return (int) ((j9 * 48000) / 1000000000);
    }

    public static int C(List list) {
        if (list.size() == 3) {
            return (int) ((ByteBuffer.wrap((byte[]) list.get(1)).order(ByteOrder.nativeOrder()).getLong() * 48000) / 1000000000);
        }
        byte[] bArr = (byte[]) list.get(0);
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int D(List list) {
        if (list.size() == 3) {
            return (int) ((ByteBuffer.wrap((byte[]) list.get(2)).order(ByteOrder.nativeOrder()).getLong() * 48000) / 1000000000);
        }
        return 3840;
    }

    public static int F(byte[] bArr, int i9) {
        return (short) (((bArr[i9 + 1] & 255) << 8) | (bArr[i9] & 255));
    }

    public static int G(int i9, int i10, boolean z9) {
        return i9 * i10 * (z9 ? 4 : 2);
    }

    private native void opusClose(long j9);

    private native int opusDecode(long j9, long j10, ByteBuffer byteBuffer, int i9, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer);

    private native int opusGetErrorCode(long j9);

    private native String opusGetErrorMessage(long j9);

    private native long opusInit(int i9, int i10, int i11, int i12, int i13, byte[] bArr);

    private native void opusReset(long j9);

    private native int opusSecureDecode(long j9, long j10, ByteBuffer byteBuffer, int i9, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i10, CryptoConfig cryptoConfig, int i11, byte[] bArr, byte[] bArr2, int i12, int[] iArr, int[] iArr2);

    private native void opusSetFloatOutput();

    @Override // U2.i
    public g g() {
        return new g(2);
    }

    @Override // U2.d
    public String getName() {
        return "libopus" + OpusLibrary.a();
    }

    @Override // U2.i, U2.d
    public void release() {
        super.release();
        opusClose(this.f25366s);
    }

    @Override // U2.i
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public SimpleDecoderOutputBuffer h() {
        return new SimpleDecoderOutputBuffer(new a.InterfaceC0238a() { // from class: a3.b
            @Override // com.google.android.exoplayer2.decoder.a.InterfaceC0238a
            public final void a(com.google.android.exoplayer2.decoder.a aVar) {
                this.f11505a.r((SimpleDecoderOutputBuffer) aVar);
            }
        });
    }

    @Override // U2.i
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public C1085c i(Throwable th) {
        return new C1085c("Unexpected decode error", th);
    }

    @Override // U2.i
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C1085c j(g gVar, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, boolean z9) {
        OpusDecoder opusDecoder;
        g gVar2;
        int iOpusDecode;
        int iB;
        int iG;
        if (z9) {
            opusReset(this.f25366s);
            this.f25368u = gVar.f9701f == 0 ? this.f25364q : this.f25365r;
        }
        ByteBuffer byteBuffer = (ByteBuffer) k0.j(gVar.f9699d);
        c cVar = gVar.f9698c;
        if (gVar.j()) {
            iOpusDecode = opusSecureDecode(this.f25366s, gVar.f9701f, byteBuffer, byteBuffer.limit(), simpleDecoderOutputBuffer, 48000, this.f25363p, cVar.f9675c, (byte[]) AbstractC1684a.e(cVar.f9674b), (byte[]) AbstractC1684a.e(cVar.f9673a), cVar.f9678f, cVar.f9676d, cVar.f9677e);
            opusDecoder = this;
            gVar2 = gVar;
        } else {
            opusDecoder = this;
            gVar2 = gVar;
            iOpusDecode = opusDecode(opusDecoder.f25366s, gVar2.f9701f, byteBuffer, byteBuffer.limit(), simpleDecoderOutputBuffer);
        }
        if (iOpusDecode < 0) {
            if (iOpusDecode != -2) {
                return new C1085c("Decode error: " + opusDecoder.opusGetErrorMessage(iOpusDecode));
            }
            String str = "Drm error: " + opusDecoder.opusGetErrorMessage(opusDecoder.f25366s);
            return new C1085c(str, new b(opusDecoder.opusGetErrorCode(opusDecoder.f25366s), str));
        }
        ByteBuffer byteBuffer2 = (ByteBuffer) k0.j(simpleDecoderOutputBuffer.data);
        byteBuffer2.position(0);
        byteBuffer2.limit(iOpusDecode);
        if (opusDecoder.f25368u <= 0) {
            if (!opusDecoder.f25367t || !gVar.hasSupplementalData() || (iB = B(gVar2.f9702g)) <= 0 || iOpusDecode < (iG = G(iB, opusDecoder.f25362o, opusDecoder.f25361n))) {
                return null;
            }
            byteBuffer2.limit(iOpusDecode - iG);
            return null;
        }
        int iG2 = G(1, opusDecoder.f25362o, opusDecoder.f25361n);
        int i9 = opusDecoder.f25368u;
        int i10 = i9 * iG2;
        if (iOpusDecode > i10) {
            opusDecoder.f25368u = 0;
            byteBuffer2.position(i10);
            return null;
        }
        opusDecoder.f25368u = i9 - (iOpusDecode / iG2);
        simpleDecoderOutputBuffer.addFlag(Integer.MIN_VALUE);
        byteBuffer2.position(iOpusDecode);
        return null;
    }

    public void z(boolean z9) {
        this.f25367t = z9;
    }
}
