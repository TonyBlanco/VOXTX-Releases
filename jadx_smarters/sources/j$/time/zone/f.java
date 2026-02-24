package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC1913i;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import org.joda.time.DateTimeConstants;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long[] f42190i = new long[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final e[] f42191j = new e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final LocalDateTime[] f42192k = new LocalDateTime[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final b[] f42193l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f42194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZoneOffset[] f42195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f42196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LocalDateTime[] f42197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ZoneOffset[] f42198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e[] f42199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeZone f42200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient ConcurrentHashMap f42201h = new ConcurrentHashMap();

    private f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f42195b = zoneOffsetArr;
        long[] jArr = f42190i;
        this.f42194a = jArr;
        this.f42196c = jArr;
        this.f42197d = f42192k;
        this.f42198e = zoneOffsetArr;
        this.f42199f = f42191j;
        this.f42200g = null;
    }

    f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {j(timeZone.getRawOffset())};
        this.f42195b = zoneOffsetArr;
        long[] jArr = f42190i;
        this.f42194a = jArr;
        this.f42196c = jArr;
        this.f42197d = f42192k;
        this.f42198e = zoneOffsetArr;
        this.f42199f = f42191j;
        this.f42200g = timeZone;
    }

    private f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        LocalDateTime localDateTimeK;
        this.f42194a = jArr;
        this.f42195b = zoneOffsetArr;
        this.f42196c = jArr2;
        this.f42198e = zoneOffsetArr2;
        this.f42199f = eVarArr;
        if (jArr2.length == 0) {
            this.f42197d = f42192k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i9 = 0;
            while (i9 < jArr2.length) {
                int i10 = i9 + 1;
                b bVar = new b(jArr2[i9], zoneOffsetArr2[i9], zoneOffsetArr2[i10]);
                if (bVar.y()) {
                    arrayList.add(bVar.k());
                    localDateTimeK = bVar.i();
                } else {
                    arrayList.add(bVar.i());
                    localDateTimeK = bVar.k();
                }
                arrayList.add(localDateTimeK);
                i9 = i10;
            }
            this.f42197d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f42200g = null;
    }

    private static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTimeK = bVar.k();
        boolean zY = bVar.y();
        boolean zI = localDateTime.I(localDateTimeK);
        return zY ? zI ? bVar.t() : localDateTime.I(bVar.i()) ? bVar : bVar.q() : !zI ? bVar.q() : localDateTime.I(bVar.i()) ? bVar.t() : bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b[] b(int i9) {
        long j9;
        Integer numValueOf = Integer.valueOf(i9);
        ConcurrentHashMap concurrentHashMap = this.f42201h;
        b[] bVarArr = (b[]) concurrentHashMap.get(numValueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.f42200g;
        if (timeZone == null) {
            e[] eVarArr = this.f42199f;
            b[] bVarArr2 = new b[eVarArr.length];
            for (int i10 = 0; i10 < eVarArr.length; i10++) {
                bVarArr2[i10] = eVarArr[i10].a(i9);
            }
            if (i9 < 2100) {
                concurrentHashMap.putIfAbsent(numValueOf, bVarArr2);
            }
            return bVarArr2;
        }
        b[] bVarArr3 = f42193l;
        if (i9 < 1800) {
            return bVarArr3;
        }
        long jN = AbstractC1913i.n(LocalDateTime.J(i9 - 1), this.f42195b[0]);
        int offset = timeZone.getOffset(jN * 1000);
        long j10 = 31968000 + jN;
        while (jN < j10) {
            long j11 = 7776000 + jN;
            long j12 = jN;
            if (offset != timeZone.getOffset(j11 * 1000)) {
                jN = j12;
                while (j11 - jN > 1) {
                    int i11 = offset;
                    long j13 = j10;
                    long jN2 = j$.com.android.tools.r8.a.n(j11 + jN, 2L);
                    if (timeZone.getOffset(jN2 * 1000) == i11) {
                        jN = jN2;
                    } else {
                        j11 = jN2;
                    }
                    offset = i11;
                    j10 = j13;
                }
                j9 = j10;
                int i12 = offset;
                if (timeZone.getOffset(jN * 1000) == i12) {
                    jN = j11;
                }
                ZoneOffset zoneOffsetJ = j(i12);
                offset = timeZone.getOffset(jN * 1000);
                ZoneOffset zoneOffsetJ2 = j(offset);
                if (c(jN, zoneOffsetJ2) == i9) {
                    bVarArr3 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length + 1);
                    bVarArr3[bVarArr3.length - 1] = new b(jN, zoneOffsetJ, zoneOffsetJ2);
                }
            } else {
                j9 = j10;
                jN = j11;
            }
            j10 = j9;
        }
        if (1916 <= i9 && i9 < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    private static int c(long j9, ZoneOffset zoneOffset) {
        return j$.time.h.P(j$.com.android.tools.r8.a.n(j9 + ((long) zoneOffset.I()), DateTimeConstants.SECONDS_PER_DAY)).J();
    }

    private Object e(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.f42195b;
        int i9 = 0;
        TimeZone timeZone = this.f42200g;
        if (timeZone != null) {
            b[] bVarArrB = b(localDateTime.G());
            if (bVarArrB.length == 0) {
                return j(timeZone.getOffset(AbstractC1913i.n(localDateTime, zoneOffsetArr[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i9 < length) {
                b bVar = bVarArrB[i9];
                Object objA = a(localDateTime, bVar);
                if ((objA instanceof b) || objA.equals(bVar.t())) {
                    return objA;
                }
                i9++;
                obj = objA;
            }
            return obj;
        }
        if (this.f42196c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f42199f.length;
        LocalDateTime[] localDateTimeArr = this.f42197d;
        if (length2 > 0 && localDateTime.H(localDateTimeArr[localDateTimeArr.length - 1])) {
            b[] bVarArrB2 = b(localDateTime.G());
            int length3 = bVarArrB2.length;
            while (i9 < length3) {
                b bVar2 = bVarArrB2[i9];
                Object objA2 = a(localDateTime, bVar2);
                if ((objA2 instanceof b) || objA2.equals(bVar2.t())) {
                    return objA2;
                }
                i9++;
                obj = objA2;
            }
            return obj;
        }
        int iBinarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
        ZoneOffset[] zoneOffsetArr2 = this.f42198e;
        if (iBinarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else if (iBinarySearch < localDateTimeArr.length - 1) {
            int i10 = iBinarySearch + 1;
            if (localDateTimeArr[iBinarySearch].equals(localDateTimeArr[i10])) {
                iBinarySearch = i10;
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return zoneOffsetArr2[(iBinarySearch / 2) + 1];
        }
        LocalDateTime localDateTime2 = localDateTimeArr[iBinarySearch];
        LocalDateTime localDateTime3 = localDateTimeArr[iBinarySearch + 1];
        int i11 = iBinarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr2[i11];
        ZoneOffset zoneOffset2 = zoneOffsetArr2[i11 + 1];
        return zoneOffset2.I() > zoneOffset.I() ? new b(localDateTime2, zoneOffset, zoneOffset2) : new b(localDateTime3, zoneOffset, zoneOffset2);
    }

    public static f i(ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
        return new f(zoneOffset);
    }

    private static ZoneOffset j(int i9) {
        return ZoneOffset.L(i9 / 1000);
    }

    static f k(DataInput dataInput) throws IOException {
        int i9 = dataInput.readInt();
        long[] jArr = f42190i;
        long[] jArr2 = i9 == 0 ? jArr : new long[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            jArr2[i10] = a.a(dataInput);
        }
        int i11 = i9 + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            zoneOffsetArr[i12] = a.b(dataInput);
        }
        int i13 = dataInput.readInt();
        if (i13 != 0) {
            jArr = new long[i13];
        }
        long[] jArr3 = jArr;
        for (int i14 = 0; i14 < i13; i14++) {
            jArr3[i14] = a.a(dataInput);
        }
        int i15 = i13 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            zoneOffsetArr2[i16] = a.b(dataInput);
        }
        int i17 = dataInput.readByte();
        e[] eVarArr = i17 == 0 ? f42191j : new e[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            eVarArr[i18] = e.b(dataInput);
        }
        return new f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f42200g != null ? (byte) 100 : (byte) 1, this);
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f42200g;
        if (timeZone != null) {
            return j(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f42196c;
        if (jArr.length == 0) {
            return this.f42195b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f42199f.length;
        ZoneOffset[] zoneOffsetArr = this.f42198e;
        if (length <= 0 || epochSecond <= jArr[jArr.length - 1]) {
            int iBinarySearch = Arrays.binarySearch(jArr, epochSecond);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return zoneOffsetArr[iBinarySearch + 1];
        }
        b[] bVarArrB = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
        b bVar = null;
        for (int i9 = 0; i9 < bVarArrB.length; i9++) {
            bVar = bVarArrB[i9];
            if (epochSecond < bVar.B()) {
                return bVar.t();
            }
        }
        return bVar.q();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(this.f42200g, fVar.f42200g) && Arrays.equals(this.f42194a, fVar.f42194a) && Arrays.equals(this.f42195b, fVar.f42195b) && Arrays.equals(this.f42196c, fVar.f42196c) && Arrays.equals(this.f42198e, fVar.f42198e) && Arrays.equals(this.f42199f, fVar.f42199f);
    }

    public final b f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (objE instanceof b) {
            return (b) objE;
        }
        return null;
    }

    public final List g(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        return objE instanceof b ? ((b) objE).u() : Collections.singletonList((ZoneOffset) objE);
    }

    public final boolean h() {
        b bVar;
        TimeZone timeZone = this.f42200g;
        if (timeZone == null) {
            return this.f42196c.length == 0;
        }
        if (timeZone.useDaylightTime() || timeZone.getDSTSavings() != 0) {
            return false;
        }
        Instant instantNow = Instant.now();
        long epochSecond = instantNow.getEpochSecond();
        if (instantNow.D() > 0 && epochSecond < Long.MAX_VALUE) {
            epochSecond++;
        }
        int iC = c(epochSecond, d(instantNow));
        b[] bVarArrB = b(iC);
        int length = bVarArrB.length - 1;
        while (true) {
            if (length >= 0) {
                if (epochSecond > bVarArrB[length].B()) {
                    bVar = bVarArrB[length];
                    break;
                }
                length--;
            } else if (iC > 1800) {
                b[] bVarArrB2 = b(iC - 1);
                int length2 = bVarArrB2.length - 1;
                while (true) {
                    if (length2 < 0) {
                        int offset = timeZone.getOffset((epochSecond - 1) * 1000);
                        long jR = j$.time.h.N(1800, 1, 1).r() * 86400;
                        for (long jMin = Math.min(epochSecond - 31104000, (j$.time.b.b().a() / 1000) + 31968000); jR <= jMin; jMin -= 7776000) {
                            int offset2 = timeZone.getOffset(jMin * 1000);
                            if (offset != offset2) {
                                int iC2 = c(jMin, j(offset2));
                                b[] bVarArrB3 = b(iC2 + 1);
                                int length3 = bVarArrB3.length - 1;
                                while (true) {
                                    if (length3 < 0) {
                                        b[] bVarArrB4 = b(iC2);
                                        bVar = bVarArrB4[bVarArrB4.length - 1];
                                        break;
                                    }
                                    if (epochSecond > bVarArrB3[length3].B()) {
                                        bVar = bVarArrB3[length3];
                                        break;
                                    }
                                    length3--;
                                }
                            }
                        }
                    } else {
                        if (epochSecond > bVarArrB2[length2].B()) {
                            bVar = bVarArrB2[length2];
                            break;
                        }
                        length2--;
                    }
                }
            } else {
                bVar = null;
            }
        }
        return bVar == null;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f42200g) ^ Arrays.hashCode(this.f42194a)) ^ Arrays.hashCode(this.f42195b)) ^ Arrays.hashCode(this.f42196c)) ^ Arrays.hashCode(this.f42198e)) ^ Arrays.hashCode(this.f42199f);
    }

    final void l(DataOutput dataOutput) throws IOException {
        long[] jArr = this.f42194a;
        dataOutput.writeInt(jArr.length);
        for (long j9 : jArr) {
            a.c(j9, dataOutput);
        }
        for (ZoneOffset zoneOffset : this.f42195b) {
            a.d(zoneOffset, dataOutput);
        }
        long[] jArr2 = this.f42196c;
        dataOutput.writeInt(jArr2.length);
        for (long j10 : jArr2) {
            a.c(j10, dataOutput);
        }
        for (ZoneOffset zoneOffset2 : this.f42198e) {
            a.d(zoneOffset2, dataOutput);
        }
        e[] eVarArr = this.f42199f;
        dataOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.c(dataOutput);
        }
    }

    final void m(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.f42200g.getID());
    }

    public final String toString() {
        StringBuilder sb;
        TimeZone timeZone = this.f42200g;
        if (timeZone != null) {
            String id = timeZone.getID();
            sb = new StringBuilder("ZoneRules[timeZone=");
            sb.append(id);
        } else {
            ZoneOffset zoneOffset = this.f42195b[r1.length - 1];
            sb = new StringBuilder("ZoneRules[currentStandardOffset=");
            sb.append(zoneOffset);
        }
        sb.append("]");
        return sb.toString();
    }
}
