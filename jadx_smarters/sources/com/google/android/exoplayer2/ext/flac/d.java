package com.google.android.exoplayer2.ext.flac;

import O2.C0897l1;
import com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer;
import com.google.android.exoplayer2.decoder.a;
import com.google.android.exoplayer2.ext.flac.FlacDecoderJni;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import d4.k0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends U2.i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final FlacStreamMetadata f25345n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final FlacDecoderJni f25346o;

    public d(int i9, int i10, int i11, List list) throws e {
        super(new U2.g[i9], new SimpleDecoderOutputBuffer[i10]);
        if (list.size() != 1) {
            throw new e("Initialization data must be of length 1");
        }
        FlacDecoderJni flacDecoderJni = new FlacDecoderJni();
        this.f25346o = flacDecoderJni;
        flacDecoderJni.setData(ByteBuffer.wrap((byte[]) list.get(0)));
        try {
            FlacStreamMetadata flacStreamMetadataDecodeStreamMetadata = flacDecoderJni.decodeStreamMetadata();
            this.f25345n = flacStreamMetadataDecodeStreamMetadata;
            u(i11 == -1 ? flacStreamMetadataDecodeStreamMetadata.maxFrameSize : i11);
        } catch (C0897l1 e9) {
            throw new e("Failed to decode StreamInfo", e9);
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // U2.i
    public U2.g g() {
        return new U2.g(1);
    }

    @Override // U2.d
    public String getName() {
        return "libflac";
    }

    @Override // U2.i, U2.d
    public void release() {
        super.release();
        this.f25346o.release();
    }

    @Override // U2.i
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public SimpleDecoderOutputBuffer h() {
        return new SimpleDecoderOutputBuffer(new a.InterfaceC0238a() { // from class: com.google.android.exoplayer2.ext.flac.c
            @Override // com.google.android.exoplayer2.decoder.a.InterfaceC0238a
            public final void a(com.google.android.exoplayer2.decoder.a aVar) {
                this.f25344a.r((SimpleDecoderOutputBuffer) aVar);
            }
        });
    }

    @Override // U2.i
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public e i(Throwable th) {
        return new e("Unexpected decode error", th);
    }

    @Override // U2.i
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public e j(U2.g gVar, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, boolean z9) {
        if (z9) {
            this.f25346o.flush();
        }
        this.f25346o.setData((ByteBuffer) k0.j(gVar.f9699d));
        try {
            this.f25346o.decodeSample(simpleDecoderOutputBuffer.init(gVar.f9701f, this.f25345n.getMaxDecodedFrameSize()));
            return null;
        } catch (FlacDecoderJni.a e9) {
            return new e("Frame decoding failed", e9);
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public FlacStreamMetadata z() {
        return this.f25345n;
    }
}
