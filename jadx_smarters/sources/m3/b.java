package m3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import d3.AbstractC1679p;
import d3.InterfaceC1673j;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;
import java.util.Arrays;
import m3.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public FlacStreamMetadata f44334n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f44335o;

    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FlacStreamMetadata f44336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public FlacStreamMetadata.a f44337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f44338c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f44339d = -1;

        public a(FlacStreamMetadata flacStreamMetadata, FlacStreamMetadata.a aVar) {
            this.f44336a = flacStreamMetadata;
            this.f44337b = aVar;
        }

        @Override // m3.g
        public long a(InterfaceC1673j interfaceC1673j) {
            long j9 = this.f44339d;
            if (j9 < 0) {
                return -1L;
            }
            long j10 = -(j9 + 2);
            this.f44339d = -1L;
            return j10;
        }

        @Override // m3.g
        public com.google.android.exoplayer2.extractor.g b() {
            AbstractC1684a.g(this.f44338c != -1);
            return new com.google.android.exoplayer2.extractor.e(this.f44336a, this.f44338c);
        }

        @Override // m3.g
        public void c(long j9) {
            long[] jArr = this.f44337b.f25377a;
            this.f44339d = jArr[k0.i(jArr, j9, true, true)];
        }

        public void d(long j9) {
            this.f44338c = j9;
        }
    }

    public static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(M m9) {
        return m9.a() >= 5 && m9.H() == 127 && m9.J() == 1179402563;
    }

    @Override // m3.i
    public long f(M m9) {
        if (o(m9.e())) {
            return n(m9);
        }
        return -1L;
    }

    @Override // m3.i
    public boolean i(M m9, long j9, i.b bVar) {
        byte[] bArrE = m9.e();
        FlacStreamMetadata flacStreamMetadata = this.f44334n;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(bArrE, 17);
            this.f44334n = flacStreamMetadata2;
            bVar.f44376a = flacStreamMetadata2.getFormat(Arrays.copyOfRange(bArrE, 9, m9.g()), null);
            return true;
        }
        if ((bArrE[0] & 127) == 3) {
            FlacStreamMetadata.a aVarG = com.google.android.exoplayer2.extractor.d.g(m9);
            FlacStreamMetadata flacStreamMetadataCopyWithSeekTable = flacStreamMetadata.copyWithSeekTable(aVarG);
            this.f44334n = flacStreamMetadataCopyWithSeekTable;
            this.f44335o = new a(flacStreamMetadataCopyWithSeekTable, aVarG);
            return true;
        }
        if (!o(bArrE)) {
            return true;
        }
        a aVar = this.f44335o;
        if (aVar != null) {
            aVar.d(j9);
            bVar.f44377b = this.f44335o;
        }
        AbstractC1684a.e(bVar.f44376a);
        return false;
    }

    @Override // m3.i
    public void l(boolean z9) {
        super.l(z9);
        if (z9) {
            this.f44334n = null;
            this.f44335o = null;
        }
    }

    public final int n(M m9) {
        int i9 = (m9.e()[2] & 255) >> 4;
        if (i9 == 6 || i9 == 7) {
            m9.V(4);
            m9.O();
        }
        int iJ = AbstractC1679p.j(m9, i9);
        m9.U(0);
        return iJ;
    }
}
