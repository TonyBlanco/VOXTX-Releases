package com.google.android.exoplayer2.extractor;

import O2.C0936z0;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import d4.L;
import d4.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q3.C2540a;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class FlacStreamMetadata {
    public static final int NOT_IN_LOOKUP_TABLE = -1;
    private static final String TAG = "FlacStreamMetadata";
    public final int bitsPerSample;
    public final int bitsPerSampleLookupKey;
    public final int channels;
    public final int maxBlockSizeSamples;
    public final int maxFrameSize;
    private final C2540a metadata;
    public final int minBlockSizeSamples;
    public final int minFrameSize;
    public final int sampleRate;
    public final int sampleRateLookupKey;
    public final a seekTable;
    public final long totalSamples;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f25377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f25378b;

        public a(long[] jArr, long[] jArr2) {
            this.f25377a = jArr;
            this.f25378b = jArr2;
        }
    }

    private FlacStreamMetadata(int i9, int i10, int i11, int i12, int i13, int i14, int i15, long j9, a aVar, C2540a c2540a) {
        this.minBlockSizeSamples = i9;
        this.maxBlockSizeSamples = i10;
        this.minFrameSize = i11;
        this.maxFrameSize = i12;
        this.sampleRate = i13;
        this.sampleRateLookupKey = getSampleRateLookupKey(i13);
        this.channels = i14;
        this.bitsPerSample = i15;
        this.bitsPerSampleLookupKey = getBitsPerSampleLookupKey(i15);
        this.totalSamples = j9;
        this.seekTable = aVar;
        this.metadata = c2540a;
    }

    public FlacStreamMetadata(int i9, int i10, int i11, int i12, int i13, int i14, int i15, long j9, ArrayList<String> arrayList, ArrayList<PictureFrame> arrayList2) {
        this(i9, i10, i11, i12, i13, i14, i15, j9, (a) null, concatenateVorbisMetadata(arrayList, arrayList2));
    }

    public FlacStreamMetadata(byte[] bArr, int i9) {
        L l9 = new L(bArr);
        l9.p(i9 * 8);
        this.minBlockSizeSamples = l9.h(16);
        this.maxBlockSizeSamples = l9.h(16);
        this.minFrameSize = l9.h(24);
        this.maxFrameSize = l9.h(24);
        int iH = l9.h(20);
        this.sampleRate = iH;
        this.sampleRateLookupKey = getSampleRateLookupKey(iH);
        this.channels = l9.h(3) + 1;
        int iH2 = l9.h(5) + 1;
        this.bitsPerSample = iH2;
        this.bitsPerSampleLookupKey = getBitsPerSampleLookupKey(iH2);
        this.totalSamples = l9.j(36);
        this.seekTable = null;
        this.metadata = null;
    }

    private static C2540a concatenateVorbisMetadata(List<String> list, List<PictureFrame> list2) {
        C2540a c2540aC = h.c(list);
        if (c2540aC == null && list2.isEmpty()) {
            return null;
        }
        return new C2540a(list2).c(c2540aC);
    }

    private static int getBitsPerSampleLookupKey(int i9) {
        if (i9 == 8) {
            return 1;
        }
        if (i9 == 12) {
            return 2;
        }
        if (i9 == 16) {
            return 4;
        }
        if (i9 != 20) {
            return i9 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int getSampleRateLookupKey(int i9) {
        switch (i9) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public FlacStreamMetadata copyWithPictureFrames(List<PictureFrame> list) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, this.seekTable, getMetadataCopyWithAppendedEntriesFrom(new C2540a(list)));
    }

    public FlacStreamMetadata copyWithSeekTable(a aVar) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, aVar, this.metadata);
    }

    public FlacStreamMetadata copyWithVorbisComments(List<String> list) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, this.seekTable, getMetadataCopyWithAppendedEntriesFrom(h.c(list)));
    }

    public long getApproxBytesPerFrame() {
        long j9;
        long j10;
        int i9 = this.maxFrameSize;
        if (i9 > 0) {
            j9 = (((long) i9) + ((long) this.minFrameSize)) / 2;
            j10 = 1;
        } else {
            int i10 = this.minBlockSizeSamples;
            j9 = ((((i10 != this.maxBlockSizeSamples || i10 <= 0) ? 4096L : i10) * ((long) this.channels)) * ((long) this.bitsPerSample)) / 8;
            j10 = 64;
        }
        return j9 + j10;
    }

    public int getDecodedBitrate() {
        return this.bitsPerSample * this.sampleRate * this.channels;
    }

    public long getDurationUs() {
        long j9 = this.totalSamples;
        if (j9 == 0) {
            return -9223372036854775807L;
        }
        return (j9 * 1000000) / ((long) this.sampleRate);
    }

    public C0936z0 getFormat(byte[] bArr, C2540a c2540a) {
        bArr[4] = -128;
        int i9 = this.maxFrameSize;
        if (i9 <= 0) {
            i9 = -1;
        }
        return new C0936z0.b().g0("audio/flac").Y(i9).J(this.channels).h0(this.sampleRate).V(Collections.singletonList(bArr)).Z(getMetadataCopyWithAppendedEntriesFrom(c2540a)).G();
    }

    public int getMaxDecodedFrameSize() {
        return this.maxBlockSizeSamples * this.channels * (this.bitsPerSample / 8);
    }

    public C2540a getMetadataCopyWithAppendedEntriesFrom(C2540a c2540a) {
        C2540a c2540a2 = this.metadata;
        return c2540a2 == null ? c2540a : c2540a2.c(c2540a);
    }

    public long getSampleNumber(long j9) {
        return k0.s((j9 * ((long) this.sampleRate)) / 1000000, 0L, this.totalSamples - 1);
    }
}
