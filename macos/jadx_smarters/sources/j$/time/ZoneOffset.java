package j$.time;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements j$.time.temporal.o, j$.time.temporal.p, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient String f41974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentHashMap f41969d = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap f41970e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = L(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ZoneOffset f41971f = L(-64800);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ZoneOffset f41972g = L(64800);

    private ZoneOffset(int i9) {
        String string;
        this.f41973b = i9;
        if (i9 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i9);
            StringBuilder sb = new StringBuilder();
            int i10 = iAbs / 3600;
            int i11 = (iAbs / 60) % 60;
            sb.append(i9 < 0 ? "-" : "+");
            sb.append(i10 < 10 ? "0" : "");
            sb.append(i10);
            sb.append(i11 < 10 ? ":0" : ":");
            sb.append(i11);
            int i12 = iAbs % 60;
            if (i12 != 0) {
                sb.append(i12 < 10 ? ":0" : ":");
                sb.append(i12);
            }
            string = sb.toString();
        }
        this.f41974c = string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j$.time.ZoneOffset J(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            j$.util.Objects.a(r7, r0)
            j$.util.concurrent.ConcurrentHashMap r0 = j$.time.ZoneOffset.f41970e
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L63
            r1 = 3
            if (r0 == r1) goto L7f
            r4 = 5
            if (r0 == r4) goto L5a
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = M(r7, r2, r3)
            int r1 = M(r7, r6, r2)
            int r2 = M(r7, r5, r2)
            goto L85
        L37:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = M(r7, r2, r3)
            int r1 = M(r7, r1, r3)
            int r2 = M(r7, r4, r3)
            goto L85
        L50:
            int r0 = M(r7, r2, r3)
            int r1 = M(r7, r6, r2)
        L58:
            r2 = 0
            goto L85
        L5a:
            int r0 = M(r7, r2, r3)
            int r1 = M(r7, r1, r3)
            goto L58
        L63:
            char r0 = r7.charAt(r3)
            char r7 = r7.charAt(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L7f:
            int r0 = M(r7, r2, r3)
            r1 = 0
            goto L58
        L85:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9e
            if (r3 != r5) goto L92
            goto L9e
        L92:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r7 = K(r7, r0, r1)
            return r7
        La8:
            j$.time.ZoneOffset r7 = K(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.ZoneOffset.J(java.lang.String):j$.time.ZoneOffset");
    }

    public static ZoneOffset K(int i9, int i10, int i11) {
        if (i9 < -18 || i9 > 18) {
            throw new c("Zone offset hours not in valid range: value " + i9 + " is not in the range -18 to 18");
        }
        if (i9 > 0) {
            if (i10 < 0 || i11 < 0) {
                throw new c("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i9 < 0) {
            if (i10 > 0 || i11 > 0) {
                throw new c("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i10 > 0 && i11 < 0) || (i10 < 0 && i11 > 0)) {
            throw new c("Zone offset minutes and seconds must have the same sign");
        }
        if (i10 < -59 || i10 > 59) {
            throw new c("Zone offset minutes not in valid range: value " + i10 + " is not in the range -59 to 59");
        }
        if (i11 < -59 || i11 > 59) {
            throw new c("Zone offset seconds not in valid range: value " + i11 + " is not in the range -59 to 59");
        }
        if (Math.abs(i9) == 18 && (i10 | i11) != 0) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        return L((i10 * 60) + (i9 * 3600) + i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset L(int i9) {
        if (i9 < -64800 || i9 > 64800) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i9 % 900 != 0) {
            return new ZoneOffset(i9);
        }
        Integer numValueOf = Integer.valueOf(i9);
        ConcurrentHashMap concurrentHashMap = f41969d;
        ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(numValueOf);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        concurrentHashMap.putIfAbsent(numValueOf, new ZoneOffset(i9));
        ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(numValueOf);
        f41970e.putIfAbsent(zoneOffset2.f41974c, zoneOffset2);
        return zoneOffset2;
    }

    private static int M(CharSequence charSequence, int i9, boolean z9) {
        if (z9 && charSequence.charAt(i9 - 1) != ':') {
            throw new c("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char cCharAt = charSequence.charAt(i9);
        char cCharAt2 = charSequence.charAt(i9 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new c("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
    }

    static ZoneOffset N(DataInput dataInput) throws IOException {
        byte b9 = dataInput.readByte();
        return b9 == 127 ? L(dataInput.readInt()) : L(b9 * 900);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 8, this);
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f C() {
        return j$.time.zone.f.i(this);
    }

    @Override // j$.time.ZoneId
    final void G(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        O(dataOutput);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f41973b - this.f41973b;
    }

    public final int I() {
        return this.f41973b;
    }

    final void O(DataOutput dataOutput) throws IOException {
        int i9 = this.f41973b;
        int i10 = i9 % 900 == 0 ? i9 / 900 : 127;
        dataOutput.writeByte(i10);
        if (i10 == 127) {
            dataOutput.writeInt(i9);
        }
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            return this.f41973b == ((ZoneOffset) obj).f41973b;
        }
        return false;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.OFFSET_SECONDS : rVar != null && rVar.l(this);
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.f41974c;
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.f41973b;
    }

    @Override // j$.time.temporal.o
    public final int i(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f41973b;
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return j$.time.temporal.n.d(this, rVar).a(q(rVar), rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long q(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f41973b;
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return rVar.k(this);
    }

    @Override // j$.time.temporal.o
    public final Object t(j$.time.temporal.t tVar) {
        return (tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.j()) ? this : j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.f41974c;
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m u(j$.time.temporal.m mVar) {
        return mVar.d(this.f41973b, j$.time.temporal.a.OFFSET_SECONDS);
    }
}
