package H6;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.http.message.TokenParser;
import x6.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f2726a = {'*', '*', '*', TokenParser.SP, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f2727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f2728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f2729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f2730e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2731a;

        static {
            int[] iArr = new int[b.values().length];
            f2731a = iArr;
            try {
                iArr[b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2731a[b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2731a[b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2731a[b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2731a[b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', TokenParser.DQUOTE, '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', TokenParser.ESCAPE, ']', '^', '_'};
        f2727b = cArr;
        f2728c = new char[]{'*', '*', '*', TokenParser.SP, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        f2729d = cArr;
        f2730e = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};
    }

    public static D6.e a(byte[] bArr) throws g {
        D6.c cVar = new D6.c(bArr);
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        b bVarC = b.ASCII_ENCODE;
        do {
            b bVar = b.ASCII_ENCODE;
            if (bVarC == bVar) {
                bVarC = c(cVar, sb, sb2);
            } else {
                int i9 = a.f2731a[bVarC.ordinal()];
                if (i9 == 1) {
                    e(cVar, sb);
                } else if (i9 == 2) {
                    g(cVar, sb);
                } else if (i9 == 3) {
                    b(cVar, sb);
                } else if (i9 == 4) {
                    f(cVar, sb);
                } else {
                    if (i9 != 5) {
                        throw g.a();
                    }
                    d(cVar, sb, arrayList);
                }
                bVarC = bVar;
            }
            if (bVarC == b.PAD_ENCODE) {
                break;
            }
        } while (cVar.a() > 0);
        if (sb2.length() > 0) {
            sb.append((CharSequence) sb2);
        }
        String string = sb.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new D6.e(bArr, string, arrayList, null);
    }

    public static void b(D6.c cVar, StringBuilder sb) throws g {
        int iD;
        char c9;
        int i9;
        int[] iArr = new int[3];
        while (cVar.a() != 8 && (iD = cVar.d(8)) != 254) {
            h(iD, cVar.d(8), iArr);
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (i11 == 0) {
                    c9 = TokenParser.CR;
                } else if (i11 == 1) {
                    c9 = '*';
                } else if (i11 == 2) {
                    c9 = '>';
                } else if (i11 != 3) {
                    if (i11 < 14) {
                        i9 = i11 + 44;
                    } else {
                        if (i11 >= 40) {
                            throw g.a();
                        }
                        i9 = i11 + 51;
                    }
                    c9 = (char) i9;
                } else {
                    c9 = TokenParser.SP;
                }
                sb.append(c9);
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b c(D6.c cVar, StringBuilder sb, StringBuilder sb2) throws g {
        String str;
        boolean z9 = false;
        do {
            int iD = cVar.d(8);
            if (iD == 0) {
                throw g.a();
            }
            if (iD > 128) {
                if (iD != 129) {
                    if (iD > 229) {
                        switch (iD) {
                            case 230:
                                return b.C40_ENCODE;
                            case 231:
                                return b.BASE256_ENCODE;
                            case 232:
                                sb.append((char) 29);
                                break;
                            case 233:
                            case 234:
                            case 241:
                                break;
                            case 235:
                                z9 = true;
                                break;
                            case 236:
                                str = "[)>\u001e05\u001d";
                                sb.append(str);
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 237:
                                str = "[)>\u001e06\u001d";
                                sb.append(str);
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 238:
                                return b.ANSIX12_ENCODE;
                            case 239:
                                return b.TEXT_ENCODE;
                            case 240:
                                return b.EDIFACT_ENCODE;
                            default:
                                if (iD != 254 || cVar.a() != 0) {
                                    throw g.a();
                                }
                                break;
                        }
                    } else {
                        int i9 = iD - 130;
                        if (i9 < 10) {
                            sb.append('0');
                        }
                        sb.append(i9);
                    }
                } else {
                    return b.PAD_ENCODE;
                }
            } else {
                if (z9) {
                    iD += 128;
                }
                sb.append((char) (iD - 1));
                return b.ASCII_ENCODE;
            }
        } while (cVar.a() > 0);
        return b.ASCII_ENCODE;
    }

    public static void d(D6.c cVar, StringBuilder sb, Collection collection) throws g {
        int iC = cVar.c();
        int i9 = iC + 2;
        int i10 = i(cVar.d(8), iC + 1);
        if (i10 == 0) {
            i10 = cVar.a() / 8;
        } else if (i10 >= 250) {
            i10 = ((i10 - 249) * 250) + i(cVar.d(8), i9);
            i9 = iC + 3;
        }
        if (i10 < 0) {
            throw g.a();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            if (cVar.a() < 8) {
                throw g.a();
            }
            bArr[i11] = (byte) i(cVar.d(8), i9);
            i11++;
            i9++;
        }
        collection.add(bArr);
        try {
            sb.append(new String(bArr, "ISO8859_1"));
        } catch (UnsupportedEncodingException e9) {
            throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e9)));
        }
    }

    public static void e(D6.c cVar, StringBuilder sb) throws g {
        int iD;
        int i9;
        char c9;
        char c10;
        int[] iArr = new int[3];
        boolean z9 = false;
        int i10 = 0;
        while (cVar.a() != 8 && (iD = cVar.d(8)) != 254) {
            h(iD, cVar.d(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i10 != 0) {
                    if (i10 == 1) {
                        if (z9) {
                            i9 = i12 + 128;
                            c10 = (char) i9;
                            sb.append(c10);
                            z9 = false;
                        }
                        c9 = (char) i12;
                        sb.append(c9);
                    } else if (i10 == 2) {
                        char[] cArr = f2727b;
                        if (i12 < cArr.length) {
                            c9 = cArr[i12];
                            if (z9) {
                                c10 = (char) (c9 + 128);
                                sb.append(c10);
                                z9 = false;
                            }
                        } else if (i12 == 27) {
                            c9 = 29;
                        } else {
                            if (i12 != 30) {
                                throw g.a();
                            }
                            z9 = true;
                        }
                        sb.append(c9);
                    } else {
                        if (i10 != 3) {
                            throw g.a();
                        }
                        if (z9) {
                            i9 = i12 + 224;
                            c10 = (char) i9;
                            sb.append(c10);
                            z9 = false;
                        } else {
                            i12 += 96;
                            c9 = (char) i12;
                            sb.append(c9);
                        }
                    }
                    i10 = 0;
                } else if (i12 < 3) {
                    i10 = i12 + 1;
                } else {
                    char[] cArr2 = f2726a;
                    if (i12 >= cArr2.length) {
                        throw g.a();
                    }
                    char c11 = cArr2[i12];
                    if (z9) {
                        sb.append((char) (c11 + 128));
                        z9 = false;
                    } else {
                        sb.append(c11);
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    public static void f(D6.c cVar, StringBuilder sb) {
        while (cVar.a() > 16) {
            for (int i9 = 0; i9 < 4; i9++) {
                int iD = cVar.d(6);
                if (iD == 31) {
                    int iB = 8 - cVar.b();
                    if (iB != 8) {
                        cVar.d(iB);
                        return;
                    }
                    return;
                }
                if ((iD & 32) == 0) {
                    iD |= 64;
                }
                sb.append((char) iD);
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r3 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
    
        r3 = (char) (r4 + 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
    
        if (r3 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(D6.c r9, java.lang.StringBuilder r10) throws x6.g {
        /*
            r0 = 3
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
            r4 = 0
        L6:
            int r5 = r9.a()
            r6 = 8
            if (r5 != r6) goto Lf
            return
        Lf:
            int r5 = r9.d(r6)
            r7 = 254(0xfe, float:3.56E-43)
            if (r5 != r7) goto L18
            return
        L18:
            int r6 = r9.d(r6)
            h(r5, r6, r1)
            r5 = 0
        L20:
            if (r5 >= r0) goto L94
            r6 = r1[r5]
            if (r4 == 0) goto L72
            r7 = 1
            if (r4 == r7) goto L6a
            r8 = 2
            if (r4 == r8) goto L4e
            if (r4 != r0) goto L49
            char[] r4 = H6.c.f2730e
            int r7 = r4.length
            if (r6 >= r7) goto L44
            char r4 = r4[r6]
            if (r3 == 0) goto L3f
        L37:
            int r4 = r4 + 128
            char r3 = (char) r4
        L3a:
            r10.append(r3)
            r3 = 0
            goto L42
        L3f:
            r10.append(r4)
        L42:
            r4 = 0
            goto L8c
        L44:
            x6.g r9 = x6.g.a()
            throw r9
        L49:
            x6.g r9 = x6.g.a()
            throw r9
        L4e:
            char[] r4 = H6.c.f2729d
            int r8 = r4.length
            if (r6 >= r8) goto L58
            char r4 = r4[r6]
            if (r3 == 0) goto L3f
            goto L37
        L58:
            r4 = 27
            if (r6 == r4) goto L67
            r3 = 30
            if (r6 != r3) goto L62
            r3 = 1
            goto L42
        L62:
            x6.g r9 = x6.g.a()
            throw r9
        L67:
            r4 = 29
            goto L3f
        L6a:
            if (r3 == 0) goto L70
            int r6 = r6 + 128
            char r3 = (char) r6
            goto L3a
        L70:
            char r4 = (char) r6
            goto L3f
        L72:
            if (r6 >= r0) goto L78
            int r6 = r6 + 1
            r4 = r6
            goto L8c
        L78:
            char[] r7 = H6.c.f2728c
            int r8 = r7.length
            if (r6 >= r8) goto L8f
            char r6 = r7[r6]
            if (r3 == 0) goto L89
            int r6 = r6 + 128
            char r3 = (char) r6
            r10.append(r3)
            r3 = 0
            goto L8c
        L89:
            r10.append(r6)
        L8c:
            int r5 = r5 + 1
            goto L20
        L8f:
            x6.g r9 = x6.g.a()
            throw r9
        L94:
            int r5 = r9.a()
            if (r5 > 0) goto L6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.c.g(D6.c, java.lang.StringBuilder):void");
    }

    public static void h(int i9, int i10, int[] iArr) {
        int i11 = ((i9 << 8) + i10) - 1;
        int i12 = i11 / 1600;
        iArr[0] = i12;
        int i13 = i11 - (i12 * 1600);
        int i14 = i13 / 40;
        iArr[1] = i14;
        iArr[2] = i13 - (i14 * 40);
    }

    public static int i(int i9, int i10) {
        int i11 = i9 - (((i10 * 149) % 255) + 1);
        return i11 >= 0 ? i11 : i11 + JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
    }
}
