package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.u;
import j$.time.k;
import j$.time.m;
import j$.time.temporal.p;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.apache.http.message.TokenParser;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f42181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f42182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j$.time.e f42183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f42184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f42185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f42186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ZoneOffset f42187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ZoneOffset f42188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ZoneOffset f42189i;

    e(m mVar, int i9, j$.time.e eVar, k kVar, boolean z9, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f42181a = mVar;
        this.f42182b = (byte) i9;
        this.f42183c = eVar;
        this.f42184d = kVar;
        this.f42185e = z9;
        this.f42186f = dVar;
        this.f42187g = zoneOffset;
        this.f42188h = zoneOffset2;
        this.f42189i = zoneOffset3;
    }

    static e b(DataInput dataInput) {
        int i9 = dataInput.readInt();
        m mVarF = m.F(i9 >>> 28);
        int i10 = ((264241152 & i9) >>> 22) - 32;
        int i11 = (3670016 & i9) >>> 19;
        j$.time.e eVarC = i11 == 0 ? null : j$.time.e.C(i11);
        int i12 = (507904 & i9) >>> 14;
        d dVar = d.values()[(i9 & 12288) >>> 12];
        int i13 = (i9 & 4080) >>> 4;
        int i14 = (i9 & 12) >>> 2;
        int i15 = i9 & 3;
        k kVarL = i12 == 31 ? k.L(dataInput.readInt()) : k.J(i12 % 24);
        ZoneOffset zoneOffsetL = ZoneOffset.L(i13 == 255 ? dataInput.readInt() : (i13 - 128) * 900);
        ZoneOffset zoneOffsetL2 = i14 == 3 ? ZoneOffset.L(dataInput.readInt()) : ZoneOffset.L((i14 * 1800) + zoneOffsetL.I());
        ZoneOffset zoneOffsetL3 = i15 == 3 ? ZoneOffset.L(dataInput.readInt()) : ZoneOffset.L((i15 * 1800) + zoneOffsetL.I());
        boolean z9 = i12 == 24;
        Objects.a(mVarF, "month");
        Objects.a(kVarL, "time");
        Objects.a(dVar, "timeDefnition");
        if (i10 < -28 || i10 > 31 || i10 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z9 && !kVarL.equals(k.f42105g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (kVarL.H() == 0) {
            return new e(mVarF, i10, eVarC, kVarL, z9, dVar, zoneOffsetL, zoneOffsetL2, zoneOffsetL3);
        }
        throw new IllegalArgumentException("Time's nano-of-second must be zero");
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final b a(int i9) {
        j$.time.h hVarO;
        p pVar;
        int I9;
        ZoneOffset zoneOffset;
        j$.time.e eVar = this.f42183c;
        m mVar = this.f42181a;
        byte b9 = this.f42182b;
        if (b9 < 0) {
            u.f42030d.getClass();
            hVarO = j$.time.h.O(i9, mVar, mVar.D(u.l(i9)) + 1 + b9);
            if (eVar != null) {
                final int value = eVar.getValue();
                final int i10 = 1;
                pVar = new p() { // from class: j$.time.temporal.q
                    @Override // j$.time.temporal.p
                    public final m u(m mVar2) {
                        switch (i10) {
                            case 0:
                                int i11 = mVar2.i(a.DAY_OF_WEEK);
                                int i12 = value;
                                if (i11 == i12) {
                                    return mVar2;
                                }
                                return mVar2.e(i11 - i12 >= 0 ? 7 - r0 : -r0, b.DAYS);
                            default:
                                int i13 = mVar2.i(a.DAY_OF_WEEK);
                                int i14 = value;
                                if (i13 == i14) {
                                    return mVar2;
                                }
                                return mVar2.y(i14 - i13 >= 0 ? 7 - r1 : -r1, b.DAYS);
                        }
                    }
                };
                hVarO = hVarO.k(pVar);
            }
        } else {
            hVarO = j$.time.h.O(i9, mVar, b9);
            if (eVar != null) {
                final int value2 = eVar.getValue();
                final int i11 = 0;
                pVar = new p() { // from class: j$.time.temporal.q
                    @Override // j$.time.temporal.p
                    public final m u(m mVar2) {
                        switch (i11) {
                            case 0:
                                int i112 = mVar2.i(a.DAY_OF_WEEK);
                                int i12 = value2;
                                if (i112 == i12) {
                                    return mVar2;
                                }
                                return mVar2.e(i112 - i12 >= 0 ? 7 - r0 : -r0, b.DAYS);
                            default:
                                int i13 = mVar2.i(a.DAY_OF_WEEK);
                                int i14 = value2;
                                if (i13 == i14) {
                                    return mVar2;
                                }
                                return mVar2.y(i14 - i13 >= 0 ? 7 - r1 : -r1, b.DAYS);
                        }
                    }
                };
                hVarO = hVarO.k(pVar);
            }
        }
        if (this.f42185e) {
            hVarO = hVarO.R(1L);
        }
        LocalDateTime localDateTimeK = LocalDateTime.K(hVarO, this.f42184d);
        d dVar = this.f42186f;
        dVar.getClass();
        int i12 = c.f42179a[dVar.ordinal()];
        ZoneOffset zoneOffset2 = this.f42188h;
        if (i12 != 1) {
            if (i12 == 2) {
                I9 = zoneOffset2.I();
                zoneOffset = this.f42187g;
            }
            return new b(localDateTimeK, zoneOffset2, this.f42189i);
        }
        I9 = zoneOffset2.I();
        zoneOffset = ZoneOffset.UTC;
        localDateTimeK = localDateTimeK.N(I9 - zoneOffset.I());
        return new b(localDateTimeK, zoneOffset2, this.f42189i);
    }

    final void c(DataOutput dataOutput) {
        k kVar = this.f42184d;
        boolean z9 = this.f42185e;
        int iT = z9 ? DateTimeConstants.SECONDS_PER_DAY : kVar.T();
        int I9 = this.f42187g.I();
        ZoneOffset zoneOffset = this.f42188h;
        int I10 = zoneOffset.I() - I9;
        ZoneOffset zoneOffset2 = this.f42189i;
        int I11 = zoneOffset2.I() - I9;
        int iG = iT % 3600 == 0 ? z9 ? 24 : kVar.G() : 31;
        int i9 = I9 % 900 == 0 ? (I9 / 900) + 128 : 255;
        int i10 = (I10 == 0 || I10 == 1800 || I10 == 3600) ? I10 / 1800 : 3;
        int i11 = (I11 == 0 || I11 == 1800 || I11 == 3600) ? I11 / 1800 : 3;
        j$.time.e eVar = this.f42183c;
        dataOutput.writeInt((this.f42181a.getValue() << 28) + ((this.f42182b + 32) << 22) + ((eVar == null ? 0 : eVar.getValue()) << 19) + (iG << 14) + (this.f42186f.ordinal() << 12) + (i9 << 4) + (i10 << 2) + i11);
        if (iG == 31) {
            dataOutput.writeInt(iT);
        }
        if (i9 == 255) {
            dataOutput.writeInt(I9);
        }
        if (i10 == 3) {
            dataOutput.writeInt(zoneOffset.I());
        }
        if (i11 == 3) {
            dataOutput.writeInt(zoneOffset2.I());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f42181a == eVar.f42181a && this.f42182b == eVar.f42182b && this.f42183c == eVar.f42183c && this.f42186f == eVar.f42186f && this.f42184d.equals(eVar.f42184d) && this.f42185e == eVar.f42185e && this.f42187g.equals(eVar.f42187g) && this.f42188h.equals(eVar.f42188h) && this.f42189i.equals(eVar.f42189i);
    }

    public final int hashCode() {
        int iT = ((this.f42184d.T() + (this.f42185e ? 1 : 0)) << 15) + (this.f42181a.ordinal() << 11) + ((this.f42182b + 32) << 5);
        j$.time.e eVar = this.f42183c;
        return ((this.f42187g.hashCode() ^ (this.f42186f.ordinal() + (iT + ((eVar == null ? 7 : eVar.ordinal()) << 2)))) ^ this.f42188h.hashCode()) ^ this.f42189i.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.f42188h;
        ZoneOffset zoneOffset2 = this.f42189i;
        sb.append(zoneOffset.compareTo(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        m mVar = this.f42181a;
        byte b9 = this.f42182b;
        j$.time.e eVar = this.f42183c;
        if (eVar == null) {
            sb.append(mVar.name());
            sb.append(TokenParser.SP);
            sb.append((int) b9);
        } else {
            if (b9 == -1) {
                sb.append(eVar.name());
                str = " on or before last day of ";
            } else if (b9 < 0) {
                sb.append(eVar.name());
                sb.append(" on or before last day minus ");
                sb.append((-b9) - 1);
                str = " of ";
            } else {
                sb.append(eVar.name());
                sb.append(" on or after ");
                sb.append(mVar.name());
                sb.append(TokenParser.SP);
                sb.append((int) b9);
            }
            sb.append(str);
            sb.append(mVar.name());
        }
        sb.append(" at ");
        sb.append(this.f42185e ? "24:00" : this.f42184d.toString());
        sb.append(" ");
        sb.append(this.f42186f);
        sb.append(", standard offset ");
        sb.append(this.f42187g);
        sb.append(']');
        return sb.toString();
    }
}
