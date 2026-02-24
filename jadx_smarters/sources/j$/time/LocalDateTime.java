package j$.time;

import j$.time.chrono.AbstractC1913i;
import j$.time.chrono.InterfaceC1906b;
import j$.time.chrono.InterfaceC1909e;
import j$.time.chrono.InterfaceC1915k;
import j$.time.format.DateTimeFormatter;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.achartengine.chart.TimeChart;
import org.joda.time.DateTimeConstants;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.p, InterfaceC1909e, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f41962c = K(h.f42095d, k.f42103e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f41963d = K(h.f42096e, k.f42104f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f41964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f41965b;

    private LocalDateTime(h hVar, k kVar) {
        this.f41964a = hVar;
        this.f41965b = kVar;
    }

    private int C(LocalDateTime localDateTime) {
        int iC = this.f41964a.C(localDateTime.f41964a);
        return iC == 0 ? this.f41965b.compareTo(localDateTime.f41965b) : iC;
    }

    public static LocalDateTime D(j$.time.temporal.o oVar) {
        if (oVar instanceof LocalDateTime) {
            return (LocalDateTime) oVar;
        }
        if (oVar instanceof z) {
            return ((z) oVar).H();
        }
        if (oVar instanceof OffsetDateTime) {
            return ((OffsetDateTime) oVar).toLocalDateTime();
        }
        try {
            return new LocalDateTime(h.E(oVar), k.E(oVar));
        } catch (c e9) {
            throw new c("Unable to obtain LocalDateTime from TemporalAccessor: " + oVar + " of type " + oVar.getClass().getName(), e9);
        }
    }

    public static LocalDateTime J(int i9) {
        return new LocalDateTime(h.N(i9, 12, 31), k.J(0));
    }

    public static LocalDateTime K(h hVar, k kVar) {
        Objects.a(hVar, "date");
        Objects.a(kVar, "time");
        return new LocalDateTime(hVar, kVar);
    }

    public static LocalDateTime L(long j9, int i9, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
        long j10 = i9;
        j$.time.temporal.a.NANO_OF_SECOND.C(j10);
        long jI = j9 + ((long) zoneOffset.I());
        long j11 = DateTimeConstants.SECONDS_PER_DAY;
        return new LocalDateTime(h.P(j$.com.android.tools.r8.a.n(jI, j11)), k.K((((long) ((int) j$.com.android.tools.r8.a.m(jI, j11))) * 1000000000) + j10));
    }

    private LocalDateTime O(h hVar, long j9, long j10, long j11, long j12) {
        long j13 = j9 | j10 | j11 | j12;
        k kVarK = this.f41965b;
        if (j13 == 0) {
            return S(hVar, kVarK);
        }
        long j14 = j9 / 24;
        long j15 = j14 + (j10 / 1440) + (j11 / 86400) + (j12 / 86400000000000L);
        long j16 = 1;
        long j17 = ((j9 % 24) * 3600000000000L) + ((j10 % 1440) * 60000000000L) + ((j11 % 86400) * 1000000000) + (j12 % 86400000000000L);
        long jS = kVarK.S();
        long j18 = (j17 * j16) + jS;
        long jN = j$.com.android.tools.r8.a.n(j18, 86400000000000L) + (j15 * j16);
        long jM = j$.com.android.tools.r8.a.m(j18, 86400000000000L);
        if (jM != jS) {
            kVarK = k.K(jM);
        }
        return S(hVar.R(jN), kVarK);
    }

    private LocalDateTime S(h hVar, k kVar) {
        return (this.f41964a == hVar && this.f41965b == kVar) ? this : new LocalDateTime(hVar, kVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 5, this);
    }

    public final int E() {
        return this.f41965b.H();
    }

    public final int F() {
        return this.f41965b.I();
    }

    public final int G() {
        return this.f41964a.J();
    }

    public final boolean H(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return C(localDateTime) > 0;
        }
        long jR = this.f41964a.r();
        long jR2 = localDateTime.f41964a.r();
        return jR > jR2 || (jR == jR2 && this.f41965b.S() > localDateTime.f41965b.S());
    }

    public final boolean I(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return C(localDateTime) < 0;
        }
        long jR = this.f41964a.r();
        long jR2 = localDateTime.f41964a.r();
        return jR < jR2 || (jR == jR2 && this.f41965b.S() < localDateTime.f41965b.S());
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime e(long j9, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (LocalDateTime) uVar.i(this, j9);
        }
        int i9 = i.f42100a[((j$.time.temporal.b) uVar).ordinal()];
        k kVar = this.f41965b;
        h hVar = this.f41964a;
        switch (i9) {
            case 1:
                return O(this.f41964a, 0L, 0L, 0L, j9);
            case 2:
                LocalDateTime localDateTimeS = S(hVar.R(j9 / 86400000000L), kVar);
                return localDateTimeS.O(localDateTimeS.f41964a, 0L, 0L, 0L, (j9 % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeS2 = S(hVar.R(j9 / TimeChart.DAY), kVar);
                return localDateTimeS2.O(localDateTimeS2.f41964a, 0L, 0L, 0L, (j9 % TimeChart.DAY) * 1000000);
            case 4:
                return N(j9);
            case 5:
                return O(this.f41964a, 0L, j9, 0L, 0L);
            case 6:
                return O(this.f41964a, j9, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeS3 = S(hVar.R(j9 / 256), kVar);
                return localDateTimeS3.O(localDateTimeS3.f41964a, (j9 % 256) * 12, 0L, 0L, 0L);
            default:
                return S(hVar.e(j9, uVar), kVar);
        }
    }

    public final LocalDateTime N(long j9) {
        return O(this.f41964a, 0L, 0L, j9, 0L);
    }

    public final h P() {
        return this.f41964a;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j9, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (LocalDateTime) rVar.q(this, j9);
        }
        boolean zD = ((j$.time.temporal.a) rVar).D();
        k kVar = this.f41965b;
        h hVar = this.f41964a;
        return zD ? S(hVar, kVar.d(j9, rVar)) : S(hVar.d(j9, rVar), kVar);
    }

    public final LocalDateTime R(h hVar) {
        return S(hVar, this.f41965b);
    }

    final void T(DataOutput dataOutput) {
        this.f41964a.Z(dataOutput);
        this.f41965b.W(dataOutput);
    }

    @Override // j$.time.chrono.InterfaceC1909e
    public final j$.time.chrono.n a() {
        return ((h) c()).a();
    }

    @Override // j$.time.chrono.InterfaceC1909e
    public final k b() {
        return this.f41965b;
    }

    @Override // j$.time.chrono.InterfaceC1909e
    public final InterfaceC1906b c() {
        return this.f41964a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.f41964a.equals(localDateTime.f41964a) && this.f41965b.equals(localDateTime.f41965b);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar != null && rVar.l(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        return aVar.u() || aVar.D();
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    public final int hashCode() {
        return this.f41964a.hashCode() ^ this.f41965b.hashCode();
    }

    @Override // j$.time.temporal.o
    public final int i(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).D() ? this.f41965b.i(rVar) : this.f41964a.i(rVar) : j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m k(h hVar) {
        return S(hVar, this.f41965b);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.t(this);
        }
        if (!((j$.time.temporal.a) rVar).D()) {
            return this.f41964a.l(rVar);
        }
        k kVar = this.f41965b;
        kVar.getClass();
        return j$.time.temporal.n.d(kVar, rVar);
    }

    @Override // j$.time.chrono.InterfaceC1909e
    public final InterfaceC1915k n(ZoneOffset zoneOffset) {
        return z.E(this, zoneOffset, null);
    }

    @Override // j$.time.temporal.o
    public final long q(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).D() ? this.f41965b.q(rVar) : this.f41964a.q(rVar) : rVar.k(this);
    }

    @Override // j$.time.temporal.o
    public final Object t(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.f() ? this.f41964a : AbstractC1913i.k(this, tVar);
    }

    public final String toString() {
        return this.f41964a.toString() + "T" + this.f41965b.toString();
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m u(j$.time.temporal.m mVar) {
        return mVar.d(((h) c()).r(), j$.time.temporal.a.EPOCH_DAY).d(b().S(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC1909e interfaceC1909e) {
        return interfaceC1909e instanceof LocalDateTime ? C((LocalDateTime) interfaceC1909e) : AbstractC1913i.c(this, interfaceC1909e);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m y(long j9, j$.time.temporal.u uVar) {
        return j9 == Long.MIN_VALUE ? e(Long.MAX_VALUE, uVar).e(1L, uVar) : e(-j9, uVar);
    }
}
