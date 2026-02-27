package P6;

import org.apache.http.message.TokenParser;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D6.a f7353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f7354b = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f7355c = new StringBuilder();

    public s(D6.a aVar) {
        this.f7353a = aVar;
    }

    public static int g(D6.a aVar, int i9, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (aVar.h(i9 + i12)) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }

    public String a(StringBuilder sb, int i9) throws x6.k {
        String str = null;
        while (true) {
            o oVarC = c(i9, str);
            String strA = r.a(oVarC.b());
            if (strA != null) {
                sb.append(strA);
            }
            String strValueOf = oVarC.d() ? String.valueOf(oVarC.c()) : null;
            if (i9 == oVarC.a()) {
                return sb.toString();
            }
            i9 = oVarC.a();
            str = strValueOf;
        }
    }

    public final n b(int i9) {
        char c9;
        int iF = f(i9, 5);
        if (iF == 15) {
            return new n(i9 + 5, '$');
        }
        if (iF >= 5 && iF < 15) {
            return new n(i9 + 5, (char) (iF + 43));
        }
        int iF2 = f(i9, 6);
        if (iF2 >= 32 && iF2 < 58) {
            return new n(i9 + 6, (char) (iF2 + 33));
        }
        switch (iF2) {
            case 58:
                c9 = '*';
                break;
            case 59:
                c9 = ',';
                break;
            case 60:
                c9 = '-';
                break;
            case 61:
                c9 = '.';
                break;
            case 62:
                c9 = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(iF2)));
        }
        return new n(i9 + 6, c9);
    }

    public o c(int i9, String str) {
        this.f7355c.setLength(0);
        if (str != null) {
            this.f7355c.append(str);
        }
        this.f7354b.h(i9);
        o oVarO = o();
        return (oVarO == null || !oVarO.d()) ? new o(this.f7354b.a(), this.f7355c.toString()) : new o(this.f7354b.a(), this.f7355c.toString(), oVarO.c());
    }

    public final n d(int i9) throws x6.g {
        int iF = f(i9, 5);
        if (iF == 15) {
            return new n(i9 + 5, '$');
        }
        char c9 = '+';
        if (iF >= 5 && iF < 15) {
            return new n(i9 + 5, (char) (iF + 43));
        }
        int iF2 = f(i9, 7);
        if (iF2 >= 64 && iF2 < 90) {
            return new n(i9 + 7, (char) (iF2 + 1));
        }
        if (iF2 >= 90 && iF2 < 116) {
            return new n(i9 + 7, (char) (iF2 + 7));
        }
        switch (f(i9, 8)) {
            case 232:
                c9 = '!';
                break;
            case 233:
                c9 = TokenParser.DQUOTE;
                break;
            case 234:
                c9 = '%';
                break;
            case 235:
                c9 = '&';
                break;
            case 236:
                c9 = '\'';
                break;
            case 237:
                c9 = '(';
                break;
            case 238:
                c9 = ')';
                break;
            case 239:
                c9 = '*';
                break;
            case 240:
                break;
            case 241:
                c9 = ',';
                break;
            case 242:
                c9 = '-';
                break;
            case 243:
                c9 = '.';
                break;
            case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                c9 = '/';
                break;
            case 245:
                c9 = ':';
                break;
            case 246:
                c9 = ';';
                break;
            case 247:
                c9 = '<';
                break;
            case 248:
                c9 = '=';
                break;
            case 249:
                c9 = '>';
                break;
            case 250:
                c9 = '?';
                break;
            case 251:
                c9 = '_';
                break;
            case 252:
                c9 = TokenParser.SP;
                break;
            default:
                throw x6.g.a();
        }
        return new n(i9 + 8, c9);
    }

    public final p e(int i9) {
        int i10 = i9 + 7;
        if (i10 > this.f7353a.l()) {
            int iF = f(i9, 4);
            return iF == 0 ? new p(this.f7353a.l(), 10, 10) : new p(this.f7353a.l(), iF - 1, 10);
        }
        int iF2 = f(i9, 7) - 8;
        return new p(i10, iF2 / 11, iF2 % 11);
    }

    public int f(int i9, int i10) {
        return g(this.f7353a, i9, i10);
    }

    public final boolean h(int i9) {
        int i10 = i9 + 3;
        if (i10 > this.f7353a.l()) {
            return false;
        }
        while (i9 < i10) {
            if (this.f7353a.h(i9)) {
                return false;
            }
            i9++;
        }
        return true;
    }

    public final boolean i(int i9) {
        int i10;
        if (i9 + 1 > this.f7353a.l()) {
            return false;
        }
        for (int i11 = 0; i11 < 5 && (i10 = i11 + i9) < this.f7353a.l(); i11++) {
            if (i11 == 2) {
                if (!this.f7353a.h(i9 + 2)) {
                    return false;
                }
            } else if (this.f7353a.h(i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(int i9) {
        int i10;
        if (i9 + 1 > this.f7353a.l()) {
            return false;
        }
        for (int i11 = 0; i11 < 4 && (i10 = i11 + i9) < this.f7353a.l(); i11++) {
            if (this.f7353a.h(i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(int i9) {
        int iF;
        if (i9 + 5 > this.f7353a.l()) {
            return false;
        }
        int iF2 = f(i9, 5);
        if (iF2 < 5 || iF2 >= 16) {
            return i9 + 6 <= this.f7353a.l() && (iF = f(i9, 6)) >= 16 && iF < 63;
        }
        return true;
    }

    public final boolean l(int i9) {
        int iF;
        if (i9 + 5 > this.f7353a.l()) {
            return false;
        }
        int iF2 = f(i9, 5);
        if (iF2 >= 5 && iF2 < 16) {
            return true;
        }
        if (i9 + 7 > this.f7353a.l()) {
            return false;
        }
        int iF3 = f(i9, 7);
        if (iF3 < 64 || iF3 >= 116) {
            return i9 + 8 <= this.f7353a.l() && (iF = f(i9, 8)) >= 232 && iF < 253;
        }
        return true;
    }

    public final boolean m(int i9) {
        if (i9 + 7 > this.f7353a.l()) {
            return i9 + 4 <= this.f7353a.l();
        }
        int i10 = i9;
        while (true) {
            int i11 = i9 + 3;
            if (i10 >= i11) {
                return this.f7353a.h(i11);
            }
            if (this.f7353a.h(i10)) {
                return true;
            }
            i10++;
        }
    }

    public final l n() {
        while (k(this.f7354b.a())) {
            n nVarB = b(this.f7354b.a());
            this.f7354b.h(nVarB.a());
            if (nVarB.c()) {
                return new l(new o(this.f7354b.a(), this.f7355c.toString()), true);
            }
            this.f7355c.append(nVarB.b());
        }
        if (h(this.f7354b.a())) {
            this.f7354b.b(3);
            this.f7354b.g();
        } else if (i(this.f7354b.a())) {
            if (this.f7354b.a() + 5 < this.f7353a.l()) {
                this.f7354b.b(5);
            } else {
                this.f7354b.h(this.f7353a.l());
            }
            this.f7354b.f();
        }
        return new l(false);
    }

    public final o o() {
        l lVarN;
        boolean zB;
        do {
            int iA = this.f7354b.a();
            lVarN = this.f7354b.c() ? n() : this.f7354b.d() ? p() : q();
            zB = lVarN.b();
            if (iA == this.f7354b.a() && !zB) {
                break;
            }
        } while (!zB);
        return lVarN.a();
    }

    public final l p() throws x6.g {
        while (l(this.f7354b.a())) {
            n nVarD = d(this.f7354b.a());
            this.f7354b.h(nVarD.a());
            if (nVarD.c()) {
                return new l(new o(this.f7354b.a(), this.f7355c.toString()), true);
            }
            this.f7355c.append(nVarD.b());
        }
        if (h(this.f7354b.a())) {
            this.f7354b.b(3);
            this.f7354b.g();
        } else if (i(this.f7354b.a())) {
            if (this.f7354b.a() + 5 < this.f7353a.l()) {
                this.f7354b.b(5);
            } else {
                this.f7354b.h(this.f7353a.l());
            }
            this.f7354b.e();
        }
        return new l(false);
    }

    public final l q() {
        while (m(this.f7354b.a())) {
            p pVarE = e(this.f7354b.a());
            this.f7354b.h(pVarE.a());
            if (pVarE.d()) {
                return new l(pVarE.e() ? new o(this.f7354b.a(), this.f7355c.toString()) : new o(this.f7354b.a(), this.f7355c.toString(), pVarE.c()), true);
            }
            this.f7355c.append(pVarE.b());
            if (pVarE.e()) {
                return new l(new o(this.f7354b.a(), this.f7355c.toString()), true);
            }
            this.f7355c.append(pVarE.c());
        }
        if (j(this.f7354b.a())) {
            this.f7354b.e();
            this.f7354b.b(4);
        }
        return new l(false);
    }
}
