package com.google.android.exoplayer2.ext.flac;

import com.google.android.exoplayer2.ext.flac.FlacDecoderJni;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.a;
import d3.AbstractC1664a;
import d3.InterfaceC1673j;
import d4.AbstractC1684a;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends com.google.android.exoplayer2.extractor.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FlacDecoderJni f25339e;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ext.flac.b$b, reason: collision with other inner class name */
    public static final class C0239b implements a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlacDecoderJni f25340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f25341b;

        public C0239b(FlacDecoderJni flacDecoderJni, c cVar) {
            this.f25340a = flacDecoderJni;
            this.f25341b = cVar;
        }

        @Override // com.google.android.exoplayer2.extractor.a.f
        public a.e a(InterfaceC1673j interfaceC1673j, long j9) throws IOException {
            ByteBuffer byteBuffer = this.f25341b.f25342a;
            long position = interfaceC1673j.getPosition();
            this.f25340a.reset(position);
            try {
                this.f25340a.decodeSampleWithBacktrackPosition(byteBuffer, position);
                if (byteBuffer.limit() == 0) {
                    return a.e.f25398d;
                }
                long lastFrameFirstSampleIndex = this.f25340a.getLastFrameFirstSampleIndex();
                long nextFrameFirstSampleIndex = this.f25340a.getNextFrameFirstSampleIndex();
                long decodePosition = this.f25340a.getDecodePosition();
                if (lastFrameFirstSampleIndex > j9 || nextFrameFirstSampleIndex <= j9) {
                    return nextFrameFirstSampleIndex <= j9 ? a.e.f(nextFrameFirstSampleIndex, decodePosition) : a.e.d(lastFrameFirstSampleIndex, position);
                }
                this.f25341b.f25343b = this.f25340a.getLastFrameTimestamp();
                return a.e.e(interfaceC1673j.getPosition());
            } catch (FlacDecoderJni.a unused) {
                return a.e.f25398d;
            }
        }

        @Override // com.google.android.exoplayer2.extractor.a.f
        public /* synthetic */ void b() {
            AbstractC1664a.a(this);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f25342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f25343b = 0;

        public c(ByteBuffer byteBuffer) {
            this.f25342a = byteBuffer;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FlacStreamMetadata flacStreamMetadata, long j9, long j10, FlacDecoderJni flacDecoderJni, c cVar) {
        super(new com.google.android.exoplayer2.ext.flac.a(flacStreamMetadata), new C0239b(flacDecoderJni, cVar), flacStreamMetadata.getDurationUs(), 0L, flacStreamMetadata.totalSamples, j9, j10, flacStreamMetadata.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata.minFrameSize));
        Objects.requireNonNull(flacStreamMetadata);
        this.f25339e = (FlacDecoderJni) AbstractC1684a.e(flacDecoderJni);
    }

    @Override // com.google.android.exoplayer2.extractor.a
    public void f(boolean z9, long j9) {
        if (z9) {
            return;
        }
        this.f25339e.reset(j9);
    }
}
