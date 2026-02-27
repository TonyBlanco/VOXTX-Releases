package okio;

import java.util.Arrays;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import l8.AbstractC2212g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class Segment {
    public static final Companion Companion = new Companion(null);
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;

    @NotNull
    public final byte[] data;
    public int limit;

    @Nullable
    public Segment next;
    public boolean owner;
    public int pos;

    @Nullable
    public Segment prev;
    public boolean shared;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public Segment() {
        this.data = new byte[SIZE];
        this.owner = true;
        this.shared = false;
    }

    public Segment(@NotNull byte[] data, int i9, int i10, boolean z9, boolean z10) {
        l.e(data, "data");
        this.data = data;
        this.pos = i9;
        this.limit = i10;
        this.shared = z9;
        this.owner = z10;
    }

    public final void compact() {
        Segment segment = this.prev;
        int i9 = 0;
        if (!(segment != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        l.b(segment);
        if (segment.owner) {
            int i10 = this.limit - this.pos;
            Segment segment2 = this.prev;
            l.b(segment2);
            int i11 = 8192 - segment2.limit;
            Segment segment3 = this.prev;
            l.b(segment3);
            if (!segment3.shared) {
                Segment segment4 = this.prev;
                l.b(segment4);
                i9 = segment4.pos;
            }
            if (i10 > i11 + i9) {
                return;
            }
            Segment segment5 = this.prev;
            l.b(segment5);
            writeTo(segment5, i10);
            pop();
            SegmentPool.recycle(this);
        }
    }

    @Nullable
    public final Segment pop() {
        Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.prev;
        l.b(segment2);
        segment2.next = this.next;
        Segment segment3 = this.next;
        l.b(segment3);
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    @NotNull
    public final Segment push(@NotNull Segment segment) {
        l.e(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        l.b(segment2);
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    @NotNull
    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    @NotNull
    public final Segment split(int i9) {
        Segment segmentTake;
        if (!(i9 > 0 && i9 <= this.limit - this.pos)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i9 >= 1024) {
            segmentTake = sharedCopy();
        } else {
            segmentTake = SegmentPool.take();
            byte[] bArr = this.data;
            byte[] bArr2 = segmentTake.data;
            int i10 = this.pos;
            AbstractC2212g.e(bArr, bArr2, 0, i10, i10 + i9, 2, null);
        }
        segmentTake.limit = segmentTake.pos + i9;
        this.pos += i9;
        Segment segment = this.prev;
        l.b(segment);
        segment.push(segmentTake);
        return segmentTake;
    }

    @NotNull
    public final Segment unsharedCopy() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        l.d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return new Segment(bArrCopyOf, this.pos, this.limit, false, true);
    }

    public final void writeTo(@NotNull Segment sink, int i9) {
        l.e(sink, "sink");
        if (!sink.owner) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i10 = sink.limit;
        if (i10 + i9 > 8192) {
            if (sink.shared) {
                throw new IllegalArgumentException();
            }
            int i11 = sink.pos;
            if ((i10 + i9) - i11 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            AbstractC2212g.e(bArr, bArr, 0, i11, i10, 2, null);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i12 = sink.limit;
        int i13 = this.pos;
        AbstractC2212g.c(bArr2, bArr3, i12, i13, i13 + i9);
        sink.limit += i9;
        this.pos += i9;
    }
}
