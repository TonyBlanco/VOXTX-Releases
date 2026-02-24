package j$.time;

import j$.time.chrono.AbstractC1913i;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.WebSocketProtocol;
import org.achartengine.chart.TimeChart;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f42103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f42104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f42105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final k[] f42106h = new k[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f42107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f42108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte f42109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42110d;

    static {
        int i9 = 0;
        while (true) {
            k[] kVarArr = f42106h;
            if (i9 >= kVarArr.length) {
                k kVar = kVarArr[0];
                f42105g = kVar;
                k kVar2 = kVarArr[12];
                f42103e = kVar;
                f42104f = new k(23, 59, 59, 999999999);
                return;
            }
            kVarArr[i9] = new k(i9, 0, 0, 0);
            i9++;
        }
    }

    private k(int i9, int i10, int i11, int i12) {
        this.f42107a = (byte) i9;
        this.f42108b = (byte) i10;
        this.f42109c = (byte) i11;
        this.f42110d = i12;
    }

    private static k D(int i9, int i10, int i11, int i12) {
        return ((i10 | i11) | i12) == 0 ? f42106h[i9] : new k(i9, i10, i11, i12);
    }

    public static k E(j$.time.temporal.o oVar) {
        Objects.a(oVar, "temporal");
        k kVar = (k) oVar.t(j$.time.temporal.n.g());
        if (kVar != null) {
            return kVar;
        }
        throw new c("Unable to obtain LocalTime from TemporalAccessor: " + oVar + " of type " + oVar.getClass().getName());
    }

    private int F(j$.time.temporal.r rVar) {
        int i9 = j.f42101a[((j$.time.temporal.a) rVar).ordinal()];
        byte b9 = this.f42108b;
        int i10 = this.f42110d;
        byte b10 = this.f42107a;
        switch (i9) {
            case 1:
                return i10;
            case 2:
                throw new j$.time.temporal.v("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i10 / 1000;
            case 4:
                throw new j$.time.temporal.v("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i10 / 1000000;
            case 6:
                return (int) (S() / 1000000);
            case 7:
                return this.f42109c;
            case 8:
                return T();
            case 9:
                return b9;
            case 10:
                return (b10 * 60) + b9;
            case 11:
                return b10 % 12;
            case 12:
                int i11 = b10 % 12;
                if (i11 % 12 == 0) {
                    return 12;
                }
                return i11;
            case 13:
                return b10;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return b10 / 12;
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
    }

    public static k J(int i9) {
        j$.time.temporal.a.HOUR_OF_DAY.C(i9);
        return f42106h[i9];
    }

    public static k K(long j9) {
        j$.time.temporal.a.NANO_OF_DAY.C(j9);
        int i9 = (int) (j9 / 3600000000000L);
        long j10 = j9 - (((long) i9) * 3600000000000L);
        int i10 = (int) (j10 / 60000000000L);
        long j11 = j10 - (((long) i10) * 60000000000L);
        int i11 = (int) (j11 / 1000000000);
        return D(i9, i10, i11, (int) (j11 - (((long) i11) * 1000000000)));
    }

    public static k L(long j9) {
        j$.time.temporal.a.SECOND_OF_DAY.C(j9);
        int i9 = (int) (j9 / 3600);
        long j10 = j9 - ((long) (i9 * 3600));
        int i10 = (int) (j10 / 60);
        return D(i9, i10, (int) (j10 - ((long) (i10 * 60))), 0);
    }

    static k R(DataInput dataInput) throws IOException {
        int i9;
        int i10;
        int i11 = dataInput.readByte();
        int i12 = 0;
        if (i11 >= 0) {
            byte b9 = dataInput.readByte();
            if (b9 < 0) {
                int i13 = ~b9;
                i10 = 0;
                i12 = i13;
                i9 = 0;
            } else {
                byte b10 = dataInput.readByte();
                if (b10 < 0) {
                    i9 = ~b10;
                    i12 = b9;
                } else {
                    int i14 = dataInput.readInt();
                    i9 = b10;
                    i10 = i14;
                    i12 = b9;
                }
            }
            j$.time.temporal.a.HOUR_OF_DAY.C(i11);
            j$.time.temporal.a.MINUTE_OF_HOUR.C(i12);
            j$.time.temporal.a.SECOND_OF_MINUTE.C(i9);
            j$.time.temporal.a.NANO_OF_SECOND.C(i10);
            return D(i11, i12, i9, i10);
        }
        i11 = ~i11;
        i9 = 0;
        i10 = 0;
        j$.time.temporal.a.HOUR_OF_DAY.C(i11);
        j$.time.temporal.a.MINUTE_OF_HOUR.C(i12);
        j$.time.temporal.a.SECOND_OF_MINUTE.C(i9);
        j$.time.temporal.a.NANO_OF_SECOND.C(i10);
        return D(i11, i12, i9, i10);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 4, this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        int iCompare = Integer.compare(this.f42107a, kVar.f42107a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(this.f42108b, kVar.f42108b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Integer.compare(this.f42109c, kVar.f42109c);
        return iCompare3 == 0 ? Integer.compare(this.f42110d, kVar.f42110d) : iCompare3;
    }

    public final int G() {
        return this.f42107a;
    }

    public final int H() {
        return this.f42110d;
    }

    public final int I() {
        return this.f42109c;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final k e(long j9, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (k) uVar.i(this, j9);
        }
        switch (j.f42102b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return P(j9);
            case 2:
                return P((j9 % 86400000000L) * 1000);
            case 3:
                return P((j9 % TimeChart.DAY) * 1000000);
            case 4:
                return Q(j9);
            case 5:
                return O(j9);
            case 6:
                return N(j9);
            case 7:
                return N((j9 % 2) * 12);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    public final k N(long j9) {
        if (j9 == 0) {
            return this;
        }
        return D(((((int) (j9 % 24)) + this.f42107a) + 24) % 24, this.f42108b, this.f42109c, this.f42110d);
    }

    public final k O(long j9) {
        if (j9 == 0) {
            return this;
        }
        int i9 = (this.f42107a * 60) + this.f42108b;
        int i10 = ((((int) (j9 % 1440)) + i9) + DateTimeConstants.MINUTES_PER_DAY) % DateTimeConstants.MINUTES_PER_DAY;
        return i9 == i10 ? this : D(i10 / 60, i10 % 60, this.f42109c, this.f42110d);
    }

    public final k P(long j9) {
        if (j9 == 0) {
            return this;
        }
        long jS = S();
        long j10 = (((j9 % 86400000000000L) + jS) + 86400000000000L) % 86400000000000L;
        return jS == j10 ? this : D((int) (j10 / 3600000000000L), (int) ((j10 / 60000000000L) % 60), (int) ((j10 / 1000000000) % 60), (int) (j10 % 1000000000));
    }

    public final k Q(long j9) {
        if (j9 == 0) {
            return this;
        }
        int i9 = (this.f42108b * 60) + (this.f42107a * 3600) + this.f42109c;
        int i10 = ((((int) (j9 % 86400)) + i9) + DateTimeConstants.SECONDS_PER_DAY) % DateTimeConstants.SECONDS_PER_DAY;
        return i9 == i10 ? this : D(i10 / 3600, (i10 / 60) % 60, i10 % 60, this.f42110d);
    }

    public final long S() {
        return (((long) this.f42109c) * 1000000000) + (((long) this.f42108b) * 60000000000L) + (((long) this.f42107a) * 3600000000000L) + ((long) this.f42110d);
    }

    public final int T() {
        return (this.f42108b * 60) + (this.f42107a * 3600) + this.f42109c;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final k d(long j9, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (k) rVar.q(this, j9);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.C(j9);
        int i9 = j.f42101a[aVar.ordinal()];
        byte b9 = this.f42108b;
        byte b10 = this.f42109c;
        int i10 = this.f42110d;
        byte b11 = this.f42107a;
        switch (i9) {
            case 1:
                return V((int) j9);
            case 2:
                return K(j9);
            case 3:
                return V(((int) j9) * 1000);
            case 4:
                return K(j9 * 1000);
            case 5:
                return V(((int) j9) * 1000000);
            case 6:
                return K(j9 * 1000000);
            case 7:
                int i11 = (int) j9;
                if (b10 == i11) {
                    return this;
                }
                j$.time.temporal.a.SECOND_OF_MINUTE.C(i11);
                return D(b11, b9, i11, i10);
            case 8:
                return Q(j9 - ((long) T()));
            case 9:
                int i12 = (int) j9;
                if (b9 == i12) {
                    return this;
                }
                j$.time.temporal.a.MINUTE_OF_HOUR.C(i12);
                return D(b11, i12, b10, i10);
            case 10:
                return O(j9 - ((long) ((b11 * 60) + b9)));
            case 11:
                return N(j9 - ((long) (b11 % 12)));
            case 12:
                if (j9 == 12) {
                    j9 = 0;
                }
                return N(j9 - ((long) (b11 % 12)));
            case 13:
                int i13 = (int) j9;
                if (b11 == i13) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.C(i13);
                return D(i13, b9, b10, i10);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (j9 == 24) {
                    j9 = 0;
                }
                int i14 = (int) j9;
                if (b11 == i14) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.C(i14);
                return D(i14, b9, b10, i10);
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return N((j9 - ((long) (b11 / 12))) * 12);
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
    }

    public final k V(int i9) {
        if (this.f42110d == i9) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.C(i9);
        return D(this.f42107a, this.f42108b, this.f42109c, i9);
    }

    final void W(DataOutput dataOutput) {
        int i9;
        byte b9 = this.f42109c;
        byte b10 = this.f42107a;
        byte b11 = this.f42108b;
        int i10 = this.f42110d;
        if (i10 != 0) {
            dataOutput.writeByte(b10);
            dataOutput.writeByte(b11);
            dataOutput.writeByte(b9);
            dataOutput.writeInt(i10);
            return;
        }
        if (b9 != 0) {
            dataOutput.writeByte(b10);
            dataOutput.writeByte(b11);
            i9 = ~b9;
        } else if (b11 == 0) {
            i9 = ~b10;
        } else {
            dataOutput.writeByte(b10);
            i9 = ~b11;
        }
        dataOutput.writeByte(i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f42107a == kVar.f42107a && this.f42108b == kVar.f42108b && this.f42109c == kVar.f42109c && this.f42110d == kVar.f42110d;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).D() : rVar != null && rVar.l(this);
    }

    public final int hashCode() {
        long jS = S();
        return (int) (jS ^ (jS >>> 32));
    }

    @Override // j$.time.temporal.o
    public final int i(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? F(rVar) : j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m k(h hVar) {
        boolean z9 = hVar instanceof k;
        j$.time.temporal.m mVarA = hVar;
        if (!z9) {
            mVarA = AbstractC1913i.a(hVar, this);
        }
        return (k) mVarA;
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long q(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.NANO_OF_DAY ? S() : rVar == j$.time.temporal.a.MICRO_OF_DAY ? S() / 1000 : F(rVar) : rVar.k(this);
    }

    @Override // j$.time.temporal.o
    public final Object t(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.e() || tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h()) {
            return null;
        }
        if (tVar == j$.time.temporal.n.g()) {
            return this;
        }
        if (tVar == j$.time.temporal.n.f()) {
            return null;
        }
        return tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.NANOS : tVar.a(this);
    }

    public final String toString() {
        int i9;
        StringBuilder sb = new StringBuilder(18);
        byte b9 = this.f42107a;
        sb.append(b9 < 10 ? "0" : "");
        sb.append((int) b9);
        byte b10 = this.f42108b;
        sb.append(b10 < 10 ? ":0" : ":");
        sb.append((int) b10);
        byte b11 = this.f42109c;
        int i10 = this.f42110d;
        if (b11 > 0 || i10 > 0) {
            sb.append(b11 < 10 ? ":0" : ":");
            sb.append((int) b11);
            if (i10 > 0) {
                sb.append('.');
                int i11 = 1000000;
                if (i10 % 1000000 == 0) {
                    i9 = (i10 / 1000000) + 1000;
                } else {
                    if (i10 % 1000 == 0) {
                        i10 /= 1000;
                    } else {
                        i11 = Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
                    }
                    i9 = i10 + i11;
                }
                sb.append(Integer.toString(i9).substring(1));
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m u(j$.time.temporal.m mVar) {
        return mVar.d(S(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m y(long j9, j$.time.temporal.u uVar) {
        return j9 == Long.MIN_VALUE ? e(Long.MAX_VALUE, uVar).e(1L, uVar) : e(-j9, uVar);
    }
}
