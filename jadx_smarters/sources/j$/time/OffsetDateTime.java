package j$.time;

import j$.time.chrono.AbstractC1913i;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.m, j$.time.temporal.p, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocalDateTime f41966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZoneOffset f41967b;

    static {
        LocalDateTime localDateTime = LocalDateTime.f41962c;
        ZoneOffset zoneOffset = ZoneOffset.f41972g;
        localDateTime.getClass();
        C(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f41963d;
        ZoneOffset zoneOffset2 = ZoneOffset.f41971f;
        localDateTime2.getClass();
        C(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "dateTime");
        this.f41966a = localDateTime;
        Objects.a(zoneOffset, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
        this.f41967b = zoneOffset;
    }

    public static OffsetDateTime C(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime D(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.C().d(instant);
        return new OffsetDateTime(LocalDateTime.L(instant.getEpochSecond(), instant.D(), zoneOffsetD), zoneOffsetD);
    }

    static OffsetDateTime F(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f41962c;
        h hVar = h.f42095d;
        return new OffsetDateTime(LocalDateTime.K(h.N(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.R(objectInput)), ZoneOffset.N(objectInput));
    }

    private OffsetDateTime G(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f41966a == localDateTime && this.f41967b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 10, this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime e(long j9, j$.time.temporal.u uVar) {
        return uVar instanceof j$.time.temporal.b ? G(this.f41966a.e(j9, uVar), this.f41967b) : (OffsetDateTime) uVar.i(this, j9);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iH;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.f41967b;
        ZoneOffset zoneOffset2 = this.f41967b;
        if (zoneOffset2.equals(zoneOffset)) {
            iH = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f41966a;
            localDateTime.getClass();
            long jN = AbstractC1913i.n(localDateTime, zoneOffset2);
            LocalDateTime localDateTime2 = offsetDateTime2.f41966a;
            localDateTime2.getClass();
            int iCompare = Long.compare(jN, AbstractC1913i.n(localDateTime2, offsetDateTime2.f41967b));
            iH = iCompare == 0 ? localDateTime.b().H() - localDateTime2.b().H() : iCompare;
        }
        return iH == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iH;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j9, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (OffsetDateTime) rVar.q(this, j9);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i9 = p.f42117a[aVar.ordinal()];
        ZoneOffset zoneOffset = this.f41967b;
        LocalDateTime localDateTime = this.f41966a;
        return i9 != 1 ? i9 != 2 ? G(localDateTime.d(j9, rVar), zoneOffset) : G(localDateTime, ZoneOffset.L(aVar.y(j9))) : D(Instant.F(j9, localDateTime.E()), zoneOffset);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.f41966a.equals(offsetDateTime.f41966a) && this.f41967b.equals(offsetDateTime.f41967b);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return (rVar instanceof j$.time.temporal.a) || (rVar != null && rVar.l(this));
    }

    public final int hashCode() {
        return this.f41966a.hashCode() ^ this.f41967b.hashCode();
    }

    @Override // j$.time.temporal.o
    public final int i(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.n.a(this, rVar);
        }
        int i9 = p.f42117a[((j$.time.temporal.a) rVar).ordinal()];
        if (i9 != 1) {
            return i9 != 2 ? this.f41966a.i(rVar) : this.f41967b.I();
        }
        throw new j$.time.temporal.v("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m k(h hVar) {
        return G(this.f41966a.R(hVar), this.f41967b);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) rVar).i() : this.f41966a.l(rVar) : rVar.t(this);
    }

    @Override // j$.time.temporal.o
    public final long q(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.k(this);
        }
        int i9 = p.f42117a[((j$.time.temporal.a) rVar).ordinal()];
        ZoneOffset zoneOffset = this.f41967b;
        LocalDateTime localDateTime = this.f41966a;
        if (i9 != 1) {
            return i9 != 2 ? localDateTime.q(rVar) : zoneOffset.I();
        }
        localDateTime.getClass();
        return AbstractC1913i.n(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.o
    public final Object t(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.j()) {
            return this.f41967b;
        }
        if (tVar == j$.time.temporal.n.k()) {
            return null;
        }
        j$.time.temporal.t tVarF = j$.time.temporal.n.f();
        LocalDateTime localDateTime = this.f41966a;
        return tVar == tVarF ? localDateTime.P() : tVar == j$.time.temporal.n.g() ? localDateTime.b() : tVar == j$.time.temporal.n.e() ? j$.time.chrono.u.f42030d : tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.NANOS : tVar.a(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f41966a;
    }

    public final String toString() {
        return this.f41966a.toString() + this.f41967b.toString();
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m u(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.f41966a;
        return mVar.d(localDateTime.P().r(), aVar).d(localDateTime.b().S(), j$.time.temporal.a.NANO_OF_DAY).d(this.f41967b.I(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        this.f41966a.T(objectOutput);
        this.f41967b.O(objectOutput);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m y(long j9, j$.time.temporal.u uVar) {
        return j9 == Long.MIN_VALUE ? e(Long.MAX_VALUE, uVar).e(1L, uVar) : e(-j9, uVar);
    }
}
