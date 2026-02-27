package okio.internal;

import kotlin.jvm.internal.l;
import l8.AbstractC2212g;
import okio.Buffer;
import okio.ByteString;
import okio.Segment;
import okio.SegmentedByteString;
import okio.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w8.q;

/* JADX INFO: loaded from: classes4.dex */
public final class SegmentedByteStringKt {
    public static final int binarySearch(@NotNull int[] binarySearch, int i9, int i10, int i11) {
        l.e(binarySearch, "$this$binarySearch");
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int i14 = binarySearch[i13];
            if (i14 < i9) {
                i10 = i13 + 1;
            } else {
                if (i14 <= i9) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return (-i10) - 1;
    }

    public static final boolean commonEquals(@NotNull SegmentedByteString commonEquals, @Nullable Object obj) {
        l.e(commonEquals, "$this$commonEquals");
        if (obj == commonEquals) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == commonEquals.size() && commonEquals.rangeEquals(0, byteString, 0, commonEquals.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(@NotNull SegmentedByteString commonGetSize) {
        l.e(commonGetSize, "$this$commonGetSize");
        return commonGetSize.getDirectory$okio()[commonGetSize.getSegments$okio().length - 1];
    }

    public static final int commonHashCode(@NotNull SegmentedByteString commonHashCode) {
        l.e(commonHashCode, "$this$commonHashCode");
        int hashCode$okio = commonHashCode.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = commonHashCode.getSegments$okio().length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1;
        while (i9 < length) {
            int i12 = commonHashCode.getDirectory$okio()[length + i9];
            int i13 = commonHashCode.getDirectory$okio()[i9];
            byte[] bArr = commonHashCode.getSegments$okio()[i9];
            int i14 = (i13 - i10) + i12;
            while (i12 < i14) {
                i11 = (i11 * 31) + bArr[i12];
                i12++;
            }
            i9++;
            i10 = i13;
        }
        commonHashCode.setHashCode$okio(i11);
        return i11;
    }

    public static final byte commonInternalGet(@NotNull SegmentedByteString commonInternalGet, int i9) {
        l.e(commonInternalGet, "$this$commonInternalGet");
        Util.checkOffsetAndCount(commonInternalGet.getDirectory$okio()[commonInternalGet.getSegments$okio().length - 1], i9, 1L);
        int iSegment = segment(commonInternalGet, i9);
        return commonInternalGet.getSegments$okio()[iSegment][(i9 - (iSegment == 0 ? 0 : commonInternalGet.getDirectory$okio()[iSegment - 1])) + commonInternalGet.getDirectory$okio()[commonInternalGet.getSegments$okio().length + iSegment]];
    }

    public static final boolean commonRangeEquals(@NotNull SegmentedByteString commonRangeEquals, int i9, @NotNull ByteString other, int i10, int i11) {
        l.e(commonRangeEquals, "$this$commonRangeEquals");
        l.e(other, "other");
        if (i9 < 0 || i9 > commonRangeEquals.size() - i11) {
            return false;
        }
        int i12 = i11 + i9;
        int iSegment = segment(commonRangeEquals, i9);
        while (i9 < i12) {
            int i13 = iSegment == 0 ? 0 : commonRangeEquals.getDirectory$okio()[iSegment - 1];
            int i14 = commonRangeEquals.getDirectory$okio()[iSegment] - i13;
            int i15 = commonRangeEquals.getDirectory$okio()[commonRangeEquals.getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i9;
            if (!other.rangeEquals(i10, commonRangeEquals.getSegments$okio()[iSegment], i15 + (i9 - i13), iMin)) {
                return false;
            }
            i10 += iMin;
            i9 += iMin;
            iSegment++;
        }
        return true;
    }

    public static final boolean commonRangeEquals(@NotNull SegmentedByteString commonRangeEquals, int i9, @NotNull byte[] other, int i10, int i11) {
        l.e(commonRangeEquals, "$this$commonRangeEquals");
        l.e(other, "other");
        if (i9 < 0 || i9 > commonRangeEquals.size() - i11 || i10 < 0 || i10 > other.length - i11) {
            return false;
        }
        int i12 = i11 + i9;
        int iSegment = segment(commonRangeEquals, i9);
        while (i9 < i12) {
            int i13 = iSegment == 0 ? 0 : commonRangeEquals.getDirectory$okio()[iSegment - 1];
            int i14 = commonRangeEquals.getDirectory$okio()[iSegment] - i13;
            int i15 = commonRangeEquals.getDirectory$okio()[commonRangeEquals.getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i9;
            if (!Util.arrayRangeEquals(commonRangeEquals.getSegments$okio()[iSegment], i15 + (i9 - i13), other, i10, iMin)) {
                return false;
            }
            i10 += iMin;
            i9 += iMin;
            iSegment++;
        }
        return true;
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull SegmentedByteString commonSubstring, int i9, int i10) {
        l.e(commonSubstring, "$this$commonSubstring");
        if (!(i9 >= 0)) {
            throw new IllegalArgumentException(("beginIndex=" + i9 + " < 0").toString());
        }
        if (!(i10 <= commonSubstring.size())) {
            throw new IllegalArgumentException(("endIndex=" + i10 + " > length(" + commonSubstring.size() + ')').toString());
        }
        int i11 = i10 - i9;
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("endIndex=" + i10 + " < beginIndex=" + i9).toString());
        }
        if (i9 == 0 && i10 == commonSubstring.size()) {
            return commonSubstring;
        }
        if (i9 == i10) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(commonSubstring, i9);
        int iSegment2 = segment(commonSubstring, i10 - 1);
        byte[][] bArr = (byte[][]) AbstractC2212g.h(commonSubstring.getSegments$okio(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i12 = iSegment;
            int i13 = 0;
            while (true) {
                iArr[i13] = Math.min(commonSubstring.getDirectory$okio()[i12] - i9, i11);
                int i14 = i13 + 1;
                iArr[i13 + bArr.length] = commonSubstring.getDirectory$okio()[commonSubstring.getSegments$okio().length + i12];
                if (i12 == iSegment2) {
                    break;
                }
                i12++;
                i13 = i14;
            }
        }
        int i15 = iSegment != 0 ? commonSubstring.getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i9 - i15);
        return new SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull SegmentedByteString commonToByteArray) {
        l.e(commonToByteArray, "$this$commonToByteArray");
        byte[] bArr = new byte[commonToByteArray.size()];
        int length = commonToByteArray.getSegments$okio().length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < length) {
            int i12 = commonToByteArray.getDirectory$okio()[length + i9];
            int i13 = commonToByteArray.getDirectory$okio()[i9];
            int i14 = i13 - i10;
            AbstractC2212g.c(commonToByteArray.getSegments$okio()[i9], bArr, i11, i12, i12 + i14);
            i11 += i14;
            i9++;
            i10 = i13;
        }
        return bArr;
    }

    public static final void commonWrite(@NotNull SegmentedByteString commonWrite, @NotNull Buffer buffer, int i9, int i10) {
        l.e(commonWrite, "$this$commonWrite");
        l.e(buffer, "buffer");
        int i11 = i10 + i9;
        int iSegment = segment(commonWrite, i9);
        while (i9 < i11) {
            int i12 = iSegment == 0 ? 0 : commonWrite.getDirectory$okio()[iSegment - 1];
            int i13 = commonWrite.getDirectory$okio()[iSegment] - i12;
            int i14 = commonWrite.getDirectory$okio()[commonWrite.getSegments$okio().length + iSegment];
            int iMin = Math.min(i11, i13 + i12) - i9;
            int i15 = i14 + (i9 - i12);
            Segment segment = new Segment(commonWrite.getSegments$okio()[iSegment], i15, i15 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                l.b(segment2);
                Segment segment3 = segment2.prev;
                l.b(segment3);
                segment3.push(segment);
            }
            i9 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) commonWrite.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forEachSegment(SegmentedByteString segmentedByteString, int i9, int i10, q qVar) {
        int iSegment = segment(segmentedByteString, i9);
        while (i9 < i10) {
            int i11 = iSegment == 0 ? 0 : segmentedByteString.getDirectory$okio()[iSegment - 1];
            int i12 = segmentedByteString.getDirectory$okio()[iSegment] - i11;
            int i13 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - i9;
            qVar.e(segmentedByteString.getSegments$okio()[iSegment], Integer.valueOf(i13 + (i9 - i11)), Integer.valueOf(iMin));
            i9 += iMin;
            iSegment++;
        }
    }

    public static final void forEachSegment(@NotNull SegmentedByteString forEachSegment, @NotNull q action) {
        l.e(forEachSegment, "$this$forEachSegment");
        l.e(action, "action");
        int length = forEachSegment.getSegments$okio().length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int i11 = forEachSegment.getDirectory$okio()[length + i9];
            int i12 = forEachSegment.getDirectory$okio()[i9];
            action.e(forEachSegment.getSegments$okio()[i9], Integer.valueOf(i11), Integer.valueOf(i12 - i10));
            i9++;
            i10 = i12;
        }
    }

    public static final int segment(@NotNull SegmentedByteString segment, int i9) {
        l.e(segment, "$this$segment");
        int iBinarySearch = binarySearch(segment.getDirectory$okio(), i9 + 1, 0, segment.getSegments$okio().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }
}
