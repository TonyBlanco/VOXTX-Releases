package com.google.android.exoplayer2.ext.ffmpeg;

import O2.C0936z0;
import U2.g;
import U2.i;
import com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer;
import com.google.android.exoplayer2.decoder.a;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
final class FfmpegAudioDecoder extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f25325n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f25326o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f25327p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f25328q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f25329r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f25330s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile int f25331t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile int f25332u;

    public FfmpegAudioDecoder(C0936z0 c0936z0, int i9, int i10, int i11, boolean z9) throws Y2.a {
        super(new g[i9], new SimpleDecoderOutputBuffer[i10]);
        if (!FfmpegLibrary.d()) {
            throw new Y2.a("Failed to load decoder native libraries.");
        }
        AbstractC1684a.e(c0936z0.f6467m);
        String str = (String) AbstractC1684a.e(FfmpegLibrary.a(c0936z0.f6467m));
        this.f25325n = str;
        byte[] bArrC = C(c0936z0.f6467m, c0936z0.f6469o);
        this.f25326o = bArrC;
        this.f25327p = z9 ? 4 : 2;
        this.f25328q = z9 ? 131072 : 65536;
        long jFfmpegInitialize = ffmpegInitialize(str, bArrC, z9, c0936z0.f6447A, c0936z0.f6480z);
        this.f25329r = jFfmpegInitialize;
        if (jFfmpegInitialize == 0) {
            throw new Y2.a("Initialization failed.");
        }
        u(i11);
    }

    public static byte[] C(String str, List list) {
        str.hashCode();
        switch (str) {
            case "audio/vorbis":
                return E(list);
            case "audio/mp4a-latm":
            case "audio/opus":
                return (byte[]) list.get(0);
            case "audio/alac":
                return z(list);
            default:
                return null;
        }
    }

    public static byte[] E(List list) {
        byte[] bArr = (byte[]) list.get(0);
        byte[] bArr2 = (byte[]) list.get(1);
        byte[] bArr3 = new byte[bArr.length + bArr2.length + 6];
        bArr3[0] = (byte) (bArr.length >> 8);
        bArr3[1] = (byte) (bArr.length & 255);
        System.arraycopy(bArr, 0, bArr3, 2, bArr.length);
        bArr3[bArr.length + 2] = 0;
        bArr3[bArr.length + 3] = 0;
        bArr3[bArr.length + 4] = (byte) (bArr2.length >> 8);
        bArr3[bArr.length + 5] = (byte) (bArr2.length & 255);
        System.arraycopy(bArr2, 0, bArr3, bArr.length + 6, bArr2.length);
        return bArr3;
    }

    private native int ffmpegDecode(long j9, ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10);

    private native int ffmpegGetChannelCount(long j9);

    private native int ffmpegGetSampleRate(long j9);

    private native long ffmpegInitialize(String str, byte[] bArr, boolean z9, int i9, int i10);

    private native void ffmpegRelease(long j9);

    private native long ffmpegReset(long j9, byte[] bArr);

    public static byte[] z(List list) {
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length + 12;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1634492771);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(bArr, 0, bArr.length);
        return byteBufferAllocate.array();
    }

    public int A() {
        return this.f25331t;
    }

    public int B() {
        return this.f25327p;
    }

    public int D() {
        return this.f25332u;
    }

    @Override // U2.i
    public g g() {
        return new g(2, FfmpegLibrary.b());
    }

    @Override // U2.d
    public String getName() {
        return "ffmpeg" + FfmpegLibrary.c() + "-" + this.f25325n;
    }

    @Override // U2.i, U2.d
    public void release() {
        super.release();
        ffmpegRelease(this.f25329r);
        this.f25329r = 0L;
    }

    @Override // U2.i
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public SimpleDecoderOutputBuffer h() {
        return new SimpleDecoderOutputBuffer(new a.InterfaceC0238a() { // from class: com.google.android.exoplayer2.ext.ffmpeg.a
            @Override // com.google.android.exoplayer2.decoder.a.InterfaceC0238a
            public final void a(com.google.android.exoplayer2.decoder.a aVar) {
                this.f25336a.r((SimpleDecoderOutputBuffer) aVar);
            }
        });
    }

    @Override // U2.i
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Y2.a i(Throwable th) {
        return new Y2.a("Unexpected decode error", th);
    }

    @Override // U2.i
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Y2.a j(g gVar, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, boolean z9) {
        if (z9) {
            long jFfmpegReset = ffmpegReset(this.f25329r, this.f25326o);
            this.f25329r = jFfmpegReset;
            if (jFfmpegReset == 0) {
                return new Y2.a("Error resetting (see logcat).");
            }
        }
        ByteBuffer byteBuffer = (ByteBuffer) k0.j(gVar.f9699d);
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferInit = simpleDecoderOutputBuffer.init(gVar.f9701f, this.f25328q);
        int iFfmpegDecode = ffmpegDecode(this.f25329r, byteBuffer, iLimit, byteBufferInit, this.f25328q);
        if (iFfmpegDecode == -2) {
            return new Y2.a("Error decoding (see logcat).");
        }
        if (iFfmpegDecode == -1) {
            simpleDecoderOutputBuffer.setFlags(Integer.MIN_VALUE);
            return null;
        }
        if (iFfmpegDecode == 0) {
            simpleDecoderOutputBuffer.setFlags(Integer.MIN_VALUE);
            return null;
        }
        if (!this.f25330s) {
            this.f25331t = ffmpegGetChannelCount(this.f25329r);
            this.f25332u = ffmpegGetSampleRate(this.f25329r);
            if (this.f25332u == 0 && "alac".equals(this.f25325n)) {
                AbstractC1684a.e(this.f25326o);
                M m9 = new M(this.f25326o);
                m9.U(this.f25326o.length - 4);
                this.f25332u = m9.L();
            }
            this.f25330s = true;
        }
        byteBufferInit.position(0);
        byteBufferInit.limit(iFfmpegDecode);
        return null;
    }
}
