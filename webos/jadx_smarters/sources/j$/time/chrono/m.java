package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
final class m implements InterfaceC1915k, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient C1911g f42008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient ZoneOffset f42009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient ZoneId f42010c;

    private m(ZoneId zoneId, ZoneOffset zoneOffset, C1911g c1911g) {
        Objects.a(c1911g, "dateTime");
        this.f42008a = c1911g;
        Objects.a(zoneOffset, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
        this.f42009b = zoneOffset;
        Objects.a(zoneId, "zone");
        this.f42010c = zoneId;
    }

    static m C(n nVar, j$.time.temporal.m mVar) {
        m mVar2 = (m) mVar;
        AbstractC1905a abstractC1905a = (AbstractC1905a) nVar;
        if (abstractC1905a.equals(mVar2.a())) {
            return mVar2;
        }
        throw new ClassCastException("Chronology mismatch, required: " + abstractC1905a.getId() + ", actual: " + mVar2.a().getId());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static j$.time.chrono.InterfaceC1915k E(j$.time.ZoneId r6, j$.time.ZoneOffset r7, j$.time.chrono.C1911g r8) {
        /*
            java.lang.String r0 = "localDateTime"
            j$.util.Objects.a(r8, r0)
            java.lang.String r0 = "zone"
            j$.util.Objects.a(r6, r0)
            boolean r0 = r6 instanceof j$.time.ZoneOffset
            if (r0 == 0) goto L17
            j$.time.chrono.m r7 = new j$.time.chrono.m
            r0 = r6
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            r7.<init>(r6, r0, r8)
            return r7
        L17:
            j$.time.zone.f r0 = r6.C()
            j$.time.LocalDateTime r1 = j$.time.LocalDateTime.D(r8)
            java.util.List r2 = r0.g(r1)
            int r3 = r2.size()
            r4 = 1
            r5 = 0
            if (r3 != r4) goto L32
        L2b:
            java.lang.Object r7 = r2.get(r5)
            j$.time.ZoneOffset r7 = (j$.time.ZoneOffset) r7
            goto L55
        L32:
            int r3 = r2.size()
            if (r3 != 0) goto L4d
            j$.time.zone.b r7 = r0.f(r1)
            j$.time.Duration r0 = r7.l()
            long r0 = r0.k()
            j$.time.chrono.g r8 = r8.G(r0)
            j$.time.ZoneOffset r7 = r7.q()
            goto L55
        L4d:
            if (r7 == 0) goto L2b
            boolean r0 = r2.contains(r7)
            if (r0 == 0) goto L2b
        L55:
            java.lang.String r0 = "offset"
            j$.util.Objects.a(r7, r0)
            j$.time.chrono.m r0 = new j$.time.chrono.m
            r0.<init>(r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.m.E(j$.time.ZoneId, j$.time.ZoneOffset, j$.time.chrono.g):j$.time.chrono.k");
    }

    static m F(n nVar, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.C().d(instant);
        Objects.a(zoneOffsetD, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
        return new m(zoneId, zoneOffsetD, (C1911g) nVar.m(LocalDateTime.L(instant.getEpochSecond(), instant.D(), zoneOffsetD)));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 3, this);
    }

    @Override // j$.time.chrono.InterfaceC1915k
    public final /* synthetic */ long B() {
        return AbstractC1913i.o(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1915k y(long j9, j$.time.temporal.u uVar) {
        return C(a(), j$.time.temporal.n.b(this, j9, uVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1915k e(long j9, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return C(a(), uVar.i(this, j9));
        }
        return C(a(), this.f42008a.e(j9, uVar).u(this));
    }

    @Override // j$.time.chrono.InterfaceC1915k
    public final n a() {
        return c().a();
    }

    @Override // j$.time.chrono.InterfaceC1915k
    public final j$.time.k b() {
        return ((C1911g) w()).b();
    }

    @Override // j$.time.chrono.InterfaceC1915k
    public final InterfaceC1906b c() {
        return ((C1911g) w()).c();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j9, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return C(a(), rVar.q(this, j9));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i9 = AbstractC1916l.f42007a[aVar.ordinal()];
        if (i9 == 1) {
            return e(j9 - AbstractC1913i.o(this), j$.time.temporal.b.SECONDS);
        }
        ZoneId zoneId = this.f42010c;
        C1911g c1911g = this.f42008a;
        if (i9 != 2) {
            return E(zoneId, this.f42009b, c1911g.d(j9, rVar));
        }
        ZoneOffset zoneOffsetL = ZoneOffset.L(aVar.y(j9));
        c1911g.getClass();
        return F(a(), Instant.F(AbstractC1913i.n(c1911g, zoneOffsetL), c1911g.b().H()), zoneId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1915k) && AbstractC1913i.d(this, (InterfaceC1915k) obj) == 0;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return (rVar instanceof j$.time.temporal.a) || (rVar != null && rVar.l(this));
    }

    @Override // j$.time.chrono.InterfaceC1915k
    public final ZoneOffset g() {
        return this.f42009b;
    }

    @Override // j$.time.chrono.InterfaceC1915k
    public final InterfaceC1915k h(ZoneId zoneId) {
        return E(zoneId, this.f42009b, this.f42008a);
    }

    public final int hashCode() {
        return (this.f42008a.hashCode() ^ this.f42009b.hashCode()) ^ Integer.rotateLeft(this.f42010c.hashCode(), 3);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int i(j$.time.temporal.r rVar) {
        return AbstractC1913i.e(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m k(j$.time.h hVar) {
        return C(a(), hVar.u(this));
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) rVar).i() : ((C1911g) w()).l(rVar) : rVar.t(this);
    }

    @Override // j$.time.chrono.InterfaceC1915k
    public final ZoneId o() {
        return this.f42010c;
    }

    @Override // j$.time.temporal.o
    public final long q(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.k(this);
        }
        int i9 = AbstractC1914j.f42006a[((j$.time.temporal.a) rVar).ordinal()];
        return i9 != 1 ? i9 != 2 ? ((C1911g) w()).q(rVar) : g().I() : B();
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object t(j$.time.temporal.t tVar) {
        return AbstractC1913i.l(this, tVar);
    }

    public final String toString() {
        String string = this.f42008a.toString();
        ZoneOffset zoneOffset = this.f42009b;
        String str = string + zoneOffset.toString();
        ZoneId zoneId = this.f42010c;
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
        return this.f42008a;
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f42008a);
        objectOutput.writeObject(this.f42009b);
        objectOutput.writeObject(this.f42010c);
    }
}
