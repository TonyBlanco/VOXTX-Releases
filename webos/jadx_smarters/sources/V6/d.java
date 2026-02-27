package V6;

import D6.l;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f10108a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10109a;

        static {
            int[] iArr = new int[h.values().length];
            f10109a = iArr;
            try {
                iArr[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10109a[h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10109a[h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10109a[h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10109a[h.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10109a[h.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10109a[h.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10109a[h.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10109a[h.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10109a[h.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static D6.e a(byte[] bArr, j jVar, f fVar, Map map) throws x6.g {
        h hVar;
        D6.c cVar = new D6.c(bArr);
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i9 = -1;
        int iD = -1;
        boolean z9 = false;
        D6.d characterSetECIByValue = null;
        do {
            try {
                h hVarForBits = cVar.a() < 4 ? h.TERMINATOR : h.forBits(cVar.d(4));
                int[] iArr = a.f10109a;
                switch (iArr[hVarForBits.ordinal()]) {
                    case 5:
                        hVar = hVarForBits;
                        break;
                    case 6:
                    case 7:
                        hVar = hVarForBits;
                        z9 = true;
                        break;
                    case 8:
                        hVar = hVarForBits;
                        if (cVar.a() < 16) {
                            throw x6.g.a();
                        }
                        int iD2 = cVar.d(8);
                        iD = cVar.d(8);
                        i9 = iD2;
                        break;
                        break;
                    case 9:
                        hVar = hVarForBits;
                        characterSetECIByValue = D6.d.getCharacterSetECIByValue(g(cVar));
                        if (characterSetECIByValue == null) {
                            throw x6.g.a();
                        }
                        break;
                        break;
                    case 10:
                        hVar = hVarForBits;
                        int iD3 = cVar.d(4);
                        int iD4 = cVar.d(hVar.getCharacterCountBits(jVar));
                        if (iD3 == 1) {
                            d(cVar, sb, iD4);
                        }
                        break;
                    default:
                        int iD5 = cVar.d(hVarForBits.getCharacterCountBits(jVar));
                        int i10 = iArr[hVarForBits.ordinal()];
                        if (i10 == 1) {
                            hVar = hVarForBits;
                            f(cVar, sb, iD5);
                        } else if (i10 == 2) {
                            hVar = hVarForBits;
                            b(cVar, sb, iD5, z9);
                        } else if (i10 == 3) {
                            hVar = hVarForBits;
                            c(cVar, sb, iD5, characterSetECIByValue, arrayList, map);
                        } else {
                            if (i10 != 4) {
                                throw x6.g.a();
                            }
                            e(cVar, sb, iD5);
                            hVar = hVarForBits;
                        }
                        break;
                }
            } catch (IllegalArgumentException unused) {
                throw x6.g.a();
            }
        } while (hVar != h.TERMINATOR);
        return new D6.e(bArr, sb.toString(), arrayList.isEmpty() ? null : arrayList, fVar == null ? null : fVar.toString(), i9, iD);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(D6.c r3, java.lang.StringBuilder r4, int r5, boolean r6) throws x6.g {
        /*
            int r0 = r4.length()
        L4:
            r1 = 1
            if (r5 <= r1) goto L2d
            int r1 = r3.a()
            r2 = 11
            if (r1 < r2) goto L28
            int r1 = r3.d(r2)
            int r2 = r1 / 45
            char r2 = h(r2)
            r4.append(r2)
            int r1 = r1 % 45
            char r1 = h(r1)
            r4.append(r1)
            int r5 = r5 + (-2)
            goto L4
        L28:
            x6.g r3 = x6.g.a()
            throw r3
        L2d:
            if (r5 != r1) goto L47
            int r5 = r3.a()
            r2 = 6
            if (r5 < r2) goto L42
            int r3 = r3.d(r2)
            char r3 = h(r3)
            r4.append(r3)
            goto L47
        L42:
            x6.g r3 = x6.g.a()
            throw r3
        L47:
            if (r6 == 0) goto L72
        L49:
            int r3 = r4.length()
            if (r0 >= r3) goto L72
            char r3 = r4.charAt(r0)
            r5 = 37
            if (r3 != r5) goto L6f
            int r3 = r4.length()
            int r3 = r3 - r1
            if (r0 >= r3) goto L6a
            int r3 = r0 + 1
            char r6 = r4.charAt(r3)
            if (r6 != r5) goto L6a
            r4.deleteCharAt(r3)
            goto L6f
        L6a:
            r3 = 29
            r4.setCharAt(r0, r3)
        L6f:
            int r0 = r0 + 1
            goto L49
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V6.d.b(D6.c, java.lang.StringBuilder, int, boolean):void");
    }

    public static void c(D6.c cVar, StringBuilder sb, int i9, D6.d dVar, Collection collection, Map map) throws x6.g {
        if ((i9 << 3) > cVar.a()) {
            throw x6.g.a();
        }
        byte[] bArr = new byte[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            bArr[i10] = (byte) cVar.d(8);
        }
        try {
            sb.append(new String(bArr, dVar == null ? l.a(bArr, map) : dVar.name()));
            collection.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw x6.g.a();
        }
    }

    public static void d(D6.c cVar, StringBuilder sb, int i9) throws x6.g {
        if (i9 * 13 > cVar.a()) {
            throw x6.g.a();
        }
        byte[] bArr = new byte[i9 * 2];
        int i10 = 0;
        while (i9 > 0) {
            int iD = cVar.d(13);
            int i11 = (iD % 96) | ((iD / 96) << 8);
            int i12 = i11 + (i11 < 2560 ? 41377 : 42657);
            bArr[i10] = (byte) (i12 >> 8);
            bArr[i10 + 1] = (byte) i12;
            i10 += 2;
            i9--;
        }
        try {
            sb.append(new String(bArr, "GB2312"));
        } catch (UnsupportedEncodingException unused) {
            throw x6.g.a();
        }
    }

    public static void e(D6.c cVar, StringBuilder sb, int i9) throws x6.g {
        if (i9 * 13 > cVar.a()) {
            throw x6.g.a();
        }
        byte[] bArr = new byte[i9 * 2];
        int i10 = 0;
        while (i9 > 0) {
            int iD = cVar.d(13);
            int i11 = (iD % 192) | ((iD / 192) << 8);
            int i12 = i11 + (i11 < 7936 ? 33088 : 49472);
            bArr[i10] = (byte) (i12 >> 8);
            bArr[i10 + 1] = (byte) i12;
            i10 += 2;
            i9--;
        }
        try {
            sb.append(new String(bArr, "SJIS"));
        } catch (UnsupportedEncodingException unused) {
            throw x6.g.a();
        }
    }

    public static void f(D6.c cVar, StringBuilder sb, int i9) throws x6.g {
        while (i9 >= 3) {
            if (cVar.a() < 10) {
                throw x6.g.a();
            }
            int iD = cVar.d(10);
            if (iD >= 1000) {
                throw x6.g.a();
            }
            sb.append(h(iD / 100));
            sb.append(h((iD / 10) % 10));
            sb.append(h(iD % 10));
            i9 -= 3;
        }
        if (i9 == 2) {
            if (cVar.a() < 7) {
                throw x6.g.a();
            }
            int iD2 = cVar.d(7);
            if (iD2 >= 100) {
                throw x6.g.a();
            }
            sb.append(h(iD2 / 10));
            sb.append(h(iD2 % 10));
            return;
        }
        if (i9 == 1) {
            if (cVar.a() < 4) {
                throw x6.g.a();
            }
            int iD3 = cVar.d(4);
            if (iD3 >= 10) {
                throw x6.g.a();
            }
            sb.append(h(iD3));
        }
    }

    public static int g(D6.c cVar) throws x6.g {
        int iD = cVar.d(8);
        if ((iD & 128) == 0) {
            return iD & 127;
        }
        if ((iD & 192) == 128) {
            return cVar.d(8) | ((iD & 63) << 8);
        }
        if ((iD & 224) == 192) {
            return cVar.d(16) | ((iD & 31) << 16);
        }
        throw x6.g.a();
    }

    public static char h(int i9) throws x6.g {
        char[] cArr = f10108a;
        if (i9 < cArr.length) {
            return cArr[i9];
        }
        throw x6.g.a();
    }
}
