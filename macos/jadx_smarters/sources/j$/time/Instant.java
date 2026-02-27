package j$.time;

import j$.time.chrono.AbstractC1913i;
import j$.time.format.DateTimeFormatter;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.p, Comparable<Instant>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Instant f41959c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f41960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41961b;

    static {
        F(-31557014167219200L, 0L);
        F(31556889864403199L, 999999999L);
    }

    private Instant(long j9, int i9) {
        this.f41960a = j9;
        this.f41961b = i9;
    }

    private static Instant C(long j9, int i9) {
        if ((((long) i9) | j9) == 0) {
            return f41959c;
        }
        if (j9 < -31557014167219200L || j9 > 31556889864403199L) {
            throw new c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j9, i9);
    }

    public static Instant E(long j9) {
        long j10 = 1000;
        return C(j$.com.android.tools.r8.a.n(j9, j10), ((int) j$.com.android.tools.r8.a.m(j9, j10)) * 1000000);
    }

    public static Instant F(long j9, long j10) {
        return C(j$.com.android.tools.r8.a.i(j9, j$.com.android.tools.r8.a.n(j10, 1000000000L)), (int) j$.com.android.tools.r8.a.m(j10, 1000000000L));
    }

    private Instant G(long j9, long j10) {
        if ((j9 | j10) == 0) {
            return this;
        }
        return F(j$.com.android.tools.r8.a.i(j$.com.android.tools.r8.a.i(this.f41960a, j9), j10 / 1000000000), ((long) this.f41961b) + (j10 % 1000000000));
    }

    public static Instant now() {
        a.f41975b.getClass();
        return E(System.currentTimeMillis());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 2, this);
    }

    public final int D() {
        return this.f41961b;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final Instant e(long j9, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (Instant) uVar.i(this, j9);
        }
        switch (f.f42042b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return G(0L, j9);
            case 2:
                return G(j9 / 1000000, (j9 % 1000000) * 1000);
            case 3:
                return G(j9 / 1000, (j9 % 1000) * 1000000);
            case 4:
                return G(j9, 0L);
            case 5:
                return G(j$.com.android.tools.r8.a.o(j9, 60), 0L);
            case 6:
                return G(j$.com.android.tools.r8.a.o(j9, 3600), 0L);
            case 7:
                return G(j$.com.android.tools.r8.a.o(j9, 43200), 0L);
            case 8:
                return G(j$.com.android.tools.r8.a.o(j9, DateTimeConstants.SECONDS_PER_DAY), 0L);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    final void I(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.f41960a);
        dataOutput.writeInt(this.f41961b);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.D(this, zoneOffset);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.f41960a, instant2.f41960a);
        return iCompare != 0 ? iCompare : this.f41961b - instant2.f41961b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r7 != r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r7 != r2) goto L20;
     */
    @Override // j$.time.temporal.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.temporal.m d(long r6, j$.time.temporal.r r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof j$.time.temporal.a
            if (r0 == 0) goto L53
            r0 = r8
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            r0.C(r6)
            int[] r1 = j$.time.f.f42041a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            int r2 = r5.f41961b
            long r3 = r5.f41960a
            if (r0 == r1) goto L4c
            r1 = 2
            if (r0 == r1) goto L46
            r1 = 3
            if (r0 == r1) goto L39
            r1 = 4
            if (r0 != r1) goto L2d
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 == 0) goto L2b
            j$.time.Instant r6 = C(r6, r2)
            goto L59
        L2b:
            r6 = r5
            goto L59
        L2d:
            j$.time.temporal.v r6 = new j$.time.temporal.v
            java.lang.String r7 = "Unsupported field: "
            java.lang.String r7 = j$.time.d.a(r7, r8)
            r6.<init>(r7)
            throw r6
        L39:
            int r7 = (int) r6
            r6 = 1000000(0xf4240, float:1.401298E-39)
            int r7 = r7 * r6
            if (r7 == r2) goto L2b
        L41:
            j$.time.Instant r6 = C(r3, r7)
            goto L59
        L46:
            int r7 = (int) r6
            int r7 = r7 * 1000
            if (r7 == r2) goto L2b
            goto L41
        L4c:
            long r0 = (long) r2
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 == 0) goto L2b
            int r7 = (int) r6
            goto L41
        L53:
            j$.time.temporal.m r6 = r8.q(r5, r6)
            j$.time.Instant r6 = (j$.time.Instant) r6
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.Instant.d(long, j$.time.temporal.r):j$.time.temporal.m");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.f41960a == instant.f41960a && this.f41961b == instant.f41961b;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.NANO_OF_SECOND || rVar == j$.time.temporal.a.MICRO_OF_SECOND || rVar == j$.time.temporal.a.MILLI_OF_SECOND : rVar != null && rVar.l(this);
    }

    public long getEpochSecond() {
        return this.f41960a;
    }

    public final int hashCode() {
        long j9 = this.f41960a;
        return (this.f41961b * 51) + ((int) (j9 ^ (j9 >>> 32)));
    }

    @Override // j$.time.temporal.o
    public final int i(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.n.d(this, rVar).a(rVar.k(this), rVar);
        }
        int i9 = f.f42041a[((j$.time.temporal.a) rVar).ordinal()];
        int i10 = this.f41961b;
        if (i9 == 1) {
            return i10;
        }
        if (i9 == 2) {
            return i10 / 1000;
        }
        if (i9 == 3) {
            return i10 / 1000000;
        }
        if (i9 == 4) {
            j$.time.temporal.a.INSTANT_SECONDS.y(this.f41960a);
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m k(h hVar) {
        return (Instant) AbstractC1913i.a(hVar, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long q(j$.time.temporal.r rVar) {
        int i9;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.k(this);
        }
        int i10 = f.f42041a[((j$.time.temporal.a) rVar).ordinal()];
        int i11 = this.f41961b;
        if (i10 == 1) {
            return i11;
        }
        if (i10 == 2) {
            i9 = i11 / 1000;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    return this.f41960a;
                }
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
            }
            i9 = i11 / 1000000;
        }
        return i9;
    }

    @Override // j$.time.temporal.o
    public final Object t(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        if (tVar == j$.time.temporal.n.e() || tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.f() || tVar == j$.time.temporal.n.g()) {
            return null;
        }
        return tVar.a(this);
    }

    public long toEpochMilli() {
        long jO;
        int i9;
        int i10 = this.f41961b;
        long j9 = this.f41960a;
        if (j9 >= 0 || i10 <= 0) {
            jO = j$.com.android.tools.r8.a.o(j9, 1000);
            i9 = i10 / 1000000;
        } else {
            jO = j$.com.android.tools.r8.a.o(j9 + 1, 1000);
            i9 = (i10 / 1000000) - 1000;
        }
        return j$.com.android.tools.r8.a.i(jO, i9);
    }

    public final String toString() {
        return DateTimeFormatter.f42043f.a(this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m u(j$.time.temporal.m mVar) {
        return mVar.d(this.f41960a, j$.time.temporal.a.INSTANT_SECONDS).d(this.f41961b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m y(long j9, j$.time.temporal.u uVar) {
        return j9 == Long.MIN_VALUE ? e(Long.MAX_VALUE, uVar).e(1L, uVar) : e(-j9, uVar);
    }
}
