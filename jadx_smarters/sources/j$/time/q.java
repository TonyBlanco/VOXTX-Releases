package j$.time;

import j$.time.chrono.AbstractC1913i;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f42118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZoneOffset f42119b;

    static {
        k kVar = k.f42103e;
        ZoneOffset zoneOffset = ZoneOffset.f41972g;
        kVar.getClass();
        C(kVar, zoneOffset);
        k kVar2 = k.f42104f;
        ZoneOffset zoneOffset2 = ZoneOffset.f41971f;
        kVar2.getClass();
        C(kVar2, zoneOffset2);
    }

    private q(k kVar, ZoneOffset zoneOffset) {
        Objects.a(kVar, "time");
        this.f42118a = kVar;
        Objects.a(zoneOffset, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
        this.f42119b = zoneOffset;
    }

    public static q C(k kVar, ZoneOffset zoneOffset) {
        return new q(kVar, zoneOffset);
    }

    static q E(ObjectInput objectInput) {
        return new q(k.R(objectInput), ZoneOffset.N(objectInput));
    }

    private q F(k kVar, ZoneOffset zoneOffset) {
        return (this.f42118a == kVar && this.f42119b.equals(zoneOffset)) ? this : new q(kVar, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 9, this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final q e(long j9, j$.time.temporal.u uVar) {
        return uVar instanceof j$.time.temporal.b ? F(this.f42118a.e(j9, uVar), this.f42119b) : (q) uVar.i(this, j9);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompare;
        q qVar = (q) obj;
        ZoneOffset zoneOffset = qVar.f42119b;
        ZoneOffset zoneOffset2 = this.f42119b;
        boolean zEquals = zoneOffset2.equals(zoneOffset);
        k kVar = qVar.f42118a;
        k kVar2 = this.f42118a;
        return (zEquals || (iCompare = Long.compare(kVar2.S() - (((long) zoneOffset2.I()) * 1000000000), kVar.S() - (((long) qVar.f42119b.I()) * 1000000000))) == 0) ? kVar2.compareTo(kVar) : iCompare;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j9, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (q) rVar.q(this, j9);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        k kVar = this.f42118a;
        return rVar == aVar ? F(kVar, ZoneOffset.L(((j$.time.temporal.a) rVar).y(j9))) : F(kVar.d(j9, rVar), this.f42119b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f42118a.equals(qVar.f42118a) && this.f42119b.equals(qVar.f42119b);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).D() || rVar == j$.time.temporal.a.OFFSET_SECONDS : rVar != null && rVar.l(this);
    }

    public final int hashCode() {
        return this.f42118a.hashCode() ^ this.f42119b.hashCode();
    }

    @Override // j$.time.temporal.o
    public final int i(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.a(this, rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.time.temporal.m
    public final j$.time.temporal.m k(h hVar) {
        if (hVar instanceof k) {
            return F((k) hVar, this.f42119b);
        }
        if (hVar instanceof ZoneOffset) {
            return F(this.f42118a, (ZoneOffset) hVar);
        }
        boolean z9 = hVar instanceof q;
        Object objA = hVar;
        if (!z9) {
            objA = AbstractC1913i.a(hVar, this);
        }
        return (q) objA;
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.t(this);
        }
        if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return ((j$.time.temporal.a) rVar).i();
        }
        k kVar = this.f42118a;
        kVar.getClass();
        return j$.time.temporal.n.d(kVar, rVar);
    }

    @Override // j$.time.temporal.o
    public final long q(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.OFFSET_SECONDS ? this.f42119b.I() : this.f42118a.q(rVar) : rVar.k(this);
    }

    @Override // j$.time.temporal.o
    public final Object t(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.j()) {
            return this.f42119b;
        }
        if (((tVar == j$.time.temporal.n.k()) || (tVar == j$.time.temporal.n.e())) || tVar == j$.time.temporal.n.f()) {
            return null;
        }
        return tVar == j$.time.temporal.n.g() ? this.f42118a : tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.NANOS : tVar.a(this);
    }

    public final String toString() {
        return this.f42118a.toString() + this.f42119b.toString();
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m u(j$.time.temporal.m mVar) {
        return mVar.d(this.f42118a.S(), j$.time.temporal.a.NANO_OF_DAY).d(this.f42119b.I(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.f42118a.W(objectOutput);
        this.f42119b.O(objectOutput);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m y(long j9, j$.time.temporal.u uVar) {
        return j9 == Long.MIN_VALUE ? e(Long.MAX_VALUE, uVar).e(1L, uVar) : e(-j9, uVar);
    }
}
