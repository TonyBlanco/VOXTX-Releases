package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.g;
import d3.u;
import d4.AbstractC1684a;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlacStreamMetadata f25416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25417b;

    public e(FlacStreamMetadata flacStreamMetadata, long j9) {
        this.f25416a = flacStreamMetadata;
        this.f25417b = j9;
    }

    public final u a(long j9, long j10) {
        return new u((j9 * 1000000) / ((long) this.f25416a.sampleRate), this.f25417b + j10);
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public g.a e(long j9) {
        AbstractC1684a.i(this.f25416a.seekTable);
        FlacStreamMetadata flacStreamMetadata = this.f25416a;
        FlacStreamMetadata.a aVar = flacStreamMetadata.seekTable;
        long[] jArr = aVar.f25377a;
        long[] jArr2 = aVar.f25378b;
        int i9 = k0.i(jArr, flacStreamMetadata.getSampleNumber(j9), true, false);
        u uVarA = a(i9 == -1 ? 0L : jArr[i9], i9 != -1 ? jArr2[i9] : 0L);
        if (uVarA.f39610a == j9 || i9 == jArr.length - 1) {
            return new g.a(uVarA);
        }
        int i10 = i9 + 1;
        return new g.a(uVarA, a(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public boolean g() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public long i() {
        return this.f25416a.getDurationUs();
    }
}
