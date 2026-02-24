package com.google.ads.interactivemedia.v3.internal;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: loaded from: classes3.dex */
public final class aaz extends aaj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aax f18704a = new aax() { // from class: com.google.ads.interactivemedia.v3.internal.aaw
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aax f18705b;

    public aaz() {
        this(null);
    }

    public aaz(aax aaxVar) {
        this.f18705b = aaxVar;
    }

    private static int d(int i9) {
        return (i9 == 0 || i9 == 3) ? 1 : 2;
    }

    private static int e(byte[] bArr, int i9, int i10) {
        int iF = f(bArr, i9);
        if (i10 == 0 || i10 == 3) {
            return iF;
        }
        while (true) {
            int length = bArr.length;
            if (iF >= length - 1) {
                return length;
            }
            if ((iF - i9) % 2 == 0 && bArr[iF + 1] == 0) {
                return iF;
            }
            iF = f(bArr, iF + 1);
        }
    }

    private static int f(byte[] bArr, int i9) {
        while (true) {
            int length = bArr.length;
            if (i9 >= length) {
                return length;
            }
            if (bArr[i9] == 0) {
                return i9;
            }
            i9++;
        }
    }

    private static int g(cj cjVar, int i9) {
        byte[] bArrH = cjVar.H();
        int iC = cjVar.c();
        int i10 = iC;
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= iC + i9) {
                return i9;
            }
            if ((bArrH[i10] & 255) == 255 && bArrH[i11] == 0) {
                System.arraycopy(bArrH, i10 + 2, bArrH, i11, (i9 - (i10 - iC)) - 2);
                i9--;
            }
            i10 = i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0297 A[Catch: all -> 0x0252, UnsupportedEncodingException -> 0x0257, TryCatch #0 {all -> 0x0252, blocks: (B:236:0x0511, B:238:0x0532, B:129:0x021e, B:151:0x0284, B:153:0x0297, B:160:0x02d3, B:162:0x02e1, B:157:0x02b7, B:159:0x02cd, B:176:0x0319, B:183:0x035c, B:186:0x038f, B:189:0x03a0, B:190:0x03a8, B:192:0x03ae, B:194:0x03b5, B:195:0x03b9, B:202:0x03db, B:206:0x0404, B:208:0x040e, B:209:0x043f, B:210:0x044b, B:212:0x0451, B:214:0x0458, B:215:0x045c, B:219:0x0471, B:228:0x049d, B:230:0x04d8, B:231:0x04e7, B:234:0x04ff), top: B:251:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b7 A[Catch: all -> 0x0252, UnsupportedEncodingException -> 0x0257, TryCatch #0 {all -> 0x0252, blocks: (B:236:0x0511, B:238:0x0532, B:129:0x021e, B:151:0x0284, B:153:0x0297, B:160:0x02d3, B:162:0x02e1, B:157:0x02b7, B:159:0x02cd, B:176:0x0319, B:183:0x035c, B:186:0x038f, B:189:0x03a0, B:190:0x03a8, B:192:0x03ae, B:194:0x03b5, B:195:0x03b9, B:202:0x03db, B:206:0x0404, B:208:0x040e, B:209:0x043f, B:210:0x044b, B:212:0x0451, B:214:0x0458, B:215:0x045c, B:219:0x0471, B:228:0x049d, B:230:0x04d8, B:231:0x04e7, B:234:0x04ff), top: B:251:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0511 A[Catch: all -> 0x0252, UnsupportedEncodingException -> 0x02fd, TRY_LEAVE, TryCatch #0 {all -> 0x0252, blocks: (B:236:0x0511, B:238:0x0532, B:129:0x021e, B:151:0x0284, B:153:0x0297, B:160:0x02d3, B:162:0x02e1, B:157:0x02b7, B:159:0x02cd, B:176:0x0319, B:183:0x035c, B:186:0x038f, B:189:0x03a0, B:190:0x03a8, B:192:0x03ae, B:194:0x03b5, B:195:0x03b9, B:202:0x03db, B:206:0x0404, B:208:0x040e, B:209:0x043f, B:210:0x044b, B:212:0x0451, B:214:0x0458, B:215:0x045c, B:219:0x0471, B:228:0x049d, B:230:0x04d8, B:231:0x04e7, B:234:0x04ff), top: B:251:0x00ef }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.ads.interactivemedia.v3.internal.aba h(int r34, com.google.ads.interactivemedia.v3.internal.cj r35, boolean r36, int r37, com.google.ads.interactivemedia.v3.internal.aax r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aaz.h(int, com.google.ads.interactivemedia.v3.internal.cj, boolean, int, com.google.ads.interactivemedia.v3.internal.aax):com.google.ads.interactivemedia.v3.internal.aba");
    }

    private static String i(byte[] bArr, int i9, int i10, String str) throws UnsupportedEncodingException {
        return (i10 <= i9 || i10 > bArr.length) ? "" : new String(bArr, i9, i10 - i9, str);
    }

    private static String j(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? "ISO-8859-1" : "UTF-8" : CharEncoding.UTF_16BE : "UTF-16";
    }

    private static String k(int i9, int i10, int i11, int i12, int i13) {
        return i9 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    private static boolean l(cj cjVar, int i9, int i10, boolean z9) {
        int iK;
        long jK;
        int iM;
        int i11;
        int iC = cjVar.c();
        while (true) {
            try {
                if (cjVar.a() < i10) {
                    cjVar.F(iC);
                    return true;
                }
                if (i9 >= 3) {
                    iK = cjVar.e();
                    jK = cjVar.p();
                    iM = cjVar.m();
                } else {
                    iK = cjVar.k();
                    jK = cjVar.k();
                    iM = 0;
                }
                if (iK == 0 && jK == 0 && iM == 0) {
                    cjVar.F(iC);
                    return true;
                }
                if (i9 == 4 && !z9) {
                    if ((8421504 & jK) != 0) {
                        cjVar.F(iC);
                        return false;
                    }
                    jK = ((jK >> 24) << 21) | ((255 & (jK >> 16)) << 14) | (jK & 255) | (((jK >> 8) & 255) << 7);
                }
                if (i9 == 4) {
                    i = iM & 1;
                    i11 = (iM & 64) == 0 ? 0 : 1;
                } else {
                    if (i9 == 3) {
                        i11 = (iM & 32) != 0 ? 1 : 0;
                        if ((iM & 128) == 0) {
                        }
                    } else {
                        i11 = 0;
                    }
                    i = 0;
                }
                if (i != 0) {
                    i11 += 4;
                }
                if (jK < i11) {
                    cjVar.F(iC);
                    return false;
                }
                if (cjVar.a() < jK) {
                    cjVar.F(iC);
                    return false;
                }
                cjVar.G((int) jK);
            } catch (Throwable th) {
                cjVar.F(iC);
                throw th;
            }
        }
    }

    private static byte[] m(byte[] bArr, int i9, int i10) {
        return i10 <= i9 ? cq.f22645f : Arrays.copyOfRange(bArr, i9, i10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aaj
    public final ao b(ByteBuffer byteBuffer) {
        return c(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.internal.ao c(byte[] r13, int r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aaz.c(byte[], int):com.google.ads.interactivemedia.v3.internal.ao");
    }
}
