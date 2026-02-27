package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
final class h implements f {
    @Override // j$.time.format.f
    public final boolean i(p pVar, StringBuilder sb) {
        Long lE = pVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.o oVarD = pVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long lValueOf = oVarD.f(aVar) ? Long.valueOf(pVar.d().q(aVar)) : null;
        int i9 = 0;
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        int iY = aVar.y(lValueOf != null ? lValueOf.longValue() : 0L);
        if (jLongValue >= -62167219200L) {
            long j9 = jLongValue - 253402300800L;
            long jN = j$.com.android.tools.r8.a.n(j9, 315569520000L) + 1;
            LocalDateTime localDateTimeL = LocalDateTime.L(j$.com.android.tools.r8.a.m(j9, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jN > 0) {
                sb.append('+');
                sb.append(jN);
            }
            sb.append(localDateTimeL);
            if (localDateTimeL.F() == 0) {
                sb.append(":00");
            }
        } else {
            long j10 = jLongValue + 62167219200L;
            long j11 = j10 / 315569520000L;
            long j12 = j10 % 315569520000L;
            LocalDateTime localDateTimeL2 = LocalDateTime.L(j12 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeL2);
            if (localDateTimeL2.F() == 0) {
                sb.append(":00");
            }
            if (j11 < 0) {
                if (localDateTimeL2.G() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j11 - 1));
                } else if (j12 == 0) {
                    sb.insert(length, j11);
                } else {
                    sb.insert(length + 1, Math.abs(j11));
                }
            }
        }
        if (iY > 0) {
            sb.append('.');
            int i10 = 100000000;
            while (true) {
                if (iY <= 0 && i9 % 3 == 0 && i9 >= -2) {
                    break;
                }
                int i11 = iY / i10;
                sb.append((char) (i11 + 48));
                iY -= i11 * i10;
                i10 /= 10;
                i9++;
            }
        }
        sb.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
