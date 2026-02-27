package j$.time;

import j$.time.chrono.AbstractC1913i;
import j$.time.chrono.InterfaceC1906b;
import j$.time.chrono.InterfaceC1909e;
import j$.time.chrono.InterfaceC1915k;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements j$.time.temporal.m, InterfaceC1915k, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocalDateTime f42170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZoneOffset f42171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ZoneId f42172c;

    private z(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f42170a = localDateTime;
        this.f42171b = zoneOffset;
        this.f42172c = zoneId;
    }

    private static z C(long j9, int i9, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.C().d(Instant.F(j9, i9));
        return new z(LocalDateTime.L(j9, i9, zoneOffsetD), zoneId, zoneOffsetD);
    }

    public static z D(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        return C(instant.getEpochSecond(), instant.D(), zoneId);
    }

    public static z E(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new z(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f fVarC = zoneId.C();
        List listG = fVarC.g(localDateTime);
        if (listG.size() == 1) {
            zoneOffset = (ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = fVarC.f(localDateTime);
            localDateTime = localDateTime.N(bVarF.l().k());
            zoneOffset = bVarF.q();
        } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listG.get(0);
            Objects.a(zoneOffset, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
        }
        return new z(localDateTime, zoneId, zoneOffset);
    }

    static z G(ObjectInput objectInput) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.f41962c;
        h hVar = h.f42095d;
        LocalDateTime localDateTimeK = LocalDateTime.K(h.N(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.R(objectInput));
        ZoneOffset zoneOffsetN = ZoneOffset.N(objectInput);
        ZoneId zoneId = (ZoneId) s.a(objectInput);
        Objects.a(zoneId, "zone");
        if (!(zoneId instanceof ZoneOffset) || zoneOffsetN.equals(zoneId)) {
            return new z(localDateTimeK, zoneId, zoneOffsetN);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 6, this);
    }

    @Override // j$.time.chrono.InterfaceC1915k
    public final /* synthetic */ long B() {
        return AbstractC1913i.o(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final z e(long j9, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (z) uVar.i(this, j9);
        }
        j$.time.temporal.b bVar = (j$.time.temporal.b) uVar;
        int iCompareTo = bVar.compareTo(j$.time.temporal.b.DAYS);
        ZoneOffset zoneOffset = this.f42171b;
        ZoneId zoneId = this.f42172c;
        LocalDateTime localDateTime = this.f42170a;
        if (iCompareTo >= 0 && bVar != j$.time.temporal.b.FOREVER) {
            return E(localDateTime.e(j9, uVar), zoneId, zoneOffset);
        }
        LocalDateTime localDateTimeE = localDateTime.e(j9, uVar);
        Objects.a(localDateTimeE, "localDateTime");
        Objects.a(zoneOffset, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
        Objects.a(zoneId, "zone");
        return zoneId.C().g(localDateTimeE).contains(zoneOffset) ? new z(localDateTimeE, zoneId, zoneOffset) : C(AbstractC1913i.n(localDateTimeE, zoneOffset), localDateTimeE.E(), zoneId);
    }

    public final LocalDateTime H() {
        return this.f42170a;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final z k(h hVar) {
        return E(LocalDateTime.K(hVar, this.f42170a.b()), this.f42172c, this.f42171b);
    }

    final void J(DataOutput dataOutput) {
        this.f42170a.T(dataOutput);
        this.f42171b.O(dataOutput);
        this.f42172c.G(dataOutput);
    }

    @Override // j$.time.chrono.InterfaceC1915k
    public final j$.time.chrono.n a() {
        return ((h) c()).a();
    }

    @Override // j$.time.chrono.InterfaceC1915k
    public final k b() {
        return this.f42170a.b();
    }

    @Override // j$.time.chrono.InterfaceC1915k
    public final InterfaceC1906b c() {
        return this.f42170a.P();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j9, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (z) rVar.q(this, j9);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i9 = y.f42169a[aVar.ordinal()];
        LocalDateTime localDateTime = this.f42170a;
        ZoneId zoneId = this.f42172c;
        if (i9 == 1) {
            return C(j9, localDateTime.E(), zoneId);
        }
        ZoneOffset zoneOffset = this.f42171b;
        if (i9 != 2) {
            return E(localDateTime.d(j9, rVar), zoneId, zoneOffset);
        }
        ZoneOffset zoneOffsetL = ZoneOffset.L(aVar.y(j9));
        return (zoneOffsetL.equals(zoneOffset) || !zoneId.C().g(localDateTime).contains(zoneOffsetL)) ? this : new z(localDateTime, zoneId, zoneOffsetL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f42170a.equals(zVar.f42170a) && this.f42171b.equals(zVar.f42171b) && this.f42172c.equals(zVar.f42172c);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return (rVar instanceof j$.time.temporal.a) || (rVar != null && rVar.l(this));
    }

    @Override // j$.time.chrono.InterfaceC1915k
    public final ZoneOffset g() {
        return this.f42171b;
    }

    @Override // j$.time.chrono.InterfaceC1915k
    public final InterfaceC1915k h(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        return this.f42172c.equals(zoneId) ? this : E(this.f42170a, zoneId, this.f42171b);
    }

    public final int hashCode() {
        return (this.f42170a.hashCode() ^ this.f42171b.hashCode()) ^ Integer.rotateLeft(this.f42172c.hashCode(), 3);
    }

    @Override // j$.time.temporal.o
    public final int i(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return AbstractC1913i.e(this, rVar);
        }
        int i9 = y.f42169a[((j$.time.temporal.a) rVar).ordinal()];
        if (i9 != 1) {
            return i9 != 2 ? this.f42170a.i(rVar) : this.f42171b.I();
        }
        throw new j$.time.temporal.v("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) rVar).i() : this.f42170a.l(rVar) : rVar.t(this);
    }

    @Override // j$.time.chrono.InterfaceC1915k
    public final ZoneId o() {
        return this.f42172c;
    }

    @Override // j$.time.temporal.o
    public final long q(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.k(this);
        }
        int i9 = y.f42169a[((j$.time.temporal.a) rVar).ordinal()];
        return i9 != 1 ? i9 != 2 ? this.f42170a.q(rVar) : this.f42171b.I() : AbstractC1913i.o(this);
    }

    @Override // j$.time.temporal.o
    public final Object t(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.f() ? this.f42170a.P() : AbstractC1913i.l(this, tVar);
    }

    public final String toString() {
        String string = this.f42170a.toString();
        ZoneOffset zoneOffset = this.f42171b;
        String str = string + zoneOffset.toString();
        ZoneId zoneId = this.f42172c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ int compareTo(InterfaceC1915k interfaceC1915k) {
        return AbstractC1913i.d(this, interfaceC1915k);
    }

    @Override // j$.time.chrono.InterfaceC1915k
    public final InterfaceC1909e w() {
        return this.f42170a;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m y(long j9, j$.time.temporal.u uVar) {
        return j9 == Long.MIN_VALUE ? e(Long.MAX_VALUE, uVar).e(1L, uVar) : e(-j9, uVar);
    }
}
