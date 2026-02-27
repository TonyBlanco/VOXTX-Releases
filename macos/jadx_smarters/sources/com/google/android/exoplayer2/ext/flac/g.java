package com.google.android.exoplayer2.ext.flac;

import O2.C0936z0;
import android.net.Uri;
import com.google.android.exoplayer2.ext.flac.FlacDecoderJni;
import com.google.android.exoplayer2.ext.flac.b;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.g;
import d3.AbstractC1677n;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.InterfaceC1678o;
import d3.t;
import d3.u;
import d3.w;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import q3.C2540a;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements InterfaceC1672i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final InterfaceC1678o f25347k = new InterfaceC1678o() { // from class: com.google.android.exoplayer2.ext.flac.f
        @Override // d3.InterfaceC1678o
        public /* synthetic */ InterfaceC1672i[] a(Uri uri, Map map) {
            return AbstractC1677n.a(this, uri, map);
        }

        @Override // d3.InterfaceC1678o
        public final InterfaceC1672i[] b() {
            return g.i();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f25348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FlacDecoderJni f25350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1674k f25351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f25352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FlacStreamMetadata f25354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b.c f25355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2540a f25356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f25357j;

    public static final class a implements com.google.android.exoplayer2.extractor.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f25358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FlacDecoderJni f25359b;

        public a(long j9, FlacDecoderJni flacDecoderJni) {
            this.f25358a = j9;
            this.f25359b = flacDecoderJni;
        }

        @Override // com.google.android.exoplayer2.extractor.g
        public g.a e(long j9) {
            g.a seekPoints = this.f25359b.getSeekPoints(j9);
            return seekPoints == null ? new g.a(u.f39609c) : seekPoints;
        }

        @Override // com.google.android.exoplayer2.extractor.g
        public boolean g() {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.g
        public long i() {
            return this.f25358a;
        }
    }

    public g() {
        this(0);
    }

    public g(int i9) {
        this.f25348a = new M();
        this.f25349b = (i9 & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC1672i[] i() {
        return new InterfaceC1672i[]{new g()};
    }

    public static void j(FlacStreamMetadata flacStreamMetadata, C2540a c2540a, w wVar) {
        wVar.d(new C0936z0.b().g0("audio/raw").I(flacStreamMetadata.getDecodedBitrate()).b0(flacStreamMetadata.getDecodedBitrate()).Y(flacStreamMetadata.getMaxDecodedFrameSize()).J(flacStreamMetadata.channels).h0(flacStreamMetadata.sampleRate).a0(k0.h0(flacStreamMetadata.bitsPerSample)).Z(c2540a).G());
    }

    public static void k(M m9, int i9, long j9, w wVar) {
        m9.U(0);
        wVar.b(m9, i9);
        wVar.f(j9, 1, i9, 0, null);
    }

    public static b l(FlacDecoderJni flacDecoderJni, FlacStreamMetadata flacStreamMetadata, long j9, InterfaceC1674k interfaceC1674k, b.c cVar) {
        com.google.android.exoplayer2.extractor.g bVar;
        b bVar2 = null;
        if (flacDecoderJni.getSeekPoints(0L) != null) {
            bVar = new a(flacStreamMetadata.getDurationUs(), flacDecoderJni);
        } else if (j9 == -1 || flacStreamMetadata.totalSamples <= 0) {
            bVar = new g.b(flacStreamMetadata.getDurationUs());
        } else {
            b bVar3 = new b(flacStreamMetadata, flacDecoderJni.getDecodePosition(), j9, flacDecoderJni, cVar);
            bVar = bVar3.b();
            bVar2 = bVar3;
        }
        interfaceC1674k.n(bVar);
        return bVar2;
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        if (j9 == 0) {
            this.f25353f = false;
        }
        FlacDecoderJni flacDecoderJni = this.f25350c;
        if (flacDecoderJni != null) {
            flacDecoderJni.reset(j9);
        }
        b bVar = this.f25357j;
        if (bVar != null) {
            bVar.h(j10);
        }
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f25351d = interfaceC1674k;
        this.f25352e = interfaceC1674k.e(0, 1);
        this.f25351d.q();
        try {
            this.f25350c = new FlacDecoderJni();
        } catch (e e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // d3.InterfaceC1672i
    public int d(InterfaceC1673j interfaceC1673j, t tVar) {
        if (interfaceC1673j.getPosition() == 0 && !this.f25349b && this.f25356i == null) {
            this.f25356i = com.google.android.exoplayer2.extractor.d.c(interfaceC1673j, true);
        }
        FlacDecoderJni flacDecoderJniG = g(interfaceC1673j);
        try {
            e(interfaceC1673j);
            b bVar = this.f25357j;
            if (bVar != null && bVar.d()) {
                return f(interfaceC1673j, tVar, this.f25348a, this.f25355h, this.f25352e);
            }
            ByteBuffer byteBuffer = this.f25355h.f25342a;
            long decodePosition = flacDecoderJniG.getDecodePosition();
            try {
                flacDecoderJniG.decodeSampleWithBacktrackPosition(byteBuffer, decodePosition);
                int iLimit = byteBuffer.limit();
                if (iLimit == 0) {
                    return -1;
                }
                k(this.f25348a, iLimit, flacDecoderJniG.getLastFrameTimestamp(), this.f25352e);
                return flacDecoderJniG.isEndOfData() ? -1 : 0;
            } catch (FlacDecoderJni.a e9) {
                throw new IOException("Cannot read frame at position " + decodePosition, e9);
            }
        } finally {
            flacDecoderJniG.clearData();
        }
    }

    public final void e(InterfaceC1673j interfaceC1673j) throws IOException {
        if (this.f25353f) {
            return;
        }
        FlacDecoderJni flacDecoderJni = this.f25350c;
        try {
            FlacStreamMetadata flacStreamMetadataDecodeStreamMetadata = flacDecoderJni.decodeStreamMetadata();
            this.f25353f = true;
            if (this.f25354g == null) {
                this.f25354g = flacStreamMetadataDecodeStreamMetadata;
                this.f25348a.Q(flacStreamMetadataDecodeStreamMetadata.getMaxDecodedFrameSize());
                this.f25355h = new b.c(ByteBuffer.wrap(this.f25348a.e()));
                this.f25357j = l(flacDecoderJni, flacStreamMetadataDecodeStreamMetadata, interfaceC1673j.getLength(), this.f25351d, this.f25355h);
                j(flacStreamMetadataDecodeStreamMetadata, flacStreamMetadataDecodeStreamMetadata.getMetadataCopyWithAppendedEntriesFrom(this.f25356i), this.f25352e);
            }
        } catch (IOException e9) {
            flacDecoderJni.reset(0L);
            interfaceC1673j.o(0L, e9);
            throw e9;
        }
    }

    public final int f(InterfaceC1673j interfaceC1673j, t tVar, M m9, b.c cVar, w wVar) {
        int iC = this.f25357j.c(interfaceC1673j, tVar);
        ByteBuffer byteBuffer = cVar.f25342a;
        if (iC == 0 && byteBuffer.limit() > 0) {
            k(m9, byteBuffer.limit(), cVar.f25343b, wVar);
        }
        return iC;
    }

    public final FlacDecoderJni g(InterfaceC1673j interfaceC1673j) {
        FlacDecoderJni flacDecoderJni = (FlacDecoderJni) AbstractC1684a.e(this.f25350c);
        flacDecoderJni.setData(interfaceC1673j);
        return flacDecoderJni;
    }

    @Override // d3.InterfaceC1672i
    public boolean h(InterfaceC1673j interfaceC1673j) {
        this.f25356i = com.google.android.exoplayer2.extractor.d.c(interfaceC1673j, !this.f25349b);
        return com.google.android.exoplayer2.extractor.d.a(interfaceC1673j);
    }

    @Override // d3.InterfaceC1672i
    public void release() {
        this.f25357j = null;
        FlacDecoderJni flacDecoderJni = this.f25350c;
        if (flacDecoderJni != null) {
            flacDecoderJni.release();
            this.f25350c = null;
        }
    }
}
