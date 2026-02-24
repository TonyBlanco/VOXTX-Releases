package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import okio.Utf8;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bto {
    public bto() {
    }

    public bto(byte[] bArr) {
        this();
    }

    public static String B(bpb bpbVar) {
        String str;
        bsv bsvVar = new bsv(bpbVar);
        StringBuilder sb = new StringBuilder(bsvVar.a());
        for (int i9 = 0; i9 < bsvVar.a(); i9++) {
            int iA = bsvVar.f22239a.a(i9);
            if (iA == 34) {
                str = "\\\"";
            } else if (iA == 39) {
                str = "\\'";
            } else if (iA != 92) {
                switch (iA) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iA < 32 || iA > 126) {
                            sb.append(TokenParser.ESCAPE);
                            sb.append((char) (((iA >>> 6) & 3) + 48));
                            sb.append((char) (((iA >>> 3) & 7) + 48));
                            iA = (iA & 7) + 48;
                        }
                        sb.append((char) iA);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static /* synthetic */ boolean C(Object obj, Object obj2) {
        return obj == obj2 || obj.equals(obj2);
    }

    public static boolean D(Object[] objArr, Object obj) {
        if (objArr != null) {
            if (obj == null) {
                for (Object obj2 : objArr) {
                    if (obj2 == null) {
                        return true;
                    }
                }
            } else {
                for (Object obj3 : objArr) {
                    if (obj.equals(obj3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static int E(byte b9) {
        return b9 & Utf8.REPLACEMENT_BYTE;
    }

    private static boolean F(byte b9) {
        return b9 > -65;
    }

    public static /* bridge */ /* synthetic */ void a(byte b9, byte b10, byte b11, byte b12, char[] cArr, int i9) throws bqw {
        if (F(b10) || (((b9 << 28) + (b10 + 112)) >> 30) != 0 || F(b11) || F(b12)) {
            throw bqw.d();
        }
        int iE = ((b9 & 7) << 18) | (E(b10) << 12) | (E(b11) << 6) | E(b12);
        cArr[i9] = (char) ((iE >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
        cArr[i9 + 1] = (char) ((iE & 1023) + Utf8.LOG_SURROGATE_HEADER);
    }

    public static /* bridge */ /* synthetic */ void b(byte b9, char[] cArr, int i9) {
        cArr[i9] = (char) b9;
    }

    public static /* bridge */ /* synthetic */ void c(byte b9, byte b10, byte b11, char[] cArr, int i9) throws bqw {
        if (!F(b10)) {
            if (b9 != -32) {
                if ((b9 == -19 || b10 < -96) && !F(b11)) {
                    cArr[i9] = (char) (((b9 & 15) << 12) | (E(b10) << 6) | E(b11));
                    return;
                }
            } else if (b10 >= -96) {
                b9 = -32;
                if (b9 == -19) {
                    cArr[i9] = (char) (((b9 & 15) << 12) | (E(b10) << 6) | E(b11));
                    return;
                } else {
                    cArr[i9] = (char) (((b9 & 15) << 12) | (E(b10) << 6) | E(b11));
                    return;
                }
            }
        }
        throw bqw.d();
    }

    public static /* bridge */ /* synthetic */ void d(byte b9, byte b10, char[] cArr, int i9) throws bqw {
        if (b9 < -62 || F(b10)) {
            throw bqw.d();
        }
        cArr[i9] = (char) (((b9 & 31) << 6) | E(b10));
    }

    public static /* bridge */ /* synthetic */ boolean e(byte b9) {
        return b9 >= 0;
    }

    public static /* bridge */ /* synthetic */ boolean f(byte b9) {
        return b9 < -16;
    }

    public static /* bridge */ /* synthetic */ boolean g(byte b9) {
        return b9 < -32;
    }

    public static /* bridge */ /* synthetic */ void n(Object obj, int i9, int i10) {
        ((bsx) obj).i(btm.c(i9, 5), Integer.valueOf(i10));
    }

    public static /* bridge */ /* synthetic */ void o(Object obj, int i9, long j9) {
        ((bsx) obj).i(btm.c(i9, 1), Long.valueOf(j9));
    }

    public static /* bridge */ /* synthetic */ void p(Object obj, int i9, Object obj2) {
        ((bsx) obj).i(btm.c(i9, 3), obj2);
    }

    public static /* bridge */ /* synthetic */ void q(Object obj, int i9, bpb bpbVar) {
        ((bsx) obj).i(btm.c(i9, 2), bpbVar);
    }

    public static /* bridge */ /* synthetic */ void r(Object obj, int i9, long j9) {
        ((bsx) obj).i(btm.c(i9, 0), Long.valueOf(j9));
    }

    public static bsx s(Object obj) {
        return ((bqn) obj).f22109c;
    }

    public static /* bridge */ /* synthetic */ Object v(Object obj, Object obj2) {
        if (bsx.c().equals(obj2)) {
            return obj;
        }
        bsx bsxVar = (bsx) obj2;
        if (bsx.c().equals(obj)) {
            return bsx.d((bsx) obj, bsxVar);
        }
        ((bsx) obj).l(bsxVar);
        return obj;
    }

    public static void x(Object obj, bsx bsxVar) {
        ((bqn) obj).f22109c = bsxVar;
    }

    public static /* synthetic */ Object y(Object obj) {
        ((bsx) obj).g();
        return obj;
    }

    public final boolean h(Object obj, bsd bsdVar) throws IOException {
        int iD = bsdVar.d();
        int iA = btm.a(iD);
        int iB = btm.b(iD);
        if (iB == 0) {
            r(obj, iA, bsdVar.l());
            return true;
        }
        if (iB == 1) {
            o(obj, iA, bsdVar.k());
            return true;
        }
        if (iB == 2) {
            q(obj, iA, bsdVar.p());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw bqw.a();
            }
            n(obj, iA, bsdVar.f());
            return true;
        }
        int iC = btm.c(iA, 4);
        Object objE = bsx.e();
        while (bsdVar.c() != Integer.MAX_VALUE && h(objE, bsdVar)) {
        }
        if (iC != bsdVar.d()) {
            throw bqw.b();
        }
        p(obj, iA, y(objE));
        return true;
    }

    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        bsx bsxVarS = s(obj);
        if (bsxVarS != bsx.c()) {
            return bsxVarS;
        }
        bsx bsxVarE = bsx.e();
        x(obj, bsxVarE);
        return bsxVarE;
    }

    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        return s(obj);
    }

    public final void k(Object obj) {
        s(obj).g();
    }

    public final /* synthetic */ void l(Object obj, Object obj2) {
        x(obj, (bsx) obj2);
    }

    public final /* bridge */ /* synthetic */ void m(Object obj, Object obj2) {
        x(obj, (bsx) obj2);
    }
}
