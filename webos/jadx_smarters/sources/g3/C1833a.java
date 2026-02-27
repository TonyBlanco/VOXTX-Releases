package g3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.a;
import d3.AbstractC1664a;
import d3.AbstractC1679p;
import d3.InterfaceC1673j;
import j$.util.Objects;

/* JADX INFO: renamed from: g3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1833a extends com.google.android.exoplayer2.extractor.a {

    /* JADX INFO: renamed from: g3.a$b */
    public static final class b implements a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlacStreamMetadata f41315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AbstractC1679p.a f41317c;

        public b(FlacStreamMetadata flacStreamMetadata, int i9) {
            this.f41315a = flacStreamMetadata;
            this.f41316b = i9;
            this.f41317c = new AbstractC1679p.a();
        }

        @Override // com.google.android.exoplayer2.extractor.a.f
        public a.e a(InterfaceC1673j interfaceC1673j, long j9) {
            long position = interfaceC1673j.getPosition();
            long jC = c(interfaceC1673j);
            long jK = interfaceC1673j.k();
            interfaceC1673j.n(Math.max(6, this.f41315a.minFrameSize));
            long jC2 = c(interfaceC1673j);
            return (jC > j9 || jC2 <= j9) ? jC2 <= j9 ? a.e.f(jC2, interfaceC1673j.k()) : a.e.d(jC, position) : a.e.e(jK);
        }

        @Override // com.google.android.exoplayer2.extractor.a.f
        public /* synthetic */ void b() {
            AbstractC1664a.a(this);
        }

        public final long c(InterfaceC1673j interfaceC1673j) {
            while (interfaceC1673j.k() < interfaceC1673j.getLength() - 6 && !AbstractC1679p.h(interfaceC1673j, this.f41315a, this.f41316b, this.f41317c)) {
                interfaceC1673j.n(1);
            }
            if (interfaceC1673j.k() < interfaceC1673j.getLength() - 6) {
                return this.f41317c.f39602a;
            }
            interfaceC1673j.n((int) (interfaceC1673j.getLength() - interfaceC1673j.k()));
            return this.f41315a.totalSamples;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833a(FlacStreamMetadata flacStreamMetadata, int i9, long j9, long j10) {
        super(new com.google.android.exoplayer2.ext.flac.a(flacStreamMetadata), new b(flacStreamMetadata, i9), flacStreamMetadata.getDurationUs(), 0L, flacStreamMetadata.totalSamples, j9, j10, flacStreamMetadata.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata.minFrameSize));
        Objects.requireNonNull(flacStreamMetadata);
    }
}
