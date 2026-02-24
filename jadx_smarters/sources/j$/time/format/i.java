package j$.time.format;

import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes2.dex */
class i implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long[] f42057f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final j$.time.temporal.r f42058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f42059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f42060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u f42061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f42062e;

    i(j$.time.temporal.r rVar, int i9, int i10, u uVar) {
        this.f42058a = rVar;
        this.f42059b = i9;
        this.f42060c = i10;
        this.f42061d = uVar;
        this.f42062e = 0;
    }

    protected i(j$.time.temporal.r rVar, int i9, int i10, u uVar, int i11) {
        this.f42058a = rVar;
        this.f42059b = i9;
        this.f42060c = i10;
        this.f42061d = uVar;
        this.f42062e = i11;
    }

    i b() {
        if (this.f42062e == -1) {
            return this;
        }
        return new i(this.f42058a, this.f42059b, this.f42060c, this.f42061d, -1);
    }

    i c(int i9) {
        int i10 = this.f42062e + i9;
        return new i(this.f42058a, this.f42059b, this.f42060c, this.f42061d, i10);
    }

    @Override // j$.time.format.f
    public boolean i(p pVar, StringBuilder sb) {
        j$.time.temporal.r rVar = this.f42058a;
        Long lE = pVar.e(rVar);
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        s sVarB = pVar.b();
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i9 = this.f42060c;
        if (length > i9) {
            throw new j$.time.c("Field " + rVar + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i9);
        }
        sVarB.getClass();
        int i10 = this.f42059b;
        u uVar = this.f42061d;
        if (jLongValue >= 0) {
            int i11 = c.f42052a[uVar.ordinal()];
            if (i11 == 1 ? !(i10 >= 19 || jLongValue < f42057f[i10]) : i11 == 2) {
                sb.append('+');
            }
        } else {
            int i12 = c.f42052a[uVar.ordinal()];
            if (i12 == 1 || i12 == 2 || i12 == 3) {
                sb.append('-');
            } else if (i12 == 4) {
                throw new j$.time.c("Field " + rVar + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i13 = 0; i13 < i10 - string.length(); i13++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    public String toString() {
        int i9 = this.f42060c;
        j$.time.temporal.r rVar = this.f42058a;
        u uVar = this.f42061d;
        int i10 = this.f42059b;
        if (i10 == 1 && i9 == 19 && uVar == u.NORMAL) {
            return "Value(" + rVar + ")";
        }
        if (i10 == i9 && uVar == u.NOT_NEGATIVE) {
            return "Value(" + rVar + "," + i10 + ")";
        }
        return "Value(" + rVar + "," + i10 + "," + i9 + "," + uVar + ")";
    }
}
