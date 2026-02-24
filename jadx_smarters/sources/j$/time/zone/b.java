package j$.time.zone;

import j$.time.Duration;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC1913i;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f42175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocalDateTime f42176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ZoneOffset f42177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ZoneOffset f42178d;

    b(long j9, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f42175a = j9;
        this.f42176b = LocalDateTime.L(j9, 0, zoneOffset);
        this.f42177c = zoneOffset;
        this.f42178d = zoneOffset2;
    }

    b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.f42175a = AbstractC1913i.n(localDateTime, zoneOffset);
        this.f42176b = localDateTime;
        this.f42177c = zoneOffset;
        this.f42178d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final long B() {
        return this.f42175a;
    }

    final void C(DataOutput dataOutput) {
        a.c(this.f42175a, dataOutput);
        a.d(this.f42177c, dataOutput);
        a.d(this.f42178d, dataOutput);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f42175a, ((b) obj).f42175a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f42175a == bVar.f42175a && this.f42177c.equals(bVar.f42177c) && this.f42178d.equals(bVar.f42178d);
    }

    public final int hashCode() {
        return (this.f42176b.hashCode() ^ this.f42177c.hashCode()) ^ Integer.rotateLeft(this.f42178d.hashCode(), 16);
    }

    public final LocalDateTime i() {
        return this.f42176b.N(this.f42178d.I() - this.f42177c.I());
    }

    public final LocalDateTime k() {
        return this.f42176b;
    }

    public final Duration l() {
        return Duration.l(this.f42178d.I() - this.f42177c.I());
    }

    public final ZoneOffset q() {
        return this.f42178d;
    }

    public final ZoneOffset t() {
        return this.f42177c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(y() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f42176b);
        sb.append(this.f42177c);
        sb.append(" to ");
        sb.append(this.f42178d);
        sb.append(']');
        return sb.toString();
    }

    final List u() {
        return y() ? Collections.emptyList() : j$.com.android.tools.r8.a.k(new Object[]{this.f42177c, this.f42178d});
    }

    public final boolean y() {
        return this.f42178d.I() > this.f42177c.I();
    }
}
