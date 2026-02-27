package j$.time.format;

import j$.time.temporal.w;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
final class g extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f42056g;

    g(j$.time.temporal.r rVar, int i9, int i10, boolean z9, int i11) {
        super(rVar, i9, i10, u.NOT_NEGATIVE, i11);
        this.f42056g = z9;
    }

    @Override // j$.time.format.i
    final i b() {
        if (this.f42062e == -1) {
            return this;
        }
        return new g(this.f42058a, this.f42059b, this.f42060c, this.f42056g, -1);
    }

    @Override // j$.time.format.i
    final i c(int i9) {
        return new g(this.f42058a, this.f42059b, this.f42060c, this.f42056g, this.f42062e + i9);
    }

    @Override // j$.time.format.i, j$.time.format.f
    public final boolean i(p pVar, StringBuilder sb) {
        j$.time.temporal.r rVar = this.f42058a;
        Long lE = pVar.e(rVar);
        if (lE == null) {
            return false;
        }
        s sVarB = pVar.b();
        long jLongValue = lE.longValue();
        w wVarI = rVar.i();
        wVarI.b(jLongValue, rVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(wVarI.e());
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(wVarI.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z9 = this.f42056g;
        int i9 = this.f42059b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i9), this.f42060c), roundingMode).toPlainString().substring(2);
            sVarB.getClass();
            if (z9) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i9 <= 0) {
            return true;
        }
        if (z9) {
            sVarB.getClass();
            sb.append('.');
        }
        for (int i10 = 0; i10 < i9; i10++) {
            sVarB.getClass();
            sb.append('0');
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.f42058a + "," + this.f42059b + "," + this.f42060c + (this.f42056g ? ",DecimalPoint" : "") + ")";
    }
}
