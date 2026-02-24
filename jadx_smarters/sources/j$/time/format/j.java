package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
final class j implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String[] f42063d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final j f42064e = new j("+HH:MM:ss", "Z");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42067c;

    static {
        new j("+HH:MM:ss", "0");
    }

    j(String str, String str2) {
        int i9 = 0;
        while (true) {
            String[] strArr = f42063d;
            if (i9 >= 22) {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
            if (strArr[i9].equals(str)) {
                this.f42066b = i9;
                this.f42067c = i9 % 11;
                this.f42065a = str2;
                return;
            }
            i9++;
        }
    }

    private static void a(boolean z9, int i9, StringBuilder sb) {
        sb.append(z9 ? ":" : "");
        sb.append((char) ((i9 / 10) + 48));
        sb.append((char) ((i9 % 10) + 48));
    }

    @Override // j$.time.format.f
    public final boolean i(p pVar, StringBuilder sb) {
        Long lE = pVar.e(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z9 = false;
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        int i9 = (int) jLongValue;
        if (jLongValue != i9) {
            throw new ArithmeticException();
        }
        String str = this.f42065a;
        if (i9 == 0) {
            sb.append(str);
        } else {
            int iAbs = Math.abs((i9 / 3600) % 100);
            int iAbs2 = Math.abs((i9 / 60) % 60);
            int iAbs3 = Math.abs(i9 % 60);
            int length = sb.length();
            sb.append(i9 < 0 ? "-" : "+");
            if (this.f42066b >= 11 && iAbs < 10) {
                sb.append((char) (iAbs + 48));
            } else {
                a(false, iAbs, sb);
            }
            int i10 = this.f42067c;
            if ((i10 >= 3 && i10 <= 8) || ((i10 >= 9 && iAbs3 > 0) || (i10 >= 1 && iAbs2 > 0))) {
                a(i10 > 0 && i10 % 2 == 0, iAbs2, sb);
                iAbs += iAbs2;
                if (i10 == 7 || i10 == 8 || (i10 >= 5 && iAbs3 > 0)) {
                    if (i10 > 0 && i10 % 2 == 0) {
                        z9 = true;
                    }
                    a(z9, iAbs3, sb);
                    iAbs += iAbs3;
                }
            }
            if (iAbs == 0) {
                sb.setLength(length);
                sb.append(str);
            }
        }
        return true;
    }

    public final String toString() {
        String strReplace = this.f42065a.replace("'", "''");
        return "Offset(" + f42063d[this.f42066b] + ",'" + strReplace + "')";
    }
}
